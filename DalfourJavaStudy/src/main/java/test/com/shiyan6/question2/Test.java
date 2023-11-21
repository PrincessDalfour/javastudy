package test.com.shiyan6.question2;

public class Test {

	public static void main(String[] args) {
		PC pc = new PC();
		pc.CPU = "I9";
		pc.RAM = 16;
		pc.HDD = "Disk";
		pc.brand = "DELL";
		NotePad notePad = new NotePad();
		notePad.color = "white";
		notePad.CPU = "A16";
		notePad.RAM = 8;
		notePad.HDD = "disk";
		pc.getDetails();
		notePad.getDetails();
	}

}
