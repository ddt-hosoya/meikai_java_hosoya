package e09;

import java.util.Scanner;

public class e09_03_tester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		e09_03_Day adachiOpenDay = new e09_03_Day(2019, 6, 21);

		e09_03 adachi = new e09_03("足立幸一", "123456", 1000, adachiOpenDay);

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　貯金残高：" + adachi.getBalance());
		System.out.println("　口座開設日：" + adachi.getOpenDay());
	}

}
