package club;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class robotfile {
	static int aile_time_data=0,aixi_time_data=0;
	static String[] arr = new String[2];//�ŧi�}�C ��minput����

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

	Robot robot =new Robot();
	
	robotfile() throws AWTException{
		try {
			BufRead("74club.txt");
		} catch (IOException e1) {
			// TODO �۰ʲ��ͪ� catch �϶�
			e1.printStackTrace();
		}
		
		
	}
	int [] Tellarr(String name){//�^�ǰ}�C�@����ڭn�������}�C
		//���X�����W�١A�^�Ǧ����}�C
		if(name.equals("aixi"))
			return aixi;
		else if(name.equals("aile"))
			return aile;
		else
			return null;		
		}
	int telltime(String name){
		if(name.equals("aile"))
			return aile_time_data;
		else if(name.equals("aixi"))
			return aixi_time_data;
		else
			return 0;
		
	}
	String sixfeel(int i){
		String name;
		if(i==1)
			name="1.����";
		else if(i==2)
			name="2.�׽m";
		else if(i==3)
			name="3.�C��";
		else if(i==4)
			name="4.����";
		else if(i==5)
			name="5.�ɩ|";
		else 
			name="6.�ʷR";
		return name;		
	}
	void Bufwrite() throws IOException{
		FileWriter fw = new FileWriter("74club.txt");
		fw.write("aile "+aile_time_data+"\naixi "+aixi_time_data);
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
	    aile_time_data=Integer.valueOf(arr[0].substring(5,7));
		aixi_time_data=Integer.valueOf(arr[1].substring(5,7));
	}//end BufRead
	public void click_N(String A,int n,int x,int y){
		  System.out.print(A+"	"+n+"��");
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
