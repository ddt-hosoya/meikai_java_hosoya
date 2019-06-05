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
		do{
			// ユーザーに対して正の整数値の入力を促す
			System.out.print("正の整数値：");
			// 入力値をカウントダウン開始の数とする変数に代入する
			startNumber = stdIn.nextInt();
		// 入力値が0以下の場合処理を繰り返す
		}while(startNumber <= 0);
		// 表示する値を入れる変数countdownを入力値で初期化し、countdownが0になるまで処理を繰り返す。
		// 処理実行後にcountdownをデクリメントする。
		for(int countdown = startNumber; countdown >= 0; countdown--){
			// 数を表示する
			System.out.println(countdown);
		}
	}

}
