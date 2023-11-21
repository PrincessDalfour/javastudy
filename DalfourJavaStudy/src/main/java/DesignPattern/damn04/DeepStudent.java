package DesignPattern.damn04;
import java.io.Serializable;

public class DeepStudent implements Cloneable, Serializable {
	private Integer id;
	private String name;
	public DeepStudent(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	protected DeepStudent clone() throws CloneNotSupportedException {
		return (DeepStudent) super.clone();
	}
}