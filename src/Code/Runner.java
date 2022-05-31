package Code;

import com.birdbraintechnologies.Finch;
import automatic.Responses;
import gui.*;
import operate.*;

public class Runner{
   public static void main(final String[] args){
	  Finch FINCH = new Finch();
	  Drive DRIVE = new Drive(FINCH);
	  Functions FUNCTIONS = new Functions(FINCH);
	  Responses RESPONSES = new Responses(FINCH);
	  Controller CONTROLLER = new Controller();
	  KeySetter KEYSETTER = new KeySetter(CONTROLLER, DRIVE, RESPONSES, FUNCTIONS);
	  
	  KEYSETTER.keyDrive();
	   
	  FINCH.quit();
      System.exit(0);
   }
}

