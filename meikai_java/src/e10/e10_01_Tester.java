package e10;
// 連番クラステスト用クラス
public class e10_01_Tester {
	public static void main(String[] args){
		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_01_Id.getMaxId());
		// インスタンス生成
		e10_01_Id a = new e10_01_Id();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_01_Id.getMaxId());
		// インスタンス生成
		e10_01_Id b = new e10_01_Id();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_01_Id.getMaxId());
		// インスタンス生成
		e10_01_Id c = new e10_01_Id();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_01_Id.getMaxId());


		// aの識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		// bの識別番号を表示
		System.out.println("bの識別番号：" + b.getId());
		// cの識別番号を表示
		System.out.println("bの識別番号：" + c.getId());

	}
}
