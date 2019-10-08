package e07;
/*
int型整数のxの絶対値、long型整数の絶対値、float型実数の絶対値、double型実数xの絶対値を求める、
以下に示す多重定義されたメソッド群を作成せよ。
int absolute(int x)
long absolute(long x)
float absolute(float x)
double absolute(double x)
 */
import java.util.Scanner;

public class e07_31 {
	/**
	 * int型整数のxの絶対値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x int型整数x
	 * @return int xの絶対値
	 */
	static int absolute(int x){
		// 負の値の場合符号を反転する
		if(x < 0){ x = -x; }
		// 絶対値を返す
		return x;
	}
	/**
	 * long型整数のxの絶対値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x long型整数x
	 * @return long xの絶対値
	 */
	static long absolute(long x){
		// 負の値の場合符号を反転する
		if(x < 0){ x = -x; }
		// 絶対値を返す
		return x;
	}
	/**
	 * float型実数のxの絶対値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x float型実数x
	 * @return float xの絶対値
	 */
	static float absolute(float x){
		// 負の値の場合符号を反転する
		if(x < 0){ x = -x; }
		// 絶対値を返す
		return x;
	}
	/**
	 * double型実数のxの絶対値を求めるメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x double型実数x
	 * @return double xの絶対値
	 */
	static double absolute(double x){
		// 負の値の場合符号を反転する
		if(x < 0){ x = -x; }
		// 絶対値を返す
		return x;
	}

	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// int型整数の入力を促す
		System.out.print("int型整数：");
		// 入力値を絶対値を求める変数にいれる
		int inputInt = stdIn.nextInt();

		// long型整数の入力を促す
		System.out.print("long型整数：");
		// 入力値を絶対値を求める変数にいれる
		long inputLong = stdIn.nextLong();

		// float型実数の入力を促す
		System.out.print("float型実数：");
		// 入力値を絶対値を求める変数にいれる
		float inputFloat = stdIn.nextFloat();

		// double型実数の入力を促す
		System.out.print("double型実数：");
		// 入力値を絶対値を求める変数にいれる
		double inputDouble = stdIn.nextDouble();

		// 絶対値を表示する
		System.out.println(inputInt + "の絶対値は" + absolute(inputInt) + "です。");
		// 絶対値を表示する
		System.out.println(inputLong + "の絶対値は" + absolute(inputLong) + "です。");
		// 絶対値を表示する
		System.out.println(inputFloat + "の絶対値は" + absolute(inputFloat) + "です。");
		// 絶対値を表示する
		System.out.println(inputDouble + "の絶対値は" + absolute(inputDouble) + "です。");
	}
}
