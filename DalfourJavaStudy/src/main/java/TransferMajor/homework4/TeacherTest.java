package TransferMajor.homework4;

public class TeacherTest {
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		 CommonTeacher ct = new CommonTeacher(Double.parseDouble(args[0]),
				 							  Double.parseDouble(args[1]));
         System.out.println(ct.pay());
         
         HighTeacher ht = new HighTeacher(Double.parseDouble(args[2]),
        		 						  Double.parseDouble(args[3]));
         System.out.println(ht.pay());
         
         SuperfineTeacher st = new SuperfineTeacher(Double.parseDouble(args[4]),
        		       								Double.parseDouble(args[5]));
         System.out.println(st.pay());        

         Teacher t = ct;
         t = ht;
         t = st; 
 }
}
class  Teacher{
    double  rate;
    double  baseSalary;
    public Teacher() {
    	rate = 1;
    	baseSalary = 1000;
    }
    public Teacher(double rate,double baseSalary) {
    	this.rate = rate;
    	this.baseSalary = baseSalary;
    }
    double pay(){
    	return(rate * baseSalary);
    }
    
}

class CommonTeacher extends Teacher{
	public CommonTeacher(double rate,double baseSalary) {
    	this.rate = rate;
    	this.baseSalary = baseSalary;
    }
	
	double pay(){
    	return(rate * baseSalary + 1000);
    }
	
}

class HighTeacher extends Teacher{
	public HighTeacher(double rate,double baseSalary) {
    	this.rate = rate;
    	this.baseSalary = baseSalary;
    }
	
	double pay(){
    	return(rate * baseSalary + 2000);
    }
	
}

class SuperfineTeacher extends Teacher{
	
	public SuperfineTeacher(double rate,double baseSalary) {
    	this.rate = rate;
    	this.baseSalary = baseSalary;
    }
	
	double pay(){
    	return(rate * baseSalary + 3000);
    }
	
}