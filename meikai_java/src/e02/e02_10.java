package e02;
/*
右に示すように、名前の姓と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 */
import java.util.Scanner;

public class e02_10 {
	public static void main(String[] args){
		//Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);
		// 姓という文字を表示する。
		System.out.print("姓：");
		// キーボード入力した文字をString型で宣言する。
		String lastName = stdIn.next();
		// 名という文字を表示する。
		System.out.print("名：");
		// キーボード入力した文字をString型で宣言する。
		String firstName = stdIn.next();

		// 入力した姓名に挨拶を行う。
		System.out.println("こんにちは" + lastName + firstName +"さん。");

	}
}
