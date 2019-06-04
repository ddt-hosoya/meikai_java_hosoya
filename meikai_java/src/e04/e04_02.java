package e04;
/*
二桁の整数値（10～99）を当てさせる《数当てゲーム》を作成せよ。
 */
import java.util.Random;
import java.util.Scanner;

public class e04_02 {
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 0～89の乱数を生成する
		int randomNo = rand.nextInt(90);
		// 仕様である二桁の整数10～99を満たすための調整値10を定数化
		final int ADJUST_INT = 10;
		// 0～89の乱数に調整値を足して仕様である二桁の整数10～99の値を生成し変数に代入
		int no = randomNo + ADJUST_INT;

		// ゲームの開始文言を表示
		System.out.println("数当てゲーム開始！！");
		// 当てる数の範囲を表示
		System.out.println("10～99の数を当ててください");

		// 入力値を数が当たっているか判定するための変数を宣言する
		int expectedInt;
		// 繰り返し処理を記載する
		do {
			// ユーザーに対して予想した数の入力を促す
			System.out.print("いくつかな：");
			// 入力値を数が当たっているか判定するための変数に代入する
			expectedInt = stdIn.nextInt();
			// 入力値が当てる数よりも小さい場合
			if(expectedInt > no){
				// 当てる数が入力値より小さい数であるという文言を表示する
				System.out.println("もっと小さな数だよ。");
			// 入力値が当てる数よりも大きい場合
			} else if(expectedInt < no){
				// 当てる数が入力値より大きい数であるという文言を表示する
				System.out.println("もっと大きな数だよ。");
			}
		// 入力値と当てる数が一致している場合
		}while(expectedInt != no);
		// 正解の場合の文言を表示する
		System.out.println("正解です。");
	}
}
