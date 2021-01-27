package e16;
/**
 * 範囲外例外クラス(List16-6より）
 * @author t.hosoya
 * @since 20210127
 */
public class e16_02_RangeError extends RuntimeException{
	// 範囲外例外コンストラクタ
	e16_02_RangeError(int n){
		// メッセージ初期化
		super("範囲外の値："+ n);
	}

}
