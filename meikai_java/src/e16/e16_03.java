package e16;

import java.util.Scanner;

/*
 * List16-7のメソッドreverseは、仮引数aに受け取った参照が空参照でないことを前提としている。
 * 受け取ったのが空参照であった場合に、何らかの処理を行うように変更したプログラムを作成せよ。
 * ※Colimn16-2(p.527)に示すNullPointerExceptionを補足して対処すること。
 */
/**
 * List16-7改
 * @author t.hosoya
 * @since 20210127
 */
public class e16_03 {
	/**
	 * 引数で渡された位置の値を入れ替える
	 * @param array 配列
	 * @param idx1 入れ替え位置
	 * @param idx2 入れ替え位置
	 */
	static void swap(int[] array, int idx1, int idx2){
		int saveIdx1 = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = saveIdx1;
	}
	/**
	 * 配列を反転させる
	 * @param array 配列
	 */
	static void reverse(int[] array){
		try{
			// 配列のインデックスごとに値を入れ替える
			for(int index = 0; index < array.length / 2;  index++){
				// ArrayIndexOutOfBoundsException再現用バグ（正しくはarray.length - index - 1)
				swap(array, index, array.length - index);
			}
		// 配列の存在しないインデックスが指定された場合の例外補足
		}catch(ArrayIndexOutOfBoundsException e){
			// トレースログ表示
			e.printStackTrace();
			// 強制終了
			System.exit(1);
		// 引数が空参照の場合の例外補足
		}catch(NullPointerException e){
			// トレースログ表示
			e.printStackTrace();
			// 強制終了
			System.exit(1);
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
		// 配列xの要素の並びを反転
		reverse(arrayForDisplay);

		System.out.println("要素の並びを反転しました。");

		for(int index = 0; index < arrayNum; index++){
			System.out.println("arrayForDisplay[" + index + "] = " + arrayForDisplay[index]);
		}
	}

}
