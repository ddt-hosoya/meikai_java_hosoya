package e02;

/*
右に示すように、キーボードから読み込んだ整数値に10を加えた値と
10を減じた値を出力せよ。
 */
import java.util.Scanner;

public class e02_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 文字を表示する。
		System.out.println("整数値：");
		// キーボードで読み込んだ値を整数値として宣言する。
		int input = stdIn.nextInt();
		// 加減する値を初期化して宣言する。
		int operand = 10;

		// 10を加えた値の結果を表示する。
		System.out.println(operand + "を加えた値は" + (input + operand) + "です。");
		// 10を減じた値の結果を表示する。
		System.out.println(operand + "を減じた値は" + (input - operand) + "です。");
	}

}
