package StuManageSys;
import StuManageSys.LogIn;
import StuManageSys.AddStuBasic;
import StuManageSys.AddStuScore;
import StuManageSys.SearchStuBac;
import StuManageSys.SearchStuSco;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//==============================================================关闭界面
		public void myclose() {
			this.dispose();
		}
		
	//**************************************************************构造方法	
	public FirstPage() {
		// TODO Auto-generated constructor stub
		//--------------------------------------------------功能选择界面部分属性
		this.setTitle("学生信息管理系统--功能选择");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		Container container2=this.getContentPane();
		container2.setLayout(null);
		Color cjp1=new Color(255,250,250);
		Color cjp2=new Color(255,255,224);
		Color cjp3=new Color(255,228,225);
				
		//=================================================大功能选择按钮放置面板
		JPanel firstjp1=new JPanel();
		JButton firstjp1jb1=new JButton("基 本 信 息");
		JButton firstjp1jb2=new JButton("成 绩 管 理");
		firstjp1jb1.setFont(new Font(" ", 0, 18));
		firstjp1jb2.setFont(new Font(" ", 0, 18));
		firstjp1jb1.setBounds(0, 0, 175, 60);
		firstjp1jb2.setBounds(175, 0, 175, 60);
		firstjp1jb1.setBackground(cjp2);
		firstjp1jb2.setBackground(cjp3);
		firstjp1.setLayout(null);
		firstjp1.setBounds(0,0,350,60);
		firstjp1.setBackground(cjp1);
		firstjp1.add(firstjp1jb1);
		firstjp1.add(firstjp1jb2);
		firstjp1jb1.setFocusPainted(false);
		firstjp1jb2.setFocusPainted(false);
				
		//****************************************************小功能按钮放置面板		
		JPanel firstjp2=new JPanel();
		JButton firstjp2jb1=new JButton("录入基本信息                                              >");
		JButton firstjp2jb2=new JButton("查询学生基本信息                                       >");
		JButton firstjp2jb3=new JButton("信息排序                                                      >");
		JButton firstjp2jb4=new JButton("修改学生信息                                               >");
		JButton firstjp2jb6=new JButton("删除信息                                                       >");
		JButton firstjp2jb5=new JButton("重新登录");
		firstjp2jb1.setFont(new Font(" ", 0, 15));
		firstjp2jb2.setFont(new Font(" ", 0, 15));
		firstjp2jb3.setFont(new Font(" ", 0, 15));
		firstjp2jb4.setFont(new Font(" ", 0, 15));
		firstjp2jb6.setFont(new Font(" ", 0, 15));
		firstjp2jb1.setBounds(0, 0, 350, 50);
		firstjp2jb2.setBounds(0, 50, 350, 50);
		firstjp2jb3.setBounds(0, 100, 350, 50);
		firstjp2jb4.setBounds(0, 150, 350, 50);
		firstjp2jb6.setBounds(0, 200, 350, 50);
		firstjp2jb5.setBounds(0, 450, 350, 53);
		firstjp2jb1.setBackground(cjp2);
		firstjp2jb2.setBackground(cjp2);
		firstjp2jb3.setBackground(cjp2);
		firstjp2jb4.setBackground(cjp2);
		firstjp2jb6.setBackground(cjp2);
		firstjp2jb5.setBackground(cjp2);
		firstjp2.setLayout(null);
		firstjp2.add(firstjp2jb1);
		firstjp2.add(firstjp2jb2);
		firstjp2.add(firstjp2jb3);
		firstjp2.add(firstjp2jb4);
		firstjp2.add(firstjp2jb6);
		firstjp2.add(firstjp2jb5);
		firstjp2.setBounds(0,60,350,540);
		firstjp2.setBackground(cjp2);
		firstjp2jb1.setFocusPainted(false);
		firstjp2jb2.setFocusPainted(false);
		firstjp2jb3.setFocusPainted(false);
		firstjp2jb4.setFocusPainted(false);
		firstjp2jb5.setFocusPainted(false);
		firstjp2jb6.setFocusPainted(false);
						
		JButton firstjp2jb1s=new JButton("录入成绩信息                                              >");
		JButton firstjp2jb2s=new JButton("查询学生成绩信息                                       >");
		JButton firstjp2jb3s=new JButton("成绩排序                                                      >");
		JButton firstjp2jb4s=new JButton("修改学生成绩                                               >");
		JButton firstjp2jb6s=new JButton("删除成绩                                                       >");
		JButton firstjp2jb5s=new JButton("重新登录");
		firstjp2jb1s.setFont(new Font(" ", 0, 15));
		firstjp2jb2s.setFont(new Font(" ", 0, 15));
		firstjp2jb3s.setFont(new Font(" ", 0, 15));
		firstjp2jb4s.setFont(new Font(" ", 0, 15));
		firstjp2jb6s.setFont(new Font(" ", 0, 15));
		firstjp2jb1s.setBounds(0, 0, 350, 50);
		firstjp2jb2s.setBounds(0, 50, 350, 50);
		firstjp2jb3s.setBounds(0, 100, 350, 50);
		firstjp2jb4s.setBounds(0, 150, 350, 50);
		firstjp2jb6s.setBounds(0, 200, 350, 50);
		firstjp2jb5s.setBounds(0, 450, 350, 53);
		firstjp2jb1s.setBackground(cjp3);
		firstjp2jb2s.setBackground(cjp3);
		firstjp2jb3s.setBackground(cjp3);
		firstjp2jb4s.setBackground(cjp3);
		firstjp2jb6s.setBackground(cjp3);
		firstjp2jb5s.setBackground(cjp3);
		firstjp2jb1s.setFocusPainted(false);
		firstjp2jb2s.setFocusPainted(false);
		firstjp2jb3s.setFocusPainted(false);
		firstjp2jb4s.setFocusPainted(false);
		firstjp2jb5s.setFocusPainted(false);
		firstjp2jb6s.setFocusPainted(false);
				
		
		container2.add(firstjp1);
		container2.add(firstjp2);
		
		
		//---------------------------------------------选择基本信息功能后的界面
		class firstjp1jb1Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				firstjp2.setBackground(cjp2);
				firstjp2.remove(firstjp2jb1s);
				firstjp2.remove(firstjp2jb2s);
				firstjp2.remove(firstjp2jb3s);
				firstjp2.remove(firstjp2jb4s);
				firstjp2.remove(firstjp2jb6s);
				firstjp2.remove(firstjp2jb5s);
				firstjp2.add(firstjp2jb1);
				firstjp2.add(firstjp2jb2);
				firstjp2.add(firstjp2jb3);
				firstjp2.add(firstjp2jb4);
				firstjp2.add(firstjp2jb5);
				firstjp2.add(firstjp2jb6);
			}
		}
		firstjp1jb1.addActionListener(new firstjp1jb1Action());
		
		//================================================选择成绩管理功能后的界面
		class firstjp1jb2Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				firstjp2.setBackground(cjp3);
				firstjp2.remove(firstjp2jb1);
				firstjp2.remove(firstjp2jb2);
				firstjp2.remove(firstjp2jb3);
				firstjp2.remove(firstjp2jb4);
				firstjp2.remove(firstjp2jb5);
				firstjp2.remove(firstjp2jb6);
				firstjp2.add(firstjp2jb1s);
				firstjp2.add(firstjp2jb2s);
				firstjp2.add(firstjp2jb3s);
				firstjp2.add(firstjp2jb4s);
				firstjp2.add(firstjp2jb6s);
				firstjp2.add(firstjp2jb5s);	
			}
		}
		firstjp1jb2.addActionListener(new firstjp1jb2Action());
		
		//================================================选择添加基本信息功能后的界面
			class firstjp2jb1Action implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
					int width=(int)(screensize.getWidth()-350)/2;
					int height=(int)(screensize.getHeight()-600)/2;
					AddStuBasic addStuBasic=new AddStuBasic();
					addStuBasic.setBounds(width,height,350,600);
					addStuBasic.setResizable(false);
					addStuBasic.setVisible(true);
					addStuBasic.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					}
				}
				firstjp2jb1.addActionListener(new firstjp2jb1Action());
				
		//================================================选择查询基本信息功能后的界面
			class firstjp2jb2Action implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
					int width=(int)(screensize.getWidth()-350)/2;
					int height=(int)(screensize.getHeight()-600)/2;
					SearchStuBac searchStuBac=new SearchStuBac();
					searchStuBac.setBounds(width,height,350,600);
					searchStuBac.setResizable(false);
					searchStuBac.setVisible(true);
					searchStuBac.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				}
			}
			firstjp2jb2.addActionListener(new firstjp2jb2Action());
				
				//================================================选择基本信息排序功能后的界面
				class firstjp2jb3Action implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						SearchError error=new SearchError();
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-300)/2;
						int height=(int)(screensize.getHeight()-200)/2;
						error.setBounds( width, height, 300, 200);
						error.jl1.setText("功能维护中...");
						error.setVisible(true);	
					}
				}
				firstjp2jb3.addActionListener(new firstjp2jb3Action());		
		
				//================================================选择修改基本信息功能后的
				class firstjp2jb4Action implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-350)/2;
						int height=(int)(screensize.getHeight()-600)/2;
						ChangeBac changeBac=new ChangeBac();
						changeBac.setBounds(width,height,350,600);
						changeBac.setResizable(false);
						changeBac.setVisible(true);
						changeBac.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					}
				}
				firstjp2jb4.addActionListener(new firstjp2jb4Action());
				
				//================================================选择删除基本信息功能后的界面
				class firstjp2jb6Action implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-350)/2;
						int height=(int)(screensize.getHeight()-600)/2;
						DeleteBac deleteBac=new DeleteBac();
						deleteBac.setBounds(width,height,350,600);
						deleteBac.setResizable(false);
						deleteBac.setVisible(true);
						deleteBac.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					}
				}
				firstjp2jb6.addActionListener(new firstjp2jb6Action());		
				
				//================================================选择录入成绩功能后的界面
				class firstjp2jb1sAction implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-350)/2;
						int height=(int)(screensize.getHeight()-600)/2;
						AddStuScore addStuScore=new AddStuScore();
						addStuScore.setBounds(width,height,350,600);
						addStuScore.setResizable(false);
						addStuScore.setVisible(true);
						addStuScore.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					}
				}
				firstjp2jb1s.addActionListener(new firstjp2jb1sAction());
						
				//================================================选择查询成绩功能后的界面
				class firstjp2jb2sAction implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-350)/2;
						int height=(int)(screensize.getHeight()-600)/2;
						SearchStuSco searchStuSco=new SearchStuSco();
						searchStuSco.setBounds(width,height,350,600);
						searchStuSco.setResizable(false);
						searchStuSco.setVisible(true);
						searchStuSco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
					}
				}
				firstjp2jb2s.addActionListener(new firstjp2jb2sAction());
						
				//================================================选择成绩排序功能后的界面
						class firstjp2jb3sAction implements ActionListener{
							public void actionPerformed(ActionEvent e) {
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-350)/2;
								int height=(int)(screensize.getHeight()-600)/2;
								SortSoc searchStuSco=new SortSoc();
								searchStuSco.setBounds(width,height,350,600);
								searchStuSco.setResizable(false);
								searchStuSco.setVisible(true);
								searchStuSco.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
							}
						}
						firstjp2jb3s.addActionListener(new firstjp2jb3sAction());		
				
				//================================================选择修改成绩信息功能后的界面
						class firstjp2jb4sAction implements ActionListener{
							public void actionPerformed(ActionEvent e) {
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-350)/2;
								int height=(int)(screensize.getHeight()-600)/2;
								ChangeSoc changeSoc=new ChangeSoc();
								changeSoc.setBounds(width,height,350,600);
								changeSoc.setResizable(false);
								changeSoc.setVisible(true);
								changeSoc.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
							}
						}
						firstjp2jb4s.addActionListener(new firstjp2jb4sAction());
						
				//================================================选择删除成绩功能后的界面
						class firstjp2jb6sAction implements ActionListener{
							public void actionPerformed(ActionEvent e) {
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-350)/2;
								int height=(int)(screensize.getHeight()-600)/2;
								DeleteSoc deleteSoc=new DeleteSoc();
								deleteSoc.setBounds(width,height,350,600);
								deleteSoc.setResizable(false);
								deleteSoc.setVisible(true);
								deleteSoc.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
							}
						}
						firstjp2jb6s.addActionListener(new firstjp2jb6sAction());		
				
		//***************************************************选择重新登录后的界面
		class firstjp2jb5_5sAction implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
				int width=(int)(screensize.getWidth()-350)/2;
				int height=(int)(screensize.getHeight()-600)/2;
				myclose();
				LogIn login=new LogIn();
				login.setBounds(width,height,350,600);
				login.setResizable(false);
				login.setVisible(true);
				login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}
		}
		firstjp2jb5.addActionListener(new firstjp2jb5_5sAction());
		firstjp2jb5s.addActionListener(new firstjp2jb5_5sAction());	
	}
}
