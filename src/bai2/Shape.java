package bai2;

public abstract class Shape {
	String ten;
	public Shape(String ten) {
		this.ten = ten;
	}
	public abstract double chuVi();
	public abstract double dienTich();
	@Override
	public String toString() {
		return "Shape [ten=" + ten + "]";
	}
}
