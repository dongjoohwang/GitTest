package polymorphism;

public class LGTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public LGTV() {
		System.out.println("LGTV 생성자(디폴트)");
	}
	
	public LGTV(Speaker speaker, int price) {
		System.out.println("LGTV 생성자(1개)");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("LGTV--전원 켜기. (가격 : " + price + ")");
	}
	public void powerOff() {
		System.out.println("LGTV--전원 끄기");
	}
	public void volumeUp() {
//		System.out.println("LGTV--소리 키우기");
		speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("LGTV--소리 낮추기");
		speaker.volumeDown();
	}
}
