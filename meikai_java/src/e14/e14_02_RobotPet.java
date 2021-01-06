package e14;
/*
 * ロボット型ペットクラスRobotPet（p.407）を拡張した、着せ替え可能なロボット型ペットクラスを作成せよ。
 * インターフェースSkinnableを実装すること。
 */
public class e14_02_RobotPet extends RobotPet implements Skinnable {
	// スキン
	private int skin = BLACK;
	// コンストラクタ
	public e14_02_RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	// スキンを初期化するコンストラクタ
	public e14_02_RobotPet(String name, String masterName, int skin) {
		super(name, masterName);
		this.skin = skin;
	}

	/**
	 * 自己紹介メソッドのオーバーライド
	 * @author t.hosoya
	 * @since 20200929
	 *
	 */
	@Override
	public void introduce(){
		System.out.println("◇私はロボット。名前は" + getName() +"。");
		System.out.println("◇ご主人様は" + getMasterName() +"。");
		System.out.println("◇スキンの色は" + getSkinName() +"。");
	}
	/**
	 * スキンのsetter
	 * @author t.hosoya
	 * @since 20200909
	 * @param skin スキン
	 */
	public void setSkin(int skin){
		this.skin = skin;
	}
	/**
	 * スキンのgetter
	 * @author t.hosoya
	 * @since 20200909
	 * @param skin スキン
	 */
	public String getSkinName(){
		String skinName;
			switch(skin){
			case BLACK:
				skinName = "黒";
				break;
			case RED:
				skinName = "赤";
				break;
			case GREEN:
				skinName = "緑";
				break;
			case BLUE:
				skinName = "青";
				break;
			case LEOPARD:
				skinName = "豹柄";
				break;
			default:
				skinName = "無地";
		}
		return skinName;
	}
	/**
	 *  スキンを変更し変更を知らせる文言を表示するメソッド
	 *  @author t.hosoya
	 *  @since 20200909
	 */
	public void changeSkin(int skin){
		// スキンをセットする
		setSkin(skin);
		// 変更を知らせる文言を表示する
		System.out.println("スキンを" + getSkinName() + "に変更しました。");
	}


}
