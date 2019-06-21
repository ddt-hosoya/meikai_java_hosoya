package e09;

//日付クラス第3版
public class e09_02_Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// コンストラクタ
	// 引数がない場合のコンストラクタ
	public e09_02_Day()									{  }
	// 引数が一つの場合のコンストラクタ
	public e09_02_Day(int year)						{ this.year = year; }
	// 引数が二つの場合のコンストラクタ
	public e09_02_Day(int year, int month)				{ this(year); this.month = month; }
	// 引数が三つの場合のコンストラクタ
	public e09_02_Day(int year, int month, int date)	{ this(year, month); this.date = date; }
	// 引数が日付クラスの場合のコンストラクタ
	public e09_02_Day(e09_02_Day day)						{ this(day.year, day.month, day.date); }

	// 年のゲッタ
	public int getYear() { return year; }
	// 月のゲッタ
	public int getMonth() { return month; }
	// 日のゲッタ
	public int getDate() { return date; }

	// 年のセッタ
	public void setYear(int year)   { this.year = year; }
	// 月のセッタ
	public void setMonth(int month) { this.month = month; }
	// 日のセッタ
	public void setDate(int date)   { this.date = date; }

	// 年月日のセッタ
	public void set(int year, int month, int date){
		// 年をフィールドにもたせる
		this.year = year;
		// 月をフィールドにもたせる
		this.month = month;
		// 日をフィールドにもたせる
		this.date = date;
	}
	// ツェラーの公式で曜日を求める
	public int dayOfWeek(){
		int y = year;
		int m = month;
		if(m == 1 || m == 2){
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 日付dayと等しいかどうか
	public boolean equalTo(e09_02_Day day){
		// 日付が一致していればtrueを返し一致していなければfalseを返す
		return year == day.year && month == day.month && date == day.date;
	}

	// 文字列表現を返却
	public String toString(){
		// 曜日の配列
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		// 日付を年月日(曜日)で表した文字列を返す
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
