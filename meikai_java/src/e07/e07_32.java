package e07;
/*
List7-12(p.241)のメソッドprintBitsは、int型整数値の内部ビットを表示するものであった。
他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。
void printBits(byte x)
void printBits(short x)
void printBits(int x)
void printBits(long x)
 */

import java.util.Scanner;

public class e07_32 {
	/**
	 * byte型整数値の内部ビットを表示するメソッド
	 * @author t.hosoya
	 * @since 20190619
	 * @param x 表示するbyte型整数値
	 */
	static void printBits(byte x){
		// byte型の内部ビットは8ビットで表現されているため8ビット分繰り返す
		for(int i = 7; i >= 0; i--){
			// そのビットが1ならば1を0ならば0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}
	/**
	 * short型整数値の内部ビットを表示するメソッド
	 * @author t.hosoya
	 * @since 20190619
	 * @param x 表示するshort型整数値
	 */
	static void printBits(short x){
		// short型の内部ビットは16ビットで表現されているため16ビット分繰り返す
		for(int i = 15; i >= 0; i--){
			// そのビットが1ならば1を0ならば0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}
	/**
	 * int型整数値の内部ビットを表示するメソッド
	 * @author t.hosoya
	 * @since 20190619
	 * @param x 表示するint型整数値
	 */
	static void printBits(int x){
		// int型の内部ビットは32ビットで表現されているため32ビット分繰り返す
		for(int i = 31; i >= 0; i--){
			// そのビットが1ならば1を0ならば0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}
	/**
	 * long型整数値の内部ビットを表示するメソッド
	 * @author t.hosoya
	 * @since 20190619
	 * @param x 表示するlong型整数値
	 */
	static void printBits(long x){
		// byte型の内部ビットは64ビットで表現されているため64ビット分繰り返す
		for(int i = 63; i >= 0; i--){
			// そのビットが1ならば1を0ならば0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		System.out.println();
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// byte型整数値の入力を促す
		System.out.print("byte型整数値：");
		// 入力値をビット表示するための変数に入れる
		byte inputByte = stdIn.nextByte();
		// short型整数値の入力を促す
		System.out.print("short型整数値：");
		// 入力値をビット表示するための変数に入れる
		short inputShort = stdIn.nextShort();
		// int型整数値の入力を促す
		System.out.print("int型整数値：");
		// 入力値をビット表示するための変数に入れる
		int inputInt = stdIn.nextInt();
		// long型整数値の入力を促す
		System.out.print("long型整数値：");
		// 入力値をビット表示するための変数に入れる
		long inputLong = stdIn.nextLong();

		// 説明を表示
		System.out.println(inputByte + "をビット表示します。");
		// ビット表示する
		printBits(inputByte);
		// 説明を表示
		System.out.println(inputShort + "をビット表示します。");
		// ビット表示する
		printBits(inputShort);
		// 説明を表示
		System.out.println(inputInt + "をビット表示します。");
		// ビット表示する
		printBits(inputInt);
		// 説明を表示
		System.out.println(inputLong + "をビット表示します。");
		// ビット表示する
		printBits(inputLong);

	}
}
