package TransferMajor.homework3;

import  java.io.PrintStream;
import  java.io.UnsupportedEncodingException;
import  java.util.Scanner;

import static java.lang.System.out;

public class StudentDemo {
	public  static  void  main(String[]  args) {
		PrintStream out;
		try {
			out = new PrintStream(System.out,false,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		test01();
		test02();
		test03();
	}

	public  static    void  test01()  {
		Student  zhangsan  =  new  Student();
		zhangsan.setSno("20230523875201");
		zhangsan.setName("张三");
		zhangsan.setCredit(56.73);
		zhangsan.listen("你好，你是谁？");
		zhangsan.say();
		zhangsan.read("忆江南  白居易  江南好，风景旧曾谙。日出江花红胜火，春来江水绿如蓝。能不忆江南？");
		zhangsan.write("贵有恒何必三更眠五更起，最无益只怕一日曝十日寒。");
		zhangsan.display();
	}
	/**
	 *  本方法使用构造方法初始化lisi对象，然后依次调用listen、say、read、write、display方法，
	 *  看看输出是否与你预想的一致
	 */
	public  static    void  test02()  {
		Student  lisi  =  new  Student();
		lisi.setSno("20230523875202");
		lisi.setName("李四");
		lisi.setCredit(72.38);
		lisi.listen("你好，你是谁？");
		lisi.say();
		lisi.read("王维《鹿柴》：空山不见人，但闻人语响。返景入深林，复照青苔上。");
		lisi.write("\"诗书勤乃有，不勤腹空虚。 ——韩愈\"");
		lisi.display();
	}
	/**
	 *  本方法使用构造方法初始化mike对象，在用setNationality方法设置国籍，
	 *  然后依次调用listen、say、read、write、display方法，
	 *  看看输出是否与你预想的一致
	 *  对比和体会初始化块的作用和构造方法的作用
	 */
	public  static    void  test03()  {
		Student  mike  =  new  Student();
		mike.setSno("20230523875203");
		mike.setName("mike");
		mike.setCredit(64.85);
		mike.setNationality("America");
		mike.listen("你好，你是谁？");
		mike.say();
		mike.read("cease to struggle and you cease to live.");
		mike.write("You are not strong,no one brave for you.");
		mike.display();

	}

}
/**
 *  学生类Student
 *  @author  XXX
 *
 */
class Student{
	String sno;
	double credit;
	String contentListen;
	String contentRead;
	String contentWrite;
	String name;
	String nationality;

	//PrintStream out;


	public Student() {nationality = "中国";}

	public void setName(String name) {this.name = name;}

	public void setSno(String sno) {this.sno = sno;}

	public void setCredit(double credit) {this.credit = credit;}

	public void listen(String contentListen) {this.contentListen = contentListen;}
	public void say() {
	}

	public void read(String contentRead) {this.contentRead = contentRead;}

	public void write(String contentWrite) {this.contentWrite = contentWrite;}

	public void  setNationality(String nationality){this.nationality = nationality;}

	public void display() {
		out.println("我听到了\""+contentListen+"\"");
		out.println("大家好,我是"+name+"来自"+"");
		out.println("阅读改变人生，今天我要读的是\""+contentRead+"\"");
		out.println("记录我们美好的回忆，今天我要记录的是“"+contentWrite+"”");
		out.println("学号\t"+sno);
		out.println("姓名\t"+name);
		out.println("学分\t"+credit);
	}
}
