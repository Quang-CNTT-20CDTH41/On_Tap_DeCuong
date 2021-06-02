package bai2;

public class Triangle extends Shape {
	double canhA;
	double canhB;
	double canhC;
	public Triangle( String ten, double canhA, double canhB, double canhC) {
		super(ten);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}

	@Override
	public double chuVi() {
		double C = canhA + canhB + canhC;
		return C;
	}

	@Override
	public double dienTich() {
		double p = (canhA + canhB + canhC)/2;
		double S = Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
		return S;
	}

	@Override
	public String toString() {
		return "Triangle chuvi: " + chuVi() + "\t dientich: " + dienTich();
	}

}
