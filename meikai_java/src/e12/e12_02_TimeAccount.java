package e12;

public class e12_02_TimeAccount extends e12_02_Account {
	// 定期預金
	private long timeBalance;
	// コンストラクタ
	e12_02_TimeAccount(String name, String no, long balance, long timeBalance){
		// クラスAccountのコンストラクタの呼び出し
		super(name, no, balance);
		// 預金残高
		this.timeBalance = timeBalance;
	}
	// 定期預金残高を調べる
	long getTimeBalance(){
		// 定期預金残高を返す
		return timeBalance;
	}
	// 定期預金を解約して普通貯金に移す
	void cancel(){
		// 普通預金に定期預金残高を預金する
		deposit(timeBalance);
		// 定期預金残高を0にする
		timeBalance = 0;
	}
}
