package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		System.out.println("=== Test 1 : Department findById");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== Test 2 : Department insert\n");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New id = " + newDepartment.getId());
		
		System.out.println("=== Test 3: Department update ===");
		department = departmentDao.findById(1);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("=== Test 4 : Department delete===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
		System.out.println("=== Test 5: Department findAll===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
	}

}
