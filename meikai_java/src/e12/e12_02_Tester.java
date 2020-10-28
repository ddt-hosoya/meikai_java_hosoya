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
		// 足立君の口座合計額と仲田君の口座合計額のどちらが多いか比較し比較結果に応じて文言を表示する
		comResult(adachi, nakata);

		// TimeAccountクラスで口座開設
		e12_02_TimeAccount tanaka = new e12_02_TimeAccount("田中", "111222", 1300, 7800);
		// TimeAccountクラスで口座開設
		e12_02_TimeAccount suzuki = new e12_02_TimeAccount("鈴木", "333444", 500, 90000);
		// 比較する文言を表示
		System.out.printf("%sと%sの普通預金と定期預金残高の合計額を比較\n\n", tanaka.getName(), suzuki.getName());
		// 田中君の口座合計額と鈴木君の口座合計額のどちらが多いか比較し比較結果に応じて文言を表示する
		comResult(tanaka, suzuki);
	}
	/**
	 * 比較結果に応じて文言を表示する
	 * @author t.hosoya
	 * @since 20190628
	 * @param firstAccount 定期預金付き銀行口座クラス型変数
	 * @param secondAccount 定期預金付き銀行口座クラス型変数
	 */
	public static void comResult(e12_02_Account firstAccount, e12_02_Account secondAccount){
		// comBalanceの結果を判定する
		int num = comBalance(firstAccount, secondAccount);
		switch(num){
			// 返り値が1の場合
			case 1:
				// firstAccountの合計額が多いという文言を表示をする
				System.out.printf("%sの口座合計額が%sの口座合計額に比べて多いです。\n\n", firstAccount.getName(), secondAccount.getName());
				break;
			// 返り値が0の場合
			case 0:
				// firstAccountとsecondAccountの合計額が同じという文言を表示をする
				System.out.printf("%sと%sの口座合計額が同じです。\n\n", firstAccount.getName(), secondAccount.getName());
				break;
			// 返り値が-1の場合
			case -1:
				// secondAccountの合計額が多いという文言を表示をする
				System.out.printf("%sの口座合計額に比べて%s口座合計額が多いです。\n\n", firstAccount.getName(), secondAccount.getName());
				break;
		}
	}

	/**
	 * 定期預金付き銀行口座クラス型変数firstAccount,secondAccountの普通預金と定期預金残高の合計額を比較した結果を返却
	 * @author t.hosoya
	 * @since 20190628
	 * @param firstAccount 定期預金付き銀行口座クラス型変数
	 * @param secondAccount 定期預金付き銀行口座クラス型変数
	 * @return 普通預金と定期預金残高の合計額を比較した結果
	 */
	public static int comBalance(e12_02_Account firstAccount, e12_02_Account secondAccount){
		//返り値
		int result;
		// 返り値を定数化
		// firstAccountの合計額のほうが大きい場合
		final int A_BIGGER = 1;
		// firstAccountとbの合計額が同じ場合
		final int A_EQUAL_B = 0;
		// secondAccountの合計額のほうが大きい場合
		final int B_BIGGER = -1;
		// firstAccountの合計額
		long totalA;
		// secondAccountの合計額
		long totalB;
		// firstAccountがAccount型のインスタンスの場合
		if(firstAccount instanceof e12_02_TimeAccount){
			// aの普通預金と定期預金を合計額とする
			totalA = ((e12_02_TimeAccount)firstAccount).getBalance() + ((e12_02_TimeAccount)firstAccount).getTimeBalance();
		// firstAccountがTimeAccount型のインスタンスの場合
		}else{
			// firstAccountの普通預金を合計額とする
			totalA = firstAccount.getBalance();
		}
		// secondAccountがAccount型のインスタンスの場合
		if(secondAccount instanceof e12_02_TimeAccount){
			// secondAccountの普通預金と定期預金を合計額とする
			totalB = ((e12_02_TimeAccount)secondAccount).getBalance() + ((e12_02_TimeAccount)secondAccount).getTimeBalance();
		// secondAccountがTimeAccount型のインスタンスの場合
		}else{
			// aの普通預金を合計額とする
			totalB = secondAccount.getBalance();
		}
		// 合計額を比較値してfirstAccountのほうが多ければ1を返却
		if(totalA > totalB){
			result = A_BIGGER;
		}
		// 合計額を比較値してfirstAccountとsecondAccountが等しければを0を返却
		else if(totalA == totalB){
			result = A_EQUAL_B;
		}
		// 合計額を比較値してsecondAccountのほうが多ければ-1を返却
		else{
			result = B_BIGGER;
		}
		return result;
	}
}
