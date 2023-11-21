package DesignPattern.damn14;

import java.util.ArrayList;
import java.util.List;

public class Gj19StudentAggregateImpl implements Gj19StudentAggregate{
	private List<Gj19Student> list= new ArrayList<Gj19Student>();

	@Override
	public void addGj19Student(Gj19Student student) {
		list.add(student);
	}

	@Override
	public void delGj19Student(Gj19Student student) {
		list.remove(student);
	}

	@Override
	public Gj19StudentIterator getStudentIterator() {
		return new Gj19StudentIteratorImpl(list);
	}
}
