package e15;
/*
 * List15-15のfor文を拡張for文で実現したプログラムを作成せよ。（p.501）
 */
/**
 * コマンドライン引数で与えられたすべての数値を加算して表示
 * @author t.hosoya
 * @since 20210106
 */
public class e15_07 {

	public static void main(String[] args) {
		// 加算結果初期化
		double sum = 0.0;
		// コマンドライン引数で与えられたすべての数値を加算して表示
		for(String argsString : args){
			// 文字列型引数をDouble型に変換して結果に加算
			sum += Double.parseDouble(argsString);
		}
		// 加算した結果を表示
		System.out.println("合計値は" + sum + "です。");

	}

}
