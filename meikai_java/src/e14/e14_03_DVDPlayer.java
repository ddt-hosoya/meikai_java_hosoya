package e14;
/**
 * DVDプレーヤー（p.467のコピー）
 * @author tsukasa
 * @since 20200929
 *
 */
public class e14_03_DVDPlayer implements e14_03_ExPlayer {
	// 再生クラスをオーバーライド
	public void play(){
		System.out.println("■DVD再生開始！");
	}
	// 停止クラスをオーバーライド
	public void stop(){
		System.out.println("■DVD再生終了！");
	}
	// スロー再生クラスをオーバーライド
	public void slow(){
		System.out.println("■DVDスロー再生開始！");
	}

}
