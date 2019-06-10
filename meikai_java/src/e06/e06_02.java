package e06;
/*
要素型がint型で要素数が5の配列の要素に対して、先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。
 */
public class e06_02 {
	public static void main(String[] args){
		// 要素型がint型で要素数が5の配列を生成
		int[] intArray = new int[5];
		// 各要素に代入する値を要素数の5で初期化
		int assignValue = intArray.length;

		// 要素の数だけ代入と表示の処理を繰り返す
		for(int valueNumber = 0; valueNumber < intArray.length; valueNumber++){
			// 要素に対して要素数の5から1までを代入する
			intArray[valueNumber] = assignValue--;
			// 要素の値を表示
			System.out.println("intArray[" + valueNumber + "] = " + intArray[valueNumber]);
		}
	}
}
