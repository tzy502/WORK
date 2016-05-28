package cn.list.waste;

import java.util.Vector;

import cn.list.control.EventManage;
import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class wastetable {
	/**
	 * @wbp.parser.entryPoint
	 */
	public void load(){
		columnNames.add("ID");
		columnNames.add( "\u59D3\u540D");
		columnNames.add("\u8D77\u59CB\u65F6\u95F4");
		columnNames.add("\u7ED3\u675F\u65F6\u95F4");
		columnNames.add("\u63CF\u8FF0");
		columnNames.add("\u662F\u5426\u63D0\u793A");
		columnNames.add("\u4F18\u5148\u7EA7");
		EventManage load =new EventManage();
		try {
			allEvent=load.LoadEvent();
		} catch (BusinessException | DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allEvent!=null)
		{
			for(int i=0;i<allEvent.size();i++)
			{
					Event event=allEvent.get(i);
					if(event.isDel()==false&&event.isComplete()==false)
					{
						Vector<Object> eventVdate = new Vector<Object>();
						eventVdate.add(event.getID());
						eventVdate.add(event.getName());
						eventVdate.add(event.getBeginTime());
						eventVdate.add(event.getEndTime());
						eventVdate.add(event.getDescribe());
						eventVdate.add(event.isHint());
						eventVdate.add(event.getLevel());
						eventData.add(eventVdate);
					}
			}
		}
		
	}
}
