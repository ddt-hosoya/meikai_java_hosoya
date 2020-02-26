package e14;
import e13.e13_01_Shape;
/**
 * 図形クラスから派生し二次元インターフェースの面積表示機能を実装した平行四辺形クラス
 * @author t.hosoya
 * @since 20200115
 */
public class e14_01_Parallelogram extends e13_01_Shape implements e14_01_Plane2D {
	// 底辺の長さ
	private int width;
	// 高さ
	private int height;
	/**
	 * 平行四辺形クラスのコンストラクタ
	 * @author t.hosoya
	 * @since 20200115
	 * @param width 底辺
	 * @param height 高さ
	 */
	public e14_01_Parallelogram(int width, int height){
		// 底辺の長さを設定
		this.width = width;
		// 高さを設定
		this.height = height;
	}
	/**
	 * メソッドtoStringは平行四辺形に関する図形情報を表す文字列を返却します
	 * @author t.hosoya
	 * @since 20200226
	 * @return 平行四辺形に関する図形情報を表す文字列
	 */
	public String toString(){
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}
	/**
	 * メソッドdrawは平行四辺形を描画します
	 * @author t.hosoya
	 * @since 20200226
	 */
	public void draw(){
		// 1段ずつ上から描画します
		for(int i = 1; i <= height; i++){
			// 高さ-1分スペースを描画します
			for(int j = 1; j <= height - i; j++){
				System.out.print(" ");
			}
			// 辺の長さ文＃を描画します
			for(int j = 1; j <= width; j++){
				System.out.print("#");
			}
			// 改行して次の段に行きます
			System.out.println();
		}
	}

	/**
	 * 面積求めるメソッド
	 * @author t.hosoya
	 * @since 20200226
	 */
	public int getArea(){
		// 面積（底辺×高さ）を返却
		return width * height;
	}
}
