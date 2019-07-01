package e06;
/*
要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 */
public class e06_01 {
	public static void main(String[] args){
		// 要素数が5を定数化
		final int VALUE_NUMBER = 5;
		// 要素型がdouble型で要素数が5の配列を生成
		double[] doubleArray = new double[VALUE_NUMBER];

		// 配列の要素doubleArray[1]に37.5を代入
		doubleArray[1] = 37.5;
		// 配列の要素doubleArray[2]に51.2を代入
		doubleArray[2] = 51.2;
		// 配列の要素doubleArray[4]に75.0を代入
		doubleArray[4] = doubleArray[1] * 2;

		// 配列の全要素を表示
		for(int index = 0; index < VALUE_NUMBER; index++){
			// doubleArray[index]の要素の値を表示
			System.out.println("doubleArray[" + index + "] = " + doubleArray[index]);
		}

	}
}
