package e07;
/*
配列aの全要素の合計を求めるメソッドsumOfをさくせいせよ。
 */
import java.util.Scanner;

public class e07_15 {
	/**
	 *  配列aの全要素の合計を求めるメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 要素数を求める配列
	 * @return int 配列の要素数
	 */
	static int sumOf(int[] a){
		// 合計値を入れる変数
		int sum = 0;
		// 全要素分処理を繰り返す
		for(int index = 0; index < a.length; index++){
			// 合計値に要素の値を加算する
			sum += a[index];
		}
		// 合計値を返却する
		return sum;
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
		// 配列aの全要素の合計を求める
		int result = sumOf(a);
		// 合計値を表示
		System.out.print("配列aの全要素の合計は"+ result + "です。");

	}
}
