package e09;
/*
第8章で作成した《銀行口座クラス(第2版)》に、口座開設日のフィールドとtoStringメソッドを追加せよ。
※コンストラクタを変更したり口座開設日のゲッタ(口座開設日フィールドが参照する日付インスタンスのコピーを返す)
などのメソッドを追加したりすること。
 */
// 銀行口座クラス
public class e09_03 {
	private String name;
	private String no;
	private long balance;
	private e09_03_Day openDay;

	// コンストラクタ
	public e09_03(String name, String no, long balance, e09_03_Day openDay){
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new e09_03_Day(openDay);
	}

	// 口座名義を調べる
	public String getName(){
		return name;
	}
	// 口座番号を調べる
	public String getNo(){
		return no;
	}
	// 貯金残高を調べる
	public long getBalance(){
		return balance;
	}
	// 口座開設日を調べる
	public e09_03_Day getOpenDay(){
		openDay = new e09_03_Day(openDay);
		return openDay;
	}
	// k円預ける
	public void deposit(long k){
		balance += k;
	}
	// k円おろす
	public void withdraw(long k){
		balance -= k;
	}

}
