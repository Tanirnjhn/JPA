package com.cg.ems.dao;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;

public interface EmployeeDao
{
	
 public Employee addEmp(Employee emp);
 public Employee deleteEmp(int empId);
 public Employee getEmpbyEid(int empId);
 public Employee updateEmp(int empId,String newName,float newsal);
 public ArrayList<Employee> fetchAllEmp();


}
