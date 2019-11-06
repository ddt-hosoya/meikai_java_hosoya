package e13;
/**
 *クラスShapeは、図形の概念を表す抽象クラスです。
 *抽象クラスですから、本クラスのインスタンスを生成することはできません。
 *具体的な図形クラスは、このクラスから派生します。
 * @author t.hosoya
 * @since 20190701
 */
public abstract class e13_01_Shape {
	/**
	 * 図形クラスを表す文字列を返却するメソッド
     * @author t.hosoya
     * @since 20190701
	 */
	public abstract String toString();

	/**
	 * メソッドdrawは、図形を描画するための抽象メソッド
     * @author t.hosoya
     * @since 20190701
	 */
	public abstract void draw();

	/**
	 * 図形情報の表示と図形の描画を行うメソッド
     * @author t.hosoya
     * @since 20190701
	 */
	public void print(){
		// 図形情報の表示
		System.out.println(toString());
		// 図形の描画
		draw();
	}
}
