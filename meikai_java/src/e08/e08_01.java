package e08;
/*
名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ（フィールドやメソッドなどは自分で自由に設計すること。
 */
/**
 * 人間クラス
 * @author t.hosoya
 * @since 20190620
 */
public class e08_01 {
	// 名前
	private String name;
	// 身長
	private double height;
	// 体重
	private double weight;
	// BMI
	private double bmi;

	// 標準体重を求めるための指数
	final double EXPONENT = 22;
	// 標準体重を求めるための調整値
	final double ADJUST = 100;

	// コンストラクタ
	e08_01(String name, double height, double weight){
		// フィールドに引数で入力された値を代入
		this.name = name;
		// フィールドに引数で入力された値を代入
		this.height = height;
		// フィールドに引数で入力された値を代入
		this.weight = weight;
		// 体重と身長でBMI数値を算出
		bmi = (weight / (height / ADJUST) / (height / ADJUST));
	}

	/**
	 * 人間のスペックを表示するクラスメソッド
	 * @author t.hosoya
	 * @since 20190620
	 */
	void putSpec(){
		// 名前を表示
		System.out.printf("名前：%s\n", name);
		// 身長を表示
		System.out.printf("身長：%5.2fcm\n", height);
		// 体重を表示
		System.out.printf("体重：%5.2fkg\n", weight);
		// BMIを表示
		bmi = updateBMI();
		System.out.printf("BMI：%5.2f\n", bmi);
	}

	/**
	 * 身長のゲッタ
	 * @author t.hosoya
	 * @since 20191209
	 * @return double 身長
	 */
	double getHeight(){
		// 身長を返す
		return height;
	}
	/**
	 * 体重のゲッタ
	 * @author t.hosoya
	 * @since 20191209
	 * @return double 体重
	 */
	double getWeight(){
		return weight;
	}
	/**
	 * BMIのアップデート
	 * @author t.hosoya
	 * @since 20191209
	 * @return double BMI
	 */
	double updateBMI(){
		bmi = (weight / (height / ADJUST) / (height / ADJUST));
		return bmi;
	}
	/**
	 * 標準体重を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double 標準体重
	 */
	double putStandardWeight(){
		// 標準体重 = 身長(m)ｘ身長(m)ｘ22
		double standardWeight = (height / ADJUST) * (height / ADJUST) * EXPONENT;
		return standardWeight;
	}

	/**
	 * 身長を更新して前回との差分を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double 前回の身長との差分
	 */
	double updateHeight(double newHeight){
		// 前回との差分を求める
		double difference = newHeight - height;
		// 身長を更新する
		height = newHeight;
		// 差分を返す
		return difference;
	}

	/**
	 * 体重を更新して前回との差分を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return double 前回の体重との差分
	 */
	double updateWeight(double newWeight){
		// 前回との差分を求める
		double difference = newWeight - weight;
		// 体重を更新する
		weight = newWeight;
		// 差分を返す
		return difference;
	}

}
