package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1,"Books");
		Department obj2 = new Department(1,"Books");
		Seller seller = new Seller(21,"bob", "caio@gmail.copm",new Date("10/06/2002"),1000.00, obj2);
		System.out.println(seller );
	}

}
