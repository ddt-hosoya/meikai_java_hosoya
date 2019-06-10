package e03;
/*
右の図にさすように、二つの整数値を読み込んで、それらの値の差が10以下であれば、
『それらの差は10以下です。』と表示し、そうでなければ『それらの差は11以上です。』と表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_11 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);

		// 差が10かどうかを判定数るための値10を定数化
		final int ADJUST_INT = 10;

		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値A：");
		// 入力値を仕様である差を検査するための変数に代入する
		int inputIntA = stdIn.nextInt();
		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値B：");
		// 入力値を仕様である差を検査するための変数に代入する
		int inputIntB = stdIn.nextInt();

		// 大きいほうの値から小さいほうの値を引き、結果の差を変数に代入
		int difference = inputIntA > inputIntB ? (inputIntA - inputIntB) : (inputIntB - inputIntA);

		// 差が10以下の場合
		if (difference <= ADJUST_INT){
			// 差が10以下の文言を表示
			System.out.println("それらの差は10以下です。");
		// 差が11以上の場合
		} else {
			// 差が11以上の文言を表示
			System.out.println("それらの差は11以上です。");
		}
	}
}
