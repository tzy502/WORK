package cn.list.model;

import java.sql.Date;
public class Event {
	private int Totalnum;//��������
	private int ID;//�¼����
	private String Name;//�¼����ƣ�
	private Date BeginTime;//��ʼʱ��
	private Date EndTime;//����ʱ��
	private boolean Hint;//��ʾ��ʶ��
	private boolean Complete;//��ɱ�ʶ��
	private String Place;//�ص�����
	private String Character;//��������
	private String describe;//�¼�����
	private int level;//���ȼ�
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
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getCharacter() {
		return Character;
	}
	public void setCharacter(String character) {
		Character = character;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
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
