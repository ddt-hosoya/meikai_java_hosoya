package e16;
/**
 * 範囲外例外(返却値)クラス(List16-6より）
 * @author t.hosoya
 * @since 20210127
 */
public class e16_02_ResultRangeError extends e16_02_RangeError {
	// 範囲外例外コンストラクタ
	e16_02_ResultRangeError(int n){
		// メッセージ初期化
		super(n);
	}

}