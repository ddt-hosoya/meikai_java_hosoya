package e07;
/*
2次元配列aと同じ配列(要素数が同じで、すべての要素の値が同じ配列)を生成して返却するメソッドaryClone2を作成せよ。
 */
public class e07_29 {
	static int[][] aryClone2(int[][] a){
		// 2次元配列を生成する
		int[][] cloneMatrix = new int[a.length][];
		// 各行の配列の参照先となる配列を生成する
		for(int line = 0; line < a.length; line++){
			// 配列を生成する
			cloneMatrix[line] = new int[a[line].length];
			// 生成した配列の各要素にaの値をコピーする
			for(int column = 0; column < cloneMatrix[line].length; column++){
				// aの値をコピーする
				cloneMatrix[line][column] = a[line][column];
			}
		}
		// 行列aと同じ2次元配列を返す
		return cloneMatrix;
	}
	// 行列mの全要素を表示
	static void printMatrix(int[][] m){
		// 全行数分繰り返す
		for(int line = 0; line < m.length; line++){
			// 各行の前列数分繰り返す
			for(int column = 0; column < m[line].length; column++){
				// 要素の値を表示
				System.out.print(m[line][column] + " ");
			}
			// 行ごとに改行
			System.out.println();
		}
	}
	// mainメソッド
	public static void main(String[] args){
		// 配列a
		int[][] a = {{1,2,3},{4,5,6},{7,8}};

		// 行列aと同じ配列を生成
		int[][] cloneMatrix = aryClone2(a);

		// 説明を表示
		System.out.println("2次元配列aと同じ配列cloneMatrixを表示します。");
		// 行列newMatrixの全要素を表示
		printMatrix(cloneMatrix);
	}
}
