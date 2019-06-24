package e04;
/*
合計だけでなく平均m求めるようにList4-17およびList4-18のプログラムを書き換えよ。
このクラスではList4-17を書き換える。
 */

import java.util.Scanner;

public class e04_25_1 {
	public static void main(String[] args) {
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// プログラムの説明を表示
		System.out.println("整数を加算します。");
		// 入力値を加算する回数を宣言
		int n;
		// 繰り返し処理
		do{
			// ユーザーに対して入力を促す
			System.out.print("何個加算しますか。：");
			// 入力値を加算する回数を判定するための変数に代入
			n = stdIn.nextInt();
		// 入力値が0以下の場合繰り返す
		}while(n <= 0);

		// 合計値を求めるための変数を初期化
		int sum = 0;
		// 何回加算したかを検証するための変数を宣言
		int i;
		// 何回加算するかで入力された分加算処理を繰り返す
		for (i = 0; i < n; i++){
			// ユーザーに対して入力を促す
			System.out.print("整数（0で終了）：");
			// 入力値を加算する数として変数に代入
			int t = stdIn.nextInt();
			// 0が入力された場合加算処理から抜ける
			if (t == 0){ break; }
			// 合計値に入力値を加算する
			sum += t;
		}
		// 平均値mを求める
		int m = sum / i;
		// 合計値を表示
		System.out.println("合計は" + sum + "です。");
		// 平均値を表示
		System.out.println("平均は" + m + "です。");
	}

}
