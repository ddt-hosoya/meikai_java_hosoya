package e03;
/*
キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_12 {
	public static void main(String[] args){
		// Scannerクラスの標準入力ストリームを実体化する
		Scanner stdIn = new Scanner(System.in);
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputIntFirst = stdIn.nextInt();
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputIntSecond = stdIn.nextInt();
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputIntThird = stdIn.nextInt();

		// minを最初の入力値で初期化する
		int min = inputIntFirst;

		// 二つ目の入力値がminより小さい場合
		if(inputIntSecond < min){
			// 二つ目の入力値をminに代入する
			min = inputIntSecond;
		}

		// 三つ目の入力値がminよりも小さい場合
		if(inputIntThird < min){
			// 三つ目の入力値をminに代入する
			min = inputIntThird;
		}

		// 最小値を表示する
		System.out.println("最小値は" + min + "です。");
	}

}
