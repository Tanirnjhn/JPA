package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
 EmployeeDao empDao=null;
 public EmployeeServiceImpl()
 {
	 empDao=new EmployeeDaoImpl();
 }
 
 @Override
	public Employee addEmp(Employee emp) {
		
		return empDao.addEmp(emp);
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		
		return empDao.fetchAllEmp();
	}

	@Override
	public Employee deleteEmp(int empId) {
		
		return empDao.deleteEmp(empId);
	}

	@Override
	public Employee getEmpbyEid(int empId) {
		
		return empDao.getEmpbyEid(empId);
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newsal) {
		
		return empDao.updateEmp(empId, newName, newsal);
	}

}
