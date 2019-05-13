package e03;

/*
List 3-5の最後のelseをelse if (n == 0)に変更したらどうなるかを検討せよ。
 */
import java.util.Scanner;

public class e03_03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0) {
			System.out.println("その値は正です。");
		} else if (n < 0) {
			System.out.println("その値は負です。");
		} else if (n == 0) {
			System.out.println("その値は0です。");
		}
	}

}
/*
 * 最後のelseを通る条件はn == 0しか無いためelse if (n == 0)としても 変更前と同等の結果が得られると考えられる。
 */
