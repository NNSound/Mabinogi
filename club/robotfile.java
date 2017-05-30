package club;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class robotfile {
	Robot robot =new Robot();
	robotfile() throws AWTException{		
	}
	public void click_N(String A,int n,int x,int y){
		  System.out.print(A+"	"+n+"¦¸");
		  robot.mouseMove(x,y);
		  for(int i=0;i<n;i++){
			  leftClick();
			  robot.delay(300);
		  }
		  System.out.println("end");
	}	
	public void leftClick(){
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	}
	
}
