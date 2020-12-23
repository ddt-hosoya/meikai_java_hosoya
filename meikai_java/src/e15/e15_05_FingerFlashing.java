package e15;

import java.util.Scanner;

import e13.e13_03_ComputerPlayer;
import e13.e13_03_HumanPlayer;

/*
 * 3人で行うジャンケンプログラムを作成せよ。プレーヤー3人のうち、コンピュータを2人として、人間を1人とすること。
 * また、演習13－3（p.443）で作成した、プレーヤークラスを利用すること
 */

/**
 * 3人でジャンケンを行うクラス
 * @author t.hosoya
 * @since 20201223
 */
public class e15_05_FingerFlashing {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// もう一度行うか確認するための変数を初期化
		int retry;
		// ジャンケンを行う
		do {
			// プレーヤー3人を準備する
			// コンピュータプレーヤー1
			e13_03_ComputerPlayer computerOne = new e13_03_ComputerPlayer();
			// コンピュータプレーヤー2
			e13_03_ComputerPlayer computerTwo = new e13_03_ComputerPlayer();
			// ヒューマンプレーヤー
			e13_03_HumanPlayer humanPlayer = new e13_03_HumanPlayer();

			// 3人の手を表示
			System.out.println(
					"1つ目の" + computerOne.toString() + "\n"
					+ "2つ目の" + computerTwo.toString() + "\n"
					+ humanPlayer.toString() + "\n");

			//出した手
			int computerOneHand = computerOne.getHand();
			int computerTwoHand = computerTwo.getHand();
			int humanHand = humanPlayer.getHand();
			// 判定の為にプレーヤーの出した手の和を求める
			int HandsSum = computerOneHand + computerTwoHand + humanHand;
			// 判定

			// 一つ目のコンピュータの勝敗を表示する
			System.out.println("一つ目のコンピュータは" + judgeHands(HandsSum, computerOneHand, computerTwoHand) + "です。");
			// 二つ目のコンピュータの勝敗を表示する
			System.out.println("二つ目のコンピュータは" + judgeHands(HandsSum, computerTwoHand, humanHand) + "です。");
			// 人間のコンピュータの勝敗を表示する
			System.out.println("人間は" + judgeHands(HandsSum, humanHand, computerOneHand) + "です。" + "\n");

			// もう一度行うかどうかを確認
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい : ");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);

		// もう一度行うを選択した場合ジャンケンをもう一度行う
		} while (retry == 1);

	}

	/**
	 * 出した手の勝ち負けを判定する
	 * @author t.hosoya
	 * @since 20201223
	 * @param sum		三者が出した手の合計値
	 * @param oneHand	勝ち負け判定対象の手
	 * @param otherHand	勝ち負け判定対象以外の手
	 * @return	判定結果
	 */
	public static String judgeHands(int sum, int oneHand, int otherHand){

		// 引き分けケース、勝ちケースに当てはまらなければ負け
		String result = "負け";

		// 和を3で割った余りが0の時、引き分け
		if(sum % 3 == 0){
			result = "引き分け";

		// 引き分け以外の場合
		} else {
			// 勝ち負け判定
			switch (sum) {
				// 和が4の時、手が1の時勝ち
				case 4:
					if(oneHand == 1){
						result = "勝ち";
					}
					break;
				// 和が5の時、手が1で他の手が2 または、手が3の時勝ち
				case 5:
					if((oneHand == 1 && otherHand == 2) || oneHand == 3){
						result = "勝ち";
					}
					break;
				// 和が7の時、手が2で他の手が3か2 または、手が3で他の手が3か1
				case 7:
					if((oneHand == 1 && (otherHand == 2 || otherHand == 3))
							|| (oneHand == 3 && (otherHand == 1 || otherHand == 3))){
						result = "勝ち";
					}
					break;
				// 和が8の時、手が2
				case 8:
					if(oneHand == 2){
						result = "勝ち";
					}
					break;
			}
		}

		return result;

	}

}
