package e13;

import java.util.Scanner;
/*
 * 図形クラス群に対して直角二等辺三角形を表すクラス群を追加せよ。左下が直角のもの、左上が直角のもの、
 * 右下が直角のもの、右上が直角のものを追加すること。直角二等辺三角形を表す抽象クラスを作り、
 * そこから個々のクラスを派生して作ること。
 */
public class e13_02_Tester {
	public static void main(String[] args){
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// 説明をする
		System.out.println("二等辺三角形を描画します");
		System.out.print("辺の長さを入力してください：");

		// 調整値を定数化
		final int ADJUST_INT = 1;
		// 図形の種類
		final int SHAPE_TYPE = 4;
		// 辺の長さとする
		int length = stdIn.nextInt();
		// 直角の位置
		int anglePosition;
		// 直角の位置の選択を促し、選択し以外が入力された場合、繰り返し入力を促す
		do{
			System.out.print("直角の位置を選択してください（1...左下／2...左上／3...右下／4...右上）：");
			// 入力値を直角の位置とする
			anglePosition = stdIn.nextInt();
		}while(anglePosition < ADJUST_INT && anglePosition > SHAPE_TYPE );

		e13_01_Shape shape[] = new e13_01_Shape[SHAPE_TYPE - ADJUST_INT];


		// 図形クラスをインスタンス化
		switch(anglePosition){
			// 1左下が選択された場合
			case 1:
				shape[anglePosition - ADJUST_INT] = new e13_02_PositionBottomLeft(length, anglePosition);
				break;
			// 2左上が選択された場合
			case 2:
				shape[anglePosition - ADJUST_INT] = new e13_02_PositionUpperLeft(length, anglePosition);
				break;
			// 3右下が選択された場合
			case 3:
				shape[anglePosition - ADJUST_INT] = new e13_02_PositionBottomRight(length, anglePosition);
				break;
			// 4右上が選択された場合
			case 4:
				shape[anglePosition - ADJUST_INT] = new e13_02_PositionUpperRight(length, anglePosition);
				break;
		}
		// 生成した図形を描画する
		shape[anglePosition - ADJUST_INT].print();
	}
}
