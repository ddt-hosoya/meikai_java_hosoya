package e07;
/*
配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッド
arraySrchIdxを作成せよ。
 */
import java.util.Scanner;

public class e07_23 {
	// 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッド
	static int[] arraySrchIdx(int[] a, int x){

		// 返却する配列の要素数を数える変数
		int count = 0;
		// 返却する配列のインデックスを数える変数
		int countIndex = 0;


		// 配列aの全要素を走査
		for(int index = 0; index < a.length; index++){
			// 値がxである要素の場合
			if(a[index] == x){
				count++;
			}
		}

		// 返却する配列を生成
		int[] searchIndex = new int[count];

		// 配列aの全要素を走査
		for(int index = 0; index < a.length; index++){
			// 値がxである要素の場合
			if(a[index] == x){
				// 値がxである要素のインデックスを生成した配列にいれる
				searchIndex[countIndex++] = index;
			}
		}

		// 配列を返却する
		return searchIndex;
	}

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
		// 要素の値の入力を促す
		System.out.print("値：");
		// 入力値を要素数として変数に代入
		int x = stdIn.nextInt();

		// 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を求める
		int[] searchIndex = arraySrchIdx(a, x);

		// 処理の内容を表示
		System.out.println("配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納しました。");

		// 配列の要素の値を表示する
		for(int index = 0; index < searchIndex.length; index++){
			// 配列の要素の値を表示する
			System.out.println("searchIndex[" + index + "] = " + searchIndex[index]);
		}
	}
}
