package e04;
/*
1からnまでの和を求めるList4-10をfor文で実現せよ。
 */
import java.util.Scanner;

public class e04_13 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 説明文を表示
		System.out.println("1からnまでの和を求めます。");
		// 仕様であるnまでの和を求めるnの値をいれる変数を宣言
		int n;
		// 求める和を入れる変数を0で初期化
		int sum = 0;

		// nが0以下の場合、nの値の入力を促す処理を繰り返す
		// 入力処理後にnに入力値を代入
		for(n = 0; n <= 0; n = stdIn.nextInt()){
			// ユーザーに対してnの値の入力を促す
			System.out.print("nの値：");
		}
		// 1がnと同じ値になるまで和に値を足す処理を繰り返す
		// 処理実行後に足す数をインクリメントする
		for(int i = 1; i <= n; i++){
			// 和に数を足す
			sum += i;
		}
		// 結果を表示する
		System.out.println("1から" + n + "までの和は" + sum + "です。");
	}

}
