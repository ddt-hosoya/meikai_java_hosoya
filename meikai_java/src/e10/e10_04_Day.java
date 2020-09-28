package e10;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
日付クラス第4版(p.346)を以下のように改良せよ。
・引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦1年1月1日で初期化するのではなく、
プログラムの実行時の日付で初期化する。
・引数を受け取るコンストラクタに不正な値が指定された場合は適当な値に調整する。
（たとえば13月が指定された場合は12月とする/9月31日が指定された場合は9月30日とする）
さらに、以下を示すメソッドを追加すること。
・年内での経過日数（元旦から数えて何日目であるか）を求めるメソッド
・年内の残り日数を求めるメソッド
・ほかの日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
・二つの日付の前後関係を判定するクラスメソッド
・日付を一つ後ろに進めるメソッド
・次の日の日付を返却するメソッド
・日付をひとつ前に戻すメソッド
・前日の日付を返却するメソッド
・日付をn日後ろに進めるメソッド
・n日後の日付を返却するメソッド
・日付をn日前に戻すメソッド
・n日前の日付を返却するメソッド
etc...
 */
/**
 * 日付クラス第4版_改訂
 * @author t.hosoya
 * @since 20190626
 */
public class e10_04_Day {
	// インスタンス変数
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// クラス変数
	private static int staticY;
	private static int staticM;
	private static int staticD;

	// クラス初期化子
	static{
		GregorianCalendar today = new GregorianCalendar();
		staticY = today.get(YEAR);
		staticM = today.get(MONTH) + 1;
		staticD = today.get(DATE);
	}

	/**
	 * y年は閏年か判定するクラスメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param y 年（西暦）
	 * @return boolean 閏年か否か
	 */
	public static boolean isLeap(int y){
		return y % 4 == 0 && y % 100 != 0 || y % 100 == 0;
	}
	/**
	 * 月の最終日を返すクラスメソッド
	 * @param year 年
	 * @param month 月
	 * @return int 月の最終日
	 */
	public static int lastDayOfMonth(int year, int month){
		// 最終日をいれる変数
		int lastDay;
		switch(month){
			// 4,6,9,11月の場合最終日は30日
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			// 2月の場合
			case 2:
				// 閏年であれば最終日は29日
				if(isLeap(year)){ lastDay = 29; }
				// 閏年でなければ最終日は28日
				else{ lastDay = 28; }
				break;
			// それ以外の月は最終日は31日
			default:
				lastDay = 31;
				break;
		}
		// 最終日を返す
		return lastDay;
	}
	/**
	 * 二つの日付の前後関係を判定するクラスメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param oneDay 日付
	 * @param anotherDay 日付
	 * @return int 前後関係の判定結果
	 */
	public static int  beforeAndAfter(e10_04_Day oneDay, e10_04_Day anotherDay){
		// anotherDayがより前の日付ならば-1／同じ日付ならば0／より後ろの日付ならば1／比較不能であれば9を返す
		int answer = 0;
		if(oneDay == null || anotherDay == null){
			answer = 9;
			return answer;
		}
		// 日付anotherDayと等しい場合
		if(oneDay.year == anotherDay.year && oneDay.month == anotherDay.month && oneDay.date == anotherDay.date){
			// 0を返す
			return answer;
		}

		// anotherDayがより前の日付の場合
		if(oneDay.year > anotherDay.year || (oneDay.year == anotherDay.year && oneDay.month > anotherDay.month) ||
				(oneDay.year == anotherDay.year && oneDay.month == anotherDay.month || oneDay.date > anotherDay.date)){
			answer = -1;
			// -1を返す
			return answer;
		}
		// anotherDayがより後ろの日付ならば1を返す
		if(oneDay.year < anotherDay.year || (oneDay.year == anotherDay.year && oneDay.month < anotherDay.month) ||
				(oneDay.year == anotherDay.year && oneDay.month == anotherDay.month || oneDay.date < anotherDay.date)){
			answer = 1;
			// 1を返す
			return answer;
		}

		// 判定を返す
		return answer;
	}

	// コンストラクタ
	// 引数を受け取らないインストラクタ
	public e10_04_Day(){
		// 年月日にプログラム実行時の年月日を設定
		this(staticY, staticM, staticD);
	}
	// 引数がint型ひとつのコンストラクタ
	public e10_04_Day(int year){
		// 引数で受け取った値を年とし、月日はプログラム実行時の月日とする
		this(year, staticM, staticD);
	}
	// 引数がint型ふたつのコンストラクタ
	public e10_04_Day(int year, int month){
		// 引数で受け取った値を年月とし、日はプログラム実行時の日とする
		this(year, month, staticD);
	}
	// 引数がint型みっつのコンストラクタ
	public e10_04_Day(int year, int month, int date){
		// 引数で受け取った値を年とする
		if(year < 0){
			//マイナスの値を受け取った場合は符号を＋に変更する
			year = -year;
		}
		this.year = year;

		// 引数で受け取った月の値が0より小さいならば1月とする
		if(month < 1){ month = 1; }
		// 引数で受け取った値が12より大きい場合12月とする
		if(month > 12){ month = 12; }
		// 値を月にいれる
		this.month = month;

		// その年月の月最終日を調べる
		int lastDay = lastDayOfMonth(this.year, this.month);
		// 引数で受け取った値が1より小さい場合1日とする
		if(date < 1){ date = 1; }
		// 引数で受け取った値が月最終日より大きい場合最終日とする
		if(date > lastDay){ date = lastDay; }
		// 値を日にいれる
		this.date = date;

	}

