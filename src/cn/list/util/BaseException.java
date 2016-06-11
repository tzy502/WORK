package cn.list.util;

import cn.list.ui.ErrorHint;

public class BaseException  extends Exception {
	public BaseException(String msg){
		super(msg);
		ErrorHint errorhint =new ErrorHint();
		errorhint.ErrorHintUI(msg);
	}
}
