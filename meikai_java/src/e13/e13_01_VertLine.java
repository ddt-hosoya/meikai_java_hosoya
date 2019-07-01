package e13;
/*
クラスVertLineは垂直直線を表すクラスです。
このクラスは、直線を表す抽象クラスAbstLineから派生したクラスです
 */
public class e13_01_VertLine extends e13_01_AbstLine {
	// 垂直直線を生成するコンストラクタ
	public e13_01_VertLine(int length){ super(length); }

	// メソッドtoStringは、垂直直線に関する図形情報を表す文字列を返却します
	public String toStriing(){
		return "VertLine(length:" + getLength() + ")";
	}
	// メソッドdrawは垂直直線を描画します
	public void draw(){
		// 長さの分だけ描画を繰り返す
		for(int i = 1; i <= getLength(); i++){
			// 記号'|'を描画して改行
			System.out.println('|');
		}
	}
}
