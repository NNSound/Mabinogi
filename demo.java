import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class demo {
/*
 * 這是為了瑪奇公會新手練技能而做的簡單腳本
 * 因為我懶 所以就不寫程式窗介面了
 * 首先 我們要用到 java 的Robot 來做腳本
 * 
 * 在開啟的時候我們需要系統管理員權限才能在遊戲中控制你的鍵盤 
 * 你需要做的是把你要練的技能放在對應的位子上
 * 下面以F1來示範 
 * */
	Robot robot = new Robot();
	int i=0;//計數器
	int time=10;/*	
	在這邊請輸入你要執行幾次技能 建議一開始次數不要太大 等熟悉之後再慢慢增加次數
	*/
	
	public static void main(String[] args)  throws AWTException {
		new demo();
	}
	demo() throws AWTException{
		robot.delay(10000);//程式會等待10秒之後才開始執行 請確保在10秒內切換到瑪奇的視窗

		while(i<time){
			//按F1
			robot.keyPress(KeyEvent.VK_F1);//表示按下按鍵 F1
			robot.delay(100);//表示停頓100微渺
			robot.keyRelease(KeyEvent.VK_F1);//表示鬆開按鍵F1
			
			robot.delay(5000);//表示停頓2秒 這邊請依照各自需求調整技能多久之後需要取消
			
			//取消技能
			robot.keyPress(KeyEvent.VK_ESCAPE);//表示按下按鍵esc
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_ESCAPE);//表示鬆開按鍵esc
			
			//表示做完一次
			i++;
			}
	}

}
