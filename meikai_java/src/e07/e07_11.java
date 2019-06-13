package e07;
/*
整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラム。
 */
import java.util.Scanner;

public class e07_11 {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);
		// ユーザに対して整数値の入力を促す
		System.out.print("整数値：");
		// 入力値を検査する整数として変数に代入
		int inputInt = stdIn.nextInt();
		// ユーザに対して何ビットシフトするか尋ねる
		System.out.print("何ビットシフトしますか：");
		// 入力値をシフトするビット数として変数に代入
		int num = stdIn.nextInt();

		// 整数をnumビット分左にシフトした値を求める
		int leftShift = inputInt << num;
		// 整数をnumビット分右にシフトした値を求める
		int rightShift = inputInt >> num;

		// べき乗の計算結果を求める変数を初期化
		int power = 1;
		// 2のべき乗を求めるので2を定数化
		final int ADJUST_POWER = 2;
		//2のnum乗の値を求める
		while(num-- > 0){
			// 2のnum乗した値を求める
			power *= ADJUST_POWER;
		}
		// 整数を2のnum乗で乗算した値を求める
		int multiply = inputInt * power;
		// 整数を2のnum乗で除算した値を求める
		int division = inputInt / power;

		// 整数を左にシフトした値と2のべき乗で乗算した値が等しく、
		// かつ、整数を右にシフトした値と2のべき乗で除算した値と等しい場合
		if(leftShift == multiply && rightShift == division){
			// 等しいことを確認したメッセージを表示
			System.out.println("左右にシフトした値は、2のべき乗での乗算や除算と等しい。");
		// 整数を左にシフトした値と2のべき乗で乗算した値が等しくない、
		// または、整数を右にシフトした値と2のべき乗で除算した値と等しくない場合
		}else{
			// 等しくないことを確認したメッセージを表示
			System.out.println("左右にシフトした値は、2のべき乗での乗算や除算と等しいことが確認できませんでした。");
		}
	}



}
