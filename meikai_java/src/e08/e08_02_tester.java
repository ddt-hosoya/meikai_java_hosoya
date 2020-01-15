package e08;

import java.util.Scanner;
// e08_02クラスのテスト用クラス
public class e08_02_tester {
	public static void main(String[] args){
		// 入力機能のインスタンス化
		Scanner stdIn = new Scanner(System.in);

		// データの入力を促す
		System.out.println("車のデータを入力せよ。");
		// 名前の入力を促す
		System.out.print("名前は：");
		// 入力値を車の名前としていれる
		String name = stdIn.next();
		// 車幅の入力を促す
		System.out.print("車幅は：");
		// 入力値を車幅としていれる
		int width = stdIn.nextInt();
		// 車高の入力を促す
		System.out.print("車高は：");
		// 入力値を車高としていれる
		int height = stdIn.nextInt();
		// 車長の入力を促す
		System.out.print("車長は：");
		// 入力値を社長としていれる
		int length = stdIn.nextInt();
		// ガソリン量の入力を促す
		System.out.print("ガソリン量は：");
		// 入力値をガソリン量としていれる
		double fuel = stdIn.nextDouble();
		// 燃料タンクの入力を促す
		System.out.print("燃料タンク容量は：");
		// 入力値を燃料タンクとしていれる
		double tankSize = stdIn.nextDouble();
		// 燃費の入力を促す
		System.out.print("燃費は：");
		// 入力値を燃費として入れる
		double fuelEconomy = stdIn.nextDouble();

		// e08_02のクラスをインスタンス化
		e08_02 myCar = new e08_02(name, width, height, length, fuel, tankSize, fuelEconomy);

		// 移動しないを選択しない限り繰り返す
		while(true){
			// 現在地と残り燃料を表示する
			System.out.println("現在地(" + myCar.getX() + "," + myCar.getY() +
					")・残り燃料 " + myCar.getFuel());
			// 移動するか尋ねる
			System.out.print("移動しますか[ 0...No/1...Yes]：");
			// 移動するを選択した場合終了
			if(stdIn.nextInt() == 1){
				// ｘの移動距離を尋ねる
				System.out.print("X方向の移動距離：");
				// 入力値をｘの移動距離として代入
				double dx = stdIn.nextDouble();
				// ｙの移動距離を尋ねる
				System.out.print("Y方向の移動距離：");
				// 入力値をｙの移動距離として代入
				double dy = stdIn.nextDouble();

				// 燃料不足で移動失敗した場合
				if(!myCar.move(dx, dy)){
					// 燃料が足りない主旨を表示し、給油するか尋ねる
					System.out.print("燃料が足りません。給油しますか[ 0...No/1...Yes]：");
					// 給油する場合、給油量を尋ね給油し、給油しない場合while文先頭に戻る
					if(stdIn.nextInt() == 1){
						// 給油量を尋ねる
						System.out.print("給油するガソリン量は：");
						// 入力値を給油量として代入
						double refuel = stdIn.nextDouble();
						// 給油する
						myCar.refueling(refuel);
					}
				}
			// 移動しないを選択した場合終了
			} else {
				break;
			}
		}
	}
}
