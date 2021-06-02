package bai1;

public class Teacher extends Person {

	String Magv;
	double Hsluong;
	public Teacher(String ten, int tuoi, String Magv, double Hsluong) {
		super(ten, tuoi);
		this.Magv = Magv;
		this.Hsluong = Hsluong;
	}
	@Override
	public String toString() {
		return "Techer Ten: " + ten + "\t Tuoi:" + tuoi + "\t Magv: " + Magv + ", \t Hsluong: " + Hsluong ;
	}
	public double getHsluong() {
		return Hsluong;
	}
	
}
