package polymorphism;

public class SonyTV implements TV {

	public SonyTV() {
		System.out.println("SonyTV 생성자");
	}
	public void powerOn() {
		System.out.println("SonyTV--전원 켜기");
	}
	public void powerOff() {
		System.out.println("SonyTV--전원 끄기");
	}
	public void volumeUp() {
		System.out.println("SonyTV--소리 키우기");
	}
	public void volumeDown() {
		System.out.println("SonyTV--소리 낮추기");
	}
}
