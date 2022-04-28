package day0427;

import lombok.Getter;
import lombok.Setter;

class Tv {
	private boolean power;
	private int channel;
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
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
	class CaptionTv extends Tv {
		private boolean caption;
				
		public boolean isCaption() {
			return caption;
		}

		public void setCaption(boolean caption) {
			this.caption = caption;
		}

		void displayCaption(String text) {
			if (caption) {
				System.out.println(text);	
		}
	}
}

class CaptionTvTest {

	public static void main(String[] args) {
		
		CaptionTv tv = new CaptionTv();
		tv.setChannel(10);
		tv.channelUp();
		System.out.println(tv.getChannel());
		tv.setCaption(true);
		tv.displayCaption("hello world");
	}

}












