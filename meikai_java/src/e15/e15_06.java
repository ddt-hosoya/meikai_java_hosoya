package e15;
/*
 * コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示するプログラムを作成せよ。（p.501）
 */
/**
 * 円の円周の長さと面積を表示するプログラム
 * @author t.hosoya
 * @since 20210106
 *
 */
public class e15_06 {
	public static void main(String[] args) {
		// コマンドライン引数index位置を初期化
		final int INDEX = 0;
		// 半径から直径を求める為の掛値
		final double ADJUST_RADIUS = 2.0;
		// 円周率
		final double PI = 3.14;

		// コマンドライン引数から半径を受け取る
		double radius = Double.parseDouble(args[INDEX]);
		// 円周の長さを求める(直径×円周率)
		double circleLength = radius * ADJUST_RADIUS * PI;
		// 円の面積を求める(半径×半径×円周率)
		double circleArea = radius * radius * PI;

		// 円周の長さと面積を表示する
		System.out.println("円周の長さ：" + circleLength
				+ "\n円の面積：" + circleArea);

	}

}
