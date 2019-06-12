package e04;
/*
読み込んだ値が1未満であれば改行文字を出力しないようにList4-11を書き換えたプログラムを作成せよ。
 */
import java.util.Scanner;

public class e04_10 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して表示する*の個数の入力を促す
		System.out.print("何個*を表示しますか：");
		// 入力値を繰り返す際の判定に使う変数に代入する
		int n = stdIn.nextInt();

		// 繰り返す回数を表す変数iを初期化し、iがnより小さい場合処理を行う。処理の実行後にiをインクリメントする
		for (int i = 0; i < n; i++){
			// *を表示する
			System.out.print('*');
		}
	}
}