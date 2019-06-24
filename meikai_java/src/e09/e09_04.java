package e09;
/*
演習8－1で作成した《人間クラス》に、誕生日のフィールドとtoStringメソッドを追加せよ。
※コンストラクタを変更したり、誕生日のゲッタなどのメソッドを追加したりすること。
 */
public class e09_04 {
	// 名前
	private String name;
	// 身長
	private int height;
	// 体重
	private int weight;
	// BMI
	private double bmi;
	// 誕生日
	private e09_04_Day birthday;
	// 標準体重を求めるための指数
	final double EXPONENT = 22;
	// 標準体重を求めるための調整値
	final double ADJUST = 100;

	// コンストラクタ
	e09_04(String name, int height, int weight, e09_04_Day birthday){
		// フィールドに引数で入力された値を代入
		this.name = name;
		// フィールドに引数で入力された値を代入
		this.height = height;
		// フィールドに引数で入力された値を代入
		this.weight = weight;
		// 体重と身長でBMI数値を算出
		bmi = (weight / (height / ADJUST) / (height / ADJUST));
		// 誕生日を日付クラスで代入
		this.birthday = new e09_04_Day(birthday);
	}

	// 人間のスペックを表示するメソッド
	void putSpec(){
		// 名前を表示
		System.out.printf("名前：%s\n", name);
		// 身長を表示
		System.out.printf("身長：%dcm\n", height);
		// 体重を表示
		System.out.printf("体重：%dkg\n", weight);
		// BMIを表示
		System.out.printf("BMI：%5.2f\n", bmi);
		// 誕生日を表示
		System.out.printf("誕生日：%s\n", toString());
	}

	// 誕生日のゲッタ
	String getBirthday(){
		// 誕生日文字列を返す
		return toString();
	}

	// 標準体重を返すメソッド
	double putStandardWeight(){
		// 標準体重 = 身長(m)ｘ身長(m)ｘ22
		double standardWeight = (height / ADJUST) * (height / ADJUST) * EXPONENT;
		return standardWeight;
	}

	// 身長を更新して前回との差分を返すメソッド
	int updateHeight(int newHeight){
		// 前回との差分を求める
		int difference = newHeight - height;
		// 身長を更新する
		height = newHeight;
		// 差分を返す
		return difference;
	}

	// 体重を更新
	int updateWeight(int newWeight){
		// 前回との差分を求める
		int difference = newWeight - weight;
		// 体重を更新する
		weight = newWeight;
		// 差分を返す
		return difference;
	}

	// 日付を文字列で返すメソッド
	public String toString(){
		// 曜日の配列
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		// 日付クラスの値を文字列で返す
		return String.format("%04d年%02d月%02d日(%s)", birthday.getYear(), birthday.getMonth(),
				birthday.getDate(), wd[birthday.dayOfWeek()]);

	}

}
