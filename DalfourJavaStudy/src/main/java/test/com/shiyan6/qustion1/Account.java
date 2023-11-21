package test.com.shiyan6.qustion1;

public class Account {
	private String name;
	 private double balance;
	private String password; 
	
	public Account() {
		name = "Null";
		balance = 0;
		password = "123456";
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getBalance() {
		System.out.println(balance);
	}

	public void getPassword() {
		System.out.println(password);		
	}

	public void setName(String name) {
		if(name.length() > 1 && name.length() < 5)
		{
			this.name = name;
			System.out.println("姓名设置成功");
		}else {
			System.out.println("请输入2-4个字符");			
		}
	}
	public void setBalance(int balance) {
		if(balance > 20)
		{
			this.balance = balance;
			System.out.println("余额设置成功");
		}else {
			System.out.println("余额必须大于20");			
		}
	}
	public void setPassword(String password) {
		if(password.length() == 6)
		{
			this.password = password;
			System.out.println("密码设置成功");
		}else {
			System.out.println("密码必须是六位数");			
		}
	}
	
}
