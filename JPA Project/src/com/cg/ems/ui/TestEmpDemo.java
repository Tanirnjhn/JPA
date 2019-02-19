package com.cg.ems.ui;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpDemo {
public static void main(String[] args)
{
	EmployeeService empservice=new EmployeeServiceImpl();
	//Employee e1=new Employee(446, "Tani Sharma",4500,null);
	//Employee e2=new Employee(555, "Vikash Agrawal",8900,null);
//	Employee e1= new Employee();
//	e1.setEmpName("Tani Sharma");
//	e1.setEmpSal(4500);
//	Employee ee1=empservice.addEmp(e1);
//	//Employee ee2=empservice.addEmp(e2);
//	System.out.println(ee1+ "\n" + "are inserted in the table");
	Employee ee=empservice.getEmpbyEid(445);
	System.out.println(ee);
	System.out.println("---- Fetch all Records");
	ArrayList<Employee> eList=empservice.fetchAllEmp();
	for(Employee tempE:eList)
	{
		System.out.println(tempE.getEmpId()+"\t"+ tempE.getEmpName()
		+"\t"+ tempE.getEmpSal());
	}
//	System.out.println("---- delete--- ");
//	Employee deletedemp=empservice.deleteEmp(1);
//	System.out.println(deletedemp + "deleted");
	System.out.println("---Update----");
	Employee updatedE=empservice.updateEmp(555, "Vikas", 50000);
	System.out.println("Updated .. Data for"+ updatedE.getEmpId());
}
}
