import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.JOINED)
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int empId;
private String empName;
private float empSal;

public Emp() {
	super();
	
}

public Emp(int empId, String empNamw, float empSal) {
	super();
	this.empId = empId;
	this.empName = empNamw;
	this.empSal = empSal;
}


public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getEmpSal() {
	return empSal;
}
public void setEmpSal(float empSal) {
	this.empSal = empSal;
}

@Override
public String toString() {
	return "Emp [empId=" + empId + ", empName=" + empName+ ","
			+ " empSal=" + empSal + "]";
}


}
