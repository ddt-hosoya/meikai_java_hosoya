package e07;

import java.util.Scanner;
/*
配列aの要素a[idx]にxを挿入するメソッドaryInsを作成せよ。
void aryIns(int[] a,int idx, int x)
挿入に伴ってa[idx]～a[a.length -2] を一つ後方にずらさなければならない。
 */
public class e07_20 {
	/**
	 * 要素a[idx]にxを挿入するメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 編集対象の配列
	 * @param idx 挿入する要素のインデックス
	 * @param x 挿入する要素
	 */
	static void aryIns(int[] a, int idx, int x){
		// インデックスの値を調整するための値を宣言する
		final int ADJUST_INT = 1;
		// a[idx]より後ろの全要素を後方にずらす
		for(int index = a.length - ADJUST_INT; index > idx; index--){
			// 書き換えるインデックスのひとつ前のインデックスを求める
			int preIndex = index - ADJUST_INT;
			// ひとつ前の要素で次の要素を書き換える
			a[index] = a[preIndex];
		}
		// 要素a[idx]にxを挿入する
		a[idx] = x;
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

		// 挿入する要素のインデックスの入力を促す
		System.out.print("挿入する要素のインデックス：");
		// 入力値を削除する要素を入れる変数に代入
		int idx = stdIn.nextInt();

		// 挿入する要素の入力を促す
		System.out.print("値：");
		// 入力値を挿入する要素を入れる変数に代入
		int insert = stdIn.nextInt();

		//  要素x[idx]にinsertを挿入する
		aryIns(x, idx, insert);

		// 処理の内容を表示
		System.out.println("x[" + idx + "]に" + insert + "を挿入しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < number; index++){
			// 配列の要素の値を表示する
			System.out.println("x[" + index + "] = " + x[index]);
		}
	}
}
