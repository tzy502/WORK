package cn.list.workinterface;

import cn.list.model.Tip;

public interface ITip {
	public void CreateTip();
	public void BuildTip(int ID);
	public void DelTip(int ID);
	public void ModifyTip(int ID);	
	public Tip SearchTip(int ID);
}
