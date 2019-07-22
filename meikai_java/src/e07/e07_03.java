package e07;
import java.util.Scanner;
/*
三つのint型引数a,b,cの中央値を求めるメソッドmedを作成せよ。
int med(int a, int b, int c)
 */
public class e07_03 {
	/**
	 *  三つのint型引数a,b,cの中央値を求めるメソッド
	 *
	 *  @author t.hosoya
	 *  @since 20190612
	 *
	 */
	static int med(int a, int b, int c){
		// cを仮に中央値とする
		int med = c;
		// aを仮に最小値とする
		int min = a;
		// aを仮に最大値とする
		int max = a;

		// bが最小値より小さい場合bを最小値とする
		if(b < min){ min = b; }
		// bが最大値より大きい場合bを最大値とする
		if(b > max){ max = b; }
		// cが最小値より小さい場合、最小値に入っていた値を中央値とする
		if(c < min){ med = min; }
		// cが最大値より大きい場合、最大値に入っていた値を中央値とする
		if(c > max){ med = max; }
		// 中央値を返却する
		return med;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値a：");
		// 入力値を中央値を求めるための変数にいれる
		int a = stdIn.nextInt();
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値b：");
		// 入力値を中央値を求めるための変数にいれる
		int b = stdIn.nextInt();
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値c：");
		// 入力値を中央値を求めるための変数にいれる
		int c = stdIn.nextInt();

		// 中央値を求める
		int result = med(a, b, c);
		// 中央値を表示する
		System.out.println("中央値は"+result+"です。");

	}
}
