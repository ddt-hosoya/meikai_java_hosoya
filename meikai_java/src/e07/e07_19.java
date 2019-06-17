package e07;
/*
配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ。
void aryRmvN(int[] a,int idx, int n
削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと。
なお、移動されずに余ってしまう要素の値は変更しなくてよい。
 */
import java.util.Scanner;

public class e07_19 {
	// 配列aから要素a[idx]を先頭とするn個の要素を削除するメソッド
	static void aryRmvN(int[] a, int idx, int n){
		// インデックスの値を調整するための値を宣言する
		final int ADJUST_INT = 1;
		// a[idx]より後ろの全要素をn個前方にずらす
		for(int index = idx; index < (a.length - ADJUST_INT); index++){
			// 書き換えるインデックスの次のインデックスを求める
			int nextIndex = index + n;
			// n個次の要素が全要素数を上回っていない場合
			if(nextIndex < a.length){
				// ひとつ前の要素をn個次の要素で書き換える
				a[index] = a[nextIndex];
			}
		}
	}
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int number = stdIn.nextInt();
		// 配列aを生成する
		int[] x = new int[number];

		// 要素数分処理を繰り返す
		for(int index = 0; index < number; index++){
			// 要素の値の入力を促す
			System.out.print("x[" + index + "] = ");
			// 入力値を配列aの要素に代入
			x[index] = stdIn.nextInt();
		}

		// 削除する要素の入力を促す
		System.out.print("削除する要素のインデックス：");
		// 入力値を削除する要素を入れる変数に代入
		int idx = stdIn.nextInt();

		// 削除する要素の入力を促す
		System.out.print("何個：");
		// 入力値を削除する要素を入れる変数に代入
		int n = stdIn.nextInt();

		//  配列xから要素x[idx]を削除する
		aryRmvN(x, idx, n);

		// 処理の内容を表示
		System.out.println("x[" + idx + "]から" + n + "個の値を削除しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < number; index++){
			// 配列の要素の値を表示する
			System.out.println("x[" + index + "] = " + x[index]);
		}
	}
}

