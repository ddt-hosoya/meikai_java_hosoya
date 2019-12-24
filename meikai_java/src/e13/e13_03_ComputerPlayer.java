package e13;
import java.util.Random;
/**
 * ジャンケンの《コンピュータプレーヤ》を表すクラス
 * 《プレーヤ》クラスから派生
 * @author t.hosoya
 * @since 20191224
 */
public class e13_03_ComputerPlayer extends e13_03_Player {
	// 出す手を表すint型のフィールド
	private int hand;

	Random rand = new Random();
	// コンピュータプレーヤのコンストラクタ
	public e13_03_ComputerPlayer(){
		// コンピュータの出す手を選択する
		selectHand();
	}
	/**
	 * コンピュータプレーヤの出す手をランダムに選択するメソッド
	 */
	public void selectHand(){
		// 出す手の種類
		final int HAND_TYPE = 3;
		// 乱数生成時に出す手の種類を調整する値
		final int ADJUST_HAND = 1;
		// 出す手として１～３の値をランダムに生成
		hand = rand.nextInt(HAND_TYPE) + ADJUST_HAND;
		// 出す手に設定する
		setHand(hand);
	}

	public String toString(){
		// 出す手初期化
		String handString = "";
		// １～３の値によって文字列を返す
		switch(hand){
			// 出す手１ならばグー
			case 1: handString = "グー";
				break;
			// 出す手２ならばチョキ
			case 2: handString = "チョキ";
				break;
			// 出す手３ならばパー
			case 3: handString = "パー";
				break;
		}
		// コンピュータの出す手の情報を文字列で返す
		return "コンピュータは" + handString + "を出しました。";
	}

}
