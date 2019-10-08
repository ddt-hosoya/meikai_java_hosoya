package e07;
/*
int型の1次元配列とint型の2次元配列（行によって列数が異なる可能性がある）の全要素の値を表示する、
多重定義されたメソッド群を作成せよ。
void printArray(int[] a)
void printArray(int[][] a)
なお、1次元配列の表示では、各要素の間には1文字分のスペースを空けること。
また、2次元配列の表示では、各列の先頭がそろうように最低限のスペースを空けること。
 */
import java.util.Scanner;

public class e07_33 {

	// int型の1次元配列の全要素の値を表示する
	static void printArray(int[] a){
		// 全要素数分繰り返す
		for(int index = 0; index < a.length; index++){
			// 要素の値を表示する
			System.out.print(a[index] + " ");
		}
		// 改行する
		System.out.println();
	}
	// int型の2次元配列の全要素の値を表示する
	static void printArray(int[][] a){
		// aの行列の中で一番列数が多い列数を求める
		int maxColumn = 1;
		// 全行
		for(int line = 0; line < a.length; line++){
			// 列数が最大列数より大きければ
			if(maxColumn < a[line].length){
				// その列数を最大列数とする
				maxColumn = a[line].length;
			}
		}
		// 最大文字数を格納する配列を生成
		int[] charNum = new int[maxColumn];

		// 各要素の桁数を調べる
		// 全行
		for(int line = 0; line < a.length; line++){
			// 全列
			for(int column = 0; column < a[line].length; column++){
				// 何桁か数える
				int countDigit = 0;
				// 要素の値が0ならば
				if(a[line][column] == 0){
					// 桁数は1である
					countDigit = 1;
				// 要素の値が1以外ならば
				}else{
					// 10で割った商が0になるまで繰り返し、繰り返した回数を桁数とする
					for(int number = a[line][column]; number != 0; countDigit++){
						// 10で割る
						number = number / 10;
					}
					// マイナスの値の場合は符号分桁数をプラスする
					if(a[line][column] < 0){
						// インクリメント
						countDigit++;
					}
				}
				// 桁数がその列の値の中でより大きい場合
				if(charNum[column] < countDigit){
					// 最大文字数を格納する配列にいれる
					charNum[column] = countDigit;
				}
			}
		}
		// 全行繰り返す
		for(int line = 0; line < a.length; line++){
			// 全列繰り返す
			for(int column = 0; column < a[line].length; column++){
				// 調査した最大桁数プラス1を最低限の表示スペースとする
				int space = charNum[column] + 1;
				// 最低限の表示スペースの中で左詰めで表示
				System.out.printf("%-" + space + "d", a[line][column]);
			}
			// 改行
			System.out.println();
		}
	}
	// mainメソッド
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		 // 一次元配列の要素数の入力を求める
		 System.out.print("一次元配列の要素数：");
		 // 入力値を要素数として代入
		 int valueNumber = stdIn.nextInt();
		 // 一次元配列を生成
		 int[] oneDimensionalArray = new int[valueNumber];
		 // 要素数分処理を繰り返す
		 for(int index = 0; index < oneDimensionalArray.length; index++){
			 // 要素の値の入力を求める
			 System.out.print("oneDimensionalArray[" + index + "] = ");
			 // 入力値を配列の要素に入れる
			 oneDimensionalArray[index] = stdIn.nextInt();
		 }

		 // 二次元配列の行数の入力を求める
		 System.out.print("二次元配列の行数：");
		 // 入力値を行数として代入
		 int lineNumber = stdIn.nextInt();
		 // 二次元配列を生成
		 int[][] twoDimensionalArray = new int[lineNumber][];
		 // 全行数分処理を繰り返す
		 for(int line = 0; line < twoDimensionalArray.length; line++){
			 // 各行の列数の入力を求める
			 System.out.print("twoDimensionalArray[" + line + "]の列数：");
			 // 入力値を列数として代入
			 int column = stdIn.nextInt();
			 // 二次元配列のその行が参照する配列を生成する
			 twoDimensionalArray[line] = new int[column];
		 }

		 // 全要素の入力を求める
		 // 全行
		 for(int line = 0; line < twoDimensionalArray.length; line++){
			 // 全列
			 for(int column = 0; column < twoDimensionalArray[line].length; column++){
				 // 入力を求める表示
				 System.out.print("twoDimensionalArray[" + line + "][" + column + "] = ");
				 // 入力値を二次元配列の要素として代入
				 twoDimensionalArray[line][column] = stdIn.nextInt();
			 }
		 }
		 // 説明を表示
		 System.out.println("一次元配列を表示します");
		 // 配列の値を表示
		 printArray(oneDimensionalArray);
		 // 説明を表示
		 System.out.println("二次元配列を表示します");
		 // 配列の値を表示
		 printArray(twoDimensionalArray);
	}
}
