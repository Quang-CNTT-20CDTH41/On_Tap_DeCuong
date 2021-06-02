package bai2;

public class Circle extends Shape {
	private double bankinh;
	public Circle(String ten, double bankinh) {
		super(ten);
		this.bankinh = bankinh;
	}

	@Override
	public double chuVi() {
		double C = bankinh*2*Math.PI;
		return C;
	}

	@Override
	public double dienTich() {
		return bankinh*bankinh*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle chuvi: " + chuVi() + "\t dientich: " + dienTich();
	}
}
