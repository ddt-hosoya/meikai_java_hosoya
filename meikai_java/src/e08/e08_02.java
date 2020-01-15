package e08;
/*
自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ。
たとえば：タンク容量を表すフィールドを追加する/ナンバーを表すフィールドを追加する/
燃費を表すフィールドを追加する/移動による燃料残量の計算に燃費を反映させる/給油のためのメソッドを追加するetc…
 */
/**
 * 自動車クラス
 * @author t.hosoya
 * @since 20190620
 *
 */
public class e08_02 {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double tankSize;
	private double fuelEconomy;

	// コンストラクタ
	e08_02(String name, int width, int height, int length, double fuel, double tankSize, double fuelEconomy){
		// 車名
		this.name = name;
		// 車幅
		this.width = width;
		// 車高
		this.height = height;
		// 車長
		this.length = length;
		// 残り燃料
		this.fuel = fuel;
		// 燃料タンク容量
		this.tankSize = tankSize;
		// 燃費
		this.fuelEconomy = fuelEconomy;
		x = y = 0.0;
	}

	/**
	 * xの座標を返すメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double xの座標
	 */
	double getX(){ return x; }
	/**
	 * yの座標を返すメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double yの座標
	 */
	double getY(){ return y; }
	/**
	 * 残り燃料を返すメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double 残り燃料
	 */
	double getFuel(){ return fuel; }

	/**
	 * 車のスペックを表示するメソッド
	 * @author t.hosoya
	 * @since 20190620
	 */
	void putSpec(){
		// 名前を表示
		System.out.println("名前：" + name);
		// 車幅を表示
		System.out.println("車幅" + width + "mm");
		// 車高を表示
		System.out.println("車高" + height + "mm");
		// 車長を表示
		System.out.println("車長" + length + "mm");
		// タンク容量を表示
		System.out.println("タンク容量" + tankSize);
		// 燃費を表示
		System.out.println("燃費" + fuelEconomy + "(距離/燃料)");

	}

	/**
	 * 残り燃料を返すメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @param dx x方向に移動する距離
	 * @param dy y方向に移動する距離
	 * @return boolean 移動したかどうか
	 */
	boolean move(double dx, double dy){
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 移動距離で使用する燃料の使用量
		double fuelUtilization = dist /  fuelEconomy;

		// 燃料の使用量が残りの燃料を上回る場合
		if(fuelUtilization > fuel){
			// falseを返す
			return false;
		// 燃料の使用量が残りの燃料を上回らない場合
		}else{
			// 残りの燃料から今回の移動で使用する燃料を引く
			fuel -= fuelUtilization;
			// x方向にdx分移動する
			x += dx;
			// y方向にdy分移動する
			y += dy;
			// trueを返す
			return true;
		}
	}
	/**
	 * 給油メソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @param refuel 給油量
	 */
	void refueling(double refuel){
		// 燃料タンクの空き容量
		double capacity = tankSize - fuel;
		// 給油しようとしている燃料が空き容量より大きい場合
		if(refuel > capacity){
			// 空き容量分の燃料を給油する主旨の文言を表示
			System.out.println("燃料" + refuel + "を給油するとタンク容量を超えてしまいます。満タンまで給油します。");
			// 給油量を空き容量とする
			refuel = capacity;
		}
		// 残りの燃料に給油する
		fuel += refuel;
		// 給油した文言を表示
		System.out.println("燃料" + refuel + "を給油しました。");
	}

}
