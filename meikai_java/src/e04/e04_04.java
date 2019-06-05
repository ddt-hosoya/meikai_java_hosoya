package e04;
/*
List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e04_04 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// カウントダウン開始の文言を表示
		System.out.println("カウントダウンします。");
		// xを宣言する
		int x;
		// 繰り返し処理を行う
		do {
			// ユーザーに対して正の整数値の入力を促す
			System.out.print("正の整数値：");
			// 入力値をxに代入する
			x = stdIn.nextInt();
		// xが正の整数値でなければ繰り返し処理を行う
		} while(x <= 0);
		// 0以上の場合
		while(x >= 0){
			// xの値を表示する
			System.out.println(x);
			// xの値をデクリメントする
			x--;
		}
		// xが-1の場合
		if(x == -1){
			// 終了時-1である文言を表示する
			System.out.println("終了時のxの値は-1です。");
		}
	}
}
