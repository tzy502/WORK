package cn.list.model;

import java.sql.Date;
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
//���Ҳ��Ҫ������ȥ��������������������������
public class Tip {
	private int Totalnum;//��������
	private int ID;//�¼����
	private String Name;//�¼����ƣ�
	private Date BeginTime;//��ʼʱ��
	private Date EndTime;//����ʱ��
	private boolean Hint;//��ʾ��ʶ��
	private boolean Complete;//��ɱ�ʶ��
	private String describe;//�¼�����
	private boolean del;//ɾ����ʶ��
	private boolean change;//�޸ı�ʶ��	
	public int getTotalnum() {
		return Totalnum;
	}
	public void setTotalnum(int totalnum) {
		Totalnum = totalnum;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBeginTime() {
		return BeginTime;
	}
	public void setBeginTime(Date beginTime) {
		BeginTime = beginTime;
	}
	public Date getEndTime() {
		return EndTime;
	}
	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
	public boolean isHint() {
		return Hint;
	}
	public void setHint(boolean hint) {
		Hint = hint;
	}
	public boolean isComplete() {
		return Complete;
	}
	public void setComplete(boolean complete) {
		Complete = complete;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public boolean isDel() {
		return del;
	}
	public void setDel(boolean del) {
		this.del = del;
	}
	public boolean isChange() {
		return change;
	}
	public void setChange(boolean change) {
		this.change = change;
	}
	
}
