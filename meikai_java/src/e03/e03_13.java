package e03;
/*
キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_13 {
	public static void main(String[] args){
		// Scannerクラスの標準入力ストリームを実体化する
		Scanner stdIn = new Scanner(System.in);
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputFirst = stdIn.nextInt();
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputSecond = stdIn.nextInt();
		// 整数値：と表示する
		System.out.print("整数値：");
		// 入力値をint型で宣言する
		int inputThird = stdIn.nextInt();

		// minを最初の入力値で初期化する
		int min = inputFirst;
		// maxを最初の入力値で初期化する
		int max = inputFirst;

		// medianを三つ目の入力値で初期化する
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
