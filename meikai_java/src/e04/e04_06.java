package e04;
/*
読み込んだ値が1未満であれば改行文字を出力しないようにList4-7及びList4-8を書き換えたプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_06 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して表示する数の入力を促す
		System.out.print("何個*を表示しますか：");
		// 入力値を繰り返し処理を行うか判定うる変数に代入する
		int n = stdIn.nextInt();
		// 繰り返し回数をカウントするための変数を初期化する
		int i = 0;
		// カウント回数が表示する個数より小さい場合繰り返し処理を行う
		while(i < n){
			// アスタリスクを表示する
			System.out.print('*');
			// カウント回数をインクリメントする
			i++;
		}
	}

}
