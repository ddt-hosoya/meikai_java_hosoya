package e06;
/*
曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
・出題する曜日は乱数で生成する。
・学習者が望む限り何度も繰り返せる
・同一曜日を連続して出題しない
 */

import java.util.Random;
import java.util.Scanner;

public class e06_15 {
	public static void main(String[] args) {
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 英語の月名をもつ配列を生成
		String[] weekEnglish = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String[] weekJapnese = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日","土曜日", "日曜日"};

		// 学習プログラムの説明を表示
		System.out.println("英語の曜日名を小文字で入力してください。");
		// 乱数で曜日の値を生成するための値を定数化
		final int WEEKDAY = 7;
		// 同一曜日を連続して出題しないように直前に出題した曜日を保持しておく変数を初期化
		int previousWeekday = 7;
		// 再度出題するかどうかの回答者の返答をいれる変数を宣言
		int again;
		// 配列のインデックスを宣言
		int weekdayIndex;

		do{
			do{
				// 0から6の乱数で生成し、曜日の配列のインデックスとする
				weekdayIndex = rand.nextInt(WEEKDAY);
			// 生成した乱数が直前に出題した値と同じ場合、もう一度乱数の生成をおこなう
			}while(weekdayIndex == previousWeekday);

			// 正解するまで繰り返す
			while(true){
				// 曜日の日本語を表示して出題する
				System.out.print(weekJapnese[weekdayIndex] + "：");
				// 入力値を回答として変数に代入
				String inputString = stdIn.next();
				// 入力した文字列と英語の曜日名をもつ配列と比較して等しければ正解を表示
				if(weekEnglish[weekdayIndex].equals(inputString)){
					// 正解を表示して、出題を続けるかの入力を促す
					System.out.print("正解です。もう一度？ 1…Yes / 2…No :");
					// 入力値を再度出題するかどうかの回答者の返答をいれる変数にいれる
					again = stdIn.nextInt();
					// 出題した曜日を直前に出題した曜日を保持しておく変数にいれる
					previousWeekday = weekdayIndex;
					// 正解したのでwhile文を抜ける
					break;
				// 不正解の場合
				}else{
					// 違いますを表示
					System.out.println("違います。");
				}
			}
		// 再度出題するかどうかの回答者の返答がYesならばもう一度出題する
		}while(again == 1);
	}
}
