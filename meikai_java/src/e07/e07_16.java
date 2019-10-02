package e07;
/*
配列aの要素の最小値を求めるメソッドminOfを作成せよ。
 */
import java.util.Scanner;

public class e07_16 {
	/**
	 *  配列aの最小値求めるメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 最小値を求める対象の配列
	 * @return int 配列の中の最小の要素
	 */
	static int minOf(int[] a){
		// 最小値を入れる変数
		int min = a[0];
		// 全要素分処理を繰り返す
		for(int index = 1; index < a.length; index++){
			// 要素の値が最小値よりも小さい場合
			if(a[index] < min){
				// 最小値にその要素の値を代入する
				min = a[index];
			}
		}
		// 最小値を返却する
		return min;
	}

	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int number = stdIn.nextInt();
		// 配列aを生成する
		int[] a = new int[number];

		// 要素数分処理を繰り返す
		for(int index = 0; index < number; index++){
			// 要素の値の入力を促す
			System.out.print("a[" + index + "] = ");
			// 入力値を配列aの要素に代入
			a[index] = stdIn.nextInt();
		}
		// 配列aの要素の最小値を求める
		int result = minOf(a);
		// 最小値を表示
		System.out.print("配列aの最小値は"+ result + "です。");

	}
}
