package e06;
/*
異なる要素が同じ値を持つことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
例えば｛1, 2, 5, 6, 1, 2｝とならないようにすること。（配列の要素数は10以下であるとする。）
 */
import java.util.Random;
import java.util.Scanner;

public class e06_11 {
	public static void main(String[] args) {
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数を入れる変数を宣言
		int valueNumber;
		do{
			// ユーザーに対して要素数の入力を促す
			System.out.print("要素数：");
			// 入力値を配列の要素数とする変数に代入する
			valueNumber = stdIn.nextInt();
		// 要素数が0未満の場合再入力させる
		}while(valueNumber < 0);


		// 配列を生成
		int[] intArray = new int[valueNumber];

		// 乱数1～10を生成するための調整値を定数化
		final int ADJUST_INT = 1;
		// 配列の要素に入れるための変数を宣言
		int assignArray;

		// 全要素分処理を繰り返す
		for(int index = 0; index < intArray.length; index++){
			do{
				// 配列の要素にいれる1～10の乱数を生成
				 assignArray = ADJUST_INT + rand.nextInt(10);
				// 配列の全要素を確認
				for(int value : intArray){
					// 生成した乱数と要素の値が一致した場合
					if(assignArray == value){
						// 配列の要素にいれる値をリセット
						 assignArray = 0;
						// 全要素の確認を中止
						break;
					}
				}
			//  配列の要素にいれる値がリセットされている場合再度乱数を生成する
			}while(assignArray == 0);

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
