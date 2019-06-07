package e05;

import java.util.Scanner;

/*
float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 */
public class e05_02 {

	public static void main(String[] args) {
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して説明を表示
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		// ユーザーに対してFloat型の入力を促す
		System.out.print("x：");
		// 入力値を表示するための変数にいれる
		float inputFloat = stdIn.nextFloat();
		// ユーザーに対してDouble型の入力を促す
		System.out.print("y：");
		// 入力値を表示するための変数にいれる
		double inputDouble = stdIn.nextDouble();

		// 読み込んだFloat型を表示
		System.out.println("x = " + inputFloat);
		// 読み込んだDouble型を表示
		System.out.println("y = " + inputDouble);
	}

}
