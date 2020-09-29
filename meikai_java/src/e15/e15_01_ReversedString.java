package e15;

import java.util.Scanner;

/*
 * 文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ
 */
/**
 * 文字列を逆順に表示するクラス
 * @author t.hosoya
 * @since 20200929
 *
 */
public class e15_01_ReversedString {

	public static void main(String[] args) {
		// 文字入力クラスの実体化
		Scanner stdIn = new Scanner(System.in);
		// 文字列の入力を促す
		System.out.println("文字列を入力してください。：");
		// 入力値
		String inputString = stdIn.nextLine();
		// 出力値の初期化
		String outputString = new String();
		// 入力値の文字数を取得
		int stringLength = inputString.length();
		// 文字列の位置を取得する際の調整値
		final int AJUST_INDEX_LENGTH = 1;

		// 文字数分ループ
		for(int index = stringLength - AJUST_INDEX_LENGTH; 0 <= index; index--){
			// 出力値に入力値の最後尾の文字から順に格納する
			outputString = outputString + String.valueOf(inputString.charAt(index));
		}
		// 文字列を逆順で表示
		System.out.println("文字列を逆順で表示します\n"
				+ outputString);
	}

}
