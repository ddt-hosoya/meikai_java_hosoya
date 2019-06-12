package e07;
/*
List7-7に表示したnこの'*'を連続表示するputStarsを、
内部でList7-8のメソッドをputCharsを呼び出すことによって表示を行うように書き換えよ。
 */
import java.util.Scanner;

public class e07_07 {
	// 文字cをn個連続で表示するメソッド
	static void putChars(char c, int n){
		// n回繰り返す
		while(n-- > 0)
			// 文字cを表示
			System.out.print(c);
	}
	// 文字*を指定してputCharsを呼び出す
	static void putStars(int n){
		putChars('*', n);
	}
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// プログラムの説明を表示
		System.out.println("左下直角の三角形を表示します。");
		// ユーザーに対して段数の入力を促す
		System.out.print("段数は：");
		// 入力値を段数として変数に代入
		int n = stdIn.nextInt();

		// 段数分処理を繰り返す
		for(int i = 1; i <= n; i++){
			// *を連続表示する
			putStars(i);
			// 改行する
			System.out.println();
		}
	}
}
