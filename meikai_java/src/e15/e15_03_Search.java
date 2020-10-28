package e15;

import java.util.Scanner;

/*
 * 文字列探索プログラムを書き換えて右のように表示するプログラムを作成せよ。
 * 一致する部分が上下で揃うように表示すること。（p.489）
 */
/**
 * 文字列探索プログラム改定版
 * @author t.hosoya
 * @since 20200930
 *
 */
public class e15_03_Search {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1 : ");
		String s1 = stdIn.next();
		System.out.print("文字列s2 : ");
		String s2 = stdIn.next();
		String replaceString = new String();
		int s1Length = s1.length();
		int s2Length = s2.length();

		int idx = s1.indexOf(s2);
		if(idx == -1){
			//System.out.println("s1の中にs2は含まれていません。");
			for(int count = 0; count < s1Length; count++){
				replaceString = replaceString + " ";
			}
		}else{
			// ループ繰り返し用フラグ宣言
			boolean continueFlg;

			// s1内でs2が最初に出現するインデックスの場合
			// s1の文字列探索開始位置
			int formIdx = 0;
			// s1の文字列内でs2が出現するまでの文字列をスペースで置き換えた文字列を生成する
			replaceString = joinSpaceStrings(s1, s2, replaceString, idx, formIdx);

			// s1内でs2が2番目以降で出現するインデックスの場合
			do{
				// ループ繰り返し用フラグ初期化
				continueFlg = false;

				// s1の文字列探索開始位置
				formIdx = idx + s2Length;
				// s1内の文字列探索開始位置以降でs2が一致するインデックス
				idx = s1.indexOf(s2, formIdx);
				// s1の文字列内でs2が出現するまでの文字列をスペースで置き換えた文字列を生成する
				replaceString = joinSpaceStrings(s1, s2, replaceString, idx - formIdx, formIdx);

				// s1内でs2が最後に出現するインデックスでない場合
				if(idx != s1.lastIndexOf(s2)){
					// ループ繰り返し用フラグをたてる
					continueFlg = true;
				}

			}while(continueFlg);


		}
		// s1のs2に一致しない文字列をスペースで埋めた文字列をs2とする
		s2 = replaceString;
		// s1を表示
		System.out.println("s1 : "+ s1);
		// s2を表示
		System.out.println("s2 : "+ s2);

	}
	/**
	 * s1の文字列内でs2が出現するまでの文字列をスペースで置き換えた文字列を生成する
	 * @param s1 文字列1
	 * @param s2 文字列2
	 * @param resultString 連結する文字列
	 * @param spaceNumber スペースの数
	 * @param formIdx スペース置き換えの開始位置
	 * @return スペースで置き換えた文字列
	 */
	private static String joinSpaceStrings(String s1, String s2, String resultString, int spaceNumber, int formIdx){
		// s2が出現する位置までスペースで埋める
		for(int count = 0; count < spaceNumber; count++){
			// スペースに置き換える位置の文字のByte数を確認（日本語などが入力された場合使用するスペースが異なるため）
			if(String.valueOf(s1.charAt(formIdx + count)).getBytes().length == 1){
				// スペース1つ分を連結
				resultString = resultString + " ";
			}else{
				// スペース2つ分を連結
				resultString = resultString + "  ";
			}
		}
		// スペースで埋めた文字列とs2を連結する
		resultString = resultString + s2;

		// 生成した文字列を返却
		return resultString;
	}

}
