package e03;
/*
キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_13 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を中央値を検査するための変数に代入
		int inputFirst = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を中央値を検査するための変数に代入
		int inputSecond = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値：");
		// 入力値を中央値を検査するための変数に代入
		int inputThird = stdIn.nextInt();

		// 小さいほうの値を入れる変数minを最初の入力値で初期化する
		int min = inputFirst;
		// 大きいほうの値を入れる変数maxを最初の入力値で初期化する
		int max = inputFirst;

		// 中央値を入れる変数medianを三つ目の入力値で初期化する
		int median = inputThird;

		// 二つ目の入力値がminより小さい場合minに値を代入する
		if(min > inputSecond){ min = inputSecond; }
		// 二つ目の入力値がmaxより大きい場合maxに値を代入する
		if(max < inputSecond){ max = inputSecond; }
		// 三つ目の入力値がminより小さい場合minをmedianに代入する
		if(min > inputThird){ median = min; }
		// 三つ目の入力値がmaxより大きい場合maxをmedianに代入する
		if(max < inputThird){ median = max; }

		// 中央値を表示する
		System.out.println("中央値は" + median + "です。");

	}
}
