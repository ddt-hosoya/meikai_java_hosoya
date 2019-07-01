package e06;
/*
テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。
人数と点数は、キーボードから読み込むこと。
 */

import java.util.Scanner;

public class e06_06 {
	public static void main(String[] arg){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 人数をいれる変数を宣言
		int peopleNumber;
		// 繰り返し処理
		do{
			// ユーザーに対して人数の入力を促す
			System.out.print("人数：");
			// 入力値を配列の要素数として代入
			peopleNumber = stdIn.nextInt();
		// 人数が0人以下の場合繰り返す
		}while(peopleNumber <= 0);
		// 入力した要素数の配列を生成
		int[] scoresArray = new int[peopleNumber];

		// 説明を表示
		System.out.println(peopleNumber + "人の点数を入力せよ。");

		// 人数の分だけ処理を繰り返す
		for(int index = 0; index < peopleNumber; index++){
			// ユーザーに対して点数の入力を促す
			System.out.print((index + 1) + "番の点数：");
			// 入力値を要素に代入する
			scoresArray[index] = stdIn.nextInt();
		}

		// 最高点を求めるための点数を初期化
		int max = scoresArray[0];
		// 最低点を求めるための点数を初期化
		int min = scoresArray[0];
		// 合計点を求めるための点数を初期化
		int sum = 0;
		// 平均点を求めるための変数を初期化
		double average = 0.0;

		// 要素数の分だけ処理を繰り返す
		for(int index = 0; index < scoresArray.length; index++){
			// その時点での最高点よりも値が大きければその値の最高点とする
			if(scoresArray[index] > max){ max = scoresArray[index]; }
			// その時点での最低点よりも値が小さければその値を最低点とする
			if(scoresArray[index] < min){ min = scoresArray[index]; }
			// 要素の値を合計点に加算する
			sum += scoresArray[index];
		}
		// 平均点を求める
		average = (double)sum / scoresArray.length;

		// 合計点を表示
		System.out.println("合計点：" + sum );
		// 平均点を表示
		System.out.println("平均点：" + average );
		// 最高点を表示
		System.out.println("最高点：" + max );
		// 最低点を表示
		System.out.println("最低点：" + min );
	}
}
