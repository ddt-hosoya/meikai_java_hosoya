package e07;

import java.util.Scanner;

/*
配列aの要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッドarrayRmvOfNを作成せよ。
削除はa[idx]より後ろの全要素をn個前方向にずらすことによって行うこと。
 */
public class e07_25 {
	static int[] arrayRmvOfN(int[] a, int idx, int n){
		// 要素数の調整値を定数化
		final int ADJUST_INT = 1;
		// 配列aの要素a[idx]を先頭とするn個の要素を削除した値を入れる配列を生成する
		int[] removeIntN;
		// idxの位置からn個の数が全要素数以下の場合
		if(a.length - ADJUST_INT - idx > n){
			// 要素a[idx]を削除した値をいれる配列を生成
			removeIntN = new int[(a.length - n)];
		// idxの位置からn個の数が全要素数より大きい場合
		}else{
			// 要素a[idx]を削除した値をいれる配列を生成
			removeIntN = new int[(idx)];
		}

		// 生成した配列にaの配列の値をコピーする
		for(int index = 0; index < removeIntN.length; index++){
			// インデックスが削除する要素のインデックスより小さい場合
			if(index < idx){
				// aの値を新しい配列の同じインデックスにいれる
				removeIntN[index] = a[index];
			// インデックスが削除する要素のインデックス以上の場合
			}else{
				if(index + n <= a.length - ADJUST_INT){
					// aの配列の次のインデックスの値を新しい配列にいれる
					removeIntN[index] = a[index + n];
				}
			}
		}
		// 生成した配列を返却する
		return removeIntN;
	}
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

		// 削除する要素の入力を促す
		System.out.print("削除する要素の先頭インデックス：");
		// 入力値を削除する要素を入れる変数に代入
		int idx = stdIn.nextInt();

		// 削除する要素の個数の入力を促す
		System.out.print("削除する要素の個数：");
		// 入力値を削除する要素を入れる変数に代入
		int n = stdIn.nextInt();

		// 配列aから要素a[idx]を削除した配列
		int[] removeIntN = arrayRmvOfN(a, idx, n);

		// 処理の内容を表示
		System.out.println("配列aから要素a[" + idx + "]から" + n + "個削除した配列を生成しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < removeIntN.length; index++){
			// 配列の要素の値を表示する
			System.out.println("removeInt[" + index + "] = " + removeIntN[index]);
		}
	}
}

