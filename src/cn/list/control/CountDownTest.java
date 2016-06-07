package cn.list.control;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import cn.list.model.Event;

public class CountDownTest {

	@Test
	public void test() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String  sdate="2016/6/7 23:45:00";
		Date date=sdf.parse(sdate);
		Event event=new Event();
		event.setEndTime(date);
		System.out.println(event.getEndTime());
		CountDown cd=new CountDown();
		Thread t = new Thread(cd);
		t.start();
		
	}

}
