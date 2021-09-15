package com.csi.controller;

import java.util.LinkedList;
import java.util.List;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import com.csi.service.EmployeeServiceImpl;

public class EmployeeController {

	static EmployeeService employeeServiceImpl = new EmployeeServiceImpl();

	public static void main(String[] args) {

		 saveData();
		// saveAllData();
		// getDataById(3);

		// getAllData();
		//updateData();
		
		//deleteData();
		
		//deleteAllData();

	}

	public static void saveData() {

		Employee employee = new Employee();

		employee.setEmpName("VAIBHA");
		employee.setEmpSalary(45657.89);
		employee.setEmpEmailId("VAIBHAV.P@CSI.COM");
		employee.setEmpContactNumber(3245665676L);
		employeeServiceImpl.saveData(employee);
	}

	public static void saveAllData() {
		List<Employee> employees = new LinkedList<Employee>();
		Employee employee1 = new Employee();

		employee1.setEmpName("KUNAL");
		employee1.setEmpSalary(454655.89);
		employee1.setEmpEmailId("KUNAL@CSI.COM");
		employee1.setEmpContactNumber(34354655L);

		Employee employee2 = new Employee();

		employee2.setEmpName("LAKSHMI");
		employee2.setEmpSalary(455465.89);
		employee2.setEmpEmailId("LAKSHMI.V@CSI.COM");
		employee2.setEmpContactNumber(45646576L);

		employees.add(employee1);
		employees.add(employee2);
		employeeServiceImpl.saveBulOfData(employees);
	}

	public static void getDataById(int empId) {
		System.out.println(employeeServiceImpl.getDataById(empId));
	}

	public static void getAllData() {
		employeeServiceImpl.getAllData().forEach(System.out::println);
	}

	public static void updateData() {
		Employee employee = new Employee();

		employee.setEmpName("VAIBHAV POHANE");
		employee.setEmpSalary(99999.89);
		employee.setEmpEmailId("VAIBHAV.POHANE@CSI.COM");
		employee.setEmpContactNumber(3456465675L);
		employeeServiceImpl.updateData(2, employee);
	}
	
	public static void deleteData()
	{
		employeeServiceImpl.deleteDataById(2);
	}
	
	public static void deleteAllData()
	{
		employeeServiceImpl.deleteAllData();
	}
}
