package e02;

import java.util.Random;

/*
以下に示すプログラムを作成せよ。
・1桁の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
・1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 */
public class e02_07 {
	public static void main(String[] args){
		Random rand = new Random();

		int positive_int = rand.nextInt();

		System.out.println("1桁の正の整数は：" + positive_int);
	}

}
