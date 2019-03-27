package e02;
/*
三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
*/
import java.util.Scanner;
public class e02_06 {
	public static void main(String[] args){
		Scanner StdIn = new Scanner(System.in);

		//文字を表示する。
		System.out.println("三角形の面積を求めます。");
		//文字を表示する。
		System.out.println("底辺：");
		//キーボードで読み込んだ値を実数値として宣言する。
		double bottom = StdIn.nextDouble();

		//文字を表示する。
		System.out.println("高さ：");
		//キーボードで読み込んだ値を実数値として宣言する。
		double high = StdIn.nextDouble();

		//三角形の面積を表示する。
		System.out.println("面積は" + ((bottom * high) / 2) + "です。");
		}
}
