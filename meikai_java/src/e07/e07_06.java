package e07;
/*
引数mで指定された月の季節を表示するメソッドprintSeasonを作成せよ。
mが3, 4, 5であれば「春」、6, 7, 8であれば「夏」、9, 10, 11 であれば「秋」、
12, 1, 2であれば「冬」と表示し、それ以外であれば何も表示しないこと。
 */
import java.util.Scanner;

public class e07_06 {
	/** 季節を表示するメソッド
	 *
	 * @author t.hosoya
	 * @since 20190612
	 * @param n ユーザが指定した月
	 *
	 */
	static void printSeason(int n){
		// 3～5が入力された場合、春と表示
		if(n >= 3 && n <= 5){
			System.out.println("春");
		// 6～8が入力された場合、夏と表示
		} else if(n >= 6 && n <= 8) {
			System.out.println("夏");
		// 9～11が入力された場合、秋と表示
		} else if(n >= 9 && n <= 11) {
			System.out.println("秋");
		// 12または1または2が入力された場合、冬と表示
		} else if(n == 12 || n == 1 || n == 2) {
			System.out.println("冬");
		}
		// mainメソッドに返却する
		return;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 月の入力を促す
		System.out.print("月：");
		// 入力値を季節を判定するための月にいれる
		int n = stdIn.nextInt();
		// 季節を表示する
		printSeason(n);
	}

}
