package e04;
/*
読み込んだ個数だけ*を表示するList4－11を書き換えて、5個表示するごとに改行するプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_16 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して表示する個数の入力を促す
		System.out.print("何個表示しますか：");
		// 入力値を何個表示するか判定するための変数に代入する
		int n = stdIn.nextInt();

		// 5の倍数回目を判定する為の調整値を定数化
		int ADJUST_INT = 5;

		// 繰り返し回数をiとし、処理実行後に回数をカウントする。
		// 繰り返し回数が表示個数になるまで繰り返す。
		for(int i = 0; i < n; i++){
			// 繰り返し回数初回を除き、5回ごとに改行をいれる
			if((i != 0) &&(i % ADJUST_INT == 0)){
				// 改行をいれる
				System.out.println();
			}
			// *を表示する
			System.out.print('*');
		}
	}


}
