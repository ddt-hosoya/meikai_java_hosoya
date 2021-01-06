package e13;
import java.util.Scanner;
/**
 * ジャンケンの《人間プレーヤ》を表すクラス
 * 《プレーヤ》クラスから派生
 * @author t.hosoya
 * @since 20191224
 */
public class e13_03_HumanPlayer extends e13_03_Player {
	// 出す手を表すint型のフィールド
	private int hand;

	Scanner stdIn = new Scanner(System.in);
	// 人間プレーヤのコンストラクタ
	public e13_03_HumanPlayer(){
		//人間の出す手を選択する
		selectHand();
	}
	/**
	 * 出す手のゲッタ
	 * @author t.hosoya
	 * @since 20201209
	 */
	public int getHand(){
		return hand;
	}
	/**
	 * 人間の出す手を選択させ決定するメソッド
	 */
	public void selectHand(){
		do{
			// 人間の出す手を選択するよう促す文言を表示
			System.out.print("人間の出す手を選択してください。\n1:グー 2:チョキ 3:パー :");
			// 入力値を出す手とする
			hand = stdIn.nextInt();
			// 出す手を設定する
			setHand(hand);
		// １～３以外が選択された場合はもう一度選択させる
		}while(hand < 1 || 3 < hand);
	}

	/**
	 * 人間の出す手の情報を文字列で返すメソッド
	 */
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
		// 人間の出す手の情報を文字列で返す
		return "人間は" + handString + "を出しました。";
	}

}
