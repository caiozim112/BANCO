package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1,"Books");
		Department obj2 = new Department(1,"Books");
		System.out.println(obj);
		System.out.println(obj.equals(obj2));
		System.out.println("g");
	}

}
