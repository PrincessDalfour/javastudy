/*package study.dalfour.zzy.homework5;

public class JiChengTtest {
	public static void main(String[] args)  {
        String name = args[0];
        String id = args[1];
        String name1 = args[2];
        String id1 = args[3];                
        Animal a1 = new Hamster(name,Integer.parseInt(id));
        Animal a2 = new Mouse(name1,Integer.parseInt(id1));
        eat(a1);
        eat(a2);
	}
	
	public static void eat(Animal obj) {
		System.out.println("call eat(Animal obj) function");
		obj.eat();
		if(obj instanceof Mouse){//插空
			eat((Mouse)obj);
		}else{
         System.out.println("is  not  a  Mouse  obj");
		}      

		if(obj instanceof Hamster){//插空
			eat((Hamster)obj);
		}else{
			System.out.println("is  not  a  Hamster  obj");
		}

	}

	public static void eat(Mouse obj) {
		System.out.println("call eat(Mouse obj) function");

	}        

	public static void eat(Hamster obj) {
		System.out.println("call eat(Hamster obj) function");
	}        

}

class  Animal {  
	protected String name;    
	protected int id;  
	public Animal(String myName,int myid) {  
		name = myName;  
		id = myid;
	}  
	public void eat(){  
		System.out.println(name+" eating,Animal");  
	}

}

class Mouse extends Animal{//插空

	public Mouse(String myName, int myid) {
		super(myName, myid);
	}
	public void eat(){  
		System.out.println(name+" eating,Mouse id:"+id);  
	}

}

class Hamster extends Mouse{//插空

	public Hamster(String myName, int myid) {
		super(myName, myid);
	}
	public void eat(){  
		System.out.println(name+" eating,Hamster id:"+id);  
	}

	
}*/