package e13;

import java.util.Scanner;
 /*
図形クラス群をテストするプログラムを作成せよ。List13－9と同じく、Shape型の配列を利用して、
インスタンスの生成と表示を行うこと。
ただし、個々の要素が参照するインスタンスは、プログラム内で与えるのではなく、キーボードから読み込むようにすること。
  */
public class e13_01_ShapeTester {
	public static void main(String[] args){
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// 何個の図形を描画するかたずねる
		System.out.print("図形は何個：");
		// 入力値を図形の数とする
		int shapeNumber = stdIn.nextInt();

		// 図形クラスをインスタンス化するための配列を生成
		e13_01_Shape[] p = new e13_01_Shape[shapeNumber];
		// 調整値を定数化
		final int ADJUST_INT = 1;
		// 図形の数分インスタンス化を繰り返す
		for(int num = 0; num < p.length; num++){
			// 図形の種類をたずねる
			System.out.print((num + ADJUST_INT) + "番の図形の種類（1...点／2...水平直線／3...垂直直線／4...長方形）：");
			// 入力値を図形の種類とする
			int kind = stdIn.nextInt();
			// 入力した値によってどの図形のインスタンスを生成するか決まる
			switch(kind){
				// 1を入力した場合
				case 1:
					// num個目の配列に点クラスのインスタンスを生成する
					p[num] = new e13_01_Point();
					// 処理を抜ける
					break;
				// 2を入力した場合
				case 2:
					// 長さをたずねる
					System.out.print("長さ：");
					// 入力値を水平直線のながさとする
					int horzLength = stdIn.nextInt();
					// num個目の配列に水平直線クラスのインスタンスを生成する
					p[num] = new e13_01_HorzLine(horzLength);
					// 処理を抜ける
					break;
				// 3を入力した場合
				case 3:
					// 長さをたずねる
					System.out.print("長さ：");
					// 入力値を垂直直線のながさとする
					int vertLength = stdIn.nextInt();
					// num個目の配列に垂直直線クラスのインスタンスを生成する
					p[num] = new e13_01_VertLine(vertLength);
					// 処理を抜ける
					break;
				// 4を入力した場合
				case 4:
					// 幅をたずねる
					System.out.print("幅：");
					// 入力値を長方形の幅とする
					int width = stdIn.nextInt();
					// 高さをたずねる
					System.out.print("高さ：");
					// 入力値を長方形の高さとする
					int height = stdIn.nextInt();
					// num個目の配列に長方形クラスのインスタンスを生成する
					p[num] = new e13_01_Rectangle(width, height);
					break;
			}
		}
		// 配列で生成したすべての図形を表示する
		for(e13_01_Shape s : p){
			// 図形を描画する
			s.print();
			// 改行
			System.out.println();
		}
	}

}
