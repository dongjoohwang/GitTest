package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("==> SonySpaeker 객체 생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker---소리 키우기");
	}
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker---소리 낮추기");
	}
}
