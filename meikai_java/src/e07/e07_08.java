package e07;
import java.util.Random;
/*
a以上b以下の乱数を生成して、その値を返却するメソッドrandomを作成せよ。
内部で乱数を生成する標準ライブラリを呼び出すこと。
int random(int a, int b)
なお、bの値がaより小さい場合には、aの値をそのまま返却すること。
 */
import java.util.Scanner;

public class e07_08 {
	/**
	 *  a以上b以下の乱数を生成して、その値を返却するメソッド
	 * @author t.hosoya
	 * @since 20190612
	 * @param a 乱数生成するための下限
	 * @param b 乱数生成するための上限
	 * @return int 生成した乱数
	 *
	 */
	static int random(int a, int b){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 返却する値をいれる変数
		int randomInt;
		// 調整値を定数化
		final int ADJUST_INT = 1;

		// bの値がaより小さい場合
		if(b < a){
			// aの値をそのまま返却する
			return a;
		}
		// bの値がa以上場合
		else{
			// 乱数を生成する範囲を求める
			int range = b - (a - ADJUST_INT);
			//  a以上b以下の乱数を生成
			randomInt = rand.nextInt(range) + a;
		}
		// 生成した乱数を生成
		return randomInt;
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 整数aの入力を促す
		System.out.print("整数a：");
		// 入力値をaとする
		int a = stdIn.nextInt();
		// 整数bの入力を促す
		System.out.print("整数b：");
		// 入力値をbとする
		int b = stdIn.nextInt();

		// 処理の説明を表示
		System.out.println(a + "から" + b +"の乱数を生成します。");
		// a以上b以下の乱数を生成
		int result = random(a, b);
		// 生成した乱数を表示
		System.out.println(result);

	}
}
