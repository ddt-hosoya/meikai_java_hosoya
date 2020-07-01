package e10;
import java.util.Scanner;

public class e10_02_Tester {
	public static void main(String[] args){
		// 入力機能の実体化
		Scanner stdIn = new Scanner(System.in);

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());
		// インスタンス生成
		e10_02_ExId a = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());
		// インスタンス生成
		e10_02_ExId b = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());
		// インスタンス生成
		e10_02_ExId c = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());

		// 識別番号の増加間隔を変更値の入力を促す
		System.out.print("識別番号の増加間隔：");
		// 入力値を識別番号の増加間隔とする
		int changeN = stdIn.nextInt();
		// 識別番号の増加間隔変更値を表示
		System.out.printf("識別番号の増加間隔%dを%dに変更します。\n", e10_02_ExId.getN(), changeN);
		// 識別番号の増加間隔を変更
		e10_02_ExId.setN(changeN);

		// インスタンス生成
		e10_02_ExId d = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());
		// インスタンス生成
		e10_02_ExId e = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());
		// インスタンス生成
		e10_02_ExId f = new e10_02_ExId();

		// 識別番号をどこまで与えているか表示
		System.out.println("最後に与えた識別番号：" + e10_02_ExId.getMaxId());


		// aの識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		// bの識別番号を表示
		System.out.println("bの識別番号：" + b.getId());
		// cの識別番号を表示
		System.out.println("bの識別番号：" + c.getId());
		// dの識別番号を表示
		System.out.println("dの識別番号：" + d.getId());
		// eの識別番号を表示
		System.out.println("eの識別番号：" + e.getId());
		// fの識別番号を表示
		System.out.println("fの識別番号：" + f.getId());

	}
}
