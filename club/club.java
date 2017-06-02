package club;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class club extends JFrame {
/*p
 * 每個角色應該有各自的計數器 放在外部文件
 * 內部應有陣列存放騎士團表格供GUI參照
 * 每次觸發btn時應即時更改外部文件
 * 

	
	如果點到97之後，會回去表格一開始的位置
但是這是有條件的
(例：第一天 95(O)→96(O)→97(O)→ 第二天 1(O)→2(O)→3(O)→ ...
(例：第一天 96(O)→97(O)→98(O)→ 第二天 2(O)→3(O)→4(O)→ ...
(例：第一天 97(O)→98(O)→99(O)→ 第二天 3(O)→4(O)→5(O)→ ...
(例：第一天 97(O)→98(O)→結束)→ 第二天 2(O)→3(O)→4(O)→ ...
(例：第一天 97(O)→98(O)→99(X)→ 第二天 2(O)→3(O)→4(O)→ ...
(例：第一天 97(O)→98(X)→結束)→ 第二天 1(O)→2(O)→3(O)→ ...
(例：第一天 96(O)→97(O)→結束)→ 第二天 1(O)→2(O)→3(O)→ ...
(例：第一天 97(O)→結束98(X)→)→ 第二天 1(O)→2(O)→3(O)→ ...)

 */
	static String[] arr = new String[2];//宣告陣列 放置input的值
	static int aile_time,aixi_time;
	static int aile[]= {1,3,4,3,1,3,1,1,2,1,//1~10 //艾樂
				 2,5,2,2,4,6,2,5,1,2,//11~20
				 6,5,6,6,4,2,4,3,5,5,//21~30
				 1,1,1,2,2,2,1,4,1,1,
				 4,3,3,2,4,3,4,4,1,4,
				 2,1,1,2,2,6,6,1,2,4,
				 3,5,2,2,4,1,2,1,1,1,
				 3,2,2,3,2,1,2,1,2,5,
				 1,2,4,1,5,3,2,2,4,4,
				 1,2,4,1,1,6,4,6,2};
	
	static int aixi[]= {4,3,5,6,5,3,6,6,3,1,//艾希
				 2,3,6,3,2,3,1,4,3,3,
				 3,6,3,4,3,6,1,5,3,3,
				 3,6,4,6,2,6,3,4,1,2,
				 3,3,1,6,4,6,4,3,3,6,
				 3,2,6,3,1,3,3,3,5,6,
				 3,3,1,2,6,6,3,3,3,5,
				 3,2,4,3,5,3,5,6,1,3,
				 3,6,2,3,3,5,6,1,1,5,
				 5,5,5,6,3,3,1,4,1};

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static String sixfeel(int i){
		String name;
		if(i==1)
			name="1.任務";
		else if(i==2)
			name="2.修練";
		else if(i==3)
			name="3.遊戲";
		else if(i==4)
			name="4.食物";
		else if(i==5)
			name="5.時尚";
		else 
			name="6.戀愛";
		return name;		
	}
	private static void Bufwrite() throws IOException{
		FileWriter fw = new FileWriter("74club.txt");
		fw.write("aile "+aile_time+"\naixi "+aixi_time);
		fw.flush();
		fw.close();
	}
	private static void BufRead(String Q) throws IOException{
	    FileReader fr = new FileReader(Q);//讀取檔案
		BufferedReader br = new BufferedReader(fr);//讀取檔案中的字串
		String line;//讀取第N行的字串
	    int k=0;//計數器
	    while((line = br.readLine())!=null)//當檔案中還有資料時 就執行迴圈
	    {	  
	    	arr[k]= line;//將資料放到陣列	    	
	    	k++;//計數器+1
	    }	   
	}//end BufRead
	public static void main(String[] args) {
		try {
			BufRead("74club.txt");
		} catch (IOException e1) {
			// TODO 自動產生的 catch 區塊
			e1.printStackTrace();
		}
		aile_time=Integer.valueOf(arr[0].substring(5,7));
		aixi_time=Integer.valueOf(arr[1].substring(5,7));	
		//System.out.println(aile_time);
		//System.out.println(sixfeel(aile[aile_time]));		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					club frame = new club();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public club() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u827E\u5E0C");
		label.setBounds(10, 10, 46, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u827E\u6A02\u5229\u7D72");
		lblNewLabel.setBounds(109, 10, 66, 15);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_aixi = new JTextArea();
		textArea_aixi.setBounds(10, 35, 87, 52);		
		textArea_aixi.append((aixi_time+1)+">>"+sixfeel(aixi[aixi_time])+"\n");
		textArea_aixi.append((aixi_time+2)+">>"+sixfeel(aixi[aixi_time+1])+"\n");
		textArea_aixi.append((aixi_time+3)+">>"+sixfeel(aixi[aixi_time+2])+"\n");
		contentPane.add(textArea_aixi);
		
		JTextArea textArea_aile = new JTextArea();
		textArea_aile.setBounds(107, 35, 89, 52);
		textArea_aile.append((aile_time+1)+">>"+sixfeel(aile[aile_time])+"\n");
		textArea_aile.append((aile_time+2)+">>"+sixfeel(aile[aile_time+1])+"\n");
		textArea_aile.append((aile_time+3)+">>"+sixfeel(aile[aile_time+2])+"\n");
		contentPane.add(textArea_aile);
		
		JButton button_aixi = new JButton("+1");
		button_aixi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//按完之後紀錄在程式
				if(aixi_time<96)//0~95>>表中的0~96
					aixi_time++;
//				else if(aixi_time==96)//按完97 之後該回到1 
//					aixi_time=0;
				textArea_aixi.setText((aixi_time)+">>"+sixfeel(aixi[aixi_time])+"\n");
				textArea_aixi.append((aixi_time+1)+">>"+sixfeel(aixi[aixi_time+1])+"\n");
				textArea_aixi.append((aixi_time+2)+">>"+sixfeel(aixi[aixi_time+2])+"\n");
				//之後紀錄到txt
				try {
					Bufwrite();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		button_aixi.setBounds(10, 97, 87, 23);
		contentPane.add(button_aixi);
		
		JButton button_aile = new JButton("+1");
		button_aile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//按完之後紀錄在程式
				if(aile_time<96)//0~95>>表中的0~96
					aile_time++;
//				else if(aile_time==96)//按完97 之後該回到1 
//					aile_time=0;
				textArea_aile.setText((aile_time)+">>"+sixfeel(aile[aile_time])+"\n");
				textArea_aile.append((aile_time+1)+">>"+sixfeel(aile[aile_time+1])+"\n");
				textArea_aile.append((aile_time+2)+">>"+sixfeel(aile[aile_time+2])+"\n");
				//之後紀錄到txt
				try {
					Bufwrite();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		button_aile.setBounds(109, 97, 87, 23);
		contentPane.add(button_aile);
		
		JButton button_aixi_error = new JButton("-1");
		button_aixi_error.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aixi_time--;
				textArea_aixi.setText((aixi_time)+">>"+sixfeel(aixi[aixi_time])+"\n");
				textArea_aixi.append((aixi_time+1)+">>"+sixfeel(aixi[aixi_time+1])+"\n");
				textArea_aixi.append((aixi_time+2)+">>"+sixfeel(aixi[aixi_time+2])+"\n");
				//之後紀錄到txt
				try {
					Bufwrite();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button_aixi_error.setBounds(10, 130, 87, 23);
		contentPane.add(button_aixi_error);
		
		JButton button_aile_error = new JButton("-1");
		button_aile_error.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aile_time--;
				textArea_aile.setText((aile_time)+">>"+sixfeel(aile[aile_time])+"\n");
				textArea_aile.append((aile_time+1)+">>"+sixfeel(aile[aile_time+1])+"\n");
				textArea_aile.append((aile_time+2)+">>"+sixfeel(aile[aile_time+2])+"\n");
				//之後紀錄到txt
				try {
					Bufwrite();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button_aile_error.setBounds(109, 130, 87, 23);
		contentPane.add(button_aile_error);
		
		JButton btnAuto_aixi = new JButton("auto");
		btnAuto_aixi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAuto_aixi.setBounds(10, 195, 87, 23);
		contentPane.add(btnAuto_aixi);
		
		JButton btnAuto_aili = new JButton("auto");
		btnAuto_aili.setBounds(109, 195, 87, 23);
		contentPane.add(btnAuto_aili);
		
		JButton btnReturn_aixi = new JButton("return 0");
		btnReturn_aixi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Returntozero GUI = new Returntozero();
				if(aixi_time>=96){
					GUI.setVisible(true);
					if(GUI.telltrue()){
						aixi_time=0;
						try {
							Bufwrite();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
				GUI.tellfalse();
			}
		});
		btnReturn_aixi.setBounds(10, 163, 87, 23);
		contentPane.add(btnReturn_aixi);
		
		JButton buttonReturn_aile = new JButton("return 0");
		buttonReturn_aile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aile_time>=96)
					aile_time=0;
			}
		});
		buttonReturn_aile.setBounds(109, 162, 87, 23);
		contentPane.add(buttonReturn_aile);
		
		
	}
}
