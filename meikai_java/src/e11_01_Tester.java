
import e11.e11_01_DateId;
// DateIdクラステスト用
public class e11_01_Tester {
	public static void main(String[] args){
		// DateIdクラスaを実体化
		e11_01_DateId a = new e11_01_DateId();
		// DateIdクラスbを実体化
		e11_01_DateId b = new e11_01_DateId();
		// DateIdクラスcを実体化
		e11_01_DateId c = new e11_01_DateId();

		// aの識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		// bの識別番号を表示
		System.out.println("bの識別番号：" + b.getId());
		// cの識別番号を表示
		System.out.println("cの識別番号：" + c.getId());
	}
}
