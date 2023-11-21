package DesignPattern.damn02_2;

public class test {
	public static void main(String[] args) {
		ClotheFactory factory = new ClotheFactory();
		Clothe shirt = factory.createClothe("Shirt");
		shirt.wear();
	}
}
