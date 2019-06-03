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
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーが入力する文字の制約を表示する
		System.out.print("整数値：");
		// 入力値を割られる数として変数に代入
		int inputInt = stdIn.nextInt();
		// 仕様である3で割った余りを検査するための数値を定数化
		final int ADJUST_INT = 3;
		// 仕様である3で割った余りを求め、その値を入れる変数を宣言
		int remainder;

		// 入力値が正の数の場合
		if (inputInt > 0) {
			// 仕様である3で割った値が何であるかを求めるため余りを計算する
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
			// 適切な値以外が入力された主旨を表示する。
			System.out.println("正でない値が入力されました。");
		}
	}

}
