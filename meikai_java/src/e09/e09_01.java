package e09;
/*
 * 演習8-1(p.293)で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 * 生成時に要素を初期化するもの、生成後の要素に値を代入するものなど、複数のパターンを作ること。
 */
import java.util.Scanner;

public class e09_01 {
	public static void main(String[] args){
		// 入力機能のインスタンス化
		Scanner stdIn = new Scanner(System.in);

		//《パターン1》生成時に要素を初期化
		e09_01_Human[] initializeSameTime = {
				new e09_01_Human("田中", 160, 50),
				new e09_01_Human("鈴木", 166, 68),
				new e09_01_Human("山田", 150, 49)
				};

		//《パターン2》生成後の要素に値を代入
		// 配列を生成
		e09_01_Human[] substituteAfterCreate;
		// 生成後
		substituteAfterCreate = new e09_01_Human[]{
				new e09_01_Human("加藤", 171, 59),
				new e09_01_Human("福田", 159, 53),
				new e09_01_Human("上野", 183, 80)
		};

		//《パターン3》生成後の要素にそれぞれ値を代入
		// 生成する配列の要素数を尋ねる
		System.out.print("要素数：");
		// 入力値を要素数とする
		int valueNumber = stdIn.nextInt();
		// 配列を生成
		e09_01_Human[] substituteEachValue = new e09_01_Human[valueNumber];
		// 各要素に値を代入する
		for(int index = 0; index < substituteEachValue.length; index++){
			// プロフィールを入力する説明を表示
			System.out.println("substituteEachValue[" + index + "]に代入するプロフィールを入力してください。");
			// 名前の入力を促す
			System.out.print("名前：");
			// 入力値を名前とする
			String name = stdIn.next();
			// 身長の入力を促す
			System.out.print("身長：");
			// 入力値を身長とする
			int height = stdIn.nextInt();
			// 体重の入力を促す
			System.out.print("体重：");
			// 入力値を体重とする
			int weight = stdIn.nextInt();

			// 入力値でその人間クラスをインスタンス化
			substituteEachValue[index] = new e09_01_Human(name, height, weight);
		}
		// 改行
		System.out.println();

		//《パターン1》生成時に要素を初期化した配列の全要素を表示
		for(int index = 0; index < initializeSameTime.length; index++){
			// 各人間のスペックを表示
			initializeSameTime[index].putSpec();
			// 改行
			System.out.println();
		}
		// 改行
		System.out.println("-------------");

		//《パターン2》生成後の要素に値を代入した配列の全要素を表示
		for(int index = 0; index < substituteAfterCreate.length; index++){
			// 各人間のスペックを表示
			substituteAfterCreate[index].putSpec();
			// 改行
			System.out.println();
		}
		// 改行
		System.out.println("-------------");

		//《パターン3》生成後の要素にそれぞれ値を代入した配列の全要素を表示
		for(int index = 0; index < substituteEachValue.length; index++){
			// 各人間のスペックを表示
			substituteEachValue[index].putSpec();
			// 改行
			System.out.println();
		}
	}
}
