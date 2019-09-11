package e07;
/*
List7-11を拡張して、以下４つの問題をランダムに出題するプログラムを作成せよ。
 */
import java.util.Random;
import java.util.Scanner;

public class e07_10 {
	// 入力機能を実体化
	static Scanner stdIn = new Scanner(System.in);
	/**
	 *  続行の確認をおこなうメソッド
	 * @author t.hosoya
	 * @since 20190613
	 * @return boolean 続行するか否か
	 *
	 */
	static boolean confirmRetry(){
		// 続行するかどうかをいれる変数
		int cont;
		do{
			// ユーザに対して続行するかどうか尋ねる
			System.out.print("もう一度？＜ Yes…1 / No…0＞：");
			// 入力値を変数にいれる
			cont = stdIn.nextInt();
		// 0か1以外が入力された場合、もう一度入力をもとめる
		}while(cont != 0 && cont != 1);
		// 続行する場合はtrueを、続行しない場合はfalseを返却する
		return cont == 1;
	}
	// mainメソッド
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 説明を表示
		System.out.println("暗算力トレーニング！！");
		do{
			// 3桁の乱数を生成
			int x = rand.nextInt(900) + 100;
			// 3桁の乱数を生成
			int y = rand.nextInt(900) + 100;
			// 3桁の乱数を生成
			int z = rand.nextInt(900) + 100;
			// 4つの問題のうちどの問題を出題するかを決定する乱数
			int question = rand.nextInt(4);

			// 正否を入れる変数
			boolean result = false;
			// 正解するまで繰り返す
			while(!result){
				// 回答を入れる変数
				int answer;
				//どの問題を出題するか判定
				switch(question){
					case 0:
						// 問題文を表示
						System.out.print(x + " + " + y + " + " + z + " = ");
						// 入力値を回答として変数に入れる
						answer = stdIn.nextInt();
						// 正解したら繰り返しから抜ける
						if(answer == x + y + z){ result = true; }
						// switch文から抜ける
						break;
					case 1:
						// 問題文を表示
						System.out.print(x + " + " + y + " - " + z + " = ");
						// 入力値を回答として変数に入れる
						answer = stdIn.nextInt();
						// 正解したら繰り返しから抜ける
						if(answer == x + y - z){ result = true; }
						// switch文から抜ける
						break;
					case 2:
						// 問題文を表示
						System.out.print(x + " - " + y + " + " + z + " = ");
						// 入力値を回答として変数に入れる
						answer = stdIn.nextInt();
						// 正解したら繰り返しから抜ける
						if(answer == x - y + z){ result = true; }
						// switch文から抜ける
						break;
					case 3:
						// 問題文を表示
						System.out.print(x + " - " + y + " - " + z + " = ");
						// 入力値を回答として変数に入れる
						answer = stdIn.nextInt();
						// 正解したら繰り返しから抜ける
						if(answer == x - y - z){ result = true; }
						// switch文から抜ける
						break;
				}
				// 問題に不正解だった場合不正解であることを表示
				if(!result){ System.out.println("違いますよ！"); }
			}
		// 続行するかどうか確認する
		}while(confirmRetry());
	}
}
