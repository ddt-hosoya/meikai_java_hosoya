package e03;
/*
二つの整数を読み込んで小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ。
ただし、二つの整数値が等しい場合は右に示すように『二つの値は同じです。』と表示すること。
 */
import java.util.Scanner;
public class e03_14 {
	public static void main(String[] args){
		// 入力機能をを実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値：");
		// 入力値を小さいほうの値、大きいほうの値を検査するための変数に代入
		int inputFirst = stdIn.nextInt();
		// ユーザーに対して入力値の制約を表示する
		System.out.print("整数値：");
		// 入力値を小さいほうの値、大きいほうの値を検査するための変数に代入
		int inputSecond = stdIn.nextInt();

		// 小さいほうの値をいれる変数min、大きいほうの値をいれる変数maxを宣言する
		int min, max;
		// 二つの入力値が等しい場合
		if(inputFirst == inputSecond){
			// 『二つの値は同じです。』と表示する
			System.out.println("二つの値は同じです。");
		// 二つの入力値が等しくない場合
		} else {
			// inputFirstの方が小さい場合
			if(inputFirst < inputSecond){
				// minにinputFirstを代入する
				min = inputFirst;
				// maxにinputSecondを代入する
				max = inputSecond;
			// inputFirstの方が大きい場合
			} else {
				// minにinputSecondを代入する
				min = inputSecond;
				// maxにinputFirstを代入する
				max = inputFirst;
			}
			// 小さいほうの値を表示する
			System.out.println("小さい方の値は" + min + "です。");
			// 大きいほうの値を表示する
			System.out.println("大きい方の値は" + max + "です。");
		}

	}
}
