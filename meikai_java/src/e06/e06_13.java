package e06;
/*
配列aの全要素を配列bに対して逆順コピーするプログラムを作成せよ。
なお、二つの配列の要素数は同一であると仮定してよい。
 */
import java.util.Scanner;

public class e06_13 {
	public static void main(String[] args){
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int valueNumber = stdIn.nextInt();

		// 配列aを生成
		int[] a = new int[valueNumber];
		// 配列bを生成
		int[] b = new int[valueNumber];

		// 要素数分処理を繰り返す
		for(int index = 0; index < a.length; index++){
			// 配列aの要素の値の入力を促す
			System.out.print("a[" + index + "] = ");
			// 入力値を配列aの要素に読み込む
			a[index] = stdIn.nextInt();
		}
		// 配列の最後のインデックスを求める
		int lastIndex = valueNumber - 1;
		// 配列bのインデックスを初期化
		int bIndex = 0;
		// 配列aの最後のインデクスから0までデクリメントして繰り返す
		for(int aindex = lastIndex; aindex >= 0; aindex--){
			// 配列bに配列aの値をコピー
			b[bIndex++] = a[aindex];
		}
		// 処理の内容を表示
		System.out.println("配列aの全要素を配列bに逆順にコピーしました。");

		// 配列bの要素分処理を繰り返す
		for(int index = 0; index < b.length; index++){
			// 配列bの要素の値を表示
			System.out.println("b[" + index + "] = " + b[index]);
		}

	}

}
