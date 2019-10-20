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
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @return int 二値の最小値
	 */
	public static int min(int a, int b){
		// aを仮に最小値とする
		int min = a;
		// 最小値よりbが小さい場合、bを最小値とする
		if(min > b){ min = b; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a long型整数値a
	 * @param b long型整数値b
	 * @return long 二値の最小値
	 */
	public static long min(long a, long b){
		// aを仮に最小値とする
		long min = a;
		// 最小値よりbが小さい場合、bを最小値とする
		if(min > b){ min = b; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a float型整数値a
	 * @param b float型整数値b
	 * @return float 二値の最小値
	 */
	public static float min(float a, float b){
		// aを仮に最小値とする
		float min = a;
		// 最小値よりbが小さい場合、bを最小値とする
		if(min > b){ min = b; }
		// 最小値を返す
		return min;
	}
	/**
	 * 二値の最小値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a double型整数値a
	 * @param b double型整数値b
	 * @return double 二値の最小値
	 */
	public static double min(double a, double b){
		// aを仮に最小値とする
		double min = a;
		// 最小値よりbが小さい場合、bを最小値とする
		if(min > b){ min = b; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @param c int型整数値c
	 * @return int 三値の最小値
	 */
	public static int min(int a, int b, int c){
		// 二値の最小値を求める
		int min = min(a, b);
		// 最小値よりcが小さい場合、cを最小値とする
		if(min > c){ min = c; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a long型整数値a
	 * @param b long型整数値b
	 * @param c long型整数値c
	 * @return long 三値の最小値
	 */
	public static long min(long a, long b, long c){
		// 二値の最小値を求める
		long min = min(a, b);
		// 最小値よりcが小さい場合、cを最小値とする
		if(min > c){ min = c; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a float型整数値a
	 * @param b float型整数値b
	 * @param c float型整数値c
	 * @return float 三値の最小値
	 */
	public static float min(float a, float b, float c){
		// 二値の最小値を求める
		float min = min(a, b);
		// 最小値よりcが小さい場合、cを最小値とする
		if(min > c){ min = c; }
		// 最小値を返す
		return min;
	}
	/**
	 * 三値の最小値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a double型整数値a
	 * @param b double型整数値b
	 * @param c double型整数値c
	 * @return double 三値の最小値
	 */
	public static double min(double a, double b, double c){
		// 二値の最小値を求める
		double min = min(a, b);
		// 最小値よりcが小さい場合、cを最小値とする
		if(min > c){ min = c; }
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
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @return int 二値の最小値
	 */
	public static int max(int a, int b){
		// 最大値を仮にaとする
		int max = a;
		// 最大値よりbが大きければ最大値をbとする
		if(max < b){ max = b; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a long型整数値a
	 * @param b long型整数値b
	 * @return long 二値の最小値
	 */
	public static long max(long a, long b){
		// 最大値を仮にaとする
		long max = a;
		// 最大値よりbが大きければ最大値をbとする
		if(max < b){ max = b; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a float型整数値a
	 * @param b float型整数値b
	 * @return float 二値の最小値
	 */
	public static float max(float a, float b){
		// 最大値を仮にaとする
		float max = a;
		// 最大値よりbが大きければ最大値をbとする
		if(max < b){ max = b; }
		// 最大値を返す
		return max;
	}
	/**
	 * 二値の最大値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a double型整数値a
	 * @param b double型整数値b
	 * @return double 二値の最小値
	 */
	public static double max(double a, double b){
		// 最大値を仮にaとする
		double max = a;
		// 最大値よりbが大きければ最大値をbとする
		if(max < b){ max = b; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(int型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a int型整数値a
	 * @param b int型整数値b
	 * @param c int型整数値c
	 * @return int 三値の最小値
	 */
	public static int max(int a, int b, int c){
		// 二値の最大値を求める
		int max = max(a, b);
		// 最大値よりcが大きければ最大値をcとする
		if(max < c){ max = c; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(long型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a long型整数値a
	 * @param b long型整数値b
	 * @param c long型整数値c
	 * @return long 三値の最小値
	 */
	public static long max(long a, long b, long c){
		// 二値の最大値を求める
		long max = max(a, b);
		// 最大値よりcが大きければ最大値をcとする
		if(max < c){ max = c; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(float型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a float型整数値a
	 * @param b float型整数値b
	 * @param c float型整数値c
	 * @return float 三値の最小値
	 */
	public static float max(float a, float b, float c){
		// 二値の最大値を求める
		float max = max(a, b);
		// 最大値よりcが大きければ最大値をcとする
		if(max < c){ max = c; }
		// 最大値を返す
		return max;
	}
	/**
	 * 三値の最大値を求める(double型)
	 * @author t.hosoya
	 * @since 20190624
	 * @param a double型整数値a
	 * @param b double型整数値b
	 * @param c double型整数値c
	 * @return double 三値の最小値
	 */
	public static double max(double a, double b, double c){
		// 二値の最大値を求める
		double max = max(a, b);
		// 最大値よりcが大きければ最大値をcとする
		if(max < c){ max = c; }
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
