package e15;

import java.util.Scanner;

/*
 * 文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ
 */
/**
 * 文字列を読み込んで、その全文字の文字コードを表示する
 * @author t.hosoya
 * @since 20200930
 *
 */
public class e15_02_DisplayUnicodeCharacters {

	public static void main(String[] args) {
		// 文字入力クラスの実体化
		Scanner stdIn = new Scanner(System.in);
		// 文字列の入力を促す
		System.out.println("文字列を入力してください。：");
		// 入力値
		String inputString = stdIn.nextLine();
		// 入力値の文字数
		int inputStringLength = inputString.length();
		// 出力値
		String outputString = new String();

		// 入力値の文字数分ループ
		for(int index = 0; index < inputStringLength; index++){
			// 初回ループ時以外
			if(index != 0){
				// カンマ付与（文字コードの区別の為）
				outputString = outputString +",";
			}
			// インデックス位置の文字コードを取得
			int unicode = inputString.codePointAt(index);
			// 出力値の文字列に追加する
			outputString = outputString + unicode;
		}
		// 文字コードを出力する
		System.out.println("文字コードで表示します。\n"
				+ outputString);

	}

}
