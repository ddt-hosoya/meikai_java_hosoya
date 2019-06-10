package e05;

/*
List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
横に並べて表示するプログラムを作成せよ。
 */
public class e05_06 {
	public static void main(String[] args) {

		// 0.0から1.0まで0.001ずつ増やしていく変数を初期化
		float addFloat = 0.0F;
		// 0から1000までインクリメントした値を1000で割った値を求める変数を初期化
		float incrementInt = 0.0F;

		// 表示する項目を表示
		System.out.printf("%10s","float");
		// 表示する項目を表示
		System.out.printf("%10s\n","int");
		// 表示の区切る文字を表示
		System.out.println("--------------------");

		// 0から1000まで処理を繰り返す
		for(int i = 0; i <= 1000; i++){
			 // 0から1000までインクリメントした値を1000で割った値を求める
			incrementInt = (float)i / 1000;

			// float型の変数を0.0から1.0まで0.001ずつ増やしていく様子を表示
			System.out.printf("%10.7f ", addFloat);
			// int型の変数を0から1000までインクリメントした値を1000で割った値を表示
			System.out.printf("%10.7f \n", incrementInt);

			// 0.001ずつ増やしていく
			addFloat += 0.001F;
		}
	}
}
