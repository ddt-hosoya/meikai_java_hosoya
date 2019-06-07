package e05;
/*
論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。
 */

import java.util.Scanner;

public class e05_03 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力を促す
		System.out.print("整数a：");
		// 入力値をaとする
		int a = stdIn.nextInt();
		// ユーザーに対して入力を促す
		System.out.print("整数b：");
		// 入力値をbとする
		int b = stdIn.nextInt();

		// aとbが一致しているかどうかの判定を論理型の変数に代入
		boolean answer = (a == b);
		// aとbが一致しているかどうかの判定結果を表示
		System.out.println("a == b = " + answer);

	}
}
