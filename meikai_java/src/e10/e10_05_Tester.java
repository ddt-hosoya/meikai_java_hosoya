package e10;

import java.util.Scanner;
// 銀行口座クラスのテスト用
public class e10_05_Tester {
	public static void main(String[] args){
		// 入力機能を実体化
		Scanner stdIn = new Scanner(System.in);

		// 足立君の口座を開設する
		e10_05_Account adachi = new e10_05_Account("足立幸一", "123456", 1000);

		// 足立君の口座情報を表示する
		System.out.println("■足立君の口座");
		// 口座名義を表示
		System.out.println("　口座名義：" + adachi.getName());
		// 口座番号を表示
		System.out.println("　口座番号：" + adachi.getNo());
		// 預金残高を表示
		System.out.println("　貯金残高：" + adachi.getBalance());
		// 識別番号を表示
		System.out.println("　識別番号：" + adachi.getId());

		// 仲田君の口座を開設する
		e10_05_Account nakata = new e10_05_Account("仲田真二", "654321", 200);

		// 仲田君の口座情報を表示する
		System.out.println("■仲田君の口座");
		// 口座名義を表示
		System.out.println("　口座名義：" + nakata.getName());
		// 口座番号を表示
		System.out.println("　口座番号：" + nakata.getNo());
		// 預金残高を表示
		System.out.println("　貯金残高：" + nakata.getBalance());
		// 識別番号を表示
		System.out.println("　識別番号：" + nakata.getId());
	}
}
