package e04;

import java.util.Scanner;

/*
List4-16は左下が直角の直角三角形を表示するプログラムであった。
直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 */
// public class e04_21_1では直角が左上側のプログラムを作成する
public class e04_21_1 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// プログラムの説明を表示
		System.out.println("左上直角の三角形を表示する。");
		// ユーザーに対して入力を促す
		System.out.print("段数は：");
		// 入力値を何段表示するかを判定するための変数に代入する
		int step = stdIn.nextInt();

		// 入力した段数分改行を繰り返し処理を行う
		for(int stepNumber = step; stepNumber > 0; stepNumber--){
			// *を1段目から一段下がるごとに減じて表示する
			for(int width = stepNumber; width > 0; width--){
				// *を表示する
				System.out.print('*');
			}
			// 改行を行う
			System.out.println();
		}
	}
}
