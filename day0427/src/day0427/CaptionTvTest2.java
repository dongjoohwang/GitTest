package day0427;

import lombok.Getter;
import lombok.Setter;

class Tv2 {
	private boolean power;
	private int channel;
	
	public Tv2() {}
	
	public Tv2(int channel) {
		this.channel = channel;
	}
	
	public Tv2(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}
	
	int getChannel() {
		return channel;
	}

	boolean getPower() {
		return power;
	}
	
	void power() {
		power = !power;
	} 
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
	class CaptionTv2 extends Tv2 {
		private boolean caption;
				
		public CaptionTv2() {}
		
		public CaptionTv2(int channel, boolean caption) {
			super(channel);
			this.caption = caption;
		}	
		
		public CaptionTv2(boolean power, int channel, boolean caption) {
			super(power, channel);
			this.caption = caption;
		}
		
		void displayCaption(String text) {
			if (caption) {
				System.out.println(text);	
		}
	}
}

class CaptionTvTest2 {

	public static void main(String[] args) {
		
		CaptionTv2 tv = new CaptionTv2(10,true);
		
		tv.channelUp();
		System.out.println(tv.getChannel());
		tv.displayCaption("hello world");
		
	}

}












