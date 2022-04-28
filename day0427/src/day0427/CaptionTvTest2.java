package day0427;

import lombok.Getter;
import lombok.Setter;

class Tv2 {
	private boolean power;
	private int channel;
	
//	public Tv2() {
//		this(false,0);
//	}
//	
//	public Tv2(int channel) {
//		this(false,channel);
//	}
//	
	public Tv2(int channel, boolean power) {
		this.channel = channel;
		this.power = power;
	}
	
	int getChannel() {
		return channel;
	}

//	boolean getPower() {
//		return power;
//	}
	
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
				
//		public CaptionTv2() {
//			this(false,0,false);
//		}
//		
		public CaptionTv2(int channel, boolean caption) {
			this(false,channel,caption);
		}	
		
		public CaptionTv2(boolean power, int channel, boolean caption) {
			super(channel, power);
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












