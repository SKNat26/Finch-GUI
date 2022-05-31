package operate;

import com.birdbraintechnologies.*;

public class Functions {
	private Finch finch;
	
	public Functions(Finch finch) {
		this.finch = finch;
	}
	//precondition = length of frequencies = length of times
	public void horn(int[] frequencies, int[] times) {
		for(int i = 0; i<frequencies.length; i++) {
			finch.buzz(frequencies[i], times[i]);
		}
	}
	//preconditions all array length must be same
	public void lightUp(int[] reds, int[] greens, int[] blues, int[] times) {
		for(int i = 0; i<reds.length; i++) {
			finch.setLED(reds[i], greens[i], blues[i], times[i]);
		}
	}
}
