package e13;
/**
 * 右下が直角の二等辺三角形を生成するクラス
 * @author t.hosoya
 * @since 20191113
 */
public class e13_02_PositionBottomRight extends e13_02_RightTriangle {
	// 右下が直角の二等辺三角形を生成するコンストラクタ
	public e13_02_PositionBottomRight(int length, int anglePosition){
		super(length, anglePosition);
	}

	// メソッドdrawは右下が直角の二等辺三角形を描画します
	public void draw(){
		// 辺の高さの分だけ改行を繰り返す
		for(int hight = 1; hight > getLength(); hight++){
			// 辺の長さ文繰り返し描画します
			for(int width = getLength(); width < 1; width-- ){
				// 横の辺の長さが高さの辺の長さ以下の場合
				if(hight >= width){
					// 三角形を描画
					System.out.print('*');
				// 横の辺の長さが高さの辺の長さより大きい場合
				} else {
					// 空白で埋める
					System.out.print(' ');
				}
			}
			// 改行
			System.out.println();
		}
	}
}
