package e07;
/*
配列aから要素a[idx]を削除するメソッド作成せよ。
void aryRmv(int[] a, int idx)
削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。
なお、移動されずに余ってしまう末尾要素a[a.length - 1]の値は変更しなくてよい。
 */
import java.util.Scanner;

public class e07_18 {
	// 配列aから要素a[idx]を削除するメソッド
	static void aryRmv(int[] a, int idx){
		// インデックスの値を調整するための値を宣言する
		final int ADJUST_INT = 1;
		// a[idx]より後ろの全要素を一つ前方にずらす
		for(int index = idx; index < (a.length - ADJUST_INT); index++){
			// 書き換えるインデックスの次のインデックスを求める
			int nextIndex = index + ADJUST_INT;
			// ひとつ前の要素を次の要素で書き換える
			a[index] = a[nextIndex];
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

		//  配列xから要素x[idx]を削除する
		aryRmv(x, idx);

		// 処理の内容を表示
		System.out.println("x[" + idx + "]の値を削除しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < number; index++){
			// 配列の要素の値を表示する
			System.out.println("x[" + index + "] = " + x[index]);
		}
	}
}
