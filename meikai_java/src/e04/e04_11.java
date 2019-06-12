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

		// 入力値が0以下の場合、入力を促す処理を繰り返す
		// 入力した値をカウントダウン開始の数を入れる変数に代入する
		for(startNumber = 0; startNumber <= 0; startNumber = stdIn.nextInt()){
			// ユーザーに対して正の整数値の入力を促す
			System.out.print("正の整数値：");
		}
		// カウントダウンを入力した値startNumberから開始し0になるまで繰り返す。
		// 表示処理実行後にカウントダウンする。
		for(int countdown = startNumber; countdown >= 0; countdown--){
			// 数を表示する
			System.out.println(countdown);
		}
	}

}
