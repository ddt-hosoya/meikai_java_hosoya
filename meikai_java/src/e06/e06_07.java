package e06;
/*
List6-9は探索するキー値と同じ値の要素が複数個存在する場合、
最も先頭に位置する要素を見つけるプログラムである。
もっとも末尾側に位置する要素を見つけるプログラムを作成せよ。
 */
import java.util.Random;
import java.util.Scanner;

public class e06_07 {
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 要素の数を定数化
		final int valueNumber = 12;
		// 配列を生成
		int searchArray[] = new int[valueNumber];

		// 要素の数分処理を繰り返す
		for(int count = 0; count < valueNumber; count++){
			// 0から9の乱数を要素に代入
			searchArray[count] = rand.nextInt(10);
		}
		// 配列の表示の説明を表示
		System.out.print("配列の全要素の値\n{");
		// 要素の数分処理を繰り返す
		for(int count = 0; count < valueNumber; count++){
			// 要素の値を表示
			System.out.print(searchArray[count] +  " ");
		}
		// 配列の表示の締めカッコ
		System.out.println("}");

		// ユーザーに対して探す数値の入力を促す
		System.out.print("探す数値：");
		// 入力値を探索するキーに代入
		int key = stdIn.nextInt();

		// インデックスを判断するための変数を宣言
		int index;
		// インデックスの数値の大きいほうから探索する
		for(index = (valueNumber - 1); index >= 0; index--){
			// 配列内にキーが見つかったら繰り返し処理を抜ける
			if(searchArray[index] == key){ break; }
		}

		// インデックスが0から11の場合
		if(index >= 0){
			// 見つかった位置を表示
			System.out.println("それはa[" + index + "]にあります。");
		// インデックスが0より小さい場合
		}else{
			// 配列にキーがないという文言を表示
			System.out.println("それはありません。");
		}
	}

}
