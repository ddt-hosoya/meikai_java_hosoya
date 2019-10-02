package e07;

import java.util.Scanner;

/*
整数xのposビット目（最下位から0, 1, 2, …）を1にした値を返すメソッドset、
0にした値を返すメソッドreset、反転した値を返すメソッドinverseを作成せよ。
 */
public class e07_13 {
	// posビット目を1,0,反転した値にするための調整値
	static int base = 1;

	/**
	 *  整数のビット表示を行うメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param number 表示する整数
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
	 *  posビット目を1にした値を返すメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param x 変更する整数
	 * @param pos 1にするビット目
	 * @return int 指定ビット目を1にした整数
	 */
	static int set(int x, int pos){
		// posビット目を1にするためにposビット目のみを1にした値を調整値として宣言
		int adjust = base << pos;
		// 整数と調整値のビットの内容のどちらかが1ならばそのビット位置は1とした値を求める
		int setResult = x | adjust;
		// 処理の内容を表示
		System.out.println(pos + "ビット目を1にしました。");
		// ビット内容の表示
		putBits(setResult);
		// posビット目を1にした値を返す
		return setResult;
	}

	/**
	 *  posビット目を0にした値を返すメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param x 変更する整数
	 * @param pos 0にするビット目
	 * @return int 指定ビット目を0にした整数
	 */
	static int reset(int x, int pos){
		// posビット目を0にするためにposビット目のみを1にした値を調整値として宣言
		int adjust = base << pos;
		// 調整値のビットの値を反転してposビット目のみを0にした値を調整値にする
		adjust = ~adjust;
		//  整数と調整値のビットの内容のどちらも1ならばそのビット位置は1とした値を求める
		int resetResult = x & adjust;
		// 処理の内容を表示
		System.out.println(pos + "ビット目を0にしました。");
		// ビット内容の表示
		putBits(resetResult);
		// posビット目を0にした値を返す
		return resetResult;
	}

	/**
	 *  posビット目を反転した値を返すメソッド
	 * @author t.hosoya
	 * @since 20190614
	 * @param x 変更する整数
	 * @param pos 反転するビット目
	 * @return int 指定ビット目を反転した整数
	 */
	static int inverse(int x, int pos){
		//  posビット目を反転した値をいれる変数宣言
		int inverseResult;
		// posビット目が1の値を生成
		int flag = base << pos;
		// 処理の内容を表示
		System.out.println(pos + "ビット目を反転します。");
		// 整数のposビット目が1なら0に0なら1に反転する
		inverseResult = x ^ flag;
		// ビット内容の表示
		putBits(inverseResult);
		// 変更した値を返す
		return inverseResult;
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
		System.out.println("変更前");

		// 変更前整数のビットの内容を表示
		putBits(x);

		// 改行する
		System.out.println();

		// 何ビット回転するかたずねる
		System.out.print("何ビット目を変更しますか：");

		// 入力値を回転数として変数に代入
		int pos = stdIn.nextInt();

		// 改行する
		System.out.println();

		// posビット目を1にした値を返すメソッド
		int setResult = set(x, pos);
		System.out.println(pos + "ビット目を1にした値は"+ setResult + "です。");
		// posビット目を0にした値を返すメソッド
		int resetResult = reset(x, pos);
		System.out.println(pos + "ビット目を0にした値は"+ resetResult + "です。");
		// posビット目を反転した値を返すメソッド
		int inverseResult = inverse(x, pos);
		System.out.println(pos + "ビット目を反転した値は"+ inverseResult + "です。");
	}
}
