package e07;
/*
三つのint型引数a,b,cの最小値を求めるメソッドminを作成せよ。
int min(int a, int b, int c)
 */
import java.util.Scanner;

public class e07_02 {
	// 三つのint型引数a,b,cの最小値を求めるメソッド
	static int min(int a, int b, int c){
		// aを仮に最小値とする
		int min = a;
		// 最小値よりもbが小さければbを最小値とする
		if(b < min){ min = b; }
		// 最小値よりもcが小さければcを最小値とする
		if(c < min){ min = c; }
		// 最小値を返却する
		return min;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値a：");
		// 入力値を最小値を求めるための変数にいれる
		int a = stdIn.nextInt();
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値b：");
		// 入力値を最小値を求めるための変数にいれる
		int b = stdIn.nextInt();
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値c：");
		// 入力値を最小値を求めるための変数にいれる
		int c = stdIn.nextInt();

		// 最小値を求める
		int result = min(a, b, c);
		// 最小値を表示する
		System.out.println("最小値は"+result+"です。");
	}
}
