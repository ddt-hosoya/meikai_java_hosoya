package e09;
/*
第8章で作成した《銀行口座クラス(第2版)》に、口座開設日のフィールドとtoStringメソッドを追加せよ。
※コンストラクタを変更したり口座開設日のゲッタ(口座開設日フィールドが参照する日付インスタンスのコピーを返す)
などのメソッドを追加したりすること。
 */
/**
 * 銀行口座クラス(第2版)+α
 * @author t.hosoya
 * @since 20190624
 */
public class e09_03 {
	private String name;
	private String no;
	private long balance;
	private e09_03_Day openDay;

	// コンストラクタ
	public e09_03(String name, String no, long balance, e09_03_Day openDay){
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new e09_03_Day(openDay);
	}
	/**
	 * 口座名義を調べるメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 口座名義
	 */
	public String getName(){
		return name;
	}
	/**
	 * 口座番号を調べるメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 口座番号
	 */
	public String getNo(){
		return no;
	}
	/**
	 * 貯金残高を調べるメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return long 貯金残高
	 */
	public long getBalance(){
		return balance;
	}
	/**
	 * 口座開設日を調べるメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 口座開設日
	 */
	public String getOpenDay(){
		openDay = new e09_03_Day(openDay);
		return toStringDate();
	}
	/**
	 * k円預けるメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param k 預ける金額
	 */
	public void deposit(long k){
		balance += k;
	}
	/**
	 * k円おろすメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param k おろす金額
	 */
	public void withdraw(long k){
		balance -= k;
	}
	/**
	 * 日付の文字列表現を返却するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 日付を年月日(曜日)で表した文字列
	 */
	public String toStringDate(){
		// 曜日の配列
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		// 日付を年月日(曜日)で表した文字列を返す
		return String.format("%04d年%02d月%02d日(%s)",
				openDay.getYear(), openDay.getMonth(), openDay.getDate(), wd[openDay.dayOfWeek()]);
	}
	/**
	 * 銀行口座情報について文字列表現を返却するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 銀行口座情報
	 */
	public String toString(){
		// 口座情報を文字列で表現
		return String.format("口座名義:%s\n口座番号:%s\n預金残高:%s\n口座開設日:%s\n\n",
								name,no,balance,getOpenDay());
	}
}
