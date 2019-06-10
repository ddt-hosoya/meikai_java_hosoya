package e06;
/*
要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 */
public class e06_01 {
	public static void main(String[] args){
		// 要素型がdouble型で要素数が5の配列を生成
		double[] doubleArray = new double[5];

		// 配列の要素doubleArray[1]に37.5を代入
		doubleArray[1] = 37.5;
		// 配列の要素doubleArray[2]に51.2を代入
		doubleArray[2] = 51.2;
		// 配列の要素doubleArray[4]に75.0を代入
		doubleArray[4] = doubleArray[1] * 2;

		// doubleArray[0]の要素の値を表示
		System.out.println("doubleArray[0] = " + doubleArray[0]);
		// doubleArray[1]の要素の値を表示
		System.out.println("doubleArray[1] = " + doubleArray[1]);
		// doubleArray[2]の要素の値を表示
		System.out.println("doubleArray[2] = " + doubleArray[2]);
		// doubleArray[3]の要素の値を表示
		System.out.println("doubleArray[3] = " + doubleArray[3]);
		// doubleArray[4]の要素の値を表示
		System.out.println("doubleArray[4] = " + doubleArray[4]);

	}
}
