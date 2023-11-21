package TransferMajor.homework7;

import  java.util.Scanner;

public  class  ExceptionSelf{
	public  static  void  efun(int  r)  throws  MyException{
	//
		if(r < 0){
			throw new MyException("MyException:" + r);
		}
		else{
			System.out.println("radius is: " + r);
		}
	}
	public  static  void  main(String  args[]){
		Scanner  in  =  new  Scanner(System.in);
		int  r  =  in.nextInt();
		//
		try{
			efun(r);
		}
		catch(MyException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("Exception is processed");
		}
	}

}

class  MyException  extends  Exception{
	MyException(String s){
		super(s);
	}

	public String toString(){
		return super.getMessage();
	}
}