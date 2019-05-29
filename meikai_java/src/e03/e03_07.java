package e03;

/*
正の整数値を読み込んで、それを3で割った値に応じて『その値は3で割り切れます。』
『その値をを3で割った余りは1です。』『その値をを3で割った余りは2です。』のいずれかを表示する
プログラムを作成せよ。
※正でない値を読み込んだ場合は『正でない値が入力されました。』と表示すること。
 */
import java.util.Scanner;

public class e03_07 {
	public static void main(String[] args) {
		// Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);
		// 「整数値：」という文字を表示する。
		System.out.print("整数値：");
		// 入力した文字をint型で宣言する。
		int inputInt = stdIn.nextInt();
		// 割る数3を宣言する。
		final int ADJUST_INT = 3;
		// 余りを入れる変数を宣言する。
		int remainder;

		// 入力値が正の数の場合
		if (inputInt > 0) {
			// 余りを計算する。
			remainder = inputInt % ADJUST_INT;
			// 余りが0の場合
			if (remainder == 0) {
				// 割り切れるときの文言を表示する。
				System.out.println("『その値は3で割り切れます。』");
				// 余りが1の場合
			} else if (remainder == 1) {
				// 余りが1ときの文言を表示する。
				System.out.println("『その値をを3で割った余りは1です。』");
				// 余りが2の場合
			} else {
				// 余りが2ときの文言を表示する。
				System.out.println("『その値をを3で割った余りは2です。』");
			}
			// 入力値が正でない場合
		} else {
			// 『正でない値が入力されました。』と表示する。
			System.out.println("正でない値が入力されました。");
		}
	}

}
