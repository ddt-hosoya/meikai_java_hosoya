package e04;
/*
読み込んだ整数値のすべての約数を表示するList4－13を書き換えて、約数の表示が終わった後に、
約数の個数を表示するプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_17 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して整数値の入力を促す
		System.out.print("整数値：");
		// 入力値を約数を検査するための変数に代入
		int n = stdIn.nextInt();
		// 約数の数をカウントする変数を宣言
		int count = 0;
		// 1からnまでの数を繰り返しnの約数かどうか検査する
		for(int i = 1; i <= n; i++){
			// nを数で割り切れる場合その数は約数であるので処理をおこなう
			if(n % i == 0){
				// 約数を表示する
				System.out.println(i);
				// 約数の数をカウントする
				count++;
			}
		}
		// 約数の数を表示する
		System.out.println("約数の数は" + count + "です。");
	}
}
