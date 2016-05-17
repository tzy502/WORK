package cn.list.workinterface;

import cn.list.model.Event;

public interface IEvent {
	public void CreateEvent(int ID);
	public void AddEvent(int ID);
	public void DelEvent(int ID);
	public void ModifyEvent(int ID);
	public Event SerchEvent(int ID);
}
