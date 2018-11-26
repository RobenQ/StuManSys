package StuManageSys;

import java.awt.Dimension;
import javax.swing.WindowConstants;
import StuManageSys.LogIn;

public class MyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//****************************************************登陆界面初始化
		Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)(screensize.getWidth()-350)/2;
		int height=(int)(screensize.getHeight()-600)/2;
		LogIn login=new LogIn();
		login.setBounds(width,height,350,600);
		login.setResizable(false);
		login.setVisible(true);
		login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
		About about=new About();
		Dimension screensize2=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int width2=(int)(screensize2.getWidth()-350)/2;
		int height2=(int)(screensize2.getHeight()-350)/2;
		about.setBounds(width2, height2+100, 350, 375);
		about.setVisible(true);
		about.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
	}
}
