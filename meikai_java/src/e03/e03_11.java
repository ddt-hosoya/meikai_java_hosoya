package e03;
/*
右の図にさすように、二つの整数値を読み込んで、それらの値の差が10以下であれば、
『それらの差は10以下です。』と表示し、そうでなければ『それらの差は11以上です。』と表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_11 {
	public static void main(String[] args){
		// Scannerクラスの標準入力ストリームを実体化する
		Scanner stdIn = new Scanner(System.in);
		// 整数値A：を表示する
		System.out.print("整数値A：");
		// 入力値をint型で宣言する
		int inputIntA = stdIn.nextInt();
		// 整数値A：を表示する
		System.out.print("整数値B：");
		// 入力値をint型で宣言する
		int inputIntB = stdIn.nextInt();

		// 大きいほうの値から小さいほうの値を引き、結果の差を変数に代入
		int difference = inputIntA > inputIntB ? (inputIntA - inputIntB) : (inputIntB - inputIntA);

		// 差が10以下の場合
		if (difference <= 10){
			// 差が10以下ですと表示する
			System.out.println("それらの差は10以下です。");
		// 差が11以上の場合
		} else {
			// 差が11以上ですと表示する
			System.out.println("それらの差は11以上です。");
		}
	}
}
