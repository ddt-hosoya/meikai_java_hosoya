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
		final int SHAPE_MIN = 1;
		// 図形の種類
		final int SHAPE_MAX = 4;
		// 調整値を定数化
		final int ADJUST_INT = 1;
		// 辺の長さとする
		int length = stdIn.nextInt();
		// 直角の位置
		int anglePosition;
		// 直角の位置の選択を促し、選択し以外が入力された場合、繰り返し入力を促す
		do{
			System.out.print("直角の位置を選択してください（1...左下／2...左上／3...右下／4...右上）：");
			// 入力値を直角の位置とする
			anglePosition = stdIn.nextInt();
		}while(anglePosition < SHAPE_MIN && anglePosition > SHAPE_MAX );

		// 直角の位置を配列の引数に渡すために調整した変数
		int displayAnglePosition = anglePosition - ADJUST_INT;

		//e13_01_Shape shape[] = new e13_01_Shape[displayAnglePosition];


		// 図形クラスをインスタンス化
		switch(anglePosition){
				// 1左下が選択された場合
				case 1:
					e13_01_Shape positionBottomLeft = new e13_02_PositionBottomLeft(length, displayAnglePosition);
					// 生成した図形を描画する
					positionBottomLeft.print();
					break;
				// 2左上が選択された場合
				case 2:
					e13_01_Shape positionUpperLeft = new e13_02_PositionUpperLeft(length, displayAnglePosition);
					// 生成した図形を描画する
					positionUpperLeft.print();
					break;
				// 3右下が選択された場合
				case 3:
					e13_01_Shape positionBottomRight = new e13_02_PositionBottomRight(length, displayAnglePosition);
					// 生成した図形を描画する
					positionBottomRight.print();
					break;
				// 4右上が選択された場合
				case 4:
					e13_01_Shape positionUpperRight = new e13_02_PositionUpperRight(length, displayAnglePosition);
					// 生成した図形を描画する
					positionUpperRight.print();
					break;
			}

	}
}
