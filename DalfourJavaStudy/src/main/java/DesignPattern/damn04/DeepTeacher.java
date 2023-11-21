package DesignPattern.damn04;

import java.util.Date;

public class DeepTeacher {
	private String name;
	private DeepStudent student;
	private Date date;

	public DeepTeacher(String name, DeepStudent student, Date date) {
		this.date = date;
		this.name = name;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepStudent getStudent() {
		return student;
	}

	public void setStudent(DeepStudent student) {
		this.student = student;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	protected DeepTeacher clone() throws CloneNotSupportedException {
		DeepTeacher deepTeacher = new DeepTeacher(this.name,this.student.clone(),(Date) this.date.clone());
		return deepTeacher;
	}
}
