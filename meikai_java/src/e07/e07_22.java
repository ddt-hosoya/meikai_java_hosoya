package e07;
/*
配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して返却するメソッドarrayCloneを作成せよ。
 */
import java.util.Scanner;

public class e07_22 {
	// 配列aと同じ配列を生成して返却するメソッド
	static int[] arrayClone(int[] a){
		// 配列aと同じ要素数の配列を生成
		int[] clone = new int[a.length];
		// 配列aの要素数分処理を繰り返す
		for(int index = 0; index < a.length; index++){
			// aの要素を生成した配列にコピーする
			clone[index] = a[index];
		}
		// 生成した配列を返却する
		return clone;
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
		//  配列aと同じ配列を生成
		int[] clone = arrayClone(a);

		// 処理の内容を表示
		System.out.println("配列aと同じ配列を生成しました。");

		// 生成した配列の全要素を表示
		for(int index = 0; index < clone.length; index++){
			// 配列の要素の値を表示する
			System.out.println("clone[" + index + "] = " + clone[index]);
		}
	}
}
