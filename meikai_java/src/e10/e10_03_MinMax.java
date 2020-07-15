package e10;
/*
二値/三値/配列の最小値や最大値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ。
 */
/**
 * 二値/三値/配列の最小値や最大値を求めるメソッドを集めたユーティリティクラス
 * @author t.hosoya
 * @since 20190624
 *
 */
public final class e10_03_MinMax {
	/**
	 * 二値の最小値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber int型整数値firstNumber
	 * @param secondNumber int型整数値secondNumber
	 * @return int 二値の最小値
	 */
	public static int min(int firstNumber, int secondNumber){
		// aを仮に最小値とする
		int min = firstNumber;
		// 最小値よりsecondNumberが小さい場合、secondNumberを最小値とする
		if(min > secondNumber){ min = secondNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber long型整数値firstNumber
	 * @param secondNumber long型整数値secondNumber
	 * @return long 二値の最小値
	 */
	public static long min(long firstNumber, long secondNumber){
		// firstNumberを仮に最小値とする
		long min = firstNumber;
		// 最小値よりsecondNumberが小さい場合、secondNumberを最小値とする
		if(min > secondNumber){ min = secondNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber float型整数値firstNumber
	 * @param secondNumber float型整数値secondNumber
	 * @return float 二値の最小値
	 */
	public static float min(float firstNumber, float secondNumber){
		// firstNumberを仮に最小値とする
		float min = firstNumber;
		// 最小値よりsecondNumberが小さい場合、secondNumberを最小値とする
		if(min > secondNumber){ min = secondNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber double型整数値firstNumber
	 * @param secondNumber double型整数値secondNumber
	 * @return double 二値の最小値
	 */
	public static double min(double firstNumber, double secondNumber){
		// firstNumberを仮に最小値とする
		double min = firstNumber;
		// 最小値よりsecondNumberが小さい場合、secondNumberを最小値とする
		if(min > secondNumber){ min = secondNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber int型整数値firstNumber
	 * @param secondNumber int型整数値secondNumber
	 * @param thirdNumber int型整数値thirdNumber
	 * @return int 三値の最小値
	 */
	public static int min(int firstNumber, int secondNumber, int thirdNumber){
		// 二値の最小値を求める
		int min = min(firstNumber, secondNumber);
		// 最小値よりthirdNumberが小さい場合、thirdNumberを最小値とする
		if(min > thirdNumber){ min = thirdNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber long型整数値firstNumber
	 * @param secondNumber long型整数値secondNumber
	 * @param thirdNumber long型整数値thirdNumber
	 * @return long 三値の最小値
	 */
	public static long min(long firstNumber, long secondNumber, long thirdNumber){
		// 二値の最小値を求める
		long min = min(firstNumber, secondNumber);
		// 最小値よりthirdNumberが小さい場合、thirdNumberを最小値とする
		if(min > thirdNumber){ min = thirdNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber float型整数値firstNumber
	 * @param secondNumber float型整数値secondNumber
	 * @param thirdNumber float型整数値thirdNumber
	 * @return float 三値の最小値
	 */
	public static float min(float firstNumber, float secondNumber, float thirdNumber){
		// 二値の最小値を求める
		float min = min(firstNumber, secondNumber);
		// 最小値よりthirdNumberが小さい場合、thirdNumberを最小値とする
		if(min > thirdNumber){ min = thirdNumber; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber double型整数値firstNumber
	 * @param secondNumber double型整数値secondNumber
	 * @param thirdNumber double型整数値thirdNumber
	 * @return double 三値の最小値
	 */
	public static double min(double firstNumber, double secondNumber, double thirdNumber){
		// 二値の最小値を求める
		double min = min(firstNumber, secondNumber);
		// 最小値よりthirdNumberが小さい場合、thirdNumberを最小値とする
		if(min > thirdNumber){ min = thirdNumber; }
		// 最小値を返す
		return min;
	}

	/**
	 * 配列の最小値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array int型整数値を要素として持つ配列
	 * @return int 配列の最小値
	 */
	public static int min(int[] array){
		// 配列の先頭の値を仮に最小値とする
		int min = array[0];
		// 配列の全要素を比較する
		for(int index = 1; index < array.length; index++){
			// 最小値より値が小さい場合その値を最小値とする
			if(min > array[index]){ min = array[index]; }
		}
		// 最小値を返す
		return min;
	}
	/**
	 * 配列の最小値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array long型整数値を要素として持つ配列
	 * @return long 配列の最小値
	 */
	public static long min(long[] array){
		// 配列の先頭の値を仮に最小値とする
		long min = array[0];
		// 配列の全要素を比較する
		for(int index = 1; index < array.length; index++){
			// 最小値より値が小さい場合その値を最小値とする
			if(min > array[index]){ min = array[index]; }
		}
		// 最小値を返す
		return min;
	}
	/**
	 * 配列の最小値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array float型整数値を要素として持つ配列
	 * @return float 配列の最小値
	 */
	public static float min(float[] array){
		// 配列の先頭の値を仮に最小値とする
		float min = array[0];
		// 配列の全要素を比較する
		for(int index = 1; index < array.length; index++){
			// 最小値より値が小さい場合その値を最小値とする
			if(min > array[index]){ min = array[index]; }
		}
		// 最小値を返す
		return min;
	}
	/**
	 * 配列の最小値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array double型整数値を要素として持つ配列
	 * @return double 配列の最小値
	 */
	public static double min(double[] array){
		// 配列の先頭の値を仮に最小値とする
		double min = array[0];
		// 配列の全要素を比較する
		for(int index = 1; index < array.length; index++){
			// 最小値より値が小さい場合その値を最小値とする
			if(min > array[index]){ min = array[index]; }
		}
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最大値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber int型整数値firstNumber
	 * @param secondNumber int型整数値secondNumber
	 * @return int 二値の最小値
	 */
	public static int max(int firstNumber, int secondNumber){
		// 最大値を仮にfirstNumberとする
		int max = firstNumber;
		// 最大値よりsecondNumberが大きければ最大値をsecondNumberとする
		if(max < secondNumber){ max = secondNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber long型整数値firstNumber
	 * @param secondNumber long型整数値secondNumber
	 * @return long 二値の最小値
	 */
	public static long max(long firstNumber, long secondNumber){
		// 最大値を仮にfirstNumberとする
		long max = firstNumber;
		// 最大値よりsecondNumberが大きければ最大値をsecondNumberとする
		if(max < secondNumber){ max = secondNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber float型整数値firstNumber
	 * @param secondNumber float型整数値secondNumber
	 * @return float 二値の最小値
	 */
	public static float max(float firstNumber, float secondNumber){
		// 最大値を仮にfirstNumberとする
		float max = firstNumber;
		// 最大値よりsecondNumberが大きければ最大値をsecondNumberとする
		if(max < secondNumber){ max = secondNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber double型整数値firstNumber
	 * @param secondNumber double型整数値secondNumber
	 * @return double 二値の最小値
	 */
	public static double max(double firstNumber, double secondNumber){
		// 最大値を仮にfirstNumberとする
		double max = firstNumber;
		// 最大値よりsecondNumberが大きければ最大値をsecondNumberとする
		if(max < secondNumber){ max = secondNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber int型整数値firstNumber
	 * @param secondNumber int型整数値secondNumber
	 * @param thirdNumber int型整数値thirdNumber
	 * @return int 三値の最小値
	 */
	public static int max(int firstNumber, int secondNumber, int thirdNumber){
		// 二値の最大値を求める
		int max = max(firstNumber, secondNumber);
		// 最大値よりthirdNumberが大きければ最大値をthirdNumberとする
		if(max < thirdNumber){ max = thirdNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber long型整数値firstNumber
	 * @param secondNumber long型整数値secondNumber
	 * @param thirdNumber long型整数値thirdNumber
	 * @return long 三値の最小値
	 */
	public static long max(long firstNumber, long secondNumber, long thirdNumber){
		// 二値の最大値を求める
		long max = max(firstNumber, secondNumber);
		// 最大値よりthirdNumberが大きければ最大値をthirdNumberとする
		if(max < thirdNumber){ max = thirdNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber float型整数値firstNumber
	 * @param secondNumber float型整数値secondNumber
	 * @param thirdNumber float型整数値thirdNumber
	 * @return float 三値の最小値
	 */
	public static float max(float firstNumber, float secondNumber, float thirdNumber){
		// 二値の最大値を求める
		float max = max(firstNumber, secondNumber);
		// 最大値よりthirdNumberが大きければ最大値をthirdNumberとする
		if(max < thirdNumber){ max = thirdNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param firstNumber double型整数値firstNumber
	 * @param secondNumber double型整数値secondNumber
	 * @param thirdNumber double型整数値thirdNumber
	 * @return double 三値の最小値
	 */
	public static double max(double firstNumber, double secondNumber, double thirdNumber){
		// 二値の最大値を求める
		double max = max(firstNumber, secondNumber);
		// 最大値よりthirdNumberが大きければ最大値をthirdNumberとする
		if(max < thirdNumber){ max = thirdNumber; }
		// 最大値を返す
		return max;
	}
	/**
	 * 配列の最大値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array int型整数値を要素として持つ配列
	 * @return int 配列の最小値
	 */
	public static int max(int[] array){
		// 配列の先頭の値を仮に最大値とする
		int max = array[0];
		// 配列の全要素を比較
		for(int index = 1; index < array.length; index++){
			// 最大値より値が大きい場合その値を最大値とする
			if(max < array[index]){ max = array[index]; }
		}
		// 最大値を返す
		return max;
	}
	/**
	 * 配列の最大値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array long型整数値を要素として持つ配列
	 * @return long 配列の最小値
	 */
	public static long max(long[] array){
		// 配列の先頭の値を仮に最大値とする
		long max = array[0];
		// 配列の全要素を比較
		for(int index = 1; index < array.length; index++){
			// 最大値より値が大きい場合その値を最大値とする
			if(max < array[index]){ max = array[index]; }
		}
		// 最大値を返す
		return max;
	}
	/**
	 * 配列の最大値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array float型整数値を要素として持つ配列
	 * @return float 配列の最小値
	 */
	public static float max(float[] array){
		// 配列の先頭の値を仮に最大値とする
		float max = array[0];
		// 配列の全要素を比較
		for(int index = 1; index < array.length; index++){
			// 最大値より値が大きい場合その値を最大値とする
			if(max < array[index]){ max = array[index]; }
		}
		// 最大値を返す
		return max;
	}
	/**
	 * 配列の最大値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param array double型整数値を要素として持つ配列
	 * @return double 配列の最小値
	 */
	public static double max(double[] array){
		// 配列の先頭の値を仮に最大値とする
		double max = array[0];
		// 配列の全要素を比較
		for(int index = 1; index < array.length; index++){
			// 最大値より値が大きい場合その値を最大値とする
			if(max < array[index]){ max = array[index]; }
		}
		// 最大値を返す
		return max;
	}
}
