package e04;
/*
右に示すように、正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 */
import java.util.Scanner;
public class e04_09 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// 入力した値を代入する変数を宣言する
		int n;
		// 繰り返し処理を行う
		do{
			// ユーザーに対して値の入力を促す
			System.out.print("nの値：");
			// 入力値を変数に代入
			n = stdIn.nextInt();
		// 入力値が正の整数値でない場合繰り返し処理を行う
		}while(n <= 0);
		// 積を求めるための変数を1で初期化
		int product = 1;
		// 1からnまでのかける数を代入する変数を1で初期化
		int multiplier = 1;

		// かける数がn以下の場合処理を繰り返す
		while(multiplier <= n){
			// 積にmultiplierをかける
			product *= multiplier;
			// multiplierをインクリメントする
			multiplier++;
		}
		// 結果を表示する
		System.out.println("1から" + n + "までの積は" + product + "です。");
	}

}
