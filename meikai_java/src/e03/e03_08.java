package e03;

/*
キーボードから読み込んだ点数に応じて、優/良/可/不可を判定するプログラムを作成せよ。
判定は以下のように行うこと。
0~59→不可 / 60~69→可 / 70~79→良 / 80~100→優
 */

import java.util.Scanner;

public class e03_08 {
	public static void main(String[] args) {
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに点数入力を求める文言を表示
		System.out.print("点数を入力してください。：");
		// 入力値を判定するための変数に代入
		int scores = stdIn.nextInt();
		// 0~59が入力された場合
		if (scores >= 0 && scores <= 59) {
			// 判定は不可と表示する
			System.out.println("判定：不可");
		//60~69が入力された場合
		} else if (scores >= 60 && scores <= 69) {
			// 判定は可と表示する
			System.out.println("判定：可");
		// 70~79が入力された場合
		} else if (scores >= 70 && scores <= 79) {
			// 判定は良と表示する
			System.out.println("判定：良");
		// 80~100が入力された場合
		} else if (scores >= 80 && scores <= 100) {
			// 判定は優と表示する
			System.out.println("判定：優");
		}
	}

}
