package cn.list.util;

import cn.list.ui.ErrorHint;

public class BusinessException extends BaseException {
	String str;
	public BusinessException(String msg){
		super(msg);
		ErrorHint errorhint =new ErrorHint();
		errorhint.ErrorHintUI(msg);
	} 

}
