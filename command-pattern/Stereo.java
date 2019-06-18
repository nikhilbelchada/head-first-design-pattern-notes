public class Stereo {
	String name;

	public Stereo(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " Stereo on");
	}

	public void setCD() {
		System.out.println(name + " Stereo CD in");
	}

	public void setVolume(int value) {
		System.out.println(name + " Stereo volume set to:" + value);
	}
}
