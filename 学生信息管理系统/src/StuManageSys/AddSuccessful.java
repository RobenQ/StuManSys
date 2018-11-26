package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddSuccessful extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//-------------------------------------------------------------关闭界面
	public void myclose() {
		this.dispose();
	}
	
	public AddSuccessful() {
		this.setTitle("学生信息管理系统--操作提示");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		this.setResizable(false);
		Container container=this.getContentPane();
		container.setLayout(null);
		Color cjp1=new Color(255,250,250);
		container.setBackground(cjp1);
		JLabel jl1=new JLabel("录入成功！",JLabel.CENTER);
		jl1.setFont(new Font(" ", 1, 15));
		jl1.setBackground(cjp1);
		jl1.setBounds(110, 40, 80, 30);
		JButton jb1=new JButton("确定");
		jb1.setBackground(cjp1);
		jb1.setBounds(120, 110, 60, 30);
		jb1.setFocusPainted(false);
		
		container.add(jl1);
		container.add(jb1);
		
		
		class jb1Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				myclose();			
			}
		}
		jb1.addActionListener(new jb1Action());
	}
}
