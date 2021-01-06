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
		final int GU = 1;								// グー
		final int CHOKI = 2;							// チョキ
		final int PA = 3;								// パー
		final int SUM_GUGUCHOKI = 4;					// グーグーチョキの合計値
		final int SUM_GUCHOKICHOKI_OR_GUGUPA = 5;	// グーチョキチョキかグーグーパーの合計値
		final int SUM_GUPAPA_OR_CHOKICHOKIPA = 7;	// グーパーパーかチョキチョキパーの合計値
		final int SUM_CHOKIPAPA = 8;					// チョキパーパーの合計値

		// 引き分けケース、勝ちケースに当てはまらなければ負け
		String result = "負け";

		// 和を3で割った余りが0の時、引き分け
		if(sum % 3 == 0){
			result = "引き分け";

		// 引き分け以外の場合
		} else {
			// 勝ち負け判定
			switch (sum) {
				// 和が4の時、手の種類はグーグーチョキなので、手がグーの時勝ち
				case SUM_GUGUCHOKI:
					if(oneHand == GU){
						result = "勝ち";
					}
					break;
				// 和が5の時、手の種類はグーチョキチョキかグーグーパーなので、手がグーで他の手がチョキ または、手がパーの時勝ち
				case SUM_GUCHOKICHOKI_OR_GUGUPA:
					if((oneHand == GU && otherHand == CHOKI) || oneHand == PA){
						result = "勝ち";
					}
					break;
				// 和が7の時、手の種類はグーパーパーかチョキチョキパーなので、手がパーで他の手がグーかパー または、手がチョキで他の手がチョキかパーの時勝ち
				case SUM_GUPAPA_OR_CHOKICHOKIPA:
					if((oneHand == GU && (otherHand == CHOKI || otherHand == PA))
							|| (oneHand == 3 && (otherHand == GU || otherHand == PA))){
						result = "勝ち";
					}
					break;
				// 和が8の時、手の種類はチョキパーパーなので、手がチョキの時勝ち
				case SUM_CHOKIPAPA:
					if(oneHand == CHOKI){
						result = "勝ち";
					}
					break;
			}
		}

		return result;

	}

}
