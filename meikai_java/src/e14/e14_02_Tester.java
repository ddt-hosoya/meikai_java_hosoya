package e14;
/*
 * e14_02_RobotPetクラステスト用
 */
import java.util.Scanner;

public class e14_02_Tester {

	public static void main(String[] args) {
		// 入力機能をインスタンス化
		Scanner stdIn = new Scanner(System.in);
		// 名前の入力を促す
		System.out.print("名前：");
		// 入力値を名前にいれる
		String name = stdIn.next();
		// 名前の入力を促す
		System.out.print("主人の名前：");
		// 入力値を主人の名前にいれる
		String masterName = stdIn.next();

		// ロボットペットインスタンス化
		e14_02_RobotPet robotPet = new e14_02_RobotPet(name, masterName);
		// 現在のスキンの色を確認する
		String beforeSkin = robotPet.getSkinName();
		System.out.println("現在のSkinの色は"+ beforeSkin + "です。");

		// 色番号
		int colorNum;

		// 何色に変更するか入力を促す
		System.out.print("何色に変更しますか？ 数字を入力してください。\n"
				+ "黒=0, 赤=1, 緑=2, 青=3, 豹柄=4 : ");
		// 入力値を色番号に設定する
		colorNum = stdIn.nextInt();

		// 上記で設定した色番号にスキンの色を変更する
		robotPet.changeSkin(colorNum);

		// 自己紹介する
		robotPet.introduce();

	}

}
