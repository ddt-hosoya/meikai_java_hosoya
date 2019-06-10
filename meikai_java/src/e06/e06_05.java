package e06;
/*
配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って｛｝で囲んだ形式とすること。
 */

import java.util.Scanner;

public class e06_05 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として定数化
		final int VALUE_NUMBER = stdIn.nextInt();
		// 入力した要素数の配列を生成
		int intArray[] = new int[VALUE_NUMBER];
		// 要素数分処理を繰り返す
		for(int index = 0; index < VALUE_NUMBER; index++){
			// 要素の値の入力を求める
			System.out.print("intArray[" + index + "] = ");
			// 入力値を要素に代入
			intArray[index] = stdIn.nextInt();
		}
		// // 各要素の値の表示
		System.out.print("intArray = {");
		// 要素数分処理を繰り返す
		for(int index = 0; index < VALUE_NUMBER; index++){

			// インデックス0以外の時値の表示の前にコンマを表示する
			if(index != 0){ System.out.print(", "); }

			// 要素の値を表示
			System.out.print(intArray[index]);
		}
		// 各要素の値の表示の締めのカッコを表示
		System.out.println("}");
	}
}
