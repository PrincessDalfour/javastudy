package DesignPattern.damn02_2;

public class ClotheFactory {
	public Clothe createClothe(String type){
		if(type.equals("Pants")){
			return new Pants();
		}else if (type.equals("Shirt")){
			return new Shirt();
		}else
			return null;
	}
}
