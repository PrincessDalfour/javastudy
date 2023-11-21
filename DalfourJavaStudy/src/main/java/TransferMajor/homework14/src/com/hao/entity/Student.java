package TransferMajor.homework14.src.com.hao.entity;

public class Student {
	private Integer sid;// 学号
	private String sname;// 姓名
	private String ssex;// 性别
	private int sage;// 年龄
	private String saddress;// 地址

	public Integer getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getSsex() {
		return ssex;
	}

	public int getSage() {
		return sage;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Student() {
		super();
	}

	public Student(Integer sid, String sname, String ssex, int sage, String saddress) {
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.saddress = saddress;
	}

	public Student(String sname, String ssex, int sage, String saddress) {
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student{" + "sid=" + sid + ", sname='" + sname + '\'' + ", ssex='" + ssex + '\'' + ", sage=" + sage + ", saddress='" + saddress + '\'' + '}';
	}
}
