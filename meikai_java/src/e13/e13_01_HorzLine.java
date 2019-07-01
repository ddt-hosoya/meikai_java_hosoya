package e13;
/*
クラスHorzLineは水平直線を表すクラスです
このクラスは、直線を表すクラスAbstLineから派生したクラスです
 */
public class e13_01_HorzLine extends e13_01_AbstLine {
	// 水平直線を生成するコンストラクタ
	public e13_01_HorzLine(int length){ super(length); }

	// メソッドtoStringは、水平直線に関する図形情報を表す文字列を返却します
	public String toString(){
		return "HorzLine(length:" + getLength() + ")";
	}
	// メソッドdrawは水平直線を描画します
	public void draw(){
		// 長さの分だけ描画を繰り返す
		for(int i = 1; i <= getLength(); i++){
			// 記号'-'を描画
			System.out.print('-');
		}
		// 改行
		System.out.println();
	}
}
