package e04;

import java.util.Scanner;

/*
合計だけでなく平均も求めるようにList4-19のプログラムを書き換えよ。
なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 */
public class e04_26 {
	public static void main(String[] args ){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// プログラムの説明を表示
		System.out.println("整数を加算します。");
		// ユーザーに対して個数の入力を促す
		System.out.print("何個加算しますか。：");
		// 入力値を加算する個数に代入
		int n = stdIn.nextInt();

		// 合計値を初期化
		int sum = 0;
		// 実際に加算処理を行った回数
		int count = 0;

		// 何個加算するか入力した回数分、処理を繰り返す
		for(int i = 0; i < n; i++){
			// ユーザーに対して加算する値の入力を促す
			System.out.print("整数：");
			// 入力値を加算する値とする
			int t = stdIn.nextInt();
			// 入力値が負の値の場合
			if(t < 0){
				// 加算処理を行はない主旨の文言を表示
				System.out.println("負の数は加算しません。");
				// 加算処理を行わず繰り返し処理を行うかの判定を行う
				continue;
			}
			// 入力値を加算する
			sum += t;
			// 加算した回数をカウント
			count++;
		}
		// 平均を求める
		int average = sum / count;
		// 合計を表示
		System.out.println("合計は" + sum + "です。");
		// 平均を表示
		System.out.println("平均は" + average + "です。");
	}
}
