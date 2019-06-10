package e03;
/*
キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_12 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を最小値を検査するための変数に代入
		int inputIntFirst = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を最小値を検査するための変数に代入
		int inputIntSecond = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を最小値を検査するための変数に代入
		int inputIntThird = stdIn.nextInt();

		// 最小値を格納する変数minを最初の入力値で初期化する
		int min = inputIntFirst;

		// 二つ目の入力値がminより小さい場合
		if(inputIntSecond < min){
			// 二つ目の入力値をminとする
			min = inputIntSecond;
		}

		// 三つ目の入力値がminよりも小さい場合
		if(inputIntThird < min){
			// 三つ目の入力値をminとする
			min = inputIntThird;
		}

		// 最小値を表示する
		System.out.println("最小値は" + min + "です。");
	}

}
