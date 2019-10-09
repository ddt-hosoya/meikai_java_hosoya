package e07;
/*
List7-20のプログラムは、三つの配列x,y,zの行数および列数が同一であることを前提としている。
三つの配列の要素が等しければ加算を行ってtrueを返し、等しくなければ加算を行わずにfalseを返すメソッドに書き換えよ。
 */

public class e07_27 {
	/**
	 * 三つの配列の要素が等しければ加算を行ってtrueを返し、等しくなければ加算を行わずにfalseを返すメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param x 行列x
	 * @param y 行列y
	 * @param z 行列z
	 * @return boolean 要素が等しいか否か
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z){
		// 三つの配列の行数が異なる場合
		if(x.length != y.length || x.length != z.length){
			// falseを返す
			return false;
		}
		// 行ごとに要素の加算処理をおこなう
		for(int i = 0; i < x.length; i++){
			// 三つの配列の列数がことなる場合
			if(x[i].length != y[i].length || x[i].length != z[i].length){
				// falseを返す
				return false;
			}
			// 各列ごとに加算処理を行い結果を配列zに代入
			for(int j = 0; j < x[i].length; j++){
				// 加算処理を行い結果を配列zに代入
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		// trueを返す
		return true;
	}
	/**
	 * 行列mの全要素を表示するメソッド
	 * @author t.hosoya
	 * @since 20190618
	 * @param m 表示する行列
	 *
	 */
	static void printMatrix(int[][] m){
		// 全行数分繰り返す
		for(int i = 0; i < m.length; i++){
			// 各行の前列数分繰り返す
			for(int j = 0; j < m[i].length; j++){
				// 要素の値を表示
				System.out.print(m[i][j] + " ");
			}
			// 行ごとに改行
			System.out.println();
		}
	}
	// mainメソッド
	public static void main(String[] args){
		// 配列a
		int[][] a = {{1,2,3},{4,5,6}};
		// 配列b
		int[][] b = {{6,3,4},{5,1,2}};
		// 配列c
		int[][] c = new int[2][3];
		// 配列d
		int[][] d = {{9,11,13},{20,18,16,14}};

		//trueパターンの検証
		System.out.println("★trueパターンの検証★");
		// 行列aとbの和をcに代入
		boolean result = addMatrix(a, b, c);
		// 行列aの全要素を表示
		System.out.println("行列a"); printMatrix(a);
		// 行列bの全要素を表示
		System.out.println("行列b"); printMatrix(b);
		// addMatrixメソッドの返り値がtrueならば加算処理後の行列を表示し、falseならば加算処理行わなかった主旨文言を表示
		if(result){
			// 行列cの全要素を表示
			System.out.println("行列c"); printMatrix(c);
		}else{
			System.out.println("行数または列数が同一で無いため加算処理を行いませんでした。");
		}

		//falseパターンの検証
		System.out.println("★falseパターンの検証★");
		// 行列aとdの和をcに代入
		boolean resultFalse = addMatrix(a, d, c);
		// 行列aの全要素を表示
		System.out.println("行列a"); printMatrix(a);
		// 行列dの全要素を表示
		System.out.println("行列d"); printMatrix(d);
		// addMatrixメソッドの返り値がtrueならば加算処理後の行列を表示し、falseならば加算処理行わなかった主旨文言を表示
		if(resultFalse){
			// 行列cの全要素を表示
			System.out.println("行列c"); printMatrix(c);
		}else{
			System.out.println("行数または列数が同一で無いため加算処理を行いませんでした。");
		}
	}
}
