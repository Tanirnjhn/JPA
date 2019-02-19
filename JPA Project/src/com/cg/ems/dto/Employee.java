package com.cg.ems.dto;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="emp1") // if we do not write this then by default employee table created
public class Employee 
{
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="emp_id",length=20)
	private int empId;
	
	@Column (name="emp_name",length=30)
	private String empName;
	
	@Column (name="emp_sal",length=10)
	private float empSal;
	
	@Transient
	private LocalDate doj;
	
	public Employee()
	{
		super();
		
	}
	
	public Employee(int empId, String empName, float empSal, LocalDate doj)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.doj = doj;
	}
	
	public int getEmpId() 
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public float getEmpSal()
	{
		return empSal;
	}
	
	public void setEmpSal(float newsal)
	{
		this.empSal = newsal;
	}
	
	public LocalDate getDoj() 
	{
		return doj;
	}
	
	public void setDoj(LocalDate doj)
	{
		this.doj = doj;
	}
	
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ","
				+ " empSal=" + empSal + ", doj=" + doj + "]";
	}

	}


