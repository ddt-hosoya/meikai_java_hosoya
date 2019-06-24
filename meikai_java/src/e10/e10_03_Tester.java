package e10;
// MinMaxユーティリティクラスのテスト用
public class e10_03_Tester {
	public static void main(String[] args){
		// int型配列生成
		int[] intArray = new int[]{999, 88, 7, 6666, 5, -22};
		// long型配列生成
		long[] longArray = new long[]{999L, 88L, 7L, 6666L, 5L, -22L};
		// float型配列生成
		float[] floatArray = new float[]{-0.0005F, -4.9F, 9.0007F, 8.9999F};
		// double型配列生成
		double[] doubleArray = new double[]{-0.0005, -4.9, 9.0007, 8.9999};

		// 二値最小値
		System.out.println("二値最小値");
		System.out.println(e10_03_MinMax.min(-2147483648, 2147483647)); // int
		System.out.println(e10_03_MinMax.min(9223372036854775807L, -9223372036854775808L)); // long
		System.out.println(e10_03_MinMax.min(1.5556F, 0.00066F)); // float
		System.out.println(e10_03_MinMax.min(1.123456789, 999.888767)); // double
		System.out.println();
		// 三値最小値
		System.out.println("三値最小値");
		System.out.println(e10_03_MinMax.min(-2147483648, 2147483647, 1073741823)); // int
		System.out.println(e10_03_MinMax.min(9223372036854775807L, 9L, 9223372036854775806L)); // long
		System.out.println(e10_03_MinMax.min(1.5556F, 0.00066F, -5.9F)); // float
		System.out.println(e10_03_MinMax.min(1.123456789, 999.888767, 9.8765)); // double
		System.out.println();
		// 配列最小値
		System.out.println("配列最小値");
		System.out.println(e10_03_MinMax.min(intArray)); // int
		System.out.println(e10_03_MinMax.min(longArray)); // long
		System.out.println(e10_03_MinMax.min(floatArray)); // float
		System.out.println(e10_03_MinMax.min(doubleArray)); // double
		System.out.println();

		// 二値最大値
		System.out.println("二値最大値");
		System.out.println(e10_03_MinMax.max(-2147483648, 2147483647)); // int
		System.out.println(e10_03_MinMax.max(9223372036854775807L, -9223372036854775808L)); // long
		System.out.println(e10_03_MinMax.max(1.5556F, 0.00066F)); // float
		System.out.println(e10_03_MinMax.max(1.123456789, 999.888767)); // double
		System.out.println();
		// 三値最大値
		System.out.println("三値最大値");
		System.out.println(e10_03_MinMax.max(-2147483648, 2147483647, 1073741823)); // int
		System.out.println(e10_03_MinMax.max(9223372036854775807L, 9L, 9223372036854775806L)); // long
		System.out.println(e10_03_MinMax.max(1.5556F, 0.00066F, -5.9F)); // float
		System.out.println(e10_03_MinMax.max(1.123456789, 999.888767, 9.8765)); // double
		System.out.println();
		// 配列最大値
		System.out.println("配列最大値");
		System.out.println(e10_03_MinMax.max(intArray)); // int
		System.out.println(e10_03_MinMax.max(longArray)); // long
		System.out.println(e10_03_MinMax.max(floatArray)); // float
		System.out.println(e10_03_MinMax.max(doubleArray)); // double
		System.out.println();
	}
}
