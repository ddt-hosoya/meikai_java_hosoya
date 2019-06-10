package e06;
/*
double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
要素数と全要素の値はキーボードから読み込むこと。
 */
import java.util.Scanner;

public class e06_08 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// ユーザーに対して要素数の入力を促す
		System.out.print("要素数：");
		// 入力値を要素数として変数に代入
		int valueNumber = stdIn.nextInt();

		// 入力された要素数の配列を生成
		double[] doubleArray = new double[valueNumber];

		// 要素の数分処理を繰り返す
		for(int index = 0; index < doubleArray.length; index++){
			// ユーザーに対して要素の値の入力を促す
			System.out.print("doubleArray[" + index + "] = ");
			// 入力値を配列の要素に代入
			doubleArray[index] = stdIn.nextDouble();
		}
		// 合計値を求めるための変数を初期化
		double sum = 0;
		// 配列の全要素を走査
		for(double value : doubleArray){
			// 合計値を入れる変数に値を加算していく
			sum += value;
		}
		// 合計値を要素数で割って平均値を求める
		double average = sum / doubleArray.length;

		// 合計値を表示
		System.out.println("全要素の合計値：" + sum);
		// 平均値を表示
		System.out.println("全要素の平均値：" + average);
	}

}
