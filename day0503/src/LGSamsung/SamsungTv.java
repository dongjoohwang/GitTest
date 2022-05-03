package LGSamsung;

public class SamsungTv implements TV {

	@Override
	public void PowerOn() {
		System.out.println("sam~on");
	}

	@Override
	public void PowerOff() {
		System.out.println("sam~off");
	}

	@Override
	public void VolumeUp() {
		System.out.println("sam~up");
	}

	@Override
	public void VolumeDown() {
		System.out.println("sam~down");
	}
	
}
