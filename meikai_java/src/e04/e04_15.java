package e04;
/*
身長と標準体重の対応表を表示するプログラムを作成せよ。
表示する身長の範囲（開始/終了/増分）は、整数値として読み込むこと。
※標準体重は(身長-100)×0.9によって求められる。
*/
import java.util.Scanner;
public class e04_15 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		// 対応表のはじまりの身長をいれる変数を宣言する
		int heightStart;
		// 対応表のおわりの身長をいれる変数を宣言する
		int heightEnd;
		// 対応表の表示する間隔をいれる変数を宣言する
		int interval;

		// プログラムの説明を表示する
		System.out.println("身長と体重の対応表を表示する。");

		// 対応表のはじまりの身長の入力を受け、0以下ならばもう一度処理を繰り返す
		for(heightStart = 0; heightStart <= 0; heightStart = stdIn.nextInt()){
			// 対応表のはじまりの身長の入力を促す
			System.out.print("何cmから:");
		}
		// 対応表のおわりの身長の入力を受け、はじまりの身長以下ならばもう一度処理を繰り返す
		for(heightEnd = 0; heightEnd <= heightStart; heightEnd = stdIn.nextInt()){
			// 対応表のおわりの身長の入力を促す
			System.out.print("何cmまで:");
		}
		// 対応表の表示する間隔の入力を受け、0以下ならばもう一度処理を繰り返す
		for(interval = 0; interval <= 0; interval = stdIn.nextInt()){
			// 対応表の表示する間隔の入力を促す
			System.out.print("何cmごと:");
		}
		// 対応表の項目を表示する
		System.out.println("身長 標準体重");

		// 始まりの身長からおわりの身長までを指定した間隔ごとに表示し、それに対応する標準体重を表示する
		for(int height = heightStart; height <= heightEnd; height += interval){
			// 標準体重を計算する
			double standardWeight = (height - 100) * 0.9;
			// 身長と標準体重表示する
			System.out.println(height + " " + standardWeight);
		}
	}
}
