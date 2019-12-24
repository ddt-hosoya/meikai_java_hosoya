package e13;

public class e13_03_Tester {
	public static void main(String[] args){
		// 人間プレーヤクラスをインスタンス化
		e13_03_HumanPlayer human =  new e13_03_HumanPlayer();
		// 人間プレーヤーの出す手を表示
		human.print();

		// コンピュータプレーヤクラスをインスタンス化
		e13_03_ComputerPlayer computer =  new e13_03_ComputerPlayer();
		// コンピュータプレーヤーの出す手を表示
		computer.print();

		// 人間とコンピュータの勝敗を表示

		int humanHand = human.getHand();
		int computerHand = computer.getHand();
		winner(humanHand, computerHand);

	}
/**
 * 人間とコンピュータのジャンケンの勝敗をジャッチするメソッド
 * @author t.hosoya
 * @since 20191224
 * @param humanHand 人間の出す手
 * @param computerHand コンピュータの出す手
 */
	static void winner(int humanHand, int computerHand){
		if(humanHand == computerHand){
			System.out.println("引き分けです。");
		} else if ((humanHand == 1 && computerHand == 2) ||
				 (humanHand == 2 && computerHand == 3) ||
				 (humanHand == 3 && computerHand == 1)){
			System.out.println("人間の勝ちです。");
		} else {
			System.out.println("コンピュータの勝ちです。");
		}
	}

}
