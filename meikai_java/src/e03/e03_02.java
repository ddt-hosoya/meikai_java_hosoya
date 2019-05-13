package e03;

/*
二つの正の整数値を読み込んで、後者が前者の約数であれば『BはAの約数です。』と表示し、
そうでなければ『AはBの約数ではありません。』と表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_02 {
	public static void main(String[] args) {
		// Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);

		// 整数値A：という文字を表示する。
		System.out.print("整数値A：");
		int integarA = stdIn.nextInt();

		// 整数値B：という文字を表示する。
		System.out.print("整数値B：");
		int integarB = stdIn.nextInt();

		if ((integarA % integarB) == 0)
			System.out.println("BはAの約数です。");
		else
			System.out.println("AはBの約数ではありません。");
	}
}
