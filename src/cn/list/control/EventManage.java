package cn.list.control;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import cn.list.model.Event;
import cn.list.workinterface.IEvent;

public class EventManage implements IEvent {

	@Override
    public void CreateEvent(int ID) {
		// �������¼�
		 Scanner a=new Scanner(System.in); 
		 int i=0;
		 Event event=new Event();
		 
		 System.out.print("�¼����ƣ�");
		 String name = a.nextLine();
		 event.setName(name);//�¼�����
		 System.out.print("��ʼʱ�䣨����-Сʱ:���ӣ���");
		 SimpleDateFormat df = new SimpleDateFormat("dd-HH:mm"); 
		 String begintimetext=a.nextLine();
		 Date begintime;
		 
//		 i=a.nextInt();
		 System.out.println("�¼����ƣ�"+event.getName());
	}

	@Override
	public void AddEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DelEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ModifyEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Event SerchEvent(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		//����
		EventManage a=new EventManage();
		a.CreateEvent(1);
	}
}
