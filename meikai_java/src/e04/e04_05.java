package e04;
/*
List4-5のx--が--xとなっていたらどのような出力結果が得られるか検討せよ。
プログラムを作成して実行結果を確認すること。
 */
import java.util.Scanner;

public class e04_05 {
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
			// xの値を表示しデクリメントする
			System.out.println(--x);
		}
	}
}
/*
検討結果：
入力値が正の場合、入力した値は表示されず、インクリメントされた値からカウントダウンが開始する。
また、表示する条件のwhile文がx>=0となっているためカウントダウンを-1まで行う。
 */
