package music;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class robot_music {
	Robot robot = new Robot();
	int i=0;
	static long time1,time2;
	public static void main(String[] args)  throws AWTException{
		// TODO 自動產生的方法 Stub
		new robot_music();
	}
	robot_music() throws AWTException{
		System.out.println("GG");
		robot.delay(3000);	
		//MMH();//1重擊
		//MMM();//2猛擊
		//mm(100);//100次音樂
		
		bot2();
		//musicP();//分身評價
		//gun();//練槍
		//sell();//地成擺攤


		//shut();
			}
	void bot2(){
		while(true){		
		robot.keyPress(KeyEvent.VK_F11);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_F11);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_F11);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_F11);
		robot.delay(21500);
		}
	}
	void bot(){
		while(i<46){

//		robot.keyPress(KeyEvent.VK_1);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_1);
//		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_2);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_2);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_2);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_2);
		robot.delay(4000);
		
		time1 = System.currentTimeMillis();
		
//		robot.keyPress(KeyEvent.VK_3);
//		robot.delay(3000);
//		robot.keyRelease(KeyEvent.VK_3);
//		robot.delay(5000);
//		
//		robot.keyPress(KeyEvent.VK_1);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_1);
//		robot.delay(100);
//
//		robot.keyPress(KeyEvent.VK_7);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_7);
//		robot.delay(3000);
//		esc();
		
//		robot.keyPress(KeyEvent.VK_5);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_5);
//		robot.delay(3000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_5);
//		robot.delay(100);
//		robot.keyRelease(KeyEvent.VK_5);
//		robot.delay(3000);
		
		robot.delay(22000);
		time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		i++;
		}
	}
	void MMM(){
		while(true){
		robot.keyPress(KeyEvent.VK_2);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_2);
		robot.delay(300);
		System.out.println("end");
		}
	}
	void MMH(){
		while(true){
		robot.keyPress(KeyEvent.VK_1);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_1);
		robot.delay(1000);
		System.out.println("end");
		}
	}
	void mm(int k){
		while(i<k){//
			robot.delay(1000);
			System.out.print(i+"start\t");
			robot.keyPress(KeyEvent.VK_F1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F1);
			robot.delay(60000);
			robot.delay(10000);
			System.out.println("end");

			i++;
			}
	}
	void musicP(){
		while(i<100){//分身評價
			robot.keyPress(KeyEvent.VK_F1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F1);
			robot.delay(2000);
			esc();
			robot.keyPress(KeyEvent.VK_F2);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F2);
			robot.delay(2000);
			esc();
			robot.delay(8000);
			i++;
			}
	}
	void sell(){
		click_N("點開",2,1300,200);
		while(true){
			robot.delay(60000);	//
			i++;
			if(i==16){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension screenSize = toolkit.getScreenSize();
				Rectangle screenRect = new Rectangle(screenSize);
				BufferedImage picture = robot.createScreenCapture(screenRect);
				try {
					ImageIO.write(picture, "jpg", new File("前"+i+".jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}

				robot.delay(3000);	//1300.200
				click_N("點開",1,1300,200);
				
				BufferedImage picture2 = robot.createScreenCapture(screenRect);
				try {
					ImageIO.write(picture2, "jpg", new File("後"+i+".jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				i=0;
			}
			System.out.println(i);	
		}
	}void gun(){
		//time1 = System.currentTimeMillis();
		while(true){
			
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(500);
		click_N("att",2,730,450);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_1);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_1);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_1);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_1);
		robot.delay(2000);
	

		robot.keyPress(KeyEvent.VK_2);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_2);
		robot.delay(4000);

		robot.keyPress(KeyEvent.VK_3);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_3);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_3);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_3);
		robot.delay(3000);
		
		
		robot.keyPress(KeyEvent.VK_4);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_4);
		robot.delay(1500);
		esc();
		
		att();
		/*
		robot.keyPress(KeyEvent.VK_5);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_5);
		robot.delay(2500);
	*/
		}
	}
	void gunandsoart(){
		while(true){
			
			robot.keyPress(KeyEvent.VK_F1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F1);
			robot.delay(100);
			ctrl();
			robot.keyPress(KeyEvent.VK_F1);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F1);
			robot.delay(2000);		
			robot.keyRelease(KeyEvent.VK_CONTROL);

			

			robot.keyPress(KeyEvent.VK_F2);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F2);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_F2);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F2);
			robot.delay(3500);	
			//esc();
			//att();

			robot.keyPress(KeyEvent.VK_F3);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F3);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_F3);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F3);
			robot.delay(500);	
			click_N("彈雨",2,650,85);
			click_N("彈雨",2,650,385);

			robot.delay(5000);
			
			robot.keyPress(KeyEvent.VK_F4);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_F4);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F4);
			robot.delay(3000);	
			
			robot.keyPress(KeyEvent.VK_F5);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F5);
			robot.delay(100);
			ctrl();
			robot.keyPress(KeyEvent.VK_F5);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F5);
			robot.delay(2500);		
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			
			robot.keyPress(KeyEvent.VK_F6);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F6);
			robot.delay(1500);
			robot.keyPress(KeyEvent.VK_F6);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F6);
			robot.delay(5000);	
			
			
			robot.keyPress(KeyEvent.VK_F7);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_F7);
			robot.delay(2000);	
			esc();
			/*
			if(i%28==0){
				robot.keyPress(KeyEvent.VK_K);
				robot.delay(100);
				robot.keyRelease(KeyEvent.VK_K);
			}
			*/
			System.out.println(i+"\tend");
			i++;
		}
	}
	void ctrl(){
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		//click_N("ATT",1,650,85);					
		//robot.delay(500);

	}
	void att(){
		robot.keyPress(KeyEvent.VK_F2);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_F2);
		robot.delay(500);	
	}
	void esc(){
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}
	public void leftClick(){
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	}
	public void click_N(String A,int n,int x,int y){
		  System.out.print(A+"	"+n+"次");
		  robot.mouseMove(x,y);
		  for(int i=0;i<n;i++){
			  leftClick();
			  robot.delay(300);
		  }
		  System.out.println("end");
	}	
	public void slied(int x,int y,int x2,int y2){//z 終點
		  robot.mouseMove(x,y);//起始位置
		  robot.mousePress(InputEvent.BUTTON1_MASK);
		  for(int i=x;i>x2;i=i-30){
			  robot.mouseMove(x,i);
			  robot.delay(100);
		  }
		  for(int i=y;i>y2;i=i-30){
			  robot.mouseMove(i,y);
			  robot.delay(100);
		  }
		  robot.mouseRelease(InputEvent.BUTTON1_MASK); 
	}
	void shut(){
		Runtime rt = Runtime.getRuntime();
        try {
                Process ps = rt.exec(
                   "C:\\WINDOWS\\system32\\shutdown.exe -s -t 600");
        }catch(Exception e) {
                e.printStackTrace();
        }
	}
}
