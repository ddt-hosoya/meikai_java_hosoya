package e06;
/*
List6-5を書き換えて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ。
最下段には、インデックスを10で割った余剰を表示すること。
 */
//
import java.util.Random;
import java.util.Scanner;

public class e06_04 {
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 要素数を入れる変数を宣言
		int valueNumber;
		// 繰り返し処理
		do{
			// ユーザーに対して入力を促す
			System.out.print("要素数：");
			// 入力値を要素数として変数に代入
			valueNumber = stdIn.nextInt();
		// 入力した要素数が負の数の場合繰り返す
		}while(0 > valueNumber);

		// 入力した要素数の配列を生成
		int[] intArray = new int[valueNumber];
		// 生成する乱数の範囲を定数化
		final int RANDOM_NUMBER = 10;

		// 要素数分処理を繰り返す
		for(int valueCount = 0; valueCount < valueNumber; valueCount++){
			// 要素にランダムに生成した1から10の整数を代入する
			intArray[valueCount] = 1 + rand.nextInt(RANDOM_NUMBER);
		}
		// 10行分表示処理を繰り返す
		for(int line = RANDOM_NUMBER; line > 0; line--){
			// 要素数分処理を繰り返す
			for(int column = 0; column < valueNumber; column++){
				// 要素の値がその行数より大きい値の場合
				if(line <= intArray[column]){
					// 記号を表示
					System.out.printf(" *");
				// 要素の値がその行数より小さい値の場合
				}else{
					// 空欄を表示
					System.out.print("  ");
				}
			}
			// 改行する
			System.out.println();
		}
		// 要素数分区切りの文字を表示する
		for(int column = 0; column < valueNumber; column++){
			// 文字を表示する
			System.out.print("--");
		}
		// 改行する
		System.out.println();

		// インデックスの表示処理
		for(int column = 0; column < valueNumber; column++){
			// インデックスを10で割った余剰を表示
			System.out.printf("%2d", column % RANDOM_NUMBER);
		}
		// 改行する
		System.out.println();
	}
}
