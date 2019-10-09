package e07;
/*
二つのint型整数a,bの最小値、三つのint型整数a,b,cの最小値、配列aの要素の最小値を求める、
以下に示す多重定義されたメソッドを作成せよ。
int min(int a, int b)
int min(int a, int b, int c)
int min(int[] a)
 */
import java.util.Scanner;

public class e07_30 {
	/**
	 * 二つのint型整数a,bの最小値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @return int 最小値
	 */
	static int min(int a, int b){
		// 二つの値を比較して小さいほうを返す
		return a < b ? a : b;
	}
	/**
	 * 三つのint型整数a,b,cの最小値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @param c int型整数値c
	 * @return int 最小値
	 */
	static int min(int a, int b, int c){
		// aの値を仮に最小値とする
		int min = a;
		// 最小値よりもbが小さければbを最小値とする。
		if(b < min){ min = b; }
		// 最小値よりもcが小さければcを最小値とする。
		if(c < min){ min = c; }
		// 最小値を返す
		return min;
	}
	/**
	 * 配列aの要素の最小値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param a 配列a
	 * @return int 最小値
	 */
	static int min(int[] a){
		// 配列aの一つ目の要素を仮に最小値とする
		int min = a[0];
		// 要素数分処理を繰り返す
		for(int index = 1; index < a.length; index++){
			// 要素の値が最小値よりも小さい場合
			if(min > a[index]){
				// その要素を最小値とする
				min = a[index];
			}
		}
		// 最小値を返す
		return min;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// aの値の入力を促す
		System.out.print("aの値：");
		// 入力値を最小値を求めるための変数にいれる
		int a = stdIn.nextInt();
		// bの値の入力を促す
		System.out.print("bの値：");
		// 入力値を最小値を求めるための変数にいれる
		int b = stdIn.nextInt();
		// cの値の入力を促す
		System.out.print("cの値：");
		// 入力値を最小値を求めるための変数にいれる
		int c = stdIn.nextInt();

		// 配列aArrayに入力した値を入れる
		int[] aArray = new int[]{a, b, c};

		System.out.println("a, bの最小値は" + min(a, b) + "です。");
		System.out.println("a, b, cの最小値は" + min(a, b, c) + "です。");
		System.out.println("配列aArrayの最小値は" + min(aArray) + "です。");
	}

}
