package e04;
/*
正の整数値を0までカウントダウンするList4-4をfor文で実現せよ。
 */
import java.util.Scanner;

public class e04_11 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// カウントダウン開始の文言を表示
		System.out.println("カウントダウンします。");

		// カウントダウン開始の数とする変数を宣言する
		int startNumber;

		// ユーザーに対して正の整数値の入力を促す
		System.out.print("正の整数値：");
		// 入力値をカウントダウン開始の数とする変数に代入する
		int inputInt = stdIn.nextInt();

		// カウントダウン開始する数をいれる変数に入力値を代入し、その数が0以下の場合再度入力を促す処理を繰り返す
		// 入力を促す処理を実行後に入力値をカウントダウン開始する数をいれる変数に入力値を代入
		for(startNumber = inputInt; startNumber <= 0; startNumber = stdIn.nextInt()){
			// ユーザーに対して正の整数値の入力を促す
			System.out.print("正の整数値：");			
		}
		// 表示する値を入れる変数countdownを入力値で初期化し、countdownが0になるまで処理を繰り返す。
		// 処理実行後にcountdownをデクリメントする。
		for(int countdown = startNumber; countdown >= 0; countdown--){
			// 数を表示する
			System.out.println(countdown);
		}
	}

}
