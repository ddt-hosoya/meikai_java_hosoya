package e06;
/*
4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ。
各要素の値はキーボードから読み込むこと。
 */
import java.util.Scanner;

public class e06_16 {
	public static void main(String[] arg){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 行列の数を定数化
		final int ADJUST_LINE = 4;
		// 行列の数を定数化
		final int ADJUST_COLUMN = 3;
		// 4行3列の配列を生成
		int[][] arrayA = new int[ADJUST_LINE][ADJUST_COLUMN];
		// 3行4列の配列を生成
		int[][] arrayB = new int[ADJUST_COLUMN][ADJUST_LINE];
		// 積を入れる変数を宣言
		int product;

		// ユーザに対しての説明を表示
		System.out.println("要素の値を入力してください。");

		// 4行3列の配列の要素の入力
		// 行の繰り返し
		for(int lineA = 0; lineA < ADJUST_LINE; lineA++){
			// 列の繰り返し
			for(int columnA = 0; columnA < ADJUST_COLUMN; columnA++){
				// 入力を行う要素を表示
				System.out.print("arrayA[" + lineA + "][" + columnA + "] = ");
				// 入力値を要素に代入
				arrayA[lineA][columnA] = stdIn.nextInt();
			}
		}

		// 3行4列の配列の要素の入力
		// 行の繰り返し
		for(int lineB = 0; lineB < ADJUST_COLUMN; lineB++){
			// 列の繰り返し
			for(int columnB = 0; columnB < ADJUST_LINE; columnB++){
				// 入力を行う要素を表示
				System.out.print("arrayB[" + lineB + "][" + columnB + "] = ");
				// 入力値を要素に代入
				arrayB[lineB][columnB] = stdIn.nextInt();
			}
		}

		// 4行3列の配列の行
		for(int lineA = 0; lineA < ADJUST_LINE; lineA++){
			// 4行3列の配列の列
			for(int columnA = 0; columnA < ADJUST_COLUMN; columnA++){
				// かける数を変数に代入する
				int multiplierA = arrayA[lineA][columnA];
				// 3行4列の配列の行
				for(int lineB = 0; lineB < ADJUST_COLUMN; lineB++){
					// 3行4列の配列の列
					for(int columnB = 0; columnB < ADJUST_LINE; columnB++){
						// かける数を変数に代入する
						int multiplierB =arrayB[lineB][columnB];
						// 積を求める
						product = multiplierA*multiplierB;
						// 積を表示する
						System.out.println("arrayA[" + lineA +"][" + columnA +"] * "
								+ "arrayB[" + lineB +"][" + columnB +"] = " + product);
					}
				}
			}
		}
	}
}
