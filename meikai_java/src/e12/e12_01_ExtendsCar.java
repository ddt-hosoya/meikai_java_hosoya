package e12;
/*
総走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。
自動車クラスCar第二版(p.324)から派生すること。
 */
public class e12_01_ExtendsCar extends e12_01_Car{
	private double distance;

	// コンストラクタ
	e12_01_ExtendsCar(String name, int width, int height, int length, double fuel, e12_01_Day purchaseDay){
		super(name, width, height, length, fuel, purchaseDay);
		this.distance = 0;
	}
	// 総走行距離を取得
	double getDistance(){
		// 総走行距離を返す
		return distance;
	}
	// スーパークラスのメソッドをオーバーライド
	public boolean move(double dx, double dy){
		// 移動できたかどうか
		boolean result = super.move(dx, dy);
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 移動完了した場合
		if(result){
			// 移動距離を加算
			distance += dist;
		}
		// 移動できたかどうかを返す
		return result;
	}
}
