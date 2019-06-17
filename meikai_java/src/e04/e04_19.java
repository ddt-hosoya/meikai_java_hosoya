package e04;
/*
季節を求めるList4-1の月の読み込みにおいて、
1～12以外の値が入力された場合は再入力させるように修正したプログラムを作成せよ。
(do文の中にdo文が入る二重ループとなる。)
 */
import java.util.Scanner;

public class e04_19 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 季節を判定するための月を入れる変数を宣言する
		int month;
		// もう一度実行するかを判定するための変数を宣言する
		int retry;
		// 一度は実行し、もう一度実行するかの判定がYesならば繰り返し処理を行う
		do{
			// 一度は実行し、1～12月以外が入力された場合繰り返し処理を行う
			do{
				// ユーザーに対して月の入力を促す
				System.out.print("季節を求めます。\n何月ですか。：");
				// 入力値を季節を判定するための変数に代入する
				month = stdIn.nextInt();
			// 1～12月以外が入力された場合繰り返し処理を行う
			}while(month < 1 || month > 12);

			// 3～5が入力された場合
			if(month >= 3 && month <= 5){
				// 判定を表示する
				System.out.println("それは春です。");
			// 6～8が入力された場合
			}else if(month >= 6 && month <= 8){
				// 判定を表示する
				System.out.println("それは夏です。");
			// 9～11が入力された場合
			}else if(month >= 9 && month <= 11){
				// 判定を表示する
				System.out.println("それは秋です。");
			// 12または1または2が入力された場合
			}else if(month == 12 || month == 1 || month == 2){
				// 判定を表示する
				System.out.println("それは冬です。");
			}
			// もう一度季節の判定を行うかをユーザーにたずねる
			System.out.print("もう一度？ 1…Yes/ 2…No：");
			// 	入力値をもう一度実行するかを判定するための変数に代入する
			retry = stdIn.nextInt();
		// もう一度判定するかがYesならば繰り返し処理を行う
		}while(retry == 1);
	}
}
