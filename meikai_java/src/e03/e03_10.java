package e03;
/*
二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_10 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値：");
		// 入力値の差を求めるための変数に代入
		int inputFirst = stdIn.nextInt();
		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値：");
		// 入力値の差を求めるための変数に代入
		int inputSecond = stdIn.nextInt();
		// 大きいほうの値から小さいほうの値を引いた差を変数に代入する
		int difference = inputFirst > inputSecond ? (inputFirst - inputSecond) : (inputSecond - inputFirst);
		// 二つの値の差を表示する
		System.out.println("二つの値の差は" + difference + "です。");
	}
}
