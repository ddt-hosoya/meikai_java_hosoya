package e09;

import java.util.Scanner;

public class e09_03_tester {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		e09_03_Day adachiOpenDay = new e09_03_Day(2019, 6, 21);

		e09_03 adachi = new e09_03("足立幸一", "123456", 1000, adachiOpenDay);

		//足立君の口座情報を表示
		System.out.println("■足立君の口座");
		System.out.println(adachi.toString());

		//足立君の口座情報を更新
		adachi.deposit(50000);
		adachi.withdraw(9200);

		//足立君の口座情報をもう一度表示
		System.out.println("■更新後の足立君の口座");
		System.out.println(adachi.toString());
	}

}
