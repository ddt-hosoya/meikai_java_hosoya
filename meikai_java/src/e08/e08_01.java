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
	private int height;
	// 体重
	private int weight;
	// BMI
	private double bmi;

	// 標準体重を求めるための指数
	final double EXPONENT = 22;
	// 標準体重を求めるための調整値
	final double ADJUST = 100;

	// コンストラクタ
	e08_01(String name, int height, int weight){
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
		System.out.printf("身長：%dcm\n", height);
		// 体重を表示
		System.out.printf("体重：%dkg\n", weight);
		// BMIを表示
		System.out.printf("BMI：%5.2f\n", bmi);
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
	 * @return int 前回の身長との差分
	 */
	int updateHeight(int newHeight){
		// 前回との差分を求める
		int difference = newHeight - height;
		// 身長を更新する
		height = newHeight;
		// 差分を返す
		return difference;
	}

	/**
	 * 体重を更新して前回との差分を返すクラスメソッド
	 * @author t.hosoya
	 * @since 20190620
	 * @return int 前回の体重との差分
	 */
	int updateWeight(int newWeight){
		// 前回との差分を求める
		int difference = newWeight - weight;
		// 体重を更新する
		weight = newWeight;
		// 差分を返す
		return difference;
	}

}
