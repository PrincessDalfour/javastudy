package DesignPattern.damn14;

import java.util.List;

public class Gj19StudentIteratorImpl implements Gj19StudentIterator{
	private List<Gj19Student> list;
	public Gj19StudentIteratorImpl(List<Gj19Student> list){
		this.list = list;
	}
	private int position = 0;//记录位置
	@Override
	public boolean hasNext() {
		return position < list.size();
	}

	@Override
	public Gj19Student next() {
		Gj19Student currentStudent = list.get(position);
		position++;
		return currentStudent;
	}
}
