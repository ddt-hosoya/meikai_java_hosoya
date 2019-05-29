package e03;

/*
正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます。』と表示し、
そうでなければ『その値は5で割り切れません。』と表示するプログラムを作成せよ。
※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
*/
import java.util.Scanner;

public class e03_05 {
	public static void main(String[] args) {
		// Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);

		// 正の整数値：という文字を表示する。
		System.out.print("正の整数値：");
		// 入力値をint型で宣言する。
		int inputInt = stdIn.nextInt();
		// 割る数5を宣言する。
		final int ADJUST_INT = 5;

		// 入力された値が正の場合
		if (inputInt > 0) {
			// 5で割り切れる場合
			if ((inputInt % ADJUST_INT) == 0) {
				// 『その値は5で割り切れます。』と表示する。
				System.out.println("その値は5で割り切れます。");
				// 5で割り切れない場合
			} else {
				// 『その値は5で割り切れません。』と表示する。
				System.out.println("その値は5で割り切れません。");
			}
			// 入力された値が正でない場合
		} else {
			// 『正でない値が入力されました。』と表示する。
			System.out.println("正でない値が入力されました。");
		}
	}
}
