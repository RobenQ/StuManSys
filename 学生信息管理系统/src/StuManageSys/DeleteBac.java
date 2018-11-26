package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.*;


public class DeleteBac extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JLabel stubacjt2_1=new JLabel();
	public JLabel stubacjt2_2=new JLabel();
	public JLabel stubacjt2_3=new JLabel();
	public JLabel stubacjt2_4=new JLabel();
	public JLabel stubacjt2_5=new JLabel();
	public JLabel stubacjt2_6=new JLabel();
	public JLabel stubacjt2_7=new JLabel();
	public JLabel stubacjt2_8=new JLabel();
	public JTextField SearchStuBacjp2jt1=new JTextField();
	
	//-------------------------------------------------------------关闭界面
		public void myclose() {
			this.dispose();
		}
	
	//=============================================================构造方法
	public DeleteBac() {
		// TODO Auto-generated constructor stub
		//****************************************************登陆界面部分属性
		this.setTitle("学生信息管理系统--删除信息");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		Container container1=this.getContentPane();
		container1.setLayout(null);
		Color cjp1=new Color(255,250,250);
		Color cjp2=new Color(255,255,224);
		container1.setBackground(cjp1);
		
		//=================================================功能提示
		JPanel SearchStuBacjp1=new JPanel();
		JLabel SearchStuBacjp1jl1=new JLabel("删除",JLabel.CENTER);
		SearchStuBacjp1jl1.setFont(new Font("删除", 1, 18));
		SearchStuBacjp1jl1.setBounds(0, 0, 350, 60);
		SearchStuBacjp1jl1.setBackground(cjp2);
		SearchStuBacjp1.setLayout(null);
		SearchStuBacjp1.setBounds(0,0,350,60);
		SearchStuBacjp1.setBackground(cjp2);
		SearchStuBacjp1.add(SearchStuBacjp1jl1);
		
		//------------------------------------------------具体选项
		JPanel SearchStuBacjp2=new JPanel();
		SearchStuBacjp2.setBounds(0, 60, 350, 60);
		SearchStuBacjp2.setLayout(null);
		SearchStuBacjp2.setBackground(cjp1);
		JLabel SearchStuBacjp2jl1=new JLabel("查找方式：",JLabel.CENTER);
		SearchStuBacjp2jl1.setBounds(20, 5, 65, 20);
		JLabel SearchStuBacjp2jl2=new JLabel("删除内容：",JLabel.CENTER);
		SearchStuBacjp2jl2.setBounds(20, 40, 65, 20);
		SearchStuBacjp2jt1.setBounds(80, 40, 200, 20);
		JComboBox<String>jc=new JComboBox<>(new MyComboBoxsa());
		jc.setBounds(80, 5, 200, 20);
		jc.setBackground(cjp2);
		SearchStuBacjp2.add(SearchStuBacjp2jl1);
		SearchStuBacjp2.add(SearchStuBacjp2jl2);
		SearchStuBacjp2.add(jc);
		SearchStuBacjp2.add( SearchStuBacjp2jt1);
		
		JPanel SearchStuBacjp2_1=new JPanel();
		SearchStuBacjp2_1.setBounds(0, 120, 350, 340);
		SearchStuBacjp2_1.setLayout(null);
		SearchStuBacjp2_1.setBackground(cjp1);
		stubacjt2_1.setEnabled(false);
		stubacjt2_2.setEnabled(false);
		stubacjt2_3.setEnabled(false);
		stubacjt2_4.setEnabled(false);
		stubacjt2_5.setEnabled(false);
		stubacjt2_6.setEnabled(false);
		stubacjt2_7.setEnabled(false);
		stubacjt2_8.setEnabled(false);
		stubacjt2_1.setBounds(0, 5,350, 40);
		stubacjt2_2.setBounds(0, 45, 350, 40);
		stubacjt2_3.setBounds(0, 85, 350,40);
		stubacjt2_4.setBounds(0, 125, 350,40);
		stubacjt2_5.setBounds(0, 165,350, 40);
		stubacjt2_7.setBounds(0, 245,350, 40);
		stubacjt2_8.setBounds(0, 285, 350, 40);
		stubacjt2_6.setBounds(0, 205,  350, 40);
			
		
		//===============================================确定查询信息面板
		JPanel SearchStuBacjp3=new JPanel();
		SearchStuBacjp3.setBounds(0, 460, 350, 140); 
		SearchStuBacjp3.setLayout(null);
		SearchStuBacjp3.setBackground(cjp1);
		JButton SearchStuBacjp3jb1=new JButton("删除");//查询按钮
		SearchStuBacjp3jb1.setBackground(cjp2);
		SearchStuBacjp3jb1.setBounds(120, 30, 100, 30);
		SearchStuBacjp3.add(SearchStuBacjp3jb1);
		JButton  Searchjp3jb2=new JButton("撤回");  //返回按钮
		Searchjp3jb2.setBackground(cjp1);
		Searchjp3jb2.setBounds(260, 80, 70, 20);
		SearchStuBacjp3.setBackground(cjp1);
		SearchStuBacjp3.add(Searchjp3jb2);
		SearchStuBacjp3jb1.setFocusPainted(false);
		Searchjp3jb2.setFocusPainted(false);
		
		
		container1.add(SearchStuBacjp1);
		container1.add(SearchStuBacjp2);
		container1.add(SearchStuBacjp2_1);
		container1.add(SearchStuBacjp3);
		
		//================================================点击返回按钮后的界面
		class  Searchjp3jb2Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				myclose();			
			}
		}
		Searchjp3jb2.addActionListener(new  Searchjp3jb2Action());
		
		//================================================点击删除按钮后的界面
		class  stubacjp3jb1Action implements ActionListener{
			 public void actionPerformed(ActionEvent e) {
				 AllWays allway=new AllWays();
				 AllWays all=new AllWays();
				if((SearchStuBacjp3jb1.getText()).equals("删除")) {
					String s1="D:\\基本信息.txt";
					String s2=(String)jc.getSelectedItem();
					String ss=SearchStuBacjp2jt1.getText();
					int k=allway.read(s1);
					switch (s2) {
					case "学号":{
						int i,j,num=0;
						Vector<String> vector=new Vector<>();//===============滚动面板
						JList<String> jsp1=new JList<>(vector);	
						String labs[]=new String[300];
						j=0;
						for ( i = 0; i<k; i++) {
							if (allway.s[i].stu1.equals(ss)) {
								num=num+1;
								j=i;
								labs[i]="学  号："+allway.s[j].stu1+"   "+"姓 名："+allway.s[j].stu2+"   "+"联系方式："+allway.s[j].stu7;
								allway.s[j].stu1="";
								allway.s[j].stu2="";
								allway.s[j].stu3="";
								allway.s[j].stu4="";
								allway.s[j].stu5="";
								allway.s[j].stu6="";
								allway.s[j].stu7="";
								allway.s[j].stu8="";
								vector.add(labs[i]);
							}
						}
							if(num==1) {
								for ( i = 0; i<k; i++) {
									all.s[i]=allway.s[j];
									String exchange=new String();
									exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
												" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
									try{
										FileWriter a=new FileWriter(s1);
										a.write(exchange);
										a.write("\r\n");
										a.close();
									}catch(Exception W){
										W.printStackTrace();
									}
								}
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.jl1.setText("删除成功！");
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuBacjp2_1.removeAll();
								SearchStuBacjp2_1.add(jsp1);
								jsp1.setBackground(cjp1);
								jsp1.setBounds(0, 5, 350, 340);
							}
						break;
					}
					case "姓名":{
						int i,j,num=0;
						Vector<String> vector=new Vector<>();//===============滚动面板
						JList<String> jsp1=new JList<>(vector);	
						String labs[]=new String[300];
						j=0;
						for ( i = 0; i<k; i++)
							if (allway.s[i].stu2.equals(ss)) {
								num=num+1;
								j=i;
								labs[i]="学  号："+allway.s[j].stu1+"   "+"姓 名："+allway.s[j].stu2+"   "+"联系方式："+allway.s[j].stu7;
								allway.s[j].stu1="";
								allway.s[j].stu2="";
								allway.s[j].stu3="";
								allway.s[j].stu4="";
								allway.s[j].stu5="";
								allway.s[j].stu6="";
								allway.s[j].stu7="";
								allway.s[j].stu8="";
								vector.add(labs[i]);
							}
							if(num==1) {
								for ( i = 0; i<k; i++) {
									all.s[i]=allway.s[j];
									String exchange=new String();
									exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
												" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
									try{
										FileWriter a=new FileWriter(s1);
										a.write(exchange);
										a.write("\r\n");
										a.close();
									}catch(Exception W){
										W.printStackTrace();
									}
								}
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.jl1.setText("删除成功！");
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuBacjp2_1.removeAll();
								SearchStuBacjp2_1.add(jsp1);
								jsp1.setBackground(cjp1);
								jsp1.setBounds(0, 5, 350, 340);
							}
						break;
					}
					case "联系方式":{
						int i,j,num=0;
						Vector<String> vector=new Vector<>();//===============滚动面板
						JList<String> jsp1=new JList<>(vector);	
						String labs[]=new String[300];
						j=0;
						for ( i = 0; i<k; i++)
							if (allway.s[i].stu7.equals(ss)) {
								num=num+1;
								j=i;
								labs[i]="学  号："+allway.s[j].stu1+"   "+"姓 名："+allway.s[j].stu2+"   "+"联系方式："+allway.s[j].stu7;
								allway.s[j].stu1="";
								allway.s[j].stu2="";
								allway.s[j].stu3="";
								allway.s[j].stu4="";
								allway.s[j].stu5="";
								allway.s[j].stu6="";
								allway.s[j].stu7="";
								allway.s[j].stu8="";
								vector.add(labs[i]);
							}
							if(num==1) {
								for ( i = 0; i<k; i++) {
									all.s[i]=allway.s[j];
									String exchange=new String();
									exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
												" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
									try{
										FileWriter a=new FileWriter(s1);
										a.write(exchange);
										a.write("\r\n");
										a.close();
									}catch(Exception W){
										W.printStackTrace();
									}
								}
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.jl1.setText("删除成功！");
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuBacjp2_1.removeAll();
								SearchStuBacjp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
							}
						break;
					}
					case "删除全部":{
						try{
							FileWriter a=new FileWriter(s1);
							a.close();
						}catch(Exception w){
							w.printStackTrace();
						 }
						SearchError error=new SearchError();
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-300)/2;
						int height=(int)(screensize.getHeight()-200)/2;
						error.jl1.setText("修改成功！");
						error.setBounds( width, height, 300, 200);
						error.setVisible(true);	
					}
				}
			}
			}
		}
		SearchStuBacjp3jb1.addActionListener(new  stubacjp3jb1Action());
	}

//=================================下拉列表
class MyComboBoxsa extends AbstractListModel<String> implements ComboBoxModel<String>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String selecteditem=null;
	String ways[]= {"学号","姓名","联系方式","删除全部"};
	public String getElementAt(int index) {
		return ways[index];
	}
	public int getSize() {
		return ways.length;
	}
	public void setSelectedItem(Object item) {
		selecteditem=(String)item;
	}
	public Object getSelectedItem() {
		return selecteditem;
	}
}
}
