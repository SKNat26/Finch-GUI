package gui;

import operate.Drive;
import automatic.Responses;
import operate.Functions;

public class KeySetter {
	private Controller controller;
	private Drive drive;
	private Responses responses;
	private Functions functions;

	public KeySetter(Controller c, Drive d, Responses r, Functions f) {
		this.controller = c;
		this.drive = d;
		this.responses = r;
		this.functions = f;
	}

	public void keyDrive() {
		char s;
		do {
			s = controller.getDirection();
			int[] frequencies;
			int[] times;
			switch(s) {
				case 'w':
					frequencies = new int[1];
					frequencies[0] = 500;
					times = new int[1];
					times[0] = 100;
					drive.drive();
					functions.horn(frequencies, times);
					break;
				case 'a':
					frequencies = new int[1];
					frequencies[0] = 500;
					times = new int[1];
					times[0] = 100;
					drive.turnLeft();
					functions.horn(frequencies, times);
					break;
				case 's':
					frequencies = new int[1];
					frequencies[0] = 500;
					times = new int[1];
					times[0] = 100;
					drive.back();
					functions.horn(frequencies, times);
					break;
				case 'd':
					frequencies = new int[1];
					frequencies[0] = 500;
					times = new int[1];
					times[0] = 100;
					drive.turnRight();
					functions.horn(frequencies, times);
					break;
				case 'k':
					frequencies = new int[1];
					frequencies[0] = 700;
					times = new int[1];
					times[0] = 100;
					drive.shiftGear();
					functions.horn(frequencies, times);
				case 'l':
					drive.unShiftGear();
			}
			if(responses.objectInFront(10000, 10, 255, 0, 0)){
				drive.back();
			}
			
		} while(s != 'q');
	}
}
