package bai1;

import java.util.*;

public class MainApp {
	public static void input(List<Person> personList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		int tuoi = sc.nextInt();
		System.out.println("Nhap magv: ");
		String magv = sc.next();
		System.out.println("Nhap hsluong: ");
		double hsluong = sc.nextDouble();
		personList.add(new Teacher(ten,tuoi,magv,hsluong));
	}
	public static void print(List<Person> personList) {
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	public static Person findTeacher(List<Person> personList) {
		double hsluong = 0;
		Person x = null;
		for(int i=0; i<personList.size(); i++) {
			if(personList.get(i).getHsluong() > hsluong ) {
				x = personList.get(i);
				hsluong = personList.get(i).getHsluong();
			}
		}
		return x;
	}
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		input(personList);
		input(personList);
		print(personList);
		System.out.println("Luong cao nhat: ");
		System.out.println(findTeacher(personList));
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		List<Person> personList = new ArrayList<>();
//		Person x =  new Teacher("Quang",23,"111",5.75);
//		Person y =  new Teacher("Van",22,"222",6.75);
//		Person z =  new Teacher("Le",21,"333",7.75);
//		personList.add(x);
//		personList.add(y);
//		personList.add(z);
//		for (Person person : personList) {
//			System.out.println(person);
//		}
	}
}
