package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		} else if(beanName.equals("lg")) {
			return new LGTV();
		} else if(beanName.equals("sony")) {
			return new SonyTV();
		}
		return null;
		
	}
}
