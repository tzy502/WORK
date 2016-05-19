package cn.list.model;

import java.sql.Date;
public class Event {
	private int Totalnum;//数据总数
	private int ID;//事件编号
	private String Name;//事件名称；
	private Date BeginTime;//起始时间
	private Date EndTime;//结束时间
	private boolean Hint;//提示标识符
	private boolean Complete;//完成标识符
	private String Place;//地点描述
	private String Character;//人物描述
	private String describe;//事件描述
	private int level;//优先级
	private boolean del;//删除标识符
	private boolean change;//修改标识符
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
