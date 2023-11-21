package DesignPattern.damn14;

public class Gj19Client {
	public static void main(String[] args) {
		Gj19StudentAggregateImpl aggregate = new Gj19StudentAggregateImpl();

		aggregate.addGj19Student(new Gj19Student("a",12));
		aggregate.addGj19Student(new Gj19Student("b",14));
		aggregate.addGj19Student(new Gj19Student("c",41));
		aggregate.addGj19Student(new Gj19Student("d",34));

		Gj19StudentIterator iterator = aggregate.getStudentIterator();
		while (iterator.hasNext()){
			Gj19Student gj19Student = iterator.next();
			System.out.println(gj19Student.toString());
		}

	}
}
