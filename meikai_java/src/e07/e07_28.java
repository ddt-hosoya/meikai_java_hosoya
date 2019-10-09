package e07;
/*
行列xとyの和を格納した２次元配列を返すメソッドを作成せよ。
行数および列数が同一の配列をxとyに受け取ることを前提としてよい。
 */
public class e07_28 {
	/**
	 * 行列xとyの和を格納した２次元配列を返すメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x 行列x
	 * @param y 行列y
	 * @return int[][] 行列xとyの和を格納した２次元配列
	 */
	static int[][] addMatrix(int[][] x, int[][] y){
		// 和を格納する二次元配列を生成する
		int[][] newMatrix = new int[x.length][];
		// 各行の配列の参照先となる配列を生成する
		for(int line = 0; line < x.length; line++){
			// 配列を生成する
			newMatrix[line] = new int[x[line].length];
			// 生成した配列の各要素にxとyの和を入れる
			for(int column = 0; column < newMatrix[line].length; column++){
				// xとyの和を入れる
				newMatrix[line][column] = x[line][column] + y[line][column];
			}
		}
		// 行列xとyの和を格納した２次元配列を返す
		return newMatrix;
	}

	/**
	 * 行列mの全要素を表示
	 * @author t.hosoya
	 * @since 20190618
	 * @param m 行列m
	 */
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
		// 配列x
		int[][] x = {{1,2,3},{4,5,6}};
		// 配列y
		int[][] y = {{6,3,4},{5,1,2}};

		// 行列xとyの和を格納した配列を生成
		int[][] newMatrix = addMatrix(x,y);

		// 説明を表示
		System.out.println("xとyの和を格納した行列newMatrixを表示します。");
		// 行列newMatrixの全要素を表示
		printMatrix(newMatrix);
	}
}
