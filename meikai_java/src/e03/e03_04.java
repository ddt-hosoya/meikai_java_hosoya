package e03;
/*
二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
『aのほうが大きいです。』『bのほうが大きいです。』『aとbは同じ値です。』
 */

import java.util.Scanner;

public class e03_04 {
	public static void main(String[] args) {
		// Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);

		// 文字を表示する。
		System.out.print("値を入力してください。a：");
		// 入力した文字を変数aに代入する。
		int a = stdIn.nextInt();

		// 文字を表示する。
		System.out.print("値を入力してください。b：");
		// 入力した文字を変数bに代入する。
		int b = stdIn.nextInt();

		// aとbが同じ値でない場合で、aからbを引いた値が0より大きい場合
		if ((a - b) > 0) {
			// aのほうが大きいです。と表示する。
			System.out.println("aのほうが大きいです。");
		// aとbが同じ値でない場合で、aからbを引いた値が0より小さい場合
		} else if ((a - b) < 0) {
			// bのほうが大きいです。と表示する。
			System.out.println("bのほうが大きいです。");
		// aとbが同じ値の場合
		} else {
			// aとbは同じ値です。と表示する。
			System.out.println("aとbは同じ値です。");
		}
	}

}
