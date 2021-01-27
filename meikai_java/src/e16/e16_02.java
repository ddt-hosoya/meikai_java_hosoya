package e16;

import java.util.Scanner;

/*
 * List16-6(p.523)のtry文では、ParameterRangeError例外とResultRangeError例外を別々の例外ハンドラで補足している。
 * 単一の例外ハンドラで補足するように変更したプログラムを作成せよ。
 */
/**
 * List16-6改
 * @author t.hosoya
 * @since 20210127
 */
public class e16_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 整数値aの入力を促す
		System.out.println("整数a：");
		// 入力値で整数aを初期化
		int a = stdIn.nextInt();
		// 整数値bの入力を促す
		System.out.println("整数b：");
		// 入力値で整数bを初期化
		int b = stdIn.nextInt();
		// 補足したエラーの種類を次判定するための文字列
		final String PARAMETER_ERROR_CLASS = "e16.e16_02_ParameterRangeError";
		// 補足したエラーの種類を次判定するための文字列表示位置
		final int ERROR_CLASS_POSITION = 0;

		try {
			// 整数aとbの和を表示する
			System.out.println("それらの和は" + add(a, b) + "です。");
		// 例外を補足した場合（整数aまたはbまたはその和が2桁以上であった場合）
		} catch(e16_02_RangeError e){
			// 整数aまたはbが2桁以上であった場合
			if(PARAMETER_ERROR_CLASS.equals(e.toString().split(":")[ERROR_CLASS_POSITION])){
				// エラー原因を表示
				System.out.println("加える数が範囲外です" + e.getMessage());
			// 整数aとbの和が2桁以上であった場合
			}else {
				// エラー原因を表示
				System.out.println("計算結果が範囲外です" + e.toString());
			}
		}
	}
	/**
	 * nは1桁（0~9）かを判定する（p.523）
	 * @param n 判定対象の値
	 * @return 正否
	 * @author t.hosoya
	 * @since 20210125
	 */
	static boolean isValid(int n){
		// 0~9の場合は正、それ以外は否を返す
		return n >= 0 && n <= 9;
	}

	/**
	 * 1桁（0~9）の整数aとbの和を求める（p.523）
	 * @param a
	 * @param b
	 * @return
	 * @throws e16_02_ParameterRangeError
	 * @throws e16_02_ResultRangeError
	 * @author t.hosoya
	 * @since 20210125
	 */
	static int add(int a, int b) throws e16_02_ParameterRangeError, e16_02_ResultRangeError{
		// 整数aが1桁でない場合
		if(!isValid(a)){
			// 範囲外例外(仮引数)を送出
			throw new e16_02_ParameterRangeError(a);
		}
		// 整数bが1桁でない場合
		if(!isValid(b)){
			// 範囲外例外(仮引数)を送出
			throw new e16_02_ParameterRangeError(b);
		}
		// 整数aとbの和を求める
		int result = a + b;
		// 整数aとbの和が1桁でない場合
		if(!isValid(result)){
			// 範囲外例外(返却値)を送出
			throw new e16_02_ResultRangeError(result);
		}
		// エラーが無ければ和を返す
		return result;
	}

}