package e10;

import java.util.Scanner;
// 日付クラスのテスト用
public class e10_04_Tester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		// 引数を渡さず日付クラスをインスタンス化
		e10_04_Day noArgs = new e10_04_Day();
		// 実行時の日付で初期化されていることを確認
		System.out.printf("引数を渡さず日付クラスをインスタンス化：%s\n\n", noArgs);

		// 引数ひとつで日付をインスタンス化
		e10_04_Day oneArgs = new e10_04_Day(1992);
		// 指定した年1月1日で初期化されていることを確認
		System.out.printf("引数ひとつで日付をインスタンス化：%s\n\n", oneArgs);

		// 引数ふたつで月が0以下の場合
		e10_04_Day TwoArgs0 = new e10_04_Day(1992, 0);
		// 指定した年1月1日で初期化されていることを確認
		System.out.printf("引数ふたつで月が0以下で日付をインスタンス化：%s\n\n", TwoArgs0);

		// 引数ふたつで月が13以上の場合
		e10_04_Day TwoArgs13 = new e10_04_Day(1992, 13);
		// 指定した年12月1日で初期化されていることを確認
		System.out.printf("引数ふたつで月が13以上で日付をインスタンス化：%s\n\n", TwoArgs13);

		// 引数ふたつで月が1~12の場合
		e10_04_Day TwoArgs = new e10_04_Day(1992, 4);
		// 指定した年指定した月1日で初期化されていることを確認
		System.out.printf("引数ふたつで月が1~12で日付をインスタンス化：%s\n\n", TwoArgs);

		// 引数みっつで0月0日の場合
		e10_04_Day ThreeArgs0 = new e10_04_Day(1992, 0, 0);
		// 指定した年1月1日で初期化されていることを確認
		System.out.printf("引数みっつで0月0日で日付をインスタンス化：%s\n\n", ThreeArgs0);

		// 引数みっつで13月32日の場合
		e10_04_Day ThreeArgs32 = new e10_04_Day(1992, 13, 32);
		// 指定した年12月31日で初期化されていることを確認
		System.out.printf("引数みっつで13月32日で日付をインスタンス化：%s\n\n", ThreeArgs32);

		// 引数みっつの場合
		e10_04_Day ThreeArgs = new e10_04_Day(1992, 4, 3);
		// 指定した年、指定した月、指定した日で初期化されていることを確認
		System.out.printf("引数みっつで日付をインスタンス化：%s\n\n", ThreeArgs);

		// 引数がクラス型変数の場合
		e10_04_Day classArgs = new e10_04_Day(ThreeArgs);
		// 引数に入れたクラスの値で初期化されていることを確認
		System.out.printf("引数がクラス型変数で日付をインスタンス化：%s\n\n", classArgs);

		// 閏年かどうか(クラスメソッド)
		System.out.print("閏年かどうかを調べる 年：");
		// 入力値を調べる年とする
		int inputYear = stdIn.nextInt();
		// 閏年の場合
		if(e10_04_Day.isLeap(inputYear)){
			// 閏年であると表示
			System.out.printf("%d年は閏年です。\n\n", inputYear);
		// 閏年でない場合
		}else{
			// 閏年でないと表示
			System.out.printf("%d年は閏年ではありません。\n\n", inputYear);
		}

		// 閏年かどうか(インスタンスメソッド)
		// 閏年の場合
		if(noArgs.isLeap()){
			// 閏年であると表示
			System.out.printf("%d年は閏年です。\n\n", noArgs.getYear());
		// 閏年でない場合
		}else{
			// 閏年でないと表示
			System.out.printf("%d年は閏年ではありません。\n\n",  noArgs.getYear());
		}

		// 二つの日付の前後関係を判定する(クラスメソッド)
		while(true){
			System.out.printf("ふたつの日付の前後関係をしらべます。\n"
					+ "日付1と日付2にそれぞれ年月日を入力してください。\n");
			System.out.print("日付1 年：");
			int oneYear = stdIn.nextInt();
			System.out.print("日付1 月：");
			int oneMonth = stdIn.nextInt();
			System.out.print("日付1 日：");
			int oneDate = stdIn.nextInt();
			System.out.print("日付2 年：");
			int anotherYear = stdIn.nextInt();
			System.out.print("日付2 月：");
			int anotherMonth = stdIn.nextInt();
			System.out.print("日付2 日：");
			int anotherDate = stdIn.nextInt();

			e10_04_Day oneDay = new e10_04_Day(oneYear, oneMonth, oneDate);
			e10_04_Day anotherDay = new e10_04_Day(anotherYear, anotherMonth, anotherDate);

			// 二つの日付の前後関係を判定する(クラスメソッド)
			switch(e10_04_Day.beforeAndAfter(oneDay, anotherDay)){
				case -1:
					System.out.printf("%sは%sより前の日付です。\n\n", anotherDay, oneDay);
					break;
				case 0:
					System.out.printf("%sは%sと同じ日付です。\n\n", anotherDay, oneDay);
					break;
				case 1:
					System.out.printf("%sは%sより後ろの日付です。\n\n", anotherDay, oneDay);
					break;
				case 9:
					System.out.printf("比較できませんでした。\n\n");
					break;

			}
			// 二つの日付の前後関係を判定する(インスタンスメソッド)
			switch(oneDay.beforeAndAfter(anotherDay)){
				case -1:
					System.out.printf("%sは%sより前の日付です。\n\n", anotherDay, oneDay);
					break;
				case 0:
					System.out.printf("%sは%sと同じ日付です。\n\n", anotherDay, oneDay);
					break;
				case 1:
					System.out.printf("%sは%sより後ろの日付です。\n\n", anotherDay, oneDay);
					break;
				case 9:
					System.out.printf("比較できませんでした。\n\n");
					break;
			}


			// 繰り返すかたずねる
			System.out.print("ふたつの日付の前後関係の判定を続けますか？ Yes...0/No...1：");
			// Noならば繰り返し処理を抜ける
			if(stdIn.nextInt() == 1){ break; }
		}

		while(true){
			System.out.println("メソッドの確認をします。");
			System.out.print("年：");
			int oneYear = stdIn.nextInt();
			System.out.print("月：");
			int oneMonth = stdIn.nextInt();
			System.out.print("日：");
			int oneDate = stdIn.nextInt();
			e10_04_Day day = new e10_04_Day(oneYear, oneMonth, oneDate);

			System.out.printf("入力した日付：%s\n", day);
			// 経過日数
			System.out.printf("経過日数：%d\n", day.passedDay());
			// 年内の残り日数
			System.out.printf("年内の残り日数：%d\n", day.restDay());
			// 日付をひとつ後ろに進める
			day.setTommorow();
			System.out.printf("日付をひとつ後ろに進める：%s\n", day);
			// 日付をひとつ後ろに進めた値を返す
			System.out.printf("%sをひとつ後ろに進める：%s\n\n", day, day.getTommorow());
			// 日付をひとつ前に戻す
			day.setYesterday();
			System.out.printf("日付をひとつ前に戻す：%s\n", day);
			// 日付をひとつ後ろに進めた値を返す
			System.out.printf("%sをひとつ前に戻す：%s\n\n", day, day.getYesterday());

			// 日付をn日後ろに進め
			System.out.print("何日進めますか？:");
			int n = stdIn.nextInt();
			day.setForwardN(n);
			System.out.printf("日付を%d日後ろに進める：%s\n", n, day);

			// 日付をo日後ろに進めた値を返す
			System.out.print("何日進めますか？:");
			int o = stdIn.nextInt();
			System.out.printf("%sを%d日後ろに進める：%s\n\n", day, o, day.getForwardN(o));


			// 日付をp日前に戻す
			System.out.print("何日前に戻しますか？:");
			int p = stdIn.nextInt();
			day.setBackN(p);
			System.out.printf("日付を%d日前に戻す：%s\n", p, day);

			// 日付をq日前に戻した値を返す
			System.out.print("何日前に戻しますか？:");
			int  q = stdIn.nextInt();
			System.out.printf("%sを%d日前に戻す：%s\n\n", day, q, day.getBackN(q));

			// 繰り返すかたずねる
			System.out.print("メソッドの確認を続けますか？ Yes...0/No...1：");
			// Noならば繰り返し処理を抜ける
			if(stdIn.nextInt() == 1){ break; }
		}
	}
}
