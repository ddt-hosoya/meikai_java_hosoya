package e13;
/**
 * 直角二等辺三角形を表すクラス
 * @author t.hosoya
 * @since 20191113
 */
public abstract class e13_02_RightTriangle extends e13_01_Shape {
	// 辺の長さを表すint型のフィールド
	private int length;
	// 直角の位置を表すint型のフィールド
	private int anglePosition;

	// 直角二等辺三角形を生成するコンストラクタ
	public e13_02_RightTriangle(int length, int anglePosition){
		setLength(length);
		setAnglePosition(anglePosition);
	}
	/**
	 *  辺の長さを取得する
	 * @author t.hosoya
	 * @since 20191113
	 * @return int 辺の長さ
	 */
	public int getLength(){
		return length;
	}

	/**
	 *  直角の位置を取得します
	 * @author t.hosoya
	 * @since 20191113
	 * @return int 直角の位置
	 */
	public int getAnglePosition(){
		return anglePosition;
	}

	/**
	 *  辺の長さを設定します
	 * @author t.hosoya
	 * @since 20191113
	 * @param length 辺の長さ
	 */
	public void setLength(int length){
		this.length = length;
	}
	/**
	 *  直角の位置を設定します
	 * @author t.hosoya
	 * @since 20191113
	 * @param anglePosition 直角の位置
	 */
	public void setAnglePosition(int anglePosition){
		this.anglePosition = anglePosition;
	}

	/**
	 *  メソッドtoStringは直角二等辺三角形に関する図形情報を表す文字列を返却します
	 * @author t.hosoya
	 * @since 20191113
	 * @return 図形情報を表す文字列
	 */
	public String toString(){
		String[] anglePositionArray = {"左下","左上","右下","右上"};
		String anglePositionString = anglePositionArray[anglePosition];
		return "Rectangle(length:" + length + ", anglePosition:" + anglePositionString + ")";
	}
}
