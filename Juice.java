package liquids;

public class Juice {

	private int volume; //ml

	public Juice() {}

	public Juice(int volume) {
		setVolume(volume);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
