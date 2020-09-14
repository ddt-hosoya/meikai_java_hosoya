package e14;

import e13.e13_01_Rectangle;
/**
 * 13章で作成した長方形クラスにオーバーライドして二次元インターフェースの面積表示機能を実装したクラス
 * @author t.hosoya
 * @since 20200115
 */
public class e14_01_Rectangle extends e13_01_Rectangle implements e14_01_Plane2D {
	/**
	 * 面積表示機能を実装した長方形クラスのコンストラクタ
	 * @author t.hosoya
	 * @since 20200115
	 * @param width 底辺
	 * @param height 高さ
	 */
	public e14_01_Rectangle(int width, int height){
		// スーパークラスのメソッドを継承
		super(width, height);
	}

	/**
	 * 面積求めるメソッド
	 * @author t.hosoya
	 * @since 20200115
	 */
	public int getArea(){
		// 面積（底辺×高さ）を返却
		return getWidth() * getHeight();
	}
}
