package cn.list.control;

import java.util.Date;

import cn.list.ui.MainUi;
import cn.list.util.BusinessException;
import cn.list.util.DbException;
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
public class Fortest {
	public static void main(String[] args) throws BusinessException, DbException {
		Date begin=new Date();
		Date end=new Date();
		end.setYear(2020);
		EventManage test=new EventManage();
		for(int i=1;i<10;i++)
			test.CreateEvent("��������"+i, begin, end, true, "��ֻ��һ������", 2);
		
}
	public static void test() throws BusinessException, DbException {
		Date begin=new Date();
		Date end=new Date();
		end.setYear(2020);
		EventManage test=new EventManage();
		for(int i=1;i<320;i++)
			test.CreateEvent("��������"+i, begin, end, true, "��ֻ��һ������", 2);
		
}
}
