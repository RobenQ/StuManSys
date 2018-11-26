package StuManageSys;
import StuManageSys.Stu;

import java.io.*;

public class AllWays {
	
	public Stu s[]=new Stu[30000];  //系统默认可以存取学生数量
	
	public static void add(String s1,String s2) {      //信息添加函数
		try{
			FileWriter a=new FileWriter(s1,true);
			a.write(s2);
			a.write("\r\n");
			a.close();
		}catch(Exception e){
			e.printStackTrace();
		 }
	}
	
	
	//====================================================================
	public  Stu dostring(String ss) {     //处理读取的每一行数据
		Stu stu=new Stu();
		StringBuffer[] stemp=new StringBuffer[8];     //用于保存字段
		for(int j=0;j<stemp.length;j++) {
			stemp[j]=new StringBuffer();
		}
		int k = 0;
		int i;
		for ( i = 0; i<ss.length();i++) {
			if (ss.charAt(i)!=' ') {
				stemp[k].append(ss.charAt(i));
			}
			else {
				++k;
			}
		}
		stu.stu1=stemp[0].toString();
		stu.stu2=stemp[1].toString();
		stu.stu3=stemp[2].toString();
		stu.stu4=stemp[3].toString();
		stu.stu5=stemp[4].toString();
		stu.stu6=stemp[5].toString();
		stu.stu7=stemp[6].toString();
		stu.stu8=stemp[7].toString();
		return stu;
		}
	public  int read(String s1) {        //将读取的每一行数据保存到数组中
		String ss;
		int q=0;
		try {
			BufferedReader a=new BufferedReader(new FileReader(s1));
			while ((ss=a.readLine())!=null) {
				s[q++] = dostring(ss);
			}
			a.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return q;
	}
	//===============================================================================
}
