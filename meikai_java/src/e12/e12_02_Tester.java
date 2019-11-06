package e12;

import java.util.Scanner;
/*
定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
comBalance(Account a, Account b)を作成せよ。
合計額を比較値してaのほうが多ければ1、等しければ0、bのほうが多ければ-1を返却すること。
もしaやbの参照先が、定期預金をもたないAccount型のインスタンスであれば、普通預金の金額を比較の対象とすること。
 */
public class e12_02_Tester {
	public static void main(String[] args){
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);
		// Accountクラスで口座開設
		e12_02_Account adachi = new e12_02_Account("足立", "123456", 1000);
		// Accountクラスで口座開設
		e12_02_Account nakata = new e12_02_Account("仲田", "654321", 200);
		// 比較する文言を表示
		System.out.printf("%sと%sの普通預金と定期預金残高の合計額を比較\n\n", adachi.getName(), nakata.getName());
		// 足立君の口座合計額と仲田君の口座合計額のどちらが多いか比較する
		int num = comBalance(adachi, nakata);
		// 比較結果に応じて文言を表示する
		comResult(num, adachi, nakata);

		// TimeAccountクラスで口座開設
		e12_02_TimeAccount tanaka = new e12_02_TimeAccount("田中", "111222", 1300, 7800);
		// TimeAccountクラスで口座開設
		e12_02_TimeAccount suzuki = new e12_02_TimeAccount("鈴木", "333444", 500, 90000);
		// 比較する文言を表示
		System.out.printf("%sと%sの普通預金と定期預金残高の合計額を比較\n\n", tanaka.getName(), suzuki.getName());
		// 田中君の口座合計額と鈴木君の口座合計額のどちらが多いか比較する
		int num2 = comBalance(tanaka, suzuki);
		// 比較結果に応じて文言を表示する
		comResult(num2, tanaka, suzuki);
	}
	/**
	 * 比較結果に応じて文言を表示する
	 * @author t.hosoya
	 * @since 20190628
	 * @param num comBalanceメソッドの判定結果
	 * @param a 定期預金付き銀行口座クラス型変数
	 * @param b 定期預金付き銀行口座クラス型変数
	 */
	public static void comResult(int num, e12_02_Account a, e12_02_Account b){
		// comBalanceの結果を判定する
		switch(num){
			// 返り値が1の場合
			case 1:
				// aの合計額が多いという文言を表示をする
				System.out.printf("%sの口座合計額が%sの口座合計額に比べて多いです。\n\n", a.getName(), b.getName());
				break;
			// 返り値が0の場合
			case 0:
				// aとbの合計額が同じという文言を表示をする
				System.out.printf("%sと%sの口座合計額が同じです。\n\n", a.getName(), b.getName());
				break;
			// 返り値が-1の場合
			case -1:
				// bの合計額が多いという文言を表示をする
				System.out.printf("%sの口座合計額に比べて%s口座合計額が多いです。\n\n", a.getName(), b.getName());
				break;
		}
	}

	/**
	 * 定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却
	 * @author t.hosoya
	 * @since 20190628
	 * @param a 定期預金付き銀行口座クラス型変数
	 * @param b 定期預金付き銀行口座クラス型変数
	 * @return 普通預金と定期預金残高の合計額を比較した結果
	 */
	public static int comBalance(e12_02_Account a, e12_02_Account b){
		// 返り値を定数化
		// aの合計額のほうが大きい場合
		final int A_BIGGER = 1;
		// aとbの合計額が同じ場合
		final int A_EQUAL_B = 0;
		// bの合計額のほうが大きい場合
		final int B_BIGGER = -1;
		// aの合計額
		long totalA;
		// bの合計額
		long totalB;
		// aがAccount型のインスタンスの場合
		if(a instanceof e12_02_TimeAccount){
			// aの普通預金と定期預金を合計額とする
			totalA = ((e12_02_TimeAccount)a).getBalance() + ((e12_02_TimeAccount)a).getTimeBalance();
		// aがTimeAccount型のインスタンスの場合
		}else{
			// aの普通預金を合計額とする
			totalA = a.getBalance();
		}
		// bがAccount型のインスタンスの場合
		if(b instanceof e12_02_TimeAccount){
			// bの普通預金と定期預金を合計額とする
			totalB = ((e12_02_TimeAccount)b).getBalance() + ((e12_02_TimeAccount)b).getTimeBalance();
		// bがTimeAccount型のインスタンスの場合
		}else{
			// aの普通預金を合計額とする
			totalB = b.getBalance();
		}
		// 合計額を比較値してaのほうが多ければ1を返却
		if(totalA > totalB){ return A_BIGGER; }
		// 合計額を比較値してaとbを0を返却
		else if(totalA == totalB){ return A_EQUAL_B; }
		// 合計額を比較値してbのほうが多ければ-1を返却
		else{ return B_BIGGER; }
	}
}
