package e06;
/*
連続する要素が同じ値を持つことのないように演習6－9のプログラムを改良したプログラムを作成せよ。
たとえば｛1, 3, 5, 5, 3, 2}とならないようにすること。
 */
import java.util.Random;
import java.util.Scanner;

public class e06_10 {
	public static void main(String[] args) {
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// ユーザーに対して要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を配列の要素数とする変数に代入する
		int valueNumber = stdIn.nextInt();

		// 配列を生成
		int[] intArray = new int[valueNumber];

		// 乱数1～10を生成するための調整値を定数化
		final int ADJUST_INT = 1;
		// 配列の要素に入れるための変数を宣言
		int assignArray;

		// 全要素分処理を繰り返す
		for(int index = 0; index < intArray.length; index++){
			// 直前のインデックス
			int previousIndex = index-1;

			do{
				// 配列の要素にいれる1～10の乱数を生成
				 assignArray = ADJUST_INT + rand.nextInt(10);
			// 直前の要素の値と生成した乱数が同じだった場合もういちど乱数を生成する
			}while(index != 0 && assignArray == intArray[previousIndex]);

			// 生成した乱数を配列の要素に代入する
			intArray[index] = assignArray;
		}
		// 配列の内容を表示
		System.out.print("intArray = {");
		// 配列の全要素を走査
		for(int value : intArray){
			// 要素の値を表示
			System.out.print(value + " ");
		}
		// 配列表示の締めカッコ
		System.out.println("}");

	}

}
