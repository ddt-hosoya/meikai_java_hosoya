package e16;

import java.util.Scanner;
/*
 * 前問と同様に、List16-8（p.526）のメソッドリバースに対して、仮引数aに受け取った参照が空参照であった場合に、
 * 何らかの対処を行うように変更したプログラムを作成せよ。
 */
/**
 * List16-8改
 * @author t.hosoya
 * @since 20210208
 */
public class e16_04 {
	/**
	 * 引数で渡された位置の値を入れ替える
	 * @param array 配列
	 * @param idx1 入れ替え位置
	 * @param idx2 入れ替え位置
	 */
	static void swap(int[] array, int idx1, int idx2){
		int t = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = t;
	}
	/**
	 * 配列を反転させる
	 * @param array 配列
	 */
	static void reverse(int[] array){
		try{
			// 配列のインデックスごとに値を入れ替える
			for(int index = 0; index < array.length / 2;  index++){
				// ArrayIndexOutOfBoundsException再現用バグ（正しくはa.length - index - 1)
				swap(array, index, array.length - index);
			}
		// 配列の存在しないインデックスが指定された場合の例外補足
		}catch(ArrayIndexOutOfBoundsException e){
			// 別の例外として送出
			throw new RuntimeException("reverseのバグ？", e);
		// 引数が空参照の場合の例外補足
		}catch(NullPointerException e){
			// 別の例外として送出
			throw new RuntimeException("reverseのバグ？", e);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 配列xの要素数の入力を促す
		System.out.print("要素数：");
		// 入力値で要素数初期化
		int arrayNum = stdIn.nextInt();
		// 配列xを要素数で初期化
		int[] arrayForDisplay = new int[arrayNum];

		// 要素数分ループ
		for(int index = 0; index < arrayNum; index++){
			// 各indexごとに格納する値を尋ねる
			System.out.print("arrayForDisplay[" + index + "]:");
			// 入力値を配列xに格納する
			arrayForDisplay[index] = stdIn.nextInt();
		}
		// NullPointerException再現用バグ埋め込み
		arrayForDisplay = null;

		try{
			// 配列xの要素の並びを反転
			reverse(arrayForDisplay);
			// 処理内容を表示
			System.out.println("要素の並びを反転しました。");
			// 処理結果を表示
			for(int index = 0; index < arrayNum; index++){
				System.out.println("arrayForDisplay[" + index + "] = " + arrayForDisplay[index]);
			}
		// reverseの例外補足
		}catch(RuntimeException e){
			// 補足した例外を表示
			System.out.println("例外      ：" + e);
			// 補足した例外の原因を表示
			System.out.println("例外の原因：" + e.getCause());
		}



	}


}
