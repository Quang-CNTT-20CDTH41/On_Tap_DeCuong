package bai2;

import java.util.*;

public class MainApp {
	public static void input(List<Shape> shapeList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh: ");
		double bankinh = sc.nextDouble();
		System.out.println("Nhap canhA Rectangle: ");
		double canhA_R = sc.nextDouble();
		System.out.println("Nhap canhB Rectangle: ");
		double canhB_R = sc.nextDouble();
		System.out.println("Nhap canhA Triangle: ");
		double canhA_T = sc.nextDouble();
		System.out.println("Nhap canhB Triangle: ");
		double canhB_T = sc.nextDouble();
		System.out.println("Nhap canhC Triangle: ");
		double canhC_T = sc.nextDouble();
		shapeList.add(new Circle("Hinh tron: ", bankinh));
		shapeList.add(new Rectangle("Hinh chu nhat: ",canhA_R, canhB_R));
		shapeList.add(new Triangle("Hinh tam giac: ",canhA_T, canhB_T, canhC_T));
	}
	public static void print(List<Shape> shapeList) {
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
	public static Shape findMaxChuvi(List<Shape> shapeList) {
		double chuVi = 0;
		Shape x = null;
		for (int i = 0; i < shapeList.size(); i++) {
			if(shapeList.get(i).chuVi() > chuVi) {
				x = shapeList.get(i);
				chuVi = shapeList.get(i).chuVi();
			}
		}
		return x;
	}
	public static Shape findMaxDienTich(List<Shape> shapeList) {
		double dienTich = 0;
		Shape y = null;
		for (int i = 0; i < shapeList.size(); i++) {
			if(shapeList.get(i).dienTich() > dienTich) {
				y = shapeList.get(i);
				dienTich = shapeList.get(i).dienTich();
			}
		}
		return y;
	}
	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<>();
		input(shapeList);
		print(shapeList);
		System.out.println("Chu vi lon nhat: ");
		System.out.println(findMaxChuvi(shapeList));
		System.out.println("Dien tich lon nhat: ");
		System.out.println(findMaxDienTich(shapeList));
	}
}
