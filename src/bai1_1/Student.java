package bai1_1;

public class Student extends Person{
	String masv;
	double dtb;
	public Student(String ten, int tuoi,String masv, double dtb ) {
		super(ten, tuoi);
		this.dtb = dtb;
		this.masv = masv;
	}
	@Override
	public String toString() {
		return "Student Ten: " + ten + "\t Tuoi: " + tuoi + "\t Masv: " + masv + "\t DTB: " + dtb;
	}
	public double getDtb() {
		return dtb;
	}
	
}
