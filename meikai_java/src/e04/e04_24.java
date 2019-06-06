package e04;

import java.util.Scanner;

/*
正の整数値を読み込み、それが素数であるかを判定するプログラムを作成せよ。
素数とは2以上n未満のいずれの数でも割り切れない整数nのことである。
 */
public class e04_24 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// プログラムの説明を表示
		System.out.println("素数であるか判定する");
		// 入力値が素数であるかを検証するための変数を宣言する
		int inputInt;
		// 入力値が素数であるかを検証するため入力値を割る数を宣言する
		int divideInt;
		// ユーザーに対して入力を促し、入力値が0以下の場合、繰り返し入力を促す
		for(inputInt = 0; inputInt <= 0; inputInt = stdIn.nextInt()){
			// ユーザーに対して入力を促す文言を表示
			System.out.print("正の整数値：");
		}
		// 入力値を2から入力値未満の数で繰り返し割る。割り切れれば繰り返し処理を抜ける
		for(divideInt = 2; divideInt < inputInt; divideInt++){
			// 入力値を割り、あまりを求める
			int remainder = inputInt % divideInt;
			// 割り切れる場合
			if (remainder == 0){
				// 割り切れる場合素数でない主旨の文言を表示
				System.out.println(inputInt + "は素数ではありません。");
				// 繰り返し処理を抜ける
				break;
			}
		}
		// 2以上入力値未満のいずれの数でも割り切れない場合
		if(divideInt == inputInt){
			// 素数である主旨の文言を表示
			System.out.println(inputInt + "は素数です。");
		}
	}
}
