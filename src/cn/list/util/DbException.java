package cn.list.util;

import cn.list.ui.ErrorHint;

public class DbException extends BaseException {
	public DbException(java.lang.Throwable ex){
		super("Êý¾Ý¿â²Ù×÷´íÎó£º"+ex.getMessage());
		ErrorHint errorhint =new ErrorHint();
		errorhint.ErrorHintUI(ex.getMessage());
	}
}
