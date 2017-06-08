package club;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class robot_talk extends robotfile{	
	public static void main(String[] args)throws AWTException {
		new robot_talk(null);
	}
	robot_talk(String name)throws AWTException{
		if(name.equals("aile")||name.equals("aixi")){			
			robot.delay(3000);		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.delay(100);
			click_N("�I��H��",5,730,450);
			skiptalk();
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			click_N("�I���ܮ�",2,300,635);
			skiptalk();
			
			//aile_time=Integer.valueOf(arr[0].substring(5,7));
			//aixi_time=Integer.valueOf(arr[1].substring(5,7));						
			try {
				System.out.println(talk(name));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	String talk(String name) throws IOException{
		
		if(name.equals("aixi")){
			aixi_time = saysomething(aixi,aixi_time);
			Bufwrite(aile_time,aixi_time);
			aixi_time = saysomething(aixi,aixi_time);
			Bufwrite(aile_time,aixi_time);
			aixi_time = saysomething(aixi,aixi_time);
			Bufwrite(aile_time,aixi_time);		
			click_N("����ܮ�",2,300,635);
			return "pass";
		}
		else if(name.equals("aile")){
			aile_time = saysomething(aile,aile_time);
			Bufwrite(aile_time,aixi_time);
			aile_time = saysomething(aile,aile_time);
			Bufwrite(aile_time,aixi_time);
			aile_time = saysomething(aile,aile_time);
			Bufwrite(aile_time,aixi_time);		
			click_N("����ܮ�",2,300,635);
			return "pass";
		}
		else{
			return "error";
		}	
	}
	int saysomething(int arr[],int time) throws IOException{
		/* 1.935,470
		 * 2.935,535
		 * 3.935,600
		 * 4.1100,455
		 * 5.1100,520
		 * 6.1100,585
		 * */
		int i = arr[time];
		if(i==1){
			click_N("����",2,935,470);skiptalk();
		}
		else if(i==2){
			click_N("�׽m",2,935,535);skiptalk();
		}
		else if(i==3){
			click_N("�C��",2,935,600);skiptalk();
		}		
		else if(i==4){
			click_N("����",2,1100,455);skiptalk();
		}
		else if(i==5){
			click_N("�ɩ|",2,1100,520);skiptalk();
		}
		else if(i==6){
			click_N("�ʷR",2,1100,585);skiptalk();
		}
		time++;		
		return time;
	}
	void skiptalk(){
		for(int i=0;i<7;i++){
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.delay(300);
		}
	}
}
