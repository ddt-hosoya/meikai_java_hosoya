package e02;

/*
右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e02_03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 文字を表示する。
		System.out.println("整数値：");
		// キーボードからの入力を整数値として宣言する。
		int input = stdIn.nextInt();

		// キーボードから読み込んだ整数値を表示する。
		System.out.println(input + "と入力しましたね。");
	}

}
