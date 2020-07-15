package e09;
/*
開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。フィールドは以下のようになる。
 */
/**
 * 期間クラス
 * @author t.hosoya
 * @since 20190624
 *
 */
public class e09_05_Period {
	// 開始日
	private e09_05_Day dateFrom;
	// 終了日
	private e09_05_Day dateTo;

	// コンストラクタ
	e09_05_Period(e09_05_Day dateFrom, e09_05_Day dateTo){
		// 日付クラスの変数を受け取り開始日とする
		this.dateFrom = dateFrom;
		// 日付クラスの変数を受け取り終了日とする
		this.dateTo= dateTo;
	}

	/**
	 *  開始日の日付を返すメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 日付を年月日(曜日)の形式にした文字列
	 */
	public String getFrom(){
		// 文字列で返す
		return toString(this.dateFrom);
	}
	/**
	 *  終了日の日付を返すメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 日付を年月日(曜日)の形式にした文字列
	 */
	public String getTo(){
		// 文字列で返す
		return toString(this.dateTo);
	}

	/**
	 *  開始日を更新するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param inputFrom 開始日
	 */
	public void setFrom(e09_05_Day inputFrom){
		// 日付クラスの変数を受け取り開始日にいれる
		this.dateFrom = inputFrom;
	}
	/**
	 *  終了日を更新するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param 終了日
	 */
	public void setTo(e09_05_Day inputTo){
		// 日付クラスの変数を受け取り終了日にいれる
		this.dateTo = inputTo;
	}

	/**
	 *  日付を受け取り、その日付が期間内かどうかを判定するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param inputDay 日付
	 * @return boolean 日付が期間内かどうか
	 */
	public boolean isInPriod(e09_05_Day inputDay){
		// 入力年が開始年より小さいか、終了年より大きい場合
		if(inputDay.getYear() < dateFrom.getYear() || inputDay.getYear() > dateTo.getYear()){
			// 期間外の為falseを返す
			return false;
		// 期間内の年の場合
		}else{
			// 入力年と開始年が同じかつ、入力月が開始月より小さい場合
			if(inputDay.getYear() == dateFrom.getYear() && inputDay.getMonth() < dateFrom.getMonth()){
				// 期間外の為falseを返す
				return false;
			// 入力年と開始年が同じかつ、入力月と開始月が同じかつ、入力日が開始日より小さい場合
			}else if(inputDay.getYear() == dateFrom.getYear() && inputDay.getMonth() == dateFrom.getMonth()
					&& inputDay.getDate() < dateFrom.getDate()){
				// 期間外の為falseを返す
				return false;
			}
			// 入力年と終了年が同じかつ、入力月が終了月より大きい場合
			if(inputDay.getYear() == dateTo.getYear() && inputDay.getMonth() > dateTo.getMonth()){
				// 期間外の為falseを返す
				return false;
			// 入力年と終了年が同じかつ、入力月と終了月が同じかつ、入力日が終了日より大きい場合
			}else if(inputDay.getYear() == dateTo.getYear() && inputDay.getMonth() == dateTo.getMonth()
					&& inputDay.getDate() > dateTo.getDate()){
				// 期間外の為falseを返す
				return false;
			}
		}
		// 期間内の為trueを返す
		return true;
	}

	/**
	 * 日付を文字列で返すメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param day 日付
	 * @return String 日付を年月日(曜日)の形式にした文字列
	 */
	public String toString(e09_05_Day day){
		// 曜日の配列
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		// 日付クラスの値を文字列で返す
		return String.format("%04d年%02d月%02d日(%s)", day.getYear(), day.getMonth(),
				day.getDate(), wd[day.dayOfWeek()]);
	}
}
