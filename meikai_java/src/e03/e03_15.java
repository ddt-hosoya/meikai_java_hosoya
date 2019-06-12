package e03;
/*
二つの整数値を読み込んで降順（大きい順）にソートするプログラムを作成せよ。
 */
import java.util.Scanner;
public class e03_15 {
	public static void main(String[] args){
		// 入力機能を実体化する
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値A：");
		// 入力値を降順にソートして一つ目に表示する変数に代入
		int firstNumber = stdIn.nextInt();
		// ユーザーに対して入力の制約を表示する
		System.out.print("整数値B：");
		// 入力値を降順にソートして二つ目に表示する変数に代入
		int secondNumber = stdIn.nextInt();

		// 一つ目に表示する変数firstNumberが二つ目に表示する変数secondNumberより小さい場合
		if(firstNumber < secondNumber){
			// firstNumberの値を別の変数で保持
			int adjustInt = firstNumber;
			// secondNumberの値を一つ目に表示する変数firstNumberに代入
			firstNumber = secondNumber;
			// 保持していた値を二つ目に表示する変数secondNumberに代入
			secondNumber = adjustInt;
		}
		// 降順にソートした主旨の文言を表示
		System.out.println("整数値A≧整数値Bとなるようにソートしました。");
		// 二つの整数値の大きいほうの値を表示
		System.out.println("整数値Aは" + firstNumber + "です。");
		// 二つの整数値の小さいほうの値を表示
		System.out.println("整数値Bは" + secondNumber + "です。");
	}

}
