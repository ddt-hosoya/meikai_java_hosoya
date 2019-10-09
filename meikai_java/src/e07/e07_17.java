package e07;
/*
メソッドlinearSearchは、探索するキーと同じ値の要素が複数個存在する場合、
最も先頭に位置する要素を見つけるものである。最も末尾側に位置する要素を見つけるlinerSearchRを作成せよ。
 */
import java.util.Scanner;
public class e07_17 {
	// 要素が存在しない場合の返り値を定数化
	static final int NO_FOUND = -1;
	/**
	 * 探索するキーと同じ値の要素が複数個存在する場合、最も末尾側に位置する要素を見つけるメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param a 探索する配列
	 * @param key 探索するキー
	 * @return int キーと一致する要素があるインデックス
	 */
	static int linerSearchR(int[] a, int key){
		// 配列のインデックスの最大を求めるための調整値
		final int ADJUST_INT = 1;
		// 配列のインデックスの大きいほうから探索
		for(int index = (a.length - ADJUST_INT); index >= 0; index--){
			// キーと一致する要素があれば
			if(a[index] == key){
				// そのインデックスを返す
				return index;
			}
		}
		// キーと一致する要素がなければ-1を返す
		return NO_FOUND;
	}

	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int number = stdIn.nextInt();
		// 配列xを生成する
		int[] x = new int[number];

		// 要素数分処理を繰り返す
		for(int index = 0; index < number; index++){
			// 要素の値の入力を促す
			System.out.print("a[" + index + "] = ");
			// 入力値を配列aの要素に代入
			x[index] = stdIn.nextInt();
		}
		System.out.print("探す値：");
		int key = stdIn.nextInt();

		int result = linerSearchR(x ,key);

		if(result == NO_FOUND){
			System.out.println("その値の要素は存在しません。");
		} else {
			System.out.println("その値はx[" + result + "]にあります。");
		}
	}
}
