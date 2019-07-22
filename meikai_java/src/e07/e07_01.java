package e07;

import java.util.Scanner;

/*
受け取ったint型引数の値nが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッドsignOfを作成せよ。

 */
public class e07_01 {
	/*
	 *  受け取ったint型引数の値nが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッド
	 *  @author t.hosoya
	 *  @since 20190612
	 */
	static int signOf(int n){
		// 負の場合の返却値を定数化
		int NEGATIVE = -1;
		// 0の場合の返却値を定数化
		int ZERO = 0;
		// 正の場合の返却値を定数化
		int POSITIVE = 1;

		// 負の場合、-1を返却する
		if(n < 0){ return NEGATIVE; }
		// 0の場合、0を返却する
		else if(n == 0){ return ZERO; }
		// 正の場合、1を返却する
		else { return POSITIVE; }
	}
	// mainメソッド
	public static void main( String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値：");
		// 入力値を正か負か0か検査するため変数に代入
		int inputInt = stdIn.nextInt();
		// 正か負か0か検査した結果を表示
		System.out.println("返却値は"+signOf(inputInt)+"です。");
	}

}
