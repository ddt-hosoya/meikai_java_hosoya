package e06;

import java.util.Scanner;

/*
クラス数・各クラスの人数・全員の点数を読み込んで点数の合計点と平均点を求めるプログラムを作成せよ。
点数の合計点と平均点はクラスごとのものと、全体のものとを表示すること。
 */

public class e06_19 {
	public static void main(String[] args) {
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 配列変数を宣言
		int[][] classScoreArray;
		// クラス数の入力を促す
		System.out.print("クラス数：");
		// 入力値をクラス数として読み込む
		int classNumber = stdIn.nextInt();
		// 入力された数の構成要素をもつ配列を生成
		classScoreArray = new int[classNumber][];

		// インデックス表示時の調整値
		final int ADJUST_INT = 1;

		// 改行する
		System.out.println();

		// 各クラスの人数と全員の点数を読み込み
		for (int line = 0; line < classNumber; line++) {
			// クラスの人数の入力を促す
			System.out.print((line + ADJUST_INT) + "組の人数：");
			// 入力値をクラスの人数として読み込む
			int peopleNumber = stdIn.nextInt();
			// 各クラスが人数に応じて配列を生成
			classScoreArray[line] = new int[peopleNumber];

			// 全員の点数の読み込み
			for (int column = 0; column < peopleNumber; column++) {
				// 何組何番の人の点数の入力を促す
				System.out.print((line + ADJUST_INT) + "組" + (column + ADJUST_INT) + "番の点数：");
				// 入力値を何組何番の人の点数として読み込む
				classScoreArray[line][column] = stdIn.nextInt();
			}
			// 改行する
			System.out.println();
		}
		// 組ごとに、合計、平均を表で表示する
		System.out.printf("%3s", "組");
		// 表で表示するための区切り文字
		System.out.printf(" | ");
		// 表で表示するための項目
		System.out.printf("%3s", "合計");
		// 表で表示するための項目
		System.out.printf("%3s\n", "平均");
		// 表で表示するための区切り文字
		System.out.printf("-----+---------------\n");

		// 全体の要素数をカウントするための変数を初期化
		int count = 0;
		// 全員の点数の合計を求めるための変数を初期化
		int sumAll = 0;
		// 全員の平均を求めるための変数を初期化
		double averageAll = 0;

		// 組ごとの合計点と平均点を求める
		for (int line = 0; line < classNumber; line++) {
			// 組ごとの点数の合計を求めるための変数を初期化
			int sum = 0;
			// 組ごとの点数の平均を求めるための変数を初期化
			double average = 0;
			// 組を表に表示
			System.out.printf("%3s", (line + ADJUST_INT) + "組");
			// 表を区切る文字を表示
			System.out.printf(" | ");
			// その組の全員の点数を調査
			for (int column = 0; column < classScoreArray[line].length; column++) {
				// 合計点に加算する
				sum += classScoreArray[line][column];
				// 平均点を求める
				average = (double)sum / (column + ADJUST_INT);
				// 通算の要素数を数える
				count++;
				// 通算の合計を求める
				sumAll += classScoreArray[line][column];
				// 通算の平均を求める
				averageAll = (double)sumAll / count;
			}
			// 組ごとの合計を表示
			System.out.printf("%3d", sum);
			// 組ごとの平均を表示
			System.out.printf("%6.1f\n", average);
		}
		// 表で表示するための区切り文字
		System.out.printf("-----+---------------\n");
		// 表で表示するための項目
		System.out.printf("%3s", "計");
		// 表で表示するための区切り文字
		System.out.printf(" | ");
		// 全員の点数の合計を表示
		System.out.printf("%3d", sumAll);
		// 全員の点数の平均を表示
		System.out.printf("%6.1f\n", averageAll);
	}
}
