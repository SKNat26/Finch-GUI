package operate;

import com.birdbraintechnologies.Finch;

public class Drive {
	private Finch finch;
	private int velocity;

	public Drive(Finch finch){
		this.finch = finch;
		this.velocity = 100;
	}

	public void drive() {
		finch.setWheelVelocities(velocity, velocity, 10);
	}
	public void turnLeft() {
		finch.setWheelVelocities(-velocity, velocity, 10);
	}
	public void turnRight() {
		finch.setWheelVelocities(velocity, -velocity, 10);
	}
	public void back() {
		finch.setWheelVelocities(-velocity, -velocity, 10);
	}
	public void shiftGear () {
		velocity = 255;
	}
	public void unShiftGear() {
		velocity = 100;
	}
	
}