package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;	// speaker : 부분 객체(samsungTV와 다른 TV에 사용되는 객체)
	private int price;

	public SamsungTV() {
		System.out.println("samsungTV 객체 생성(default)");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	
	// 집합 관계 -> speaker를 samsungTV를 포함한 다른 TV들과 공유한다
	// 삼성 tv와 스피커가 연관관계를 맺고 있으면서도 다른 객체에게 스피커를 공유할 수 있다.
	// 스피커 외부 주입 => 삼성 TV가 어느 시점에 소멸되더라도 삼성 TV의 생명주기는 스피커 생명주기에 영향을 끼칠 수 없다.
	public SamsungTV(Speaker speaker) {	// samsungTv : 전체 객체(speaker의 기능을 사용하는 객체)
		System.out.println("samsungTV 생성자(1개)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("samsungTV 생성자(2개)");
		this.speaker = speaker;
		this.price = price;
	}
	
	void AAA() {
		System.out.println("AAA 초기화 메소드");
	}
	void BBB() {
		System.out.println("BBB 소멸 전 메소드");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV--전원 켜기. (가격 : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV--전원 끄기.");
	}
	public void volumeUp() {
//		System.out.println("SamsungTV--소리 키우기");
//		speaker = new SonySpeaker();	합성 관계 : SamsungTV 생성자가 없을 경우
										// 내부에서 객체 생성 => 스피커를 다른 클래스와 공유할 수 없음
										// 자기 스스로 스피커 객체 생성 => 삼성 tv 객체가 생성될 때 스피커 객체가 생성되며,
										// 삼성TV 객체가 소멸될 때 스피커 객체도 소멸된다.
		speaker.volumeUp();		
	} 
	public void volumeDown() {
//		System.out.println("SamsungTV--소리 낮추기");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}










