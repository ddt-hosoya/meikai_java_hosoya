package e06;
/*
要素数がint型である配列を作り、全要素を1～10の乱数で埋め尽くす(1以上10以下の値を代入する）
プログラムを作成せよ。要素数はキーボードから読み込むこと。
 */
import java.util.Random;
import java.util.Scanner;

public class e06_09 {
	public static void main(String[] args) {
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数をいれる変数を宣言
		int valueNumber;
		// 繰り返し処理
		do{
			// ユーザーに対して要素数の入力を促す
			System.out.print("要素数：");
			// 入力値を配列の要素数とする変数に代入する
			valueNumber = stdIn.nextInt();
		// 要素数が負の数の場合繰り返す
		}while(valueNumber < 0);


		// 配列を生成
		int[] intArray = new int[valueNumber];

		// 乱数1～10を生成するための調整値を定数化
		final int ADJUST_INT = 1;
		// 全要素分処理を繰り返す
		for(int index = 0; index < intArray.length; index++){
			// 配列の要素に1～10の乱数をいれる
			intArray[index] = ADJUST_INT + rand.nextInt(10);
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
