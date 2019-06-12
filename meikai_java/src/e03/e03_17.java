package e03;
/*
0,1,2のいずれかの乱数を生成し、0であれば"グー"を、1であれば"チョキ"を、2であれば"パー"を
表示するプログラムを作成せよ。
 */
import java.util.Random;

public class e03_17 {
	public static void main(String[] args){
		// 乱数生成機能を実体化
		Random rand = new Random();

		// 仕様である0,1,2の乱数を生成するための値を定数化
		final int MAKE_NUMBER = 3;
		// 0,1,2いずれかの乱数を生成しどの処理を行うかを検査するための変数に代入する
		int randomInt = rand.nextInt(MAKE_NUMBER);

		// 生成した乱数の値に応じて処理を行う
		switch(randomInt){
			// 生成した乱数の値が0の場合の文言を表示
			case 0: System.out.print("グー"); break;
			// 生成した乱数の値が1の場合の文言を表示
			case 1: System.out.print("チョキ"); break;
			// 生成した乱数の値が2の場合の文言を表示
			case 2: System.out.print("パー"); break;
		}
	}
}
