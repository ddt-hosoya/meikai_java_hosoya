package e14;
/**
 * インターフェース Skinnable
 * @author tsukasa
 * @since 20200909
 *
 */
public interface Skinnable {
	int BLACK = 0;    // 黒
	int RED = 1;      // 赤
	int GREEN = 2;    // 緑
	int BLUE = 3;     // 青
	int LEOPARD = 4;  // 豹柄

	// スキン変更
	void changeSkin(int skin);


}
