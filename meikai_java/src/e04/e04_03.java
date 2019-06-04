package e04;
/*
右に示すように、二つの整数値を読み込んで、
小さいほうの数以上で大きいほうの数以下の全整数を
小さいほうから順に表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e04_03 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値A：");
		// 入力値を大きいほうの数小さいほうの数を判定するための変数に代入する
		int inputFirst = stdIn.nextInt();
		// 整数値の入力を促す
		System.out.print("整数値B：");
		// 入力値を大きいほうの数小さいほうの数を判定するための変数に代入する
		int inputSecond = stdIn.nextInt();

		// 小さいほうの数をいれる変数を一つ目の入力値で初期化
		int min = inputFirst;
		// 大きいほうの数をいれる変数を二つ目の入力値で初期化
		int max = inputSecond;
		// 一つ目の入力値が二つ目の入力値より大きい場合
		if(inputFirst > inputSecond){
			// 小さいほうの数をいれる変数にinputSecondを代入
			min = inputSecond;
			// 大きいほうの数をいれる変数にinputFirstを代入
			max = inputFirst;
		}
		// 繰り返し処理を行う
		do {
			// minの値を表示する
			System.out.print(min + " ");
			// minをインクリメントする
			min = min + 1;
		// minが入力した大きいほうの数に満たなければ繰り返し処理を行う
		} while(min != max);

		// 入力した大きいほうの数を表示する
		System.out.print(max);
	}

}
