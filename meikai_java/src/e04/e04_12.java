package e04;
/*
前問とは逆にカウントアップするプログラムを作成せよ。
 */
import java.util.Scanner;

public class e04_12 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// カウントアップ開始の文言を表示
		System.out.println("カウントアップします。");

		// ユーザーに対して正の整数の入力を促す
		System.out.print("正の整数：");
		// 入力値を変数に代入する
		int inputInt = stdIn.nextInt();

		// カウントアップの最後の数いれる変数を宣言する
		int endNumber;
		// 入力値が0以下である場合入力を促す文言を繰り返し表示する
		// 入力した値をカウントアップの最後の数いれる変数に代入する
		for(endNumber = inputInt; endNumber <= 0; endNumber = stdIn.nextInt()){
			// ユーザーに対して正の整数の入力を促す
			System.out.print("正の整数：");
		}

		// カウントアップを0から開始するようcountupを0で初期化し、endNumberの値まで繰り返し処理を行う
		// 表示処理実行後にcountupをインクリメントする
		for(int countup = 0; countup <= endNumber; countup++){
			// 数を表示する
			System.out.println(countup);
		}
	}
}
