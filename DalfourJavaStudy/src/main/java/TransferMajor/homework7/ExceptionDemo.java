package TransferMajor.homework7;

class DivDemo {
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException  {
		int []arr = new int [a];
		System.out.println(arr[10]);
		return a/b;
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		DivDemo d = new DivDemo();
		int type = Integer.parseInt(args[0]);	// -20	20	20	20
		int a = Integer.parseInt(args[1]);		//	 9	90	90	 8
		int b = Integer.parseInt(args[2]);		//	 0	30	 0	10

		try {
			if(type < 0) {
				//  add  throw  Exception
				System.out.println("java.lang.Exception: NegativeException");
				return;
			}
			int x = d.div(a,b);
			System.out.println("x="+x);
		}
		//  add  two  catch
		 catch (ArithmeticException e){
			 System.out.println("ArithmeticException");
		 }

		//  add  catch
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch (RuntimeException e)

		{
			System.out.println(e.toString());
		}finally  {
			System.out.println("Over");
		}

	}
}
