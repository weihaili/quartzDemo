package org.cn.kkl.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobTest {

	public void doJob(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("time is : "+format.format(new Date()));
	}
}
