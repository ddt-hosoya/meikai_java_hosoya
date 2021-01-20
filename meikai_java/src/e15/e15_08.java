package e15;
import static java.util.Calendar.*;

import java.util.GregorianCalendar;

import e10.e10_04_Day;
/*
 * コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。
 * コマンドラインの年のみが与えられた場合は、その年の1月から12月までのカレンダーを表示して、
 * 年と月が与えられた場合はその月のカレンダーを表示して、
 * 年も月も与えられなかったら現在の月のカレンダーを表示すること。（p.501）
 */
/**
 * カレンダーを表示するプログラム
 * @author t.hosoya
 * @since 20210106
 *
 */
public class e15_08 {

	public static void main(String[] args) {
		int year;								// 年
		int month;								// 月
		int displayPattern;					// 表示パターン
		final int DIAPLAY_NO_ARGS = 0;		// 表示パターン引数なし
		final int DIAPLAY_ONE_ARGS = 1;		// 表示パターン引数ひとつ
		final int DIAPLAY_TWO_ARGS = 2;		// 表示パターン引数ふたつ
		final int YEAR_MIN_LIMIT = 1583;		// 表示年下限
		final int YEAR_ARGS_POSITION = 0;		// 引数の位置 年
		final int MONTH_ARGS_POSITION = 1;	// 引数の位置 月
		final int JANUARY = 1;					// 1月
		final int DECEMBER = 12;				// 12月

		// 引数なしの場合
		if(args.length == 0){
			displayPattern = DIAPLAY_NO_ARGS;
		// 引数が1つの場合
		}else if(args.length == 1){
			// 1583年以降であるか確認(教本(p301,302)で取り上げられているグレゴリオ暦でカレンダー表示をするのでそれ以前の日付は正しく表示できないため)
			if(Integer.parseInt(args[YEAR_ARGS_POSITION]) < YEAR_MIN_LIMIT){
				// 1583年より前の場合は正しく表示できないので引数なしのパターンで表示する
				displayPattern = DIAPLAY_NO_ARGS;
				// 表示できないことを知らせる
				System.out.println("1583年より前のカレンダーは表示できません。");
			}else{
				// フォーマットチェックOK
				displayPattern = DIAPLAY_ONE_ARGS;
			}
		// 引数が2つ以上の場合
		} else {
			// 1583年以降であるか確認(教本(p301,302)で取り上げられているグレゴリオ暦でカレンダー表示をするのでそれ以前の日付は正しく表示できないため)
			if(Integer.parseInt(args[YEAR_ARGS_POSITION]) < YEAR_MIN_LIMIT){
				// 1583年より前の場合は正しく表示できないので引数なしのパターンで表示する
				displayPattern = DIAPLAY_NO_ARGS;
				// 表示できないことを知らせる
				System.out.println("1583年より前のカレンダーは表示できません。");
			}else{
				// 月が1から12の間で指定されているか確認
				if(Integer.parseInt(args[MONTH_ARGS_POSITION]) < JANUARY || Integer.parseInt(args[MONTH_ARGS_POSITION]) > DECEMBER){
					// 1より小さく12より大きい場合引数1つのパターンで表示する
					displayPattern = DIAPLAY_ONE_ARGS;
					// 指定した月が誤りであることを知らせる
					System.out.println(args[MONTH_ARGS_POSITION] + "月は存在しません。");
				}else{
					// 1から12の間で指定されている場合は引数2つのパターンで表示する
					displayPattern = DIAPLAY_TWO_ARGS;
				}
			}
		}

		// 表示パターンによってカレンダーを表示
		switch(displayPattern){
			// 年も月も与えられない場合、現在の月のカレンダーを表示
			case DIAPLAY_NO_ARGS:
				// カレンダークラス実体化
				GregorianCalendar today = new GregorianCalendar();
				// 現在の年を取得
				year = today.get(YEAR);
				// 現在の月を取得
				month = today.get(MONTH) + 1;
				// カレンダーを表示するメソッドを呼び出す
				displayCalendar(year, month);

				break;

			// 年のみが与えられた場合、その年の1月から12月までのカレンダーを表示
			case DIAPLAY_ONE_ARGS:
				// 年をint型に変換
				year = Integer.parseInt(args[YEAR_ARGS_POSITION]);

				// 1月から12月まで表示
				for(month = 1; month <= 12; month++){
					// カレンダーを表示するメソッドを呼び出す
					displayCalendar(year, month);
				}
				break;

			// 年と月が与えられた場合、その月のカレンダーを表示
			case DIAPLAY_TWO_ARGS:
				// 年をint型に変換
				year = Integer.parseInt(args[YEAR_ARGS_POSITION]);
				// 月をint型に変換
				month = Integer.parseInt(args[MONTH_ARGS_POSITION]);
				// カレンダーを表示するメソッドを呼び出す
				displayCalendar(year, month);
				break;
		}
	}

	/**
	 *  指定された年、月のカレンダーを表示するメソッド
	 * @param year 年
	 * @param month 月
	 * @author t.hosoya
	 * @since 20210120
	 */
	public static void displayCalendar(int year, int month){
		// 月始めの日付の曜日を求める
		int dayOfWeek = getFirstDayOfWeek(year, month);
		// その月の末日を求める
		int maxDay = e10_04_Day.lastDayOfMonth(year, month);
		// 表示するカレンダーの年月を表示
		System.out.println(year + "年" + month + "月");
		// 曜日を表示
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		int position = dayOfWeek;
		// その月の開始位置まで空白で埋める
		for(int count = 0; count < position; count++){
			System.out.print("    ");
		}
		// 月初から月末まで繰り返す
		for(int day = 1; day <= maxDay;){
			do{
				System.out.printf("%4d",day);
				position++;
				day++;
			// 日曜から土曜まで表示したら次の行へ
			}while((position < 7 || position % 7 != 0 ) && day <= maxDay);
			// 改行
			System.out.println();
		}
		// 改行
		System.out.println("----------------------------");
	}

	/**
	 * 月始めの日付の曜日を求めて返却するメソッド
	 * @param year
	 * @param month
	 * @author t.hosoya
	 * @since 20210120
	 * @return 月始めの曜日
	 */
	public static int getFirstDayOfWeek(int year, int month){
		int date = 1;
		if( month == 1 || month == 2){
			year--;
			month += 12;
		}
		// 教本(p301,302)で取り上げられているグレゴリオ暦に基づく計算式を使用
		// 日曜から土曜が0から6の数値で返却される
		return (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + date) % 7;
	}

}
