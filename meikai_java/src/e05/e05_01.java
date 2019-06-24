package e05;

import java.util.Scanner;
/*
10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 */
public class e05_01 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して整数の入力を促す
		System.out.print("整数：");
		// 入力値を10進数の数として宣言
		int decimal = stdIn.nextInt();

		// 10進数の数をを8進数で表示
		System.out.printf("8進数では%oです。\n", decimal);
		// 10進数の数をを16進数で表示
		System.out.printf("16進数では%xです。\n", decimal);
	}
}
