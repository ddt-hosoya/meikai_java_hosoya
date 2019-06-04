package e03;
/*
月を1～12の整数値として読み込んで、それに対応するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_18 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザーに対して入力の制約を表示
		System.out.print("月：");
		int month = stdIn.nextInt();

		//入力値に応じて処理を行う
		switch(month){
			// 3が入力された場合
			case 3:
			// 4が入力された場合
			case 4:
			// 5が入力された場合
			case 5:
				// 3,4,5が入力された場合の季節を表示する
				System.out.println(month + "月は春です"); break;
			// 6が入力された場合
			case 6:
			// 7が入力された場合
			case 7:
			// 8が入力された場合
			case 8:
				// 8,9,10が入力された場合の季節を表示する
				System.out.println(month + "月は夏です"); break;
			// 9が入力された場合
			case 9:
			// 10が入力された場合
			case 10:
			// 11が入力された場合
			case 11:
				// 9,10,11が入力された場合の季節を表示する
				System.out.println(month + "月は秋です"); break;
			// 12が入力された場合
			case 12:
			// 1が入力された場合
			case 1:
			// 2が入力された場合
			case 2:
				// 12,1,2が入力された場合の季節を表示する
				System.out.println(month + "月は冬です"); break;
		}
	}

}
