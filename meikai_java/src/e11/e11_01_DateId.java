package e11;
import static java.util.Calendar.*;

/*
List10-12(p.356)のクラスDateIdをパッケージidに所属させるように書き換えよ。
なお、クラスDateIdTesterは無名パッケージに所属させること。
 */
import java.util.GregorianCalendar;
/**
 * DateIdクラス
 * @author t.hosoya
 * @since 20190627
 */
public class e11_01_DateId {
	// 何番までの識別番号を与えたか
	private static int counter;
	// 識別番号
	private int id;
	// クラス初期化子
	static{
		// グレゴリオ暦を実体化
		GregorianCalendar today = new GregorianCalendar();
		// 年
		int y = today.get(YEAR);
		// 月
		int m = today.get(MONTH) + 1;
		// 日
		int d = today.get(DATE);
		// 年月日を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		// 識別番号の初期値を設定
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	// コンストラクタ
	public e11_01_DateId(){
		// 識別番号をインクリメントして与える
		id = ++counter;
	}

	/**
	 * 識別番号を取得するメソッド
	 * @author t.hosoya
	 * @since 20190627
	 * @return int 識別番号
	 */
	public int getId(){
		// 識別番号を返す
		return id;
	}
}