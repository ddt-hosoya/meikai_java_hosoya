package e04;
/*
読み込んだ整数値の符号を判定するList3-5のプログラム(p.58)を、
好きなだけ何度でも繰り返して入力・表示できるようにしたプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_01 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 繰り返し行うか判定する変数を宣言
		int retry;

		do {
			// ユーザーに対して入力の制約を表示
			System.out.print("整数値：");
			// 入力値を符号を判定するための変数に代入
			int n = stdIn.nextInt();
			// 入力値が0より大きい場合
			if (n > 0){
				// 正であることを表示
				System.out.println("その値は正です。");
			// 入力値が0より小さい場合
			}else if (n < 0){
				// 負であることを表示
				System.out.println("その値は負です。");
			// 入力値が0の場合
			}else{
				// 0であることを表示
				System.out.println("その値は0です。");
			}
			// ユーザーに対して繰り返し処理を行うかをたずねる
			System.out.print("もう一度？ 1…Yes / 0…No：");
			// 入力値を繰り返し行うか判定する変数に代入
			retry = stdIn.nextInt();
		// retryが1であれば繰り返し処理を行う
		} while(retry == 1);

	}

}
