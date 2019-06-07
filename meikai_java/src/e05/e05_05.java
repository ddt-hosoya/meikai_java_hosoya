package e05;

import java.util.Scanner;

/*
三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
平均はキャスト演算子を利用して求め、実数として表示すること。
 */
public class e05_05 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// プログラムの説明を表示
		System.out.println("整数値を読み込んで、その合計と平均を表示します。");
		// 合計値をいれる変数を初期化
		int sum = 0;
		// 三つの整数値の平均を求めるための調整値を定数化
		final int DIVIDE_DOUBLE = 3;

		// 入力とその入力値の加算を3回繰り返す
		for(int count = 0; count < DIVIDE_DOUBLE; count++){
			// 整数値の入力を促す
			System.out.print("整数値：");
			// 入力値を合計を求めるための変数に代入
			int inputInt = stdIn.nextInt();
			// 合計に入力値を加算
			sum += inputInt;
		}

		// 合計値をキャストして平均を実数値で求める
		double average = (double) sum / DIVIDE_DOUBLE;
		// 合計を表示
		System.out.println("合計は" + sum + "です。");
		// 平均を表示
		System.out.println("平均は" + average + "です。");
	}
}
