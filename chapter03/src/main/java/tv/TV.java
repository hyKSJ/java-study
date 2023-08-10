package tv;

public class TV {
	private int channel; // 1 ~ 255
	private int volume; // 0 ~ 100
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		power = on;
	}

	public void channel(int channel) {
		if (this.power) {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (this.power) {

			if (up) {
				this.channel += 1;
			} else {
				this.channel -= 1;
			}
		}
	}

	public void volume(int volume) {
		if (this.power) {
			this.volume = volume;
			
		}
	}

	public void volume(boolean up) {
		if (this.power) {
			if (up) {
				this.volume += 1;
			} else {
				this.volume -= 1;
			}
			
		}
	}

	public void status() {
		System.out.println("TV[power=" + (power ? "on" : "off") + ", channel=" + channel + ", volume=" + volume + "]");
	}
}
