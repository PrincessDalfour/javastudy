package TransferMajor.homework3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class QuadraticEquationDemo {
	private static Scanner input;
	private static PrintStream out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testBefore();
		test01();
		out.println("-------------");
		out.print("test02测试" + (test02()?"通过":"不通过"));
	}
	public static void testBefore() {
		input = new Scanner(System.in);
		out = null;
		try {
			out = new PrintStream(System.out,false,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean test01() {		
		out.print("a=");
		int a = input.nextInt();
		out.print("b=");
		int b = input.nextInt();
		out.print("c=");
		int c = input.nextInt();
		QuadraticEquation qe = new QuadraticEquation(a,b,c);
		out.println(qe.getA() + "x^2+" + qe.getB() + "x+" + qe.getC() + "=0");
		out.println("解：方程的判别式为" + qe.getDiscriminant() 
			+ (qe.getDiscriminant() > 0 ? "> 0" : qe.getDiscriminant() == 0 ? "= 0" : " < 0"));
		if(qe.getDiscriminant() > 0) {
			out.println("方程有两个不同的根，它们分别是" + qe.getRoot1() + "和" + qe.getRoot2());
		}else if(qe.getDiscriminant() == 0) {
			out.println("方程有两个相同的根，它们是" + qe.getRoot1());
		}else {
			out.println("方程没有实数根。");
		}
		return false;
	}	
	
	public static boolean test02() {		
		QuadraticEquation qe = new QuadraticEquation(5,7,9);
		String result = "";
		result += qe.getA() + "x^2+" + qe.getB() + "x+" + qe.getC() + "=0";
		result += "解：方程的判别式为" + qe.getDiscriminant() 
			+ (qe.getDiscriminant() > 0 ? "> 0" : qe.getDiscriminant() == 0 ? "= 0" : " < 0");
		if(qe.getDiscriminant() > 0) {
			result += "方程有两个不同的根，它们分别是" + qe.getRoot1() + "和" + qe.getRoot2();
		}else if(qe.getDiscriminant() == 0) {
			result += "方程有两个相同的根，它们是" + qe.getRoot1();
		}else {
			result += "方程没有实数根。";
		}
		String answer = "5.0x^2+7.0x+9.0=0"
				+ "解：方程的判别式为-131.0 < 0"
				+ "方程没有实数根。";
		if(result.equals(answer))
			return true;
		return false;
	}	
}
/**
 * 一元二次方程类
 * double类型的a、b、c作为私有成员变量
 * 获取a、b、c的公有成员方法
 * 带a、b、c参数的构造方法
 * 用于计算derta的getDiscriminant方法
 * 获取两个根的方法getRoot1和getRoot2，root1小于等于root2
 * @author gxw
 *
 */
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * 获取
     * @return a
     */
    public double getA() {
        return a;
    }

    /**
     * 设置
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * 获取
     * @return b
     */
    public double getB() {
        return b;
    }

    /**
     * 设置
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * 获取
     * @return c
     */
    public double getC() {
        return c;
    }

    /**
     * 设置
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b-Math.pow(b*b-4*a*c,0.5))/(2*a);
    }

    public double getRoot2(){
        return (-b+Math.pow(b*b-4*a*c,0.5))/(2*a);
    }
}


