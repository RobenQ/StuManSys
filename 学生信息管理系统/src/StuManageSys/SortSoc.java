package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class SortSoc extends JFrame{

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
	
	//-------------------------------------------------------------�رս���
	public void myclose() {
		this.dispose();
	}
	
	//=============================================================���췽��
			public SortSoc() {
				// TODO Auto-generated constructor stub
				//****************************************************��½���沿������
				this.setTitle("ѧ����Ϣ����ϵͳ--�ɼ�����");
				ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
				this.setIconImage(icon.getImage());
				Container container1=this.getContentPane();
				container1.setLayout(null);
				Color cjp1=new Color(255,250,250);
				Color cjp2=new Color(255,228,225);
				container1.setBackground(cjp1);
				
				//=================================================������ʾ���
				JPanel SearchStuScojp1=new JPanel();
				JLabel SearchStuScojp1jl1=new JLabel("�ɼ�����",JLabel.CENTER);
				SearchStuScojp1jl1.setFont(new Font("�ɼ�����", 1, 18));
				SearchStuScojp1jl1.setBounds(0, 0, 350, 60);
				SearchStuScojp1jl1.setBackground(cjp2);
				SearchStuScojp1.setLayout(null);
				SearchStuScojp1.setBounds(0,0,350,60);
				SearchStuScojp1.setBackground(cjp2);
				SearchStuScojp1.add(SearchStuScojp1jl1);
				
				//------------------------------------------------����ѡ��
				JPanel  SearchStuScojp2=new JPanel();
				SearchStuScojp2.setBounds(0, 60, 350, 60);
				SearchStuScojp2.setLayout(null);
				SearchStuScojp2.setBackground(cjp1);
				JLabel SearchStuScojp2jl1=new JLabel("����ʽ��",JLabel.CENTER);
				SearchStuScojp2jl1.setBounds(20, 5, 65, 20);
				JComboBox<String>jc=new JComboBox<>(new MyComboBoxsb());
				jc.setBounds(80, 5, 200, 20);
				jc.setBackground(cjp2);
				SearchStuScojp2.add(SearchStuScojp2jl1);/////////////////////////////////////
				SearchStuScojp2.add(jc);
				
				JPanel SearchStuScojp2_1=new JPanel();
				SearchStuScojp2_1.setBounds(0, 120, 350, 340);
				SearchStuScojp2_1.setLayout(null);
				SearchStuScojp2_1.setBackground(cjp1);
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
				stubacjt2_3.setBounds(0, 125, 350,40);
				stubacjt2_5.setBounds(0, 165,350, 40);
				stubacjt2_7.setBounds(0, 245,350, 40);
				stubacjt2_8.setBounds(0, 285, 350, 40);
				stubacjt2_6.setBounds(0, 205,  350, 40);
				
				Vector<String> vector=new Vector<>();//===============�������
				JList<String> jsp1=new JList<>(vector);
				
				//===============================================ȷ��¼����Ϣ���
				JPanel SearchStuScojp3=new JPanel();
				SearchStuScojp3.setBounds(0, 460, 350, 140); //¼�밴ť
				SearchStuScojp3.setLayout(null);
				SearchStuScojp3.setBackground(cjp1);
				JButton SearchStuScojp3jb1=new JButton("����");
				SearchStuScojp3jb1.setBackground(cjp2);
				SearchStuScojp3jb1.setBounds(120, 30, 100, 30);
				SearchStuScojp3.add(SearchStuScojp3jb1);
				JButton SearchStuScojp3jb2=new JButton("����");  //���ذ�ť
				SearchStuScojp3jb2.setBackground(cjp1);
				SearchStuScojp3jb2.setBounds(260, 80, 70, 20);
				SearchStuScojp3.setBackground(cjp1);
				SearchStuScojp3.add(SearchStuScojp3jb2);
				SearchStuScojp3jb1.setFocusPainted(false);
				SearchStuScojp3jb2.setFocusPainted(false);
				
				
				container1.add(SearchStuScojp1);
				container1.add(SearchStuScojp2);
				container1.add(SearchStuScojp2_1);
				container1.add(SearchStuScojp3);
				
				//================================================������ذ�ť��Ľ���
				class  SearchStuScojp3jb2Action implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						myclose();			
					}
				}
				SearchStuScojp3jb2.addActionListener(new  SearchStuScojp3jb2Action());
				
				//================================================�����ѯ��ť��Ľ���
				class SearchStuScojp3jb1Action implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						String s1="D:\\�ɼ���Ϣ.txt";
						AllWays allway=new AllWays();
						int k=allway.read(s1);
						String s2=(String)jc.getSelectedItem();
						int all=0;
						switch (s2) {
						case "����ɼ�":{
							int i,j;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for(j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu3)<Integer.parseInt(allway.s[i+1].stu3)) {
									sb=allway.s[i+1].stu3;
									allway.s[i+1].stu3=allway.s[i].stu3;
									allway.s[i].stu3=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"����ɼ���"+allway.s[i].stu3+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "ģ��ɼ�":{
							int i,j;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for(j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu4)<Integer.parseInt(allway.s[i+1].stu4)) {
									sb=allway.s[i+1].stu4;
									allway.s[i+1].stu4=allway.s[i].stu4;
									allway.s[i].stu4=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"ģ��ɼ���"+allway.s[i].stu4+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "Ӣ��ɼ�":{
							int i,j;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for( j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu5)<Integer.parseInt(allway.s[i+1].stu5)) {
									sb=allway.s[i+1].stu5;
									allway.s[i+1].stu5=allway.s[i].stu5;
									allway.s[i].stu5=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"Ӣ��ɼ���"+allway.s[i].stu4+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "ͳ��������۳ɼ�":{
							int i,j;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for(j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu6)<Integer.parseInt(allway.s[i+1].stu6)) {
									sb=allway.s[i+1].stu6;
									allway.s[i+1].stu6=allway.s[i].stu6;
									allway.s[i].stu6=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"�����۳ɼ���"+allway.s[i].stu4+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "��ɢ��ѧ�ɼ�":{
							int i;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for(int j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu7)<Integer.parseInt(allway.s[i+1].stu7)) {
									sb=allway.s[i+1].stu7;
									allway.s[i+1].stu7=allway.s[i].stu7;
									allway.s[i].stu7=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"��ɢ��ѧ�ɼ���"+allway.s[i].stu4+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "��ѧ�����ɼ�":{
							int i;
							String sb=new String();
							String labs[]=new String[300];
							for (i = 0; i<k-1; i++) 
								for(int j=0;j<=i;j++ ){
								if (Integer.parseInt(allway.s[i].stu8)<Integer.parseInt(allway.s[i+1].stu8)) {
									sb=allway.s[i+1].stu8;
									allway.s[i+1].stu8=allway.s[i].stu8;
									allway.s[i].stu8=sb;
								}
							}
							for (i = 0; i<k; i++) {
								all=Integer.parseInt(allway.s[i].stu3)+Integer.parseInt(allway.s[i].stu4)+Integer.parseInt(allway.s[i].stu5)+
										Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu6)+Integer.parseInt(allway.s[i].stu8);
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"��ɢ��ѧ�ɼ���"+allway.s[i].stu4+"   "+"�ܳɼ���"+all;
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						case "�ܳɼ�":{
							int i;
							int c;
							String labs[]=new String[300];
							int alls[]=new int[k];
							for (int n = 0; n<k; n++) {
								alls[n]=Integer.parseInt(allway.s[n].stu3)+Integer.parseInt(allway.s[n].stu4)+Integer.parseInt(allway.s[n].stu5)+
										Integer.parseInt(allway.s[n].stu6)+Integer.parseInt(allway.s[n].stu6)+Integer.parseInt(allway.s[n].stu8);
							}
							for (i = 0; i<k-1; i++) 
								for(int j=0;j<=i;j++ ){
								if (alls[i]<alls[i+1]) {
									c=alls[i+1];
									alls[i+1]=alls[i];
									alls[i]=c;
								}
							}
							for (i = 0; i<k; i++) {
								
								labs[i]="��      ����"+allway.s[i].stu2+"   "+"�ܳɼ���"+alls[i];
								vector.add(labs[i]);
							}
							SearchStuScojp2_1.add(jsp1);
							break;
						}
						}	
										
					}
				}
				SearchStuScojp3jb1.addActionListener(new  SearchStuScojp3jb1Action());
			}

	}
	class MyComboBoxsb extends AbstractListModel<String> implements ComboBoxModel<String>{
		
		/*
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String selecteditem=null;
		String ways[]= {"����ɼ�","ģ��ɼ�","Ӣ��ɼ�","ͳ��������۳ɼ�","��ɢ��ѧ�ɼ�","��ѧ�����ɼ�","�ܳɼ�"};
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
	

