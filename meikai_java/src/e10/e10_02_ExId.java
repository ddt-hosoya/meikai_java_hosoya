package e10;
/*
前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
インスタンスを生成するたびに識別番号をnずつ増やして与える(nは正の整数)。nの値は、
指定されない限り1とするが、メソッドを通じて取得、変更できるようにする。
 */
/**
 * IDクラス(インスタンスを生成するたびに識別番号をnずつ増やして与える)
 * @author t.hosoya
 * @since 20190624
 *
 */
public class e10_02_ExId {
	// 何番までの識別番号を与えたか
	private static int counter = 0;
	// 識別番号の増加間隔
	private static int n = 1;
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
	/**
	 *  識別番号の増加間隔を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return int 識別番号の増加間隔
	 */
	public static int getN(){
		return n;
	}
	/**
	 * 識別番号の増加間隔を変更するクラスメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param changeN 増加間隔を変更値
	 */
	public static void setN(int changeN){
		n = changeN;
	}

	// コンストラクタ
	public e10_02_ExId(){
		counter += n;
		// 何番までの識別番号を与えたかの値をインクリメントして識別番号にいれる
		id = counter;
	}
	/**
	 * そのインスタンスの識別番号を返すインスタンスメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return int 識別番号
	 */
	public int getId(){
		return id;
	}

}
