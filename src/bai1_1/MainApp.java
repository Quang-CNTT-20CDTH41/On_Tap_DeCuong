package bai1_1;

import java.util.*;

public class MainApp {
	public static void input(List<Person> personList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten giao vien: ");
		String tengv = sc.next();
		System.out.println("Nhap tuoi giao vien: ");
		int tuoigv = sc.nextInt();
		System.out.println("Nhap ma giao vien: ");
		String magv = sc.next();
		System.out.println("Nhap he so luong: ");
		double hsluong = sc.nextDouble();
		System.out.println("Nhap ten sinh vien: ");
		String tensv = sc.next();
		System.out.println("Nhap tuoi sinh vien: ");
		int tuoisv = sc.nextInt();
		System.out.println("Nhap ma sinh vien: ");
		String masv = sc.next();
		System.out.println("Diem trung binh: ");
		double dtb = sc.nextDouble();
		personList.add(new Teacher(tengv,tuoigv,magv, hsluong));
		personList.add(new Student(tensv, tuoisv, masv, dtb));
	}
	public static void print(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	// tim giao vien co so luong cao nhat
	public static Person findTeacher(List<Person> personList) {
		double hsluong = 0;
		Person x = null;
		for (int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getHsluong() > hsluong) {
				x = personList.get(i);
				hsluong = personList.get(i).getHsluong();
			}
		}
		return x;
	}
	public static Person findStudent(List<Person> personList) {
		double dtb = 0;
		Person y = null;
		for (int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getDtb() > dtb) {
				y = personList.get(i);
				dtb = personList.get(i).getDtb();
			}
		}
		return y;
	}
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		input(personList);
		input(personList);
		print(personList);
		System.out.println("Gia vien co luong cao nhat: ");
		System.out.println(findTeacher(personList));
		System.out.println("Sinh vien co diem trung binh cao nhat: ");
		System.out.println(findStudent(personList));
	}
	
}
