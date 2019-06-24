package e05;
/*
0.0から0.001おきに、その値とその値の2乗を表示するプログラムを作成せよ。
 */
public class e05_07 {
	public static void main(String[] args) {

		// 0から1000までインクリメントした値を1000で割った値を求める変数を初期化
		float incrementInt = 0.0F;
		// 2乗した値を求める変数を初期化
		float squaredValue = 0.0F;

		// 表示する項目を表示
		System.out.printf("%10s","値");
		// 表示する項目を表示
		System.out.printf("%10s\n","2乗");
		// 表示の区切る文字を表示
		System.out.println("--------------------");

		// 0から1000まで処理を繰り返す
		for(int i = 0; i <= 1000; i++){

			 // 0から1000までインクリメントした値を1000で割った値を求める
			incrementInt = (float)i / 1000;

			// 2乗した値を求める
			squaredValue = incrementInt*incrementInt;

			// int型の変数を0から1000までインクリメントした値を1000で割った値を表示
			System.out.printf("%10.7f", incrementInt);
			// 2乗した値を表示
			System.out.printf("%10.7f\n", squaredValue);
		}
	}
}