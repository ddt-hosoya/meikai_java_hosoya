package e13;
/**
 *クラスRectangleは長方形を表すクラスです。
 *このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 *@author t.hosoya
 *@since 20190701
 */
public class e13_01_Rectangle extends e13_01_Shape {
	// 長方形の幅を表すint型のフィールド
	private int width;
	// 長方形の高さを表すint型のフィールド
	private int height;

	// 長方形を生成するコンストラクタ
	public e13_01_Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	/**
	 * 長方形の幅を表すint型のフィールドのセッタ
	 * @author t.hosoya
	 * @since 20200914
	 * @param width
	 */
	public void setWidth(int width){
		this.width = width;
	}
	/**
	 * 長方形の幅を表すint型のフィールドのゲッタ
	 * @author t.hosoya
	 * @since 20200914
	 * @return width
	 */
	public int getWidth(){
		return width;
	}
	/**
	 * 長方形の高さを表すint型のフィールドのセッタ
	 * @author t.hosoya
	 * @since 20200914
	 * @param height
	 */
	public void setHeight(int height){
		this.width = height;
	}
	/**
	 * 長方形の高さを表すint型のフィールドのゲッタ
	 * @author t.hosoya
	 * @since 20200914
	 * @return height
	 */
	public int getHeight(){
		return height;
	}

	/**
	 * メソッドtoStringは長方形に関する図形情報を表す文字列を返却します
	 * @author t.hosoya
	 * @since 20190701
	 * @return 長方形に関する図形情報を表す文字列
	 */
	public String toString(){
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	/**
	 * メソッドdrawは長方形を描画します
	 * @author t.hosoya
	 * @since 20190701
	 */
	public void draw(){
		// 高さの分だけ改行する
		for(int i = 1; i <= height; i++){
			// 幅の分だけ'*'を描画する
			for(int j = 1; j <= width; j++){
				// '*'を描画
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}
	}

}
