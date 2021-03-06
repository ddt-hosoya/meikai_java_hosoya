package e08;

import java.util.Scanner;
// 人間クラステスト用
public class e08_01_tester {
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
		double height = stdIn.nextDouble();
		// 体重の入力を促す
		System.out.print("体重：");
		// 入力値を体重にいれる
		double weight = stdIn.nextDouble();

		// 人間クラスをインスタンス化
		e08_01 myprofile = new e08_01(name, height, weight);

		// 説明を表示
		System.out.println("プロフィールを表示します。");
		// プロフィールを表示する
		myprofile.putSpec();

		// 標準体重を表示
		System.out.printf("あなたの標準体重は%5.2fです。\n", myprofile.putStandardWeight());

		// 更新身長をたずねる
		System.out.print("更新身長：");
		// 入力値をプロフィールを更新するための変数にいれる
		double newHeight = stdIn.nextDouble();
		// 身長を更新し、前回との差分を返す
		double difference = myprofile.updateHeight(newHeight);
		// 差分が0より大きい場合
		if(difference > 0){
			// 伸びた値を表示
			System.out.printf("前回と比較して身長が%5.2fcm伸びました。\n", difference);
		// 差分が0より小さい場合
		}else if(difference < 0){
			// 絶対値をもとめる
			difference = -difference;
			// 縮んだ値を表示
			System.out.printf("前回と比較して身長が%5.2fcm縮みました。\n", difference);
		// 差分が0の場合
		}else{
			// 変更がない主旨を表示
			System.out.println("前回と比較して身長に変化はありませんでした。");
		}


		// 更新体重をたずねる
		System.out.print("体重：");
		// 入力値をプロフィールを更新するための変数にいれる
		double newWeight = stdIn.nextDouble();
		// 体重を更新し、前回との差分を返す
		double differenceWeight = myprofile.updateWeight(newWeight);
		// 差分が0より大きい場合
		if(differenceWeight > 0){
			// 増えた値を表示
			System.out.printf("前回と比較して体重が%5.2fkg増えました。\n", differenceWeight);
		// 差分が0より小さい場合
		}else if(differenceWeight < 0){
			// 絶対値をもとめる
			differenceWeight = -differenceWeight;
			// 減った値を表示
			System.out.printf("前回と比較して体重が%5.2fkg減りました。\n", differenceWeight);
		// 差分が0の場合
		}else{
			// 変更がない主旨を表示
			System.out.println("前回と比較して体重に変化はありませんでした。");
		}

		// 説明を表示
		System.out.println("プロフィールを表示します。");
		// プロフィールを表示する
		myprofile.putSpec();
	}
}
