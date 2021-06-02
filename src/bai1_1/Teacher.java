package bai1_1;

public class Teacher extends Person {
	String magv;
	double hsluong;
	public Teacher(String ten, int tuoi,String magv, double hsluong ) {
		super(ten, tuoi);
		this.hsluong = hsluong;
		this.magv = magv;
	}
	@Override
	public String toString() {
		return "teacher: Ten: " + ten + "\t Tuoi: " + tuoi + "\t magv: " + magv + "\t hsluong: " + hsluong;
	}
	public double getHsluong() {
		return hsluong;
	}
	
}	
