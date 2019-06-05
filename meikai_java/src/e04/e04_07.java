package e04;
/*
読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
表示は*と+を交互に行うこと。
 */
import java.util.Scanner;
public class e04_07 {
	public static void main(String[] arg){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して表示する個数の入力を促す
		System.out.print("何個表示しますか：");
		// 入力値を表示する個数を判定するための変数に代入する
		int number = stdIn.nextInt();
		// 繰り返し処理を行う回数をカウントするための変数に代入する
		int count = 0;
		// 繰り返し処理の回数を
		final int ADJUST_INT = 2;

		// 表示する個数より繰り返し処理の回数が小さい場合処理を行う
		while(count < number){
			// 繰り返し処理の回数が偶数の場合
			if((count%ADJUST_INT) == 0){
				// *を表示する
				System.out.print('*');
			// 繰り返し処理の回数が奇数の場合
			}else{
				// +を表示する
				System.out.print('+');
			}
			// 繰り返し処理の回数をインクリメントする
			count++;
		}
	}
}