	// 引数がクラス型変数のコンストラクタ
	public e10_04_Day(e10_04_Day day){
		// 引数で受け取ったdayクラスがnullの場合
		if(day == null){
			// 年月日にプログラム実行時の年月日を設定
			this.year = staticY;
			this.month = staticM;
			this.date = staticD;
		// 引数で受け取ったdayクラスがnullでなければクラスのフィールドの値を年月日に設定する
		}else{
			// 引数で受け取った値を年とする
			int paramYear = day.year;
			int paramMonth = day.month;
			int paramDate = day.date;
			if(paramYear < 0){
				//マイナスの値を受け取った場合は符号を＋に変更する
				paramYear = -paramYear;
			}
			this.year = paramYear;

			// 引数で受け取った月の値が0より小さいならば1月とする
			if(paramMonth < 1){ paramMonth = 1; }
			// 引数で受け取った値が12より大きい場合12月とする
			if(paramMonth > 12){ paramMonth = 12; }
			// 値を月にいれる
			this.month = paramMonth;

			// その年月の月最終日を調べる
			int lastDay = lastDayOfMonth(this.year, this.month);
			// 引数で受け取った値が1より小さい場合1日とする
			if(paramDate < 1){ paramDate = 1; }
			// 引数で受け取った値が月最終日より大きい場合最終日とする
			if(paramDate > lastDay){ paramDate = lastDay; }
			// 値を日にいれる
			this.date = paramDate;
		}
	}

	/**
	 *  年のゲッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 年
	 */
	public int getYear() {
		return year;
	}
	/**
	 *  月のゲッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 月
	 */
	public int getMonth() {
		return month;
	}

	/**
	 *  日のゲッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 日
	 */
	public int getDate() {
		return date;
	}

	/**
	 *  年のセッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @param int 年
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 *  月のセッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @param int 月
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 *  日のセッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @param int 日
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 *  年月日のセッタ
	 * @author t.hosoya
	 * @since 20190626
	 * @param year 年
	 * @param month 月
	 * @param date 日
	 */
	public void set(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}

	/**
	 *  閏年か判定するインスタンスメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return boolean 閏年か否か
	 */
	public boolean isLeap(){
		return isLeap(year);
	}

