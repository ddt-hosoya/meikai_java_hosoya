package e01;
/*
演習1－1
プログラム中の文の終端を示すセミコロン；が欠如してるとどうなるのか。
プログラムをコンパイルして検証せよ。
 */
public class e01_01 {
	public static void main(String[] args){
		//文を表示する
		System.out.println("はじめてのJavaプログラム");
		//文を表示する
		//検証のために文の終端のセミコロンを記載していない
		System.out.println("画面に出力しています。")
	}

}

/*
セミコロンが欠如した状態で実行すると構文エラーになり、実行できないことがわかった。
 */
