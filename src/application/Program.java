package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "books");
		System.out.println(dep);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com",new Date(), 3000.00, dep);
		System.out.println(seller);
	}

}
