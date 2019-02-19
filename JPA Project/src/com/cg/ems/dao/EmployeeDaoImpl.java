package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao
{
	EntityManager em=null;
	EntityTransaction entityTran=null;

	public EmployeeDaoImpl() {
		
		em = JPAUtil.getEntityManager();
		entityTran=em.getTransaction();
	}

	@Override
	public Employee addEmp(Employee emp) {
		entityTran.begin();
		em.persist(emp);
		entityTran.commit();
		
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() 
	{
		String selAllQry="SELECT emps FROM Employee emps";// emps is aliase here
		TypedQuery<Employee> tq=em.createQuery(selAllQry,Employee.class);
		ArrayList<Employee> empList=(ArrayList)tq.getResultList();
		return empList;
	}

	@Override
	public Employee deleteEmp(int empId) {
	
		
		//Employee e1=new Employee();  // e1 is in a new state
 Employee e1=em.find(Employee.class, empId); // e1 is in manage state
 entityTran.begin();
 //e1.setEmpId(empId);
		em.remove(e1);
		entityTran.commit();
		return e1;
	}

	@Override
	public Employee getEmpbyEid(int empId) {
	Employee ee=em.find(Employee.class, empId); // ee is in manage state
		return ee;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newsal) 
	{
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newsal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		return ee;
	}


	

}
