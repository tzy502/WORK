package cn.list.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;
import cn.list.control.*;
public class SortEvent {

	List<Event> TotalEvent=new ArrayList<Event>();
	Event event=new Event();
	EventManage eventmanage =new EventManage();
	public List<Event>  SortEventEnd() throws BusinessException, DbException{
		TotalEvent=eventmanage.LoadEventOrderbyID();
		int i;
		for(i=TotalEvent.size()-1;i>0;--i){
			for(int j=0;j<i;++j){
				if(TotalEvent.get(j).getEndTime().after(TotalEvent.get(j+1).getEndTime())){
					event=TotalEvent.get(j);
					TotalEvent.set(j, TotalEvent.get(j+1));
					TotalEvent.set(j+1, event);		
					System.out.println("true");
				}
			}
		}
		for(i=0;i<TotalEvent.size();i++){
			System.out.println(TotalEvent.get(i).getID());
		}
		return TotalEvent;
	}
	public static void main(String[] args){
		
		try {
			new SortEvent().SortEventEnd();
		} catch (BusinessException | DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
