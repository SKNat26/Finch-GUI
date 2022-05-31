package automatic;

import com.birdbraintechnologies.*;

public class Responses {
	private Finch finch;
	
	public Responses(Finch finch) {
		this.finch = finch;
	}
	
	public boolean objectInFront(int frequency, int time, int r, int g, int b) {
		if(finch.isObstacleLeftSide() && finch.isObstacleRightSide()) {
			finch.buzz(frequency, time);
			finch.setLED(r, g, b);
			return true;
		}
		return false;
	}
}
