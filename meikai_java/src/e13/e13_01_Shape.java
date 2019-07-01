package e13;
/*
クラスShapeは、図形の概念を表す抽象クラスです。
抽象クラスですから、本クラスのインスタンスを生成することはできません。
具体的な図形クラスは、このクラスから派生します。
 */
public abstract class e13_01_Shape {
	// 図形クラスを表す文字列を返却するメソッドです
	public abstract String toString();

	// メソッドdrawは、図形を描画するための抽象メソッドです
	public abstract void draw();

	// メソッドprintは、図形情報の表示と図形の描画を行います
	public void print(){
		// 図形情報の表示
		System.out.println(toString());
		// 図形の描画
		draw();
	}
}
