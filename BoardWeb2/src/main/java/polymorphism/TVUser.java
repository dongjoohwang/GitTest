package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {

		AbstractApplicationContext factory 
		= new GenericXmlApplicationContext("applicationContext.xml");
		
//		SamsungTV s1 = new SamsungTV();
		
		TV tv = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv2");
//		TV tv3 = (TV)factory.getBean("tv");
//		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		factory.close();
	}
}
