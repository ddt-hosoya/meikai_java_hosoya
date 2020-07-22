package e12;
import java.util.Scanner;

public class e12_01_Tester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		// 購入日
		e12_01_Day purchaseDay = new e12_01_Day(2019, 6, 27);
		// 派生したクラスでインスタンス化
		e12_01_ExtendsCar mycar = new e12_01_ExtendsCar("愛車", 1885, 1490, 5220, 90.0, purchaseDay);
		// スペックを表示する
		mycar.putSpec();
		// 購入日を表示する
		System.out.println("購入日：" + mycar.getPurchaseDay());
		// 移動距離を表示する
		System.out.println("総移動距離：" + mycar.getDistance());
		// 繰り返し処理
		int next = 1;
		while(next == 1){
			// 移動
			System.out.print("移動 X：");
			double x = stdIn.nextDouble();
			System.out.print("移動 Y：");
			double y = stdIn.nextDouble();

			// 移動完了した場合
			if(mycar.move(x, y)){
				// 移動完了しましたと表示
				System.out.println("移動完了しました。");
			// 移動失敗した場合
			}else{
				// 移動失敗しましたと表示
				System.out.println("移動失敗しました。");
			}
			// 移動距離を表示する
			System.out.println("総移動距離：" + mycar.getDistance());

			// 繰り返すかたずねる
			System.out.print("移動を続けますか Yes...1/No...0：");
			next = stdIn.nextInt();
		}
	}
}
