import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class demo {
/*
 * �o�O���F���_���|�s��m�ޯ�Ӱ���²��}��
 * �]�����i �ҥH�N���g�{���������F
 * ���� �ڭ̭n�Ψ� java ��Robot �Ӱ��}��
 * 
 * �b�}�Ҫ��ɭԧڭ̻ݭn�t�κ޲z���v���~��b�C��������A����L 
 * �A�ݭn�����O��A�n�m���ޯ��b��������l�W
 * �U���HF1�ӥܽd 
 * */
	Robot robot = new Robot();
	int i=0;//�p�ƾ�
	int time=10;/*	
	�b�o��п�J�A�n����X���ޯ� ��ĳ�@�}�l���Ƥ��n�Ӥj �����x����A�C�C�W�[����
	*/
	
	public static void main(String[] args)  throws AWTException {
		new demo();
	}
	demo() throws AWTException{
		robot.delay(10000);//�{���|����10����~�}�l���� �нT�O�b10�������캿�_������

		while(i<time){
			//��F1
			robot.keyPress(KeyEvent.VK_F1);//��ܫ��U���� F1
			robot.delay(100);//��ܰ��y100�L��
			robot.keyRelease(KeyEvent.VK_F1);//����P�}����F1
			
			robot.delay(5000);//��ܰ��y2�� �o��Ш̷ӦU�ۻݨD�վ�ޯ�h�[����ݭn����
			
			//�����ޯ�
			robot.keyPress(KeyEvent.VK_ESCAPE);//��ܫ��U����esc
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_ESCAPE);//����P�}����esc
			
			//��ܰ����@��
			i++;
			}
	}

}
