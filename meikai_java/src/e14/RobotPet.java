package e14;
/**
 *  ロボットペットクラス（p.407のコピー）
 * @author t.hosoya
 * @since 20200902
 */
public class RobotPet extends Pet {
	// コンストラクタ
	public RobotPet(String name, String masterName){
		super(name, masterName);
	}
	// 自己紹介
	public void introduce(){
		System.out.println("◇私はロボット。名前は" + getName() +"。");
		System.out.println("◇ご主人様は" + getMasterName() +"。");
	}
	// 家事をする
	public void work(int sw){
		switch(sw){
		case 0:
			System.out.println("掃除します。");
			break;
		case 1:
			System.out.println("洗濯します。");
			break;
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}
}
