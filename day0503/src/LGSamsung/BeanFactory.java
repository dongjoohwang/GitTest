package LGSamsung;

public class BeanFactory {

	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTv();
		} else if (beanName.equals("LGTV")) {
			return new LGTV();
		}
		return null;
	}
}
