package e06;
/*
6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ。
 */
import java.util.Scanner;

public class e06_17 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		// 学生の人数
		final int PEOPLE_NUMBER = 6;
		// 科目数
		final int SUBJECT_NUMBER = 2;
		// インデックス表示時の調整値
		final int ADJUST_INT = 1;

		// 6人の2科目（国語・数学）の点数をいれる二次元配列を生成する
		int[][] scores = new int[PEOPLE_NUMBER][SUBJECT_NUMBER];
		// 科目名の配列を生成
		String[] subject = {"国語", "数学"};

		// 一人ひとり各科目の点数を入力
		for(int people = 0; people < PEOPLE_NUMBER; people++){
			// 科目ごとに処理を行う
			for(int subjects = 0; subjects < SUBJECT_NUMBER; subjects++){
				// 何人目の何の科目の点数を入力するのかを表示
				System.out.print((people + ADJUST_INT) + "人目の" + subject[subjects] + "の点数：");
				// 入力値を二次元配列に代入
				scores[people][subjects] = stdIn.nextInt();
			}
		}

		// 科目ごとの平均点
		for(int subjects = 0; subjects < SUBJECT_NUMBER; subjects++){
			// 科目の合計値を入れる変数を初期化
			int sumSubject = 0;
			// 科目の平均点を入れる変数を初期化
			double averageSubject = 0;
			// 全員の点数を調査し科目別に合算する
			for(int people = 0; people < PEOPLE_NUMBER; people++){
				// 点数を合計点に加算する
				sumSubject += scores[people][subjects];
				// 合計点を人数で割って平均点を求める
				averageSubject = (double)sumSubject/PEOPLE_NUMBER;
			}
			// 科目ごとの平均点を表示する
			System.out.println(subject[subjects] + "の平均点：" + averageSubject + "点");
		}

		// 学生ごとの平均点
		for(int people = 0; people < PEOPLE_NUMBER; people++){
			// 各人の合計点を入れる変数を初期化
			int sumPeople = 0;
			// 各人の平均点を入れる変数を初期化
			double averagePeople = 0;
			// 全科目の点数を調査し各人別に合算する
			for(int subjects = 0; subjects < SUBJECT_NUMBER; subjects++){
				// 点数を合計点に加算する
				sumPeople += scores[people][subjects];
				// 合計点を科目数で割って平均点を求める
				averagePeople = (double)sumPeople/SUBJECT_NUMBER;
			}
			// 各人の平均点を表示する
			System.out.println((people + ADJUST_INT) + "人目の平均点：" + averagePeople + "点");
		}
	}
}

