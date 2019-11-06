package e13;
/**
 *クラスPointは、点を表すクラスです
 *このクラスは図形を表す抽象クラスShapeから派生したクラスです
 *@author t.hosoya
 *@since 20190701
 */
public class e13_01_Point extends e13_01_Shape {
	// 点を生成するコンストラクタです
	public e13_01_Point(){
		//何も行わない
	}

	/**
	 * メソッドtoStrongは、点に関する図形情報を表す文字列を返却します
	 * @author t.hosoya
	 * @since 20190701
	 * @return 点に関する図形情報を表す文字列
	 */
	public String toString(){
		// "Point"という文字列を返す
		return "Point";
	}

	/**
	 * メソッドdrawは点を描画するメソッドです
	 * @author t.hosoya
	 * @since 20190701
	 */
	public void draw(){
		// プラス記号を一個だけ表示して改行
		System.out.println('+');
	}

}
