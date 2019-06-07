package e04;

import java.util.Random;
import java.util.Scanner;

/*
List4-3の数当てゲームのプレーヤーが入力できる回数に制限を設けたプログラムを作成せよ。
制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 */

public class e04_27 {

	public static void main(String[] args) {
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 当てるべき数を0～99の乱数として生成
		int no = rand.nextInt(100);
		// 制限回数を定数化
		final int LIMIT = 10;
		// ゲーム開始文言を表示
		System.out.println("数当てゲーム開始！");
		// 制限回数内に数を当てる主旨の文言を表示
		System.out.println("0～99の数を" + LIMIT +"回以内に当ててください。");
		// 数当てゲームのラベル
		Game: {
			//
			int inputInt;
			// 制限回数分数当てゲームを繰り返す
			for(int count = 0; count < LIMIT; count++){
				// ユーザーに対して入力を促す
				System.out.print("いくつかな：");
				// 入力値を数が合っているか検証するための変数に代入
				inputInt = stdIn.nextInt();

				// 入力値が当てるべき数より大きい場合
				if(inputInt > no){
					// ヒントを表示
					System.out.println("もっと小さな数だよ。");
				// 入力値が当てるべき数より小さい場合
				}else if (inputInt < no){
					// ヒントを表示
					System.out.println("もっと大きな数だよ。");
				// 入力値が当てるべき数と一致している場合
				}else{
					// 正解である主旨を表示する
					System.out.println("正解です。");
					// 正解した場合ゲームから抜ける
					break Game;
				}
			}
			// 正解せずに制限回数が過ぎた場合、正解を表示する
			System.out.println("正解は"+ no + "です。");
		}
	}
}
