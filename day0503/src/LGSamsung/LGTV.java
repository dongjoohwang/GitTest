package LGSamsung;

public class LGTV implements TV {

	@Override
	public void PowerOn() {
		System.out.println("LG~on");
	}

	@Override
	public void PowerOff() {
		System.out.println("LG~off");
	}

	@Override
	public void VolumeUp() {
		System.out.println("LG~up");
	}

	@Override
	public void VolumeDown() {
		System.out.println("LG~down");
	}

}
