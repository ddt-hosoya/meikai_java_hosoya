package e07;
/*
整数xを右にnビット回転した値を返すメソッドrRotateと、
左にnビット回転した値を返すメソッドlRotateを作成せよ。
※回転とは、最下位ビットと最上位ビットがつながっているとみなしてシフトすることである。
たとえば右に5ビット回転した場合は、シフトによってはじき出されることになる下位5ビットを
上位に持ってこなければならない。
 */
import java.util.Scanner;
public class e07_12 {

	/**
	 *  整数のビット表示を行うメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param number ビット表示する整数
	 *
	 */
	static void putBits(int number){
		// 32ビット分順番に表示する
		for(int bitNum = 31; bitNum >= 0; bitNum--){
			// 第bitNumビットが1ならば1を、0ならば0を表示する
			System.out.print((number >>> bitNum & 1) == 1 ? '1' : '0');
		}
		// 改行する
		System.out.println();
	}

	/**
	 *  右にnビット回転した値を返すメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param x 回転する整数
	 * @param n 右に回転するビット数
	 */
	static void rRotate(int x, int n){
		// 右にnビットシフト
		int rightShift = x >>> n;
		// 左に32‐nビットシフト
		int leftShift = x << (32 - n);
		// 右にシフトした値と左にシフトした値で論理和演算し、右回転した場合の表示を再現する
		int rRotate = rightShift | leftShift;
		// 説明を表示
		System.out.println("整数"+x+"を右に"+n+"ビット回転しました。");
		// ビットの内容を表示する
		putBits(rRotate);
	}

	/**
	 *  左にnビット回転した値を返すメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param x 回転する整数
	 * @param n 左に回転するビット数
	 */
	static void lRotate(int x, int n){
		// 左にnビットシフト
		int leftShift = x << n;
		// 右に32‐nビットシフト
		int rightShift = x >>> (32 - n);
		// 右にシフトした値と左にシフトした値で論理和演算し、左回転した場合の表示を再現する
		int lRotate = rightShift | leftShift;
		// 説明を表示
		System.out.println("整数"+x+"を左に"+n+"ビット回転しました。");
		// ビットの内容を表示する
		putBits(lRotate);
	}

	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 整数の入力を促す
		System.out.print("整数x：");
		// 入力値を整数として変数に代入
		int x = stdIn.nextInt();
		// 説明を表示
		System.out.println("回転前");
		// 回転前の整数のビットの内容を表示
		putBits(x);

		// 改行する
		System.out.println();
		// 何ビット回転するかたずねる
		System.out.print("何ビット回転しますか：");
		// 入力値を回転数として変数に代入
		int n = stdIn.nextInt();

		// 改行する
		System.out.println();

		// 整数を右回転し、ビットの内容を表示
		rRotate(x, n);
		// 整数を左回転し、ビットの内容を表示
		lRotate(x, n);
	}
}
