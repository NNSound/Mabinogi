package club;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import club.robotfile;

public class robot_talk {
	static String[] arr = new String[2];//�ŧi�}�C ��minput����
	static int aile_time,aixi_time;
	robotfile rf =new robotfile();
	Robot robot =new Robot();
	static int aile[]= {1,3,4,3,1,3,1,1,2,1,//1~10 //���
		 2,5,2,2,4,6,2,5,1,2,//11~20
		 6,5,6,6,4,2,4,3,5,5,//21~30
		 1,1,1,2,2,2,1,4,1,1,
		 4,3,3,2,4,3,4,4,1,4,
		 2,1,1,2,2,6,6,1,2,4,
		 3,5,2,2,4,1,2,1,1,1,
		 3,2,2,3,2,1,2,1,2,5,
		 1,2,4,1,5,3,2,2,4,4,
		 1,2,4,1,1,6,4,6,2};

static int aixi[]= {4,3,5,6,5,3,6,6,3,1,//���
		 2,3,6,3,2,3,1,4,3,3,
		 3,6,3,4,3,6,1,5,3,3,
		 3,6,4,6,2,6,3,4,1,2,
		 3,3,1,6,4,6,4,3,3,6,
		 3,2,6,3,1,3,3,3,5,6,
		 3,3,1,2,6,6,3,3,3,5,
		 3,2,4,3,5,3,5,6,1,3,
		 3,6,2,3,3,5,6,1,1,5,
		 5,5,5,6,3,3,1,4,1};
	public static void main(String[] args)throws AWTException, IOException {
		new robot_talk();
	}
	robot_talk()throws AWTException, IOException{
		robot.delay(3000);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		rf.click_N("�I��H��",5,730,450);
		skiptalk();
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		rf.click_N("�I���ܮ�",2,300,635);
		skiptalk();
		
		BufRead("74club.txt");
		aile_time=Integer.valueOf(arr[0].substring(5,7));
		aixi_time=Integer.valueOf(arr[1].substring(5,7));	
		
		aile_time = saysomething(aile,aile_time);
		Bufwrite();
		aile_time = saysomething(aile,aile_time);
		Bufwrite();
		aile_time = saysomething(aile,aile_time);
		Bufwrite();
		
		rf.click_N("����ܮ�",2,300,635);
		System.out.println(aile_time);
	}
	int saysomething(int arr[],int time) throws IOException{
		/*
		 * 1.935,470
		 * 2.935,535
		 * 3.935,600
		 * 4.1100,455
		 * 5.1100,520
		 * 6.1100,585
		 * */
		int i = arr[time];
		if(i==1){
			rf.click_N("����",2,935,470);
			skiptalk();
		}
		else if(i==2){
			rf.click_N("�׽m",2,935,535);
			skiptalk();
		}
		else if(i==3){
			rf.click_N("�C��",2,935,600);
			skiptalk();
		}		
		else if(i==4){
			rf.click_N("����",2,1100,455);
			skiptalk();
		}
		else if(i==5){
			rf.click_N("�ɩ|",2,1100,520);
			skiptalk();
		}
		else if(i==6){
			rf.click_N("�ʷR",2,1100,585);
			skiptalk();
		}
		time++;
		Bufwrite();
		return time;
	}
	void skiptalk(){
		for(int i=0;i<10;i++){
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.delay(300);
		}
	}
	private static void Bufwrite() throws IOException{
		FileWriter fw = new FileWriter("74club.txt");
		fw.write("aile "+aile_time+"\naixi "+aixi_time);
		fw.flush();
		fw.close();
	}
	private static void BufRead(String Q) throws IOException{
	    FileReader fr = new FileReader(Q);//Ū���ɮ�
		BufferedReader br = new BufferedReader(fr);//Ū���ɮפ����r��
		String line;//Ū����N�檺�r��
	    int k=0;//�p�ƾ�
	    while((line = br.readLine())!=null)//���ɮפ��٦���Ʈ� �N����j��
	    {	  
	    	arr[k]= line;//�N��Ʃ��}�C	    	
	    	k++;//�p�ƾ�+1
	    }	   
	}//end BufRead

}
