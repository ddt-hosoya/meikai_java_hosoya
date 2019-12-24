package e13;
/*
 * ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ。そのクラスから、以下のクラスを派生すること。
 * ・人間プレーヤクラス(出す手をキーボードから読み込む)
 * ・コンピュータプレーヤクラス(出す手を乱数で生成する)
 */
/**
 * ジャンケンの《プレーヤ》を表す抽象クラス
 * @author t.hosoya
 * @since 20191218
 */
public abstract class e13_03_Player {
	/**
	 * 出す手を表すint型のフィールド
	 */
	private int hand;

	/**
	 * 出す手セッタ
	 * @param hand 出す手
	 */
	public void setHand(int hand){
		this.hand = hand;
	}

	/**
	 * 出す手ゲッタ
	 * @return hand 出す手
	 */
	public int getHand(){
		return hand;
	}

	/**
	 * プレーヤーの出す手を文字列で返却するメソッド
	 * @return string プレーヤーの出す手
	 */
	public abstract String toString();

	/**
	 * プレーヤーの出す手を表示するメソッド
	 */
	public void print(){
		System.out.println(toString());
	}

}
