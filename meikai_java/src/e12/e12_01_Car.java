package e12;

public class e12_01_Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private e12_01_Day purchaseDay;

	//コンストラクタ
	public e12_01_Car(String name, int width, int height, int length, double fuel, e12_01_Day purchaseDay){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new e12_01_Day(purchaseDay);
	}
	// 現在位置X座標を取得
	public double getX(){ return x; }
	// 現在位置Y座標を取得
	public double getY(){ return y; }
	// 残り燃料を取得
	public double getFuel(){ return fuel; }
	// 購入日を取得
	public e12_01_Day getPurchaseDay(){ return new e12_01_Day(purchaseDay); }

	// スペック表示
	public void putSpec(){
		System.out.println("名前" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
	}
	// X方向にdx・Y方向にdy
	public boolean move(double dx, double dy){
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 燃料不足
		if(dist > fuel){
			// 移動できない
			return false;
		// 燃料がある場合
		}else{
			// 移動距離分燃料が減る
			fuel -= dist;
			// x方向に移動
			x += dx;
			// y方向に移動
			y += dy;
			// 移動完了
			return true;
		}
	}
}
