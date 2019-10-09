package e10;
/*
List10-3に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ。
なお、このメソッドはインスタンスをn個生成した時点で呼び出すとnを返すことになる。
 */
/**
 * 連番クラス
 * @author t.hosoya
 * @since 20190624
 *
 */
public class e10_01_Id {
	// 何番までの識別番号を与えたか
	private static int counter = 0;
	// 識別番号
	private int id;

	/**
	 *  最後に与えた識別番号を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return int 最後に与えた識別番号
	 */
	public static int getMaxId(){
		// 最後に与えた識別番号を返す
		return counter;
	}

	// コンストラクタ
	public e10_01_Id(){
		// 何番までの識別番号を与えたかの値をインクリメントして識別番号にいれる
		id = ++ counter;
	}
	/**
	 *  そのインスタンスの識別番号を返すインスタンスメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return int 識別番号
	 */
	public int getId(){
		return id;
	}
}


