package cn.list.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
	private String Describe;//�¼�����
	private int Level;//���ȼ�
	private boolean Del;//ɾ����ʶ��
	private boolean Change;//�޸ı�ʶ��
	
	public static boolean  Flag=true;//���б�ʶ��
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
		return Describe;
	}
	public void setDescribe(String describe) {
		this.Describe = describe;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		this.Level = level;
	}
	public boolean isDel() {
		return Del;
	}
	public void setDel(boolean del) {
		this.Del = del;
	}
	public boolean isChange() {
		return Change;
	}
	public void setChange(boolean change) {
		this.Change = change;
	}
	
}
