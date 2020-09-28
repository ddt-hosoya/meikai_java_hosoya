package e14;

import java.util.Scanner;

/*
 * ここに示した図形クラス群を利用するプログラムを作成せよ。
 */
/**
 * ここ(List14-7及びList14-8)に示した図形クラス群を利用するプログラム
 * @author t.hosoya
 * @since 20200108
 */
public class e14_01 {
	public static void main(String[] args){
		// 二次元インターフェース型配列を生成
		e14_01_Plane2D[] area = new e14_01_Plane2D[2];

		// 長方形のインスタンス化
		System.out.println("長方形を作成します");
		// 図形の情報を入力
		int[] shapeInfoRectangle = inputShapeInfo();
		// 底辺の長さを設定
		int widthRectangle = shapeInfoRectangle[0];
		// 高さを設定
		int heightRectangle = shapeInfoRectangle[1];
		// 長方形クラスをインスタンス化し二次元インターフェース型配列に格納
		area[0] = new e14_01_Rectangle(widthRectangle, heightRectangle);

		// 平行四辺形のインスタンス化
		System.out.println("平行四辺形を作成します");
		// 図形の情報を入力
		int[] shapeInfoParallelogram = inputShapeInfo();
		// 底辺の長さを設定
		int widthParallelogram = shapeInfoParallelogram[0];
		// 高さを設定
		int heightParallelogram = shapeInfoParallelogram[1];
		// 平行四辺形クラスをインスタンス化し二次元インターフェース型配列に格納
		area[1] = new e14_01_Parallelogram(widthParallelogram, heightParallelogram);

		// 生成したインスタンスをそれぞれ参照する
		for(e14_01_Plane2D shape : area){
			// 図形の情報を表示
			System.out.println(shape.toString());
			// 図形を表示
			shape.draw();
			// 面積を表示
			System.out.println("面積:" + shape.getArea());
			// 改行
			System.out.println();
		}
	}

	static int[] inputShapeInfo(){
		int[] shapeInfo = new int[2];
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// 長さをたずねる
		System.out.print("底辺の長さ：");
		// 入力値を図形の底辺の長さとする
		shapeInfo[0] = stdIn.nextInt();
		// 高さをたずねる
		System.out.print("高さ：");
		// 入力値を図形の高さとする
		shapeInfo[1] = stdIn.nextInt();
		// 高さと長さの値を返却する
		return shapeInfo;
	}
}
