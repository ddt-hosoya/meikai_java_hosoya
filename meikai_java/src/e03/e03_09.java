package e03;
/*
二つの実数値を読み込んで大きいほうの値を表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_09 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力値の制約を表示する
		System.out.print("実数値：");
		// 入力値を仕様である大きいほうの値かどうかを比較するための変数として代入
		double inputFirst = stdIn.nextDouble();
		// ユーザーに対して入力値の制約を表示する
		System.out.print("実数値：");
		// 入力値を仕様である大きいほうの値かどうかを比較するための変数として代入
		double inputSecond = stdIn.nextDouble();
		// 最初の入力値が大きければ変数maxに代入し、そうでなければ次の入力値を変数maxに代入する。
		double max = inputFirst > inputSecond ? inputFirst : inputSecond;
		// 大きいほうの値を表示する。
		System.out.println("大きいほうの値は" + max + "です。");

	}

}
