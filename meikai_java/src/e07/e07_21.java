package e07;
/*
配列aと配列bの全要素の値を交換するメソッドaryExchngを作成せよ。
void aryExchng(int[] a, int[] b)
二つの配列の要素数が等しくない場合は、小さいほうの要素数分の要素を交換すること。
 */
import java.util.Scanner;

public class e07_21 {
	/**
	 * 配列aと配列bの全要素の値を交換するメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 要素を交換する配列a
	 * @param b 要素を交換する配列b
	 *
	 */
	static void aryExchng(int[] a, int[] b){
		// 交換する要素のかず
		int exchangeLength;
		// aの要素数がbの要素数以下の場合
		if(a.length <= b.length) {
			// 交換する要素数はaの要素数とする
			exchangeLength = a.length;
		// bの要素数がaの要素数より小さい場合
		} else {
			// 交換する要素数はbの要素数とする
			exchangeLength = b.length;
		}
		// 小さいほうの要素数分交換処理を繰り返す
		for(int index = 0; index < exchangeLength; index++){
		// aの値を仮の変数にいれておく
			int save = a[index];
			// bの値をaにいれる
			a[index] = b[index];
			// 仮の変数に入れておいたaの値をbにいれる
			b[index] = save;
		}
	}

	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("配列aの要素数：");
		// 入力値を要素数として変数に代入
		int numberA = stdIn.nextInt();
		// 配列aを生成する
		int[] a = new int[numberA];
		// 要素数の入力を促す
		System.out.print("配列bの要素数：");
		// 入力値を要素数として変数に代入
		int numberB = stdIn.nextInt();
		// 配列aを生成する
		int[] b = new int[numberB];

		// 配列aの要素数分処理を繰り返す
		for(int index = 0; index < numberA; index++){
			// 要素の値の入力を促す
			System.out.print("a[" + index + "] = ");
			// 入力値を配列aの要素に代入
			a[index] = stdIn.nextInt();
		}
		// 配列bの要素数分処理を繰り返す
		for(int index = 0; index < numberB; index++){
			// 要素の値の入力を促す
			System.out.print("b[" + index + "] = ");
			// 入力値を配列aの要素に代入
			b[index] = stdIn.nextInt();
		}


		// 配列aと配列bの全要素の値を交換
		aryExchng(a, b);

		// 処理の内容を表示
		System.out.println("配列aと配列bの全要素の値を交換しました。");

		// 要素交換後の配列aの要素の値を表示する
		for(int index = 0; index < numberA; index++){
			// 配列の要素の値を表示する
			System.out.println("a[" + index + "] = " + a[index]);
		}
		// 要素交換後の配列bの要素の値を表示する
		for(int index = 0; index < numberB; index++){
			// 配列の要素の値を表示する
			System.out.println("b[" + index + "] = " + b[index]);
		}
	}
}