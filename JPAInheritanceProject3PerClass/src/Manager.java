import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_stores")
public class Manager extends Emp {
	private String deptName;


public Manager() {
	super();
	// TODO Auto-generated constructor stub
}


public Manager(String deptName) {
	super();
	this.deptName = deptName;
}


public Manager(int empId, String empNamw, float empSal,String DeptName) {
	super(empId, empNamw, empSal);
	this.deptName=deptName;

}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}


@Override
public String toString() {
	return "Manager [deptName=" + deptName + "]";
}

}
