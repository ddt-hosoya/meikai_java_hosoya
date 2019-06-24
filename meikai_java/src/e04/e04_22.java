package e04;

import java.util.Scanner;

/*
n段のピラミッドを表示するプログラムを作成せよ。
第i行目には(i - 1) * 2 + 1個の＊記号を表示して、
最終行である第n行目には(n - 1) * 2 + 1個の＊記号を表示すること。
 */

public class e04_22 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// プログラムの説明を表示
		System.out.println("n段のピラミッドを表示する。");
		// ユーザーに対して入力を促す
		System.out.print("n段：");

		// 入力値を表示する段数とする変数に代入する
		int step = stdIn.nextInt();

		// 1段目から表示する最終段までいち段ごとに改行する
		for(int stepNumber = 1; stepNumber <= step; stepNumber++){
			// その段数目の時に表示する記号の数を求める
			int mark = (stepNumber - 1) * 2 + 1;
			// 最終段目で表示する記号の数を求める
			int finalMark = (step - 1) * 2 + 1;
			// 表示する文字を等分するための調整値を定数化
			final int ADJUST_INT = 2;
			// 最終段目で表示する記号数からその段数目の記号を引いた数を等分した数をスペースとする
			int space = (finalMark - mark) / ADJUST_INT;

			// 求めたスペースの数だけ表示処理を繰り返す
			for(int spaceNumber = space; spaceNumber > 0; spaceNumber--){
				// スペースを表示する
				System.out.print(" ");
			}
			// 求めた記号の数だけ表示処理を繰り返す
			for(int markNumber = mark; markNumber > 0; markNumber--){
				// 記号を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}

}