	/**
	 *  曜日を求めるメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 曜日
	 */
	public int dayOfWeek(){
		int y = year;
		int m = month;
		if(m == 1 || m == 2){
			y--;
			m += 12;
		}
		return(y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	/**
	 * 日付dと等しいか
	 * @author t.hosoya
	 * @param d 日付
	 * @return boolean 日付dと一致しているか否か
	 */
	public boolean equalTo(e10_04_Day day){
		if( day == null){
			return false;
		}
		// 年、月、日が一致していればtrueを返す
		return year == day.year && month == day.month && date == day.date;
	}

	/**
	 * 文字列表現を返却
	 * @author t.hosoya
	 * @since 20190626
	 * @return string 年月日(曜日)形式の日付
	 */
	public String toString(){
		// 曜日配列
		String[] wd = {"日","月","火","水","木","金","土"};
		// 文字列型で日付を返す
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	/**
	 * 年内での経過日数を求めるメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 経過日数
	 */
	public int passedDay(){
		// 経過日数を入れる変数を初期化
		int passedDayNum = 0;
		// 1月から前月までの日数を加算していく
		for(int num = 1; num < month; num++){
			// 経過日数に日数を加算
			passedDayNum += lastDayOfMonth(year, num);
		}
		// 経過日数に当月の日を加算
		passedDayNum += date;
		// 経過日数を返す
		return passedDayNum;
	}
	/**
	 * 年内の残り日数を求めるメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return int 年内の残り日数
	 */
	public int restDay(){
		// 残り日数を入れる変数
		int restDayNum;
		// 閏年ならば年間日数が366日とし、閏年でなければ年間日数が365日とする
		if(isLeap()){ restDayNum = 366; } else { restDayNum = 365; }
		// 経過日数を求める
		int passedDayNum = passedDay();
		// 年間日数から経過日数を引いて、残りの日数を求める
		restDayNum -= passedDayNum;
		// 残りの日数を返す
		return restDayNum;
	}

	/**
	 * ほかの日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param anotherDay 日付
	 * @return int 前後関係の判定結果
	 */
	public int beforeAndAfter(e10_04_Day anotherDay){
		// 二つの日付を比較するクラスメソッドを呼び、anotherDayがより前の日付ならば-1／同じ日付ならば0／より後ろの日付ならば1を返す
		int answer = beforeAndAfter(this , anotherDay);

		// 判定を返す
		return answer;
	}

	/**
	 * 日付を一つ後ろに進めるメソッド
	 * @author t.hosoya
	 * @since 20190626
	 */
	public void setTommorow(){
		// 次の日を設定するインスタンスを生成
		e10_04_Day tommorow = getTommorow();
		// 次の日の年を設定
		setYear(tommorow.year);
		// 次の日の月を設定
		setMonth(tommorow.month);
		// 次の日の日を設定
		setDate(tommorow.date);
	}

	/**
	 * 次の日の日付を返却するメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return e10_04_Day 次の日の日付
	 */
	public e10_04_Day getTommorow(){
		// 次の日を設定するインスタンスを生成
		e10_04_Day tommorow = new e10_04_Day(year, month, date);
		// 調整値を定数化
		final int ADJUST = 1;
		// 月最終日を調べる
		int lastDay = lastDayOfMonth(year, month);

		// 最終日より日にちが小さい場合
		if(date < lastDay){
			// 日にち1を足して後ろに進める
			tommorow.setDate(date + 1);
		// 最終日の場合
		}else{
			// 月が12月ならば
			if(month == 12){
				// 年を更新
				tommorow.setYear(year + ADJUST);
				// 月を更新
				tommorow.setMonth(ADJUST);
				// 日を更新
				tommorow.setDate(ADJUST);
			// 月が12以外
			}else{
				// 月を更新
				tommorow.setMonth(month + ADJUST);
				// 日を更新
				tommorow.setDate(ADJUST);
			}
		}
		// 次の日の日付を返却
		return tommorow;
	}

	/**
	 * 日付をひとつ前に戻すメソッド
	 * @author t.hosoya
	 * @since 20190626
	 */
	public void setYesterday(){
		// 前日を設定するインスタンスを生成
		e10_04_Day yesterday = getYesterday();
		// 前日の年を設定
		setYear(yesterday.year);
		// 前日の月を設定
		setMonth(yesterday.month);
		// 前日の日を設定
		setDate(yesterday.date);
	}

	/**
	 * 前日の日付を返却するメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @return e10_04_Day 前日の日付
	 */
	public e10_04_Day getYesterday(){
		// 前日を設定するインスタンスを生成
		e10_04_Day yesterday = new e10_04_Day(year, month, date);
		// 調整値を定数化
		final int ADJUST = 1;
		// 前日が前年の場合の月を定数化
		final int LAST_MONTH = 12;

		// 日付が1より大きい場合
		if(date > 1){
			// 日付を1引いてひとつ前に戻す
			yesterday.setDate(date - ADJUST);
		// 日付が1の場合
		}else{
			// 1月の場合
			if(month == 1){
				// 前月最終日を調べる
				int lastDay = lastDayOfMonth(year - ADJUST, LAST_MONTH);
				// 年を更新
				yesterday.setYear(year - ADJUST);
				// 月を更新
				yesterday.setMonth(LAST_MONTH);
				// 日にちを更新
				yesterday.setDate(lastDay);
			// 1月以外
			}else{
				// 前月最終日を調べる
				int lastDay = lastDayOfMonth(year, month - ADJUST);
				// 月を更新
				yesterday.setMonth(month - ADJUST);
				// 日を更新
				yesterday.setDate(lastDay);
			}
		}
		// 前日の日付を返却
		return yesterday;
	}
	/**
	 * 日付をn日後ろに進めるメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param n 後ろに進める日数
	 */
	public void setForwardN(int n){
		e10_04_Day forwardDay = getForwardN(n);
		// n日後ろの年を設定
		setYear(forwardDay.year);
		// n日後ろの月を設定
		setMonth(forwardDay.month);
		// n日後ろの日を設定
		setDate(forwardDay.date);
	}
	/**
	 * n日後の日付を返却するメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param n 何日後
	 * @return e10_04_Day n日後の日付
	 */
	public e10_04_Day getForwardN(int n){
		// n日後の日付をいれるクラス型変数を生成
		e10_04_Day forwardDay = new e10_04_Day(year, month, date);
		// n日分繰り返す
		for(int count = n; count > 0; count--){
			// n日後の日付をいれるクラス型変数を1日後の日付に更新
			forwardDay.setTommorow();
		}
		// n日後の日付を返却
		return forwardDay;
	}
	/**
	 * 日付をn日前に戻すメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param n 前に戻す日数
	 */
	public void setBackN(int n){
		e10_04_Day backDay = getBackN(n);
		// n日前の年を設定
		setYear(backDay.year);
		// n日前の月を設定
		setMonth(backDay.month);
		// n日前の日を設定
		setDate(backDay.date);
	}

	/**
	 * n日前の日付を返却するメソッド
	 * @author t.hosoya
	 * @since 20190626
	 * @param n 何日前
	 * @return e10_04_Day n日前の日付
	 */
	public e10_04_Day getBackN(int n){
		// n日前の日付を入れるクラス型変数を生成
		e10_04_Day backDay = new e10_04_Day(year, month, date);
		// n日分処理を繰り返す
		for(int count = n; count > 0; count--){
			// n日前の日付を入れるクラス型変数を1日前の日付に更新
			backDay.setYesterday();
		}
		// n日前の日付を返却
		return backDay;
	}
}
