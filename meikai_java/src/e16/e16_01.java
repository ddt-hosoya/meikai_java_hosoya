package e16;

import java.util.Scanner;

/*
 * List16-4(p.518)のtry文では、Exception例外とRuntimeException例外を、単一の例外ハンドラで補足している。
 * ふたつの例外を別々に補足するように変更したプログラムを作成せよ。
 */
public class e16_01 {

	/**
	 * swの値に応じて例外を発生(p518)
	 * @param sw 例外ケース
	 * @throws Exception
	 * @author t.hosoya
	 * @since 20210125
	 */
	static void check(int sw) throws Exception {
		// 引数で受け取った例外ケースに応じて例外を送出する
		switch(sw){
			// Exception送出
			case 1: throw new Exception("検査例外発生！！");
			// RuntimeException送出
			case 2: throw new RuntimeException("非検査例外発生！！");
		}
	}
	/**
	 * checkを呼び出す(p518)
	 * @param sw
	 * @throws Exception
	 * @author t.hosoya
	 * @since 20210125
	 */
	static void test(int sw) throws Exception{
		// checkメソッドを呼び出す
		check(sw);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 例外ケースの入力を促す
		System.out.println("sw：");
		// 入力値を例外ケースとする
		int sw = stdIn.nextInt();

		try{
			test(sw);
		// RuntimeException例外を補足
		}catch(RuntimeException e){
			// RuntimeException例外の詳細文字列を表示
			System.out.println(e.getMessage());
		// Exception例外を補足
		}catch(Exception e){
			// Exception例外の詳細文字列を表示
			System.out.println(e.getMessage());
		}


	}

}
