package e03;
/*
二つの実数値を読み込んで大きいほうの値を表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_09 {
	public static void main(String[] args){
		// Scannerクラスの標準入力ストリームを実体化する
		Scanner stdIn = new Scanner(System.in);
		// 実数値：と表示する
		System.out.print("実数値：");
		// 入力値をdouble型で宣言
		double inputFirst = stdIn.nextDouble();
		// 実数値：と表示する
		System.out.print("実数値：");
		// 入力値をdouble型で宣言
		double inputSecond = stdIn.nextDouble();
		// 最初の入力値が大きければ変数maxに代入し、そうでなければ次の入力値を変数maxに代入する。
		double max = inputFirst > inputSecond ? inputFirst : inputSecond;
		// 大きいほうの値を表示する。
		System.out.println("大きいほうの値は" + max + "です。");

	}

}
