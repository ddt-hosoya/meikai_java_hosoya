package e07;
/*
配列aから要素a[idx]を削除した配列を返却するメソッドarrayRmvOfを作成せよ。
 */

import java.util.Scanner;

public class e07_24 {
	/**
	 * 配列aから要素a[idx]を削除した配列を返却するメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 配列a
	 * @param idx 削除する要素のインデックス
	 * @return int[] 要素a[idx]を削除した配列
	 */
	static int[] arrayRmvOf(int[] a, int idx){
		// 要素数の調整値を定数化
		final int REMOVE_NUMBER = 1;
		// 要素a[idx]を削除した値をいれる配列を生成
		int[] removeInt = new int[(a.length - REMOVE_NUMBER)];

		// 生成した配列にaの配列の値をコピーする
		for(int index = 0; index < removeInt.length; index++){
			// インデックスが削除する要素のインデックスより小さい場合
			if(index < idx){
				// aの値を新しい配列の同じインデックスにいれる
				removeInt[index] = a[index];
				// インデックスが削除する要素のインデックス以上の場合
			}else{
				// aの配列の次のインデックスの値を新しい配列にいれる
				removeInt[index] = a[index + REMOVE_NUMBER];
			}
		}
		// 生成した配列を返却する
		return removeInt;
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
		System.out.print("削除する要素のインデックス：");
		// 入力値を削除する要素を入れる変数に代入
		int idx = stdIn.nextInt();

		// 配列aから要素a[idx]を削除した配列
		int[] removeInt = arrayRmvOf(a, idx);

		// 処理の内容を表示
		System.out.println("配列aから要素a[" + idx + "]を削除した配列を生成しました。");

		// 削除後の配列の要素の値を表示する
		for(int index = 0; index < removeInt.length; index++){
			// 配列の要素の値を表示する
			System.out.println("removeInt[" + index + "] = " + removeInt[index]);
		}
	}
}
