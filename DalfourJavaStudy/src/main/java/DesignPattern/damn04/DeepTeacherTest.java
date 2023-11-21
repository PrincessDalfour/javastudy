package DesignPattern.damn04;

import java.util.Date;

public class DeepTeacherTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		DeepTeacher teacher=new DeepTeacher(
				"teacher1", new DeepStudent(2, "学生"),new Date());
		DeepTeacher cloneDeepTeacher = teacher.clone();
		cloneDeepTeacher.setName("teacher2");
		System.out.println(teacher+"----"+cloneDeepTeacher);
		System.out.println(teacher.getStudent()+"---"+cloneDeepTeacher.getStudent());
		System.out.println(teacher==cloneDeepTeacher);
		System.out.println(teacher.getName()+"---"+cloneDeepTeacher.getName());

	}
}
