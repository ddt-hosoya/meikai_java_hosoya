package e07;
import java.util.Scanner;
/*
1からnまでの全整数の和を求めて返却するメソッドを作成せよ。
int sumUp(int n)
 */
public class e07_04 {
	// 1からnまでの全整数の和を求めて返却するメソッド
	static int sumUp(int n){
		// 和を求める変数
		int sum = 0;
		// nを加算後にデクリメントしていき、1まで繰り返す
		while(n > 0){
			// 和にnを加算
			sum += n--;
		}
		// 和を返却する
		return sum;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザに対して整数値の入力を促す
		System.out.print("整数n：");
		// 入力値を求める和の数とする
		int n = stdIn.nextInt();
		// 1からnまでの和を求める
		int result = sumUp(n);
		// 求めた和を表示する
		System.out.println("1から" + n + "までの和は" + result + "です。");
	}
}
