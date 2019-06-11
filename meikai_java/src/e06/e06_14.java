package e06;

import java.util.Random;
import java.util.Scanner;

/*
月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
・出題する月の値は乱数で生成する。
・学習者が望む限り何度も繰り返せる。
・同一月を連続して出題しない。
文字列s1とs2が等しい（すべての文字が等しい）かどうかの判定はs1.equals(s2)によって行える。（p.490）
 */
public class e06_14 {
	public static void main(String[] args) {
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 英語の月名をもつ配列を生成
		String[] monthArray = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};

		// 学習プログラムの説明を表示
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で2文字目以降は小文字とします。");
		// 乱数で月の値を生成するための値を定数化
		final int MONTH = 12;
		// 乱数で生成した月の値を1～12にするための補正値を定数化
		final int ADJUST_MONTH = 1;
		// 同一月を連続して出題しないように直前に出題した月を保持しておく変数を初期化
		int previousMonth = 12;
		// 再度出題するかどうかの回答者の返答をいれる変数を宣言
		int again;
		// 英語の月名をもつ配列のインデックスを宣言
		int monthIndex;

		do{
			do{
				// 0から11の乱数で生成し、月の配列のインデックスとする
				monthIndex = rand.nextInt(MONTH);
			// 生成した乱数が直前に出題した値と同じ場合、もう一度乱数の生成をおこなう
			}while(monthIndex == previousMonth);

			// 正解するまで繰り返す
			while(true){
				// インデックスの値を1で補正して入力してほしい月を表示する
				System.out.print(monthIndex + ADJUST_MONTH + "月：");
				// 入力値を文字列としてもつ
				String inputString = stdIn.next();
				// 入力した文字列と月名をもつ配列と比較して等しければ正解を表示
				if(monthArray[monthIndex].equals(inputString)){
					// 正解を表示して、出題を続けるかの入力を促す
					System.out.print("正解です。。\nもう一度？ 1…Yes / 2…No :");
					// 入力値を再度出題するかどうかの回答者の返答をいれる変数にいれる
					again = stdIn.nextInt();
					// 出題した月のインデックスを直前に出題した月を保持しておく変数にいれる
					previousMonth = monthIndex;
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
