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
	private e09_05_Day from;
	// 終了日
	private e09_05_Day to;

	// コンストラクタ
	e09_05_Period(e09_05_Day from, e09_05_Day to){
		// 日付クラスの変数を受け取り開始日とする
		this.from = from;
		// 日付クラスの変数を受け取り終了日とする
		this.to= to;
	}

	/**
	 *  開始日の日付を返すメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 日付を年月日(曜日)の形式にした文字列
	 */
	public String getFrom(){
		// 文字列で返す
		return toString(from);
	}
	/**
	 *  終了日の日付を返すメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @return String 日付を年月日(曜日)の形式にした文字列
	 */
	public String getTo(){
		// 文字列で返す
		return toString(to);
	}

	/**
	 *  開始日を更新するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param inputfrom 開始日
	 */
	public void setFrom(e09_05_Day inputfrom){
		// 日付クラスの変数を受け取り開始日にいれる
		from = inputfrom;
	}
	/**
	 *  終了日を更新するメソッド
	 * @author t.hosoya
	 * @since 20190624
	 * @param 終了日
	 */
	public void setTo(e09_05_Day inputto){
		// 日付クラスの変数を受け取り終了日にいれる
		to = inputto;
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
		if(inputDay.getYear() < from.getYear() || inputDay.getYear() > to.getYear()){
			// 期間外の為falseを返す
			return false;
		// 期間内の年の場合
		}else{
			// 入力年と開始年が同じかつ、入力月が開始月より小さい場合
			if(inputDay.getYear() == from.getYear() && inputDay.getMonth() < from.getMonth()){
				// 期間外の為falseを返す
				return false;
			// 入力年と開始年が同じかつ、入力月と開始月が同じかつ、入力日が開始日より小さい場合
			}else if(inputDay.getYear() == from.getYear() && inputDay.getMonth() == from.getMonth()
					&& inputDay.getDate() < from.getDate()){
				// 期間外の為falseを返す
				return false;
			}
			// 入力年と終了年が同じかつ、入力月が終了月より大きい場合
			if(inputDay.getYear() == to.getYear() && inputDay.getMonth() > to.getMonth()){
				// 期間外の為falseを返す
				return false;
			// 入力年と終了年が同じかつ、入力月と終了月が同じかつ、入力日が終了日より大きい場合
			}else if(inputDay.getYear() == to.getYear() && inputDay.getMonth() == to.getMonth()
					&& inputDay.getDate() > to.getDate()){
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
