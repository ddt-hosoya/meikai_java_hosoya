package e04;
/*
右に示すように、正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_08 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 入力値を桁数を検査するための変数に代入する
		int inputInt;
		do{
			// ユーザーに対して整数値の入力を促す
			System.out.print("整数値：");
			inputInt = stdIn.nextInt();
		// 入力値が負の場合処理を繰り返す
		}while(inputInt <= 0);

		// 繰り返しの回数をカウントするための変数を0で初期化
		int count = 0;
		// 桁数を検査するための入力値を割る数10を定数化
		final int DIVIDE_INT = 10;

		// 入力値が0より大きい場合処理を繰り返す
		while(inputInt > 0){
			// 入力値を定数10でわる
			inputInt /= DIVIDE_INT;
			// 繰り返した回数をカウント
			count++;
		}

		// 桁数を表示
		System.out.println("その値は" + count + "桁です。");
	}

}
