package e06;

import java.util.Scanner;

/*
行数・各行の列数・各要素の値をキーボードから読み込むようにList6-18を書き換えたプログラムを作成せよ。
 */

public class e06_18 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 配列変数を宣言
		int[][] c;
		// 行数の入力を促す
		System.out.print("行数：");
		// 入力された数を行数として定数化
		final int LINE = stdIn.nextInt();
		// 入力された数の構成要素をもつ配列を生成
		c = new int[LINE][];

		// 各行の列数を読み込む
		for(int index = 0; index < LINE; index++){
			// 各行の列数の入力を促す
			System.out.print("c[" + index + "]の列数：");
			// 入力値を列数とする
			int column = stdIn.nextInt();
			// 入力された数の構成要素をもつ配列を生成
			c[index] = new int[column];
		}
		// 各要素の値を読み込む
		for(int index = 0; index < c.length; index++){
			// 各行の各要素にたいして値の入力を促す
			for(int column = 0; column < c[index].length; column++){
				// 値の入力を促す
				System.out.print("c[" + index + "][" + column + "] = ");
				// 入力値を要素に代入
				c[index][column] = stdIn.nextInt();
			}
		}
		// 配列の要素をすべて表示
		for(int index = 0; index < c.length; index++){
			// 行ごとにすべての要素を表示する
			for(int column = 0; column < c[index].length; column++){
				// 構成要素を表示
				System.out.printf("%3d", c[index][column]);
			}
			// 改行する
			System.out.println();
		}
	}

}
