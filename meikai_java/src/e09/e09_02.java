package e09;
/*
日付クラス第3版を利用するプログラムを作成せよ。
すべてのコンストラクタの働きを確認できるようにすること。
 */
import java.util.Scanner;

public class e09_02 {
	public static void main(String[] args){
		// 入力機能のインスタンス化
		Scanner stdIn = new Scanner(System.in);

		// 引数が0の場合のコンストラクタの呼び出し
		System.out.println("引数が0つの場合のクラスのインスタンス化");
		// 引数なしで日付クラスをインスタンス化
		e09_02_Day dayZero = new e09_02_Day();
		// 年月日の値を表示
		System.out.println(dayZero.toString());

		// 引数が1の場合のコンストラクタの呼び出し
		System.out.println("引数が1つの場合のクラスのインスタンス化");
		// 年の入力を促す
		System.out.print("年：");
		// 入力値をインスタンス化するため変数にいれる
		int year = stdIn.nextInt();
		// 引数1で日付クラスをインスタンス化
		e09_02_Day dayOne = new e09_02_Day(year);
		// 年月日の値を表示
		System.out.println(dayOne.toString());

		// 引数が2の場合のコンストラクタの呼び出し
		System.out.println("引数が2つの場合のクラスのインスタンス化");
		// 年の入力を促す
		System.out.print("年：");
		// 入力値をインスタンス化するため変数にいれる
		int yearTwo = stdIn.nextInt();
		// 月の入力を促す
		System.out.print("月：");
		// 入力値をインスタンス化するため変数にいれる
		int monthTwo = stdIn.nextInt();
		// 引数2で日付クラスをインスタンス化
		e09_02_Day dayTwo = new e09_02_Day(yearTwo, monthTwo);
		// 年月日の値を表示
		System.out.println(dayTwo.toString());

		// 引数が3の場合のコンストラクタの呼び出し
		System.out.println("引数が3つの場合のクラスのインスタンス化");
		// 年の入力を促す
		System.out.print("年：");
		// 入力値をインスタンス化するため変数にいれる
		int yearThree = stdIn.nextInt();
		// 月の入力を促す
		System.out.print("月：");
		// 入力値をインスタンス化するため変数にいれる
		int monthThree = stdIn.nextInt();
		// 日の入力を促す
		System.out.print("日：");
		// 入力値をインスタンス化するため変数にいれる
		int dateThree = stdIn.nextInt();
		// 引数3で日付クラスをインスタンス化
		e09_02_Day dayThree = new e09_02_Day(yearThree, monthThree, dateThree);
		// 年月日の値を表示
		System.out.println(dayThree.toString());

		// 引数がクラス型インスタンスの場合のコンストラクタの呼び出し
		System.out.println("引数がクラス型インスタンスの場合のクラスのインスタンス化");
		// 引数ひとつで生成したインスタンスを引数にしてクラスをインスタンス化
		e09_02_Day dayClass = new e09_02_Day(dayOne);
		// 年月日の値を表示
		System.out.println(dayClass.toString());


	}
}


