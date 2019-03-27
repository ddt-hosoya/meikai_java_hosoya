package e02;
import java.util.Scanner;
/*
二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
*/
public class e02_05 {
	public static void main(String[] args){
		Scanner StdIn = new Scanner(System.in);
		//文字を表示する。
		System.out.println("xの値：");
		//キーボードで読み込んだ値を実数値として宣言する。
		double x = StdIn.nextDouble();

		//文字を表示する。
		System.out.println("yの値：");
		//キーボードで読み込んだ値を実数値として宣言する。
		double y = StdIn.nextDouble();

		//合計値を表示する。
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は"+ (x + y)/2 + "です。");
		}
}
