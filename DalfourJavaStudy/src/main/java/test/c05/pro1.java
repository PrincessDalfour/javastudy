package test.c05;

public class pro1
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "Dalfour";
		Ways way = new Ways();
		Person p0 = way.copyPerson(p);
		System.out.println(p.name);
		System.out.println(p0.name);
	}
}
class Person
{
	String name;
}
class Ways
{
	public Person copyPerson(Person p)
	{
		Person p0 = new Person();
		p0.name = p.name;
		return p0;
	}
}