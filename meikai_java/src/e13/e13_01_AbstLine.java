package e13;
/*
クラスAbstLineは直線を表す抽象クラスです。
このクラスは図形を表す抽象クラスShapeから派生したクラスです。
抽象クラスですから、本クラスのインスタンスを生成することはできません。
具体的な直線クラスはこのくらすから派生します。
 */
public abstract class e13_01_AbstLine extends e13_01_Shape {
	// 直線の長さを表すint型のフィールド
	private int length;

	// 直線を生成するコンストラクタ
	public e13_01_AbstLine(int length){
		setLength(length);
	}

	// 直線の長さを取得します
	public int getLength(){
		return length;
	}

	// 直線の長さを設定します
	public void setLength(int length){
		this.length = length;
	}

	// メソッドtoStringは、直線に関する図形情報を表す文字列を返却します
	public String toString(){
		return "AbsLine(length:" + length + ")";
	}
}
