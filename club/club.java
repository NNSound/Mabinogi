package club;

import java.awt.AWTException;
import java.awt.EventQueue;

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
/*
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
	
	private JPanel contentPane;
	int arr[];
	robotfile data=new robotfile();
	int aile_time=data.telltime("aile");
	int aixi_time=data.telltime("aixi");
//int aile_time,aixi_time;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws AWTException{
		
		//System.out.println(aile_time);
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
	public club() throws AWTException{
//	 
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
		arr=data.Tellarr("aixi");
		textArea_aixi.append((aixi_time+1)+">>"+data.sixfeel(arr[aixi_time])+"\n");
		textArea_aixi.append((aixi_time+2)+">>"+data.sixfeel(arr[aixi_time+1])+"\n");
		textArea_aixi.append((aixi_time+3)+">>"+data.sixfeel(arr[aixi_time+2])+"\n");
		contentPane.add(textArea_aixi);
		
		JTextArea textArea_aile = new JTextArea();
		textArea_aile.setBounds(107, 35, 89, 52);
		arr=data.Tellarr("aile");
		textArea_aile.append((aile_time+1)+">>"+data.sixfeel(arr[aile_time])+"\n");
		textArea_aile.append((aile_time+2)+">>"+data.sixfeel(arr[aile_time+1])+"\n");
		textArea_aile.append((aile_time+3)+">>"+data.sixfeel(arr[aile_time+2])+"\n");
		contentPane.add(textArea_aile);
		
		JButton button_aixi = new JButton("+1");
		button_aixi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//按完之後紀錄在程式
				if(aixi_time<96)//0~95>>表中的0~96
					aixi_time++;
//				else if(aixi_time==96)//按完97 之後該回到1 
//					aixi_time=0;
				arr=data.Tellarr("aixi");
				textArea_aixi.setText((aixi_time)+">>"+data.sixfeel(arr[aixi_time])+"\n");
				textArea_aixi.append((aixi_time+1)+">>"+data.sixfeel(arr[aixi_time+1])+"\n");
				textArea_aixi.append((aixi_time+2)+">>"+data.sixfeel(arr[aixi_time+2])+"\n");
				//之後紀錄到txt
					try {
						data.Bufwrite();
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
				arr=data.Tellarr("aile");
				textArea_aile.setText((aile_time)+">>"+data.sixfeel(arr[aile_time])+"\n");
				textArea_aile.append((aile_time+1)+">>"+data.sixfeel(arr[aile_time+1])+"\n");
				textArea_aile.append((aile_time+2)+">>"+data.sixfeel(arr[aile_time+2])+"\n");
				//之後紀錄到txt
				
				try {
					data.Bufwrite();
				} catch (IOException e1) {
					// TODO 自動產生的 catch 區塊
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
				arr=data.Tellarr("aixi");

				textArea_aixi.setText((aixi_time)+">>"+data.sixfeel(arr[aixi_time])+"\n");
				textArea_aixi.append((aixi_time+1)+">>"+data.sixfeel(arr[aixi_time+1])+"\n");
				textArea_aixi.append((aixi_time+2)+">>"+data.sixfeel(arr[aixi_time+2])+"\n");
				//之後紀錄到txt
				
					try {
						data.Bufwrite();
					} catch (IOException e1) {
						// TODO 自動產生的 catch 區塊
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
				arr=data.Tellarr("aile");
				textArea_aile.setText((aile_time)+">>"+data.sixfeel(arr[aile_time])+"\n");
				textArea_aile.append((aile_time+1)+">>"+data.sixfeel(arr[aile_time+1])+"\n");
				textArea_aile.append((aile_time+2)+">>"+data.sixfeel(arr[aile_time+2])+"\n");
				//之後紀錄到txt			
				try {
					data.Bufwrite();
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
							data.Bufwrite();
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
