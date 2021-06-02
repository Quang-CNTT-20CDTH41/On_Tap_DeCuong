package bai2;

public class Rectangle extends Shape {
	
	double canhA;
	double canhB;
	
	public Rectangle( String ten, double canhA, double canhB) {
		super(ten);
		this.canhA = canhA;
		this.canhB = canhB;
	}

	@Override
	public double chuVi() {
		double C = (canhA + canhB)*2;
		return C;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return canhA*canhB;
	}

	@Override
	public String toString() {
		return "Rectangle chuvi: " + chuVi() + "\t dientich: " + dienTich();
	}

}
