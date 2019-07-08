package e06;
/*
配列の要素の並びをシャッフルする（ランダムな順になるようかき混ぜる）プログラムを作成せよ。
 */
import java.util.Random;
import java.util.Scanner;

public class e06_12 {
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 要素数をいれる変数を宣言
		int valueNumber;
		do{
			// ユーザーに対して要素数の入力を促す
			System.out.print("要素数：");
			// 入力値を要素数にいれる
			valueNumber = stdIn.nextInt();
		// 入力値が負の数の場合再入力させる
		}while(valueNumber < 0);

		// 入力した要素数の配列を生成する
		int[] intArray = new int[valueNumber];

		// シャッフル前の配列に代入する値を初期化
		int assign = 1;
		// 配列名の表示
		System.out.print("intArray = {");
		// 要素数分処理を繰り返す
		for(int index = 0; index < intArray.length; index++){
			// 配列の要素に1から順番に値をいれる
			intArray[index] = assign++;
			// 配列の要素の表示
			System.out.print(intArray[index] + " ");
		}
		// 配列の締めカッコの表示
		System.out.println("}");

		// 説明文の表示
		System.out.println("シャッフルします。");

		// 要素数分シャッフル処理を繰り返す
		for(int count = 1; count <= valueNumber; count++){
			// 何番目と何番目の要素の値をシャッフルするか決める
			int index1 = rand.nextInt(valueNumber);
			// 何番目と何番目の要素の値をシャッフルするか決める
			int index2 = rand.nextInt(valueNumber);

			// シャッフルする１つ目の要素の値を変数で保持しておく
			int tentative = intArray[index1];
			// シャッフルする１つ目の要素に２つ目の要素の値をいれる
			intArray[index1] = intArray[index2];
			// シャッフルする２つ目の要素に１つ目の要素の値をいれる
			intArray[index2] = tentative;
		}
		// 配列名の表示
		System.out.print("intArray = {");
		// 配列の全要素を走査
		for(int value : intArray){
			// 配列の要素の表示
			System.out.print(value + " ");
		}
		// 配列の締めカッコの表示
		System.out.println("}");
	}
}
