package e14;
/*
 * クラスDVDPlayerを利用するプログラム例を作成せよ
 */
/**
 * クラスDVDPlayerを利用するプログラム
 * @author tsukasa
 * @since 20200929
 *
 */
public class e14_03_DVDPlayerTester {

	public static void main(String[] args) {
		// DVDPlayer作成
		e14_03_DVDPlayer player = new e14_03_DVDPlayer();
		// 再生する
		player.play();
		// スロー再生する
		player.slow();
		// 停止する
		player.stop();

	}

}
