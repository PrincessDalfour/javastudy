package TransferMajor.homework7;

public  class  NotStaticOuter  {

	class NotStaticInner {
		public  void  print(int  a)  {
			System.out.println("NotStaticInner  "+a);
		}
	}

	public  void  method1()  {
		NotStaticInner  obj  = new NotStaticInner();  //  不需要创建外部类实例
		obj.print(2);
	}

	public  static  void  main(String[]  args)  {
		NotStaticOuter  out  =  new  NotStaticOuter();
		NotStaticInner  obj  = out.new NotStaticInner();  //  需要创建外部类实例

		obj.print(1);
		out.method1();
	}
}
