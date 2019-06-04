package e03;
/*
三つの整数値を読み込んで昇順（小さい順）にソートするプログラムを作成せよ。
 */

import java.util.Scanner;

public class e03_16 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値A：");
		// 入力値を昇順でソートし、一つ目に表示する変数に代入
		int firstNumber = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値B：");
		// 入力値を昇順でソートし、二つ目に表示する変数に代入
		int secondNumber = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値C：");
		// 入力値を昇順でソートし、三つ目に表示する変数に代入
		int thirdNumber = stdIn.nextInt();

		// 一つ目に表示する変数firstNumberの値より二つ目に表示する変数secondNumberの値が小さい場合順番を入れ替える
		if(firstNumber > secondNumber){
			// firstNumberの値を別の変数で保持する
			int adjustIntFirst = firstNumber;
			// 一つ目に表示する変数firstNumberに二つ目に表示する変数secondNumberの値を代入
			firstNumber = secondNumber;
			//二つ目に表示する変数secondNumberに保持していたfirstNumberに入っていた値を代入
			secondNumber = adjustIntFirst;
		}
		// 一つ目に表示する変数firstNumberの値より三つ目に表示する変数secondNumberの値が小さい場合順番を入れ替える
		if(firstNumber > thirdNumber){
			// firstNumberの値を別の変数で保持する
			int adjustIntFirst = firstNumber;
			// secondNumberの値を別の変数で保持する
			int adjustIntSecond = secondNumber;
			// 一つ目に表示する変数firstNumberに三つ目に表示する変数thirdNumberの値を代入
			firstNumber = thirdNumber;
			//二つ目に表示する変数secondNumberに保持していたfirstNumberに入っていた値を代入
			secondNumber = adjustIntFirst;
			//三つ目に表示する変数thirdNumberに保持していたsecondNumberに入っていた値を代入
			thirdNumber = adjustIntSecond;
		}

		// 二つ目に表示する変数secondNumberより三つ目に表示する変数thirdNumberの値が小さい場合順番を入れ替える
		if(secondNumber > thirdNumber){
			// secondNumberの値を別の変数で保持する
			int adjustIntSecond = secondNumber;
			//二つ目に表示する変数secondNumberにthirdNumberに入っていた値を代入
			secondNumber = thirdNumber;
			//三つ目に表示する変数thirdNumberに保持していたsecondNumberに入っていた値を代入
			thirdNumber = adjustIntSecond;
		}
		// 昇順にソートした主旨の文言を表示
		System.out.println("整数値A≦整数値B≦整数値Cとなるようにソートしました。");
		// 昇順にソートした値を順番に表示
		System.out.println("整数値Aは" + firstNumber + "です。");
		System.out.println("整数値Bは" + secondNumber + "です。");
		System.out.println("整数値Cは" + thirdNumber + "です。");
	}
}
