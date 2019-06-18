package e07;
/*
配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成せよ。
int[] arrayInsOf(int[] a,int idx, int x)
挿入に伴ってa[idx]以降の全要素をひとつづつ後方にずらすこと。
 */
import java.util.Scanner;

public class e07_26 {
	static int[] arrayInsOf(int[] a,int idx, int x){
		// 要素数の調整値を定数化
		final int ADJUST_INT = 1;
		// 要素a[idx]を挿入した値をいれる配列を生成
		int[] insertInt = new int[(a.length + ADJUST_INT)];

		// 新しい配列の要素数分処理を繰り返す
		for(int index = 0; index < insertInt.length; index++){
			// 新しい配列のインデックスが挿入箇所より前方のとき
			if(index < idx){
				// 新しい配列に配列aの同じインデックスの値を代入
				insertInt[index] = a[index];
			// 新しい配列のインデックスが挿入箇所のとき
			}else if(index == idx){
				// 新しい配列に値xを代入
				insertInt[index] = x;
			// 新しい配列のインデックスが挿入箇所より後方のとき
			}else{
				// 新しい配列に配列aのひとつ前のインデックスの値を代入
				insertInt[index] = a[index - ADJUST_INT];
			}
		}
		// 生成した配列を返却
		return insertInt;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int number = stdIn.nextInt();
		// 配列aを生成する
		int[] a = new int[number];

		// 要素数分処理を繰り返す
		for(int index = 0; index < number; index++){
			// 要素の値の入力を促す
			System.out.print("a[" + index + "] = ");
			// 入力値を配列aの要素に代入
			a[index] = stdIn.nextInt();
		}

		// 挿入する要素のインデックスの入力を促す
		System.out.print("挿入する要素のインデックス：");
		// 入力値を挿入する要素のインデックスを入れる変数に代入
		int idx = stdIn.nextInt();

		// 挿入する要素の値の入力を促す
		System.out.print("挿入する要素の値：");
		// 入力値を挿入する要素のインデックスを入れる変数に代入
		int x = stdIn.nextInt();

		// 配列aの要素a[idx]にxを挿入した配列を求める
		int[] insertInt = arrayInsOf(a, idx, x);

		// 処理の内容を表示
		System.out.println("配列aから要素a[" + idx + "]に" + x + "を挿入した配列を生成しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < insertInt.length; index++){
			// 配列の要素の値を表示する
			System.out.println("insertInt[" + index + "] = " + insertInt[index]);
		}
	}
}
