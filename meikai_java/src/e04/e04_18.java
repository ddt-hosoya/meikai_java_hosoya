package e04;
/*
右に示すように、1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_18 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		System.out.print("nの値：");
		int n = stdIn.nextInt();
		// 1からnまで処理を繰り返す
		for(int number = 1; number <= n; number++){
			// 数を2乗した結果を求める
			int square = number * number;
			// 2乗した結果を表示する
			System.out.println(number + "の2乗は" + square + "です。");
		}
	}
}
