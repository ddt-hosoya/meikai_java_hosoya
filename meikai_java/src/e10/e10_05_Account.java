package e10;
/*
インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、
銀行口座クラスAcountを変更せよ。表示はインスタンス初期化子で行うこと。
 */
public class e10_05_Account {
	// クラス変数
	// 識別番号何番まで与えたか
	private static int counter = 0;
	// インスタンス変数
	// 名前
	private String name;
	// 口座番号
	private String no;
	// 預金残高
	private long balance;
	// 識別番号
	private int id;

	// インスタンス初期化子
	{
		// idを与える
		id = ++counter;
		// インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示する
		System.out.println("明解銀行での口座開設ありがとうございます。");

	}
	// コンストラクタ
	public e10_05_Account(String n, String num, long z){
		// 名前をいれる
		name = n;
		// 口座番号をいれる
		no = num;
		// 預金残高
		balance = z;
	}
	// 名前を調べる
	public String getName(){
		// 名前を返す
		return name;
	}
	// 口座番号を調べる
	public String getNo(){
		// 口座番号を返す
		return no;
	}
	// 預金残高を調べる
	public long getBalance(){
		// 預金残高を返す
		return balance;
	}
	// 識別番号を調べる
	public int getId(){
		// 識別番号を返す
		return id;
	}
	// k円預ける
	public void deposit(long k){
		// 預金残高にkを加算
		balance += k;
	}
	// k円おろす
	public void withdraw(long k){
		// 預金残高からkを引く
		balance -= k;
	}

}
