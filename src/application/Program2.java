package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=========== TEST 1: department insert ===========");
		Department dep = new Department(null, "D4");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " +dep.getId());
		
		System.out.println("\n=========== TEST 2: department findById ===========");
		Department dep1 = new Department();
		dep1 = departmentDao.findById(3);
		System.out.println(dep1);
		
		System.out.println("\n=========== TEST 3: department update ===========");
		dep1 = departmentDao.findById(7);
		dep1.setName("Games");
		departmentDao.update(dep1);
		System.out.println("Update completed!");
		
		System.out.println("\n=========== TEST 4: department findAll ===========");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=========== TEST 5: department deleteById ===========");
		departmentDao.deleteById(10);
		System.out.println("Delete completed!");
	}

}
