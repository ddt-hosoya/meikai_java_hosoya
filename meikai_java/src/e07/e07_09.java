package e07;
/*
「正の整数値：」と表示してキーボードから整数値を読み込んで、
その値を返却するメソッドreadPlusIntを作成せよ。0や負の値が入力されtら再入力させること。
int readPlusInt()
 */
import java.util.Scanner;

public class e07_09 {
	/**
	 *  整数値を読み込んで、その値を返却するメソッド
	 * @author t.hosoya
	 * @since 20190613
	 * @return int 入力された正の整数
	 */
	static int readPlusInt(){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// 入力値を入れる変数
		int inputInt;
		do{
			// ユーザに対して整数値の入力を促す
			System.out.print("正の整数：");
			// 入力値を変数にいれる
			inputInt = stdIn.nextInt();
		// 入力値が0以下の場合再入力させる
		}while(inputInt <= 0);
		// 入力された値を返却する
		return inputInt;
	}

	public static void main(String[] args){
		// 正の整数を求める
		int plusInt =readPlusInt();
		// 入力された正の整数を表示
		System.out.println(plusInt);
	}


}
