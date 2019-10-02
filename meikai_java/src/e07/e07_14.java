package e07;
/*
整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッドsetN、
0にした値を返すメソッドresetN、反転した値を返すメソッドinverseNを作成せよ。
 */
import java.util.Scanner;

public class e07_14 {
	/**
	 *  整数のビット表示を行うメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param number ビット表示するメソッド
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
	 * 0をposビット目を最下位として連続するn個のビットを、1にした値を返すメソッド
	 * @author t.hosoya
	 * @since 20191002
	 * @param pos ビットを1にする最下位のビット目
	 * @param n 1にするビットの個数
	 * @return int 0をposビット目を最下位として連続するn個のビットを、1にした値
	 */
	static int setFlagContinue(int pos, int n){
		// xの対象のビット位置に1をたてるための値
		int flag = 0;
		// posビット目から左にn個分を連続する1にする
		for(int index=0; index < n; index++){
			// どのビット位置に1をたてるかを示す値
			int setFlag = 1;
			// posビット目から左にn個目を1にする
			setFlag = setFlag << (pos + index);
			// posビット目から左にn個目を1にした値を増やしていく
			flag = flag | setFlag;
		}
		return flag;
	}
	/**
	 *  整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param x 編集対象の整数
	 * @param pos ビットを1にする最下位のビット目
	 * @param n 1にするビットの個数
	 * @return int 編集後の整数
	 */
	static int setN(int x, int pos, int n){
		// xの対象のビット位置に1をたてるための値
		int flag = setFlagContinue(pos, n);

		// 入力した整数のビットの値と合わせてどちらかが1であればそのビット位置を1にする
		int setResult = x | flag;

		// 処理の内容を表示
		System.out.println(pos + "ビット目から"+ n +"個を1にしました。");

		// ビット内容の表示
		putBits(setResult);

		// posビット目を1にした値を返す
		return setResult;
	}

	/**
	 *  整数xのposビット目を最下位として連続するn個のビットを、0にした値を返すメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param x 編集対象の整数
	 * @param pos ビットを0にする最下位のビット目
	 * @param n 0にするビットの個数
	 * @return int 編集後の整数
	 */
	static int resetN(int x, int pos, int n){
		// xの対象のビット位置に0をたてるための値
		int flag = setFlagContinue(pos, n);

		// posビット目から左にn個分を連続する0、それ以外は1にした値を調整値とする
		flag = ~flag;

		// 入力した整数のビットの値と合わせてどちらも1であればそのビット位置を1にする
		int resetResult = x & flag;

		// 処理の内容を表示
		System.out.println(pos + "ビット目から"+ n +"個を0にしました。");

		// ビット内容の表示
		putBits(resetResult);

		// posビット目から左にn個分を連続する0にした値を返す
		return resetResult;
	}

	/**
	 *  整数xのposビット目を最下位として連続するn個のビットを、反転した値を返すメソッド
	 * @author t.hosoya
	 * @since 20190617
	 * @param x 編集対象の整数
	 * @param pos ビットを反転する最下位のビット目
	 * @param n 反転するビットの個数
	 * @return int 編集後の整数
	 */
	static int inverseN(int x, int pos, int n){
		// xの対象のビット位置の値を反転させるための値
		int flag = setFlagContinue(pos, n);

		// 整数のposビット目を最下位として連続するn個のビットのなかで1になっている個所を0にし、0になっている個所を1にする
		int inverseResult = x ^ flag;

		// 処理の内容を表示
		System.out.println(pos + "ビット目から"+ n +"個を反転しました。");

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

		// 何ビット目から変更するかたずねる
		System.out.print("何ビット目から変更しますか：");

		// 入力値を変更箇所の最下位として変数に代入
		int pos = stdIn.nextInt();

		// 何個変更するかたずねる
		System.out.print("何個：");

		// 入力値を変更箇所の最下位として変数に代入
		int n = stdIn.nextInt();
		// 改行する
		System.out.println();

		// posビット目を1にした値を返すメソッド
		int setResult = setN(x, pos, n);
		System.out.println(pos + "ビット目から" + n + "個を1にした値は"+ setResult + "です。");
		// posビット目を0にした値を返すメソッド
		int resetResult = resetN(x, pos, n);
		System.out.println(pos + "ビット目から" + n + "個を0にした値は"+ resetResult + "です。");
		// posビット目を反転した値を返すメソッド
		int inverseResult = inverseN(x, pos, n);
		System.out.println(pos +  "ビット目から" + n + "個を反転した値は"+ inverseResult + "です。");
	}
}
