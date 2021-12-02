package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		System.out.println("=== TEST 1: seller findByID----");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
	
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDeparment ====");
		Department department= new Department(1,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("Teste 333   " );
		list= sellerDao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("----Teste 4");
		Seller newSeller = new Seller(null,"oi","email",new Date(),400.00,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
	}

}
