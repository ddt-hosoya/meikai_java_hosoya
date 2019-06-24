package e09;

import java.util.Scanner;
// 人間クラステスト用
public class e09_04_tester {
	public static void main(String[] args){
		// 入力機能をインスタンス化
		Scanner stdIn = new Scanner(System.in);

		// 名前の入力を促す
		System.out.print("名前：");
		// 入力値を名前にいれる
		String name = stdIn.next();
		// 身長の入力を促す
		System.out.print("身長：");
		// 入力値を身長にいれる
		int height = stdIn.nextInt();
		// 体重の入力を促す
		System.out.print("体重：");
		// 入力値を体重にいれる
		int weight = stdIn.nextInt();
		// 誕生年の入力を促す
		System.out.print("誕生年：");
		//  入力値を誕生年にいれる
		int year = stdIn.nextInt();
		// 誕生月の入力を促す
		System.out.print("誕生月：");
		//  入力値を誕生月にいれる
		int month = stdIn.nextInt();
		// 誕生日の入力を促す
		System.out.print("誕生日：");
		//  入力値を誕生日にいれる
		int date = stdIn.nextInt();

		// 誕生日を日付クラスでインスタンス化
		e09_04_Day birthday = new e09_04_Day(year, month, date);

		// 人間クラスをインスタンス化
		e09_04 myprofile = new e09_04(name, height, weight, birthday);

		// 説明を表示
		System.out.println("プロフィールを表示します。");
		// プロフィールを表示する
		myprofile.putSpec();

		// 標準体重を表示
		System.out.printf("あなたの標準体重は%5.2fです。\n", myprofile.putStandardWeight());

		// 誕生日を表示
		System.out.println("誕生日を表示します。");
		// 誕生日を表示する
		System.out.println(myprofile.getBirthday() + "です。");

		// 更新身長をたずねる
		System.out.print("更新身長：");
		// 入力値をプロフィールを更新するための変数にいれる
		int newHeight = stdIn.nextInt();
		// 身長を更新し、前回との差分を返す
		int difference = myprofile.updateHeight(newHeight);
		// 差分が0より大きい場合
		if(difference > 0){
			// 伸びた値を表示
			System.out.printf("前回と比較して身長が%dcm伸びました。\n", difference);
		// 差分が0より小さい場合
		}else if(difference < 0){
			// 絶対値をもとめる
			difference = -difference;
			// 縮んだ値を表示
			System.out.printf("前回と比較して身長が%dcm縮みました。\n", difference);
		// 差分が0の場合
		}else{
			// 変更がない主旨を表示
			System.out.println("前回と比較して身長に変化はありませんでした。");
		}


		// 更新体重をたずねる
		System.out.print("体重：");
		// 入力値をプロフィールを更新するための変数にいれる
		int newWeight = stdIn.nextInt();
		// 体重を更新し、前回との差分を返す
		int differenceWeight = myprofile.updateWeight(newWeight);
		// 差分が0より大きい場合
		if(differenceWeight > 0){
			// 増えた値を表示
			System.out.printf("前回と比較して体重が%dkg増えました。\n", differenceWeight);
		// 差分が0より小さい場合
		}else if(differenceWeight < 0){
			// 絶対値をもとめる
			differenceWeight = -differenceWeight;
			// 減った値を表示
			System.out.printf("前回と比較して体重が%dkg減りました。\n", differenceWeight);
		// 差分が0の場合
		}else{
			// 変更がない主旨を表示
			System.out.println("前回と比較して体重に変化はありませんでした。");
		}
	}
}
