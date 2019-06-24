package e06;
/*
要素型がdouble型で要素数が5の配列の要素に対して、
先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するプログラムを作成せよ。
 */
public class e06_03 {
	public static void main(String[] args){
		// 要素型がdouble型で要素数が5の配列を生成
		double[] doubleArray = new double[5];

		// 要素数分処理を繰り返す
		for(int valueNumber = 0; valueNumber < doubleArray.length; valueNumber++){
			// 代入する値を求めるための調整値
			double assignValue = 1.1;
			// 何個目の要素数かを求める
			int adjustInt = valueNumber + 1;

			// 代入する値を求める
			assignValue *= adjustInt;
			// 先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入
			doubleArray[valueNumber] = assignValue;

			// 要素の値を表示
			System.out.println("doubleArray[" + valueNumber + "] = " + doubleArray[valueNumber]);

		}
	}

}
