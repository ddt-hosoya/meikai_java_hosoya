package e09;

import java.util.Scanner;
// 期間クラステスト用
public class e09_05_Tester {
	public static void main(String[] args){
		// 入力機能をインスタンス化
		Scanner stdIn = new Scanner(System.in);

		// 開始日の入力開始のメッセージ表示
		System.out.println("開始日を入力してください。");
		// 開始年の入力を促す
		System.out.print("年：");
		// 入力値を開始年とする
		int fromYear = stdIn.nextInt();
		// 開始月の入力を促す
		System.out.print("月：");
		// 入力値を開始月とする
		int fromMonth = stdIn.nextInt();
		// 開始日の入力を促す
		System.out.print("日：");
		// 入力値を開始日とする
		int fromDate = stdIn.nextInt();

		// 終了日の入力開始のメッセージ表示
		System.out.println("終了日を入力してください。");
		// 終了年の入力を促す
		System.out.print("年：");
		// 入力値を終了年とする
		int toYear = stdIn.nextInt();
		// 終了月の入力を促す
		System.out.print("月：");
		// 入力値を終了月とする
		int toMonth = stdIn.nextInt();
		// 終了日の入力を促す
		System.out.print("日：");
		// 入力値を終了日とする
		int toDate = stdIn.nextInt();

		// 期間クラスをインスタンス化
		e09_05_Period period = new e09_05_Period(new e09_05_Day(fromYear, fromMonth, fromDate),
				new e09_05_Day(toYear, toMonth, toDate));

		// 開始日を表示する
		System.out.printf("開始日は%sです。", period.getFrom());
		// 終了日を表示する
		System.out.printf("終了日は%sです。", period.getTo());
		// 改行
		System.out.println();

		// 開始日の更新のメッセージ表示
		System.out.println("開始日の更新");
		// 開始年の入力を促す
		System.out.print("年：");
		// 入力値を開始年とする
		fromYear = stdIn.nextInt();
		// 開始月の入力を促す
		System.out.print("月：");
		// 入力値を開始月とする
		fromMonth = stdIn.nextInt();
		// 開始日の入力を促す
		System.out.print("日：");
		// 入力値を開始日とする
		fromDate = stdIn.nextInt();
		// 入力した日付で開始日を更新する
		period.setFrom(new e09_05_Day(fromYear, fromMonth, fromDate));
		// 改行
		System.out.println();

		// 終了日の更新のメッセージ表示
		System.out.println("終了日の更新");
		// 終了年の入力を促す
		System.out.print("年：");
		// 入力値を終了年とする
		toYear = stdIn.nextInt();
		// 終了月の入力を促す
		System.out.print("月：");
		// 入力値を終了月とする
		toMonth = stdIn.nextInt();
		// 終了日の入力を促す
		System.out.print("日：");
		// 入力値を終了日とする
		toDate = stdIn.nextInt();
		// 入力した日付で終了日を更新する
		period.setTo(new e09_05_Day(toYear, toMonth, toDate));
		// 改行
		System.out.println();

		// 開始日を表示する
		System.out.printf("開始日は%sです。", period.getFrom());
		// 終了日を表示する
		System.out.printf("終了日は%sです。", period.getTo());
		// 改行
		System.out.println();

		// 判定を続けるかの回答
		int answer;
		// 判定を続けますか？で「No」を選択しない限り繰り返す
		do{
			// 期間内かどうかを判定するメッセージを表示
			System.out.println("入力する日付が期間内であるかどうか判定します。");
			// 年の入力を促す
			System.out.print("年：");
			// 入力値を年とする
			int inputYear = stdIn.nextInt();
			// 月の入力を促す
			System.out.print("月：");
			// 入力値を月とする
			int inputMonth = stdIn.nextInt();
			// 日の入力を促す
			System.out.print("日：");
			// 入力値を日とする
			int inputDate = stdIn.nextInt();
			// 日付クラスでインスタンス化
			e09_05_Day inputDay = new e09_05_Day(inputYear, inputMonth, inputDate);
			// 入力された日付が期間内の場合
			if(period.isInPriod(inputDay)){
				// 期間内であることを表示
				System.out.println(period.toString(inputDay) + "は期間内です。");
			// 入力された日付が期間外の場合
			}else{
				// 期間外であることを表示
				System.out.println(period.toString(inputDay) + "は期間外です。");
			}

			// 判定を続けるか尋ねる
			System.out.print("判定を続けますか？ Yes...0, No...1：");
			// 入力値を代入する
			answer = stdIn.nextInt();
			// 判定を続けますか？で「No」を選択した場合、繰り返しを抜ける
		}while(answer == 0);

	}
}
