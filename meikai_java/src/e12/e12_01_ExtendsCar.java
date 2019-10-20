package e12;
/*
総走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。
自動車クラスCar第二版(p.324)から派生すること。
 */
/**
 * 自動車クラス拡張版
 * @author t.hosoya
 * @since 20190627
 *
 */
public class e12_01_ExtendsCar extends e12_01_Car{
	private double distance;

	// コンストラクタ
	e12_01_ExtendsCar(String name, int width, int height, int length, double fuel, e12_01_Day purchaseDay){
		super(name, width, height, length, fuel, purchaseDay);
		this.distance = 0;
	}
	/**
	 * 総走行距離を取得
	 * @author t.hosoya
	 * @since 20190627
	 * @return double 総走行距離
	 */
	double getDistance(){
		// 総走行距離を返す
		return distance;
	}
	/**
	 * スーパークラスのメソッドをオーバーライド
	 * @author t.hosoya
	 * @since 20190627
	 * @param dx x方向に進む距離
	 * @param dy y方向に進む距離
	 * @retun boolean 移動できたかどうか
	 */
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
