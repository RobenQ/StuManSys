package StuManageSys;

import javax.swing.*;

public class About extends JDialog{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public About() {
		this.setTitle("关于");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		JTextArea about=new JTextArea();
		about.setText("                 "+"\n");
		about.setBounds(0, 0, 350, 375);
		about.setEditable(false);
		this.add(about);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
