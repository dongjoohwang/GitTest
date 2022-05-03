package LGSamsung;

public class TvUser {

	public static void main(String[] args) {
		
//		LGTV tv2 = new LGTV();
//		tv2.PowerOn();
//		tv2.PowerOff();
//		tv2.VolumeUp();
//		tv2.VolumeDown();
		
		BeanFactory fac = new BeanFactory();
		TV tv = (TV)fac.getBean(args[0]);
		tv.PowerOn();
		tv.PowerOff();
		tv.VolumeUp();
		tv.VolumeDown();
	}

}
