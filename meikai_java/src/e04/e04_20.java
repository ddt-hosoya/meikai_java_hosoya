package e04;
/*
n段の正方形を表示するプログラムを作成せよ。右に示すのは、nが3の時の実行結果である。
 */
import java.util.Scanner;
public class e04_20 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力を促す
		System.out.print("n段の正方形を表示します。\nn段：");
		// 入力値を何段の表示をするかの判定をするための変数に代入する
		int n = stdIn.nextInt();
		// 1段からn段まで改行処理を繰り返す
		for(int length = 1; length <= n; length++){
			// *を1個からn個まで表示処理を繰り返す
			for(int width = 1; width <= n; width++){
				// *を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}
}
