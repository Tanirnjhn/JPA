import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestInheritanceDemo {

	public static void main(String[] args) {
	Emp rahul=new Emp();
	rahul.setEmpName("Ram Chauhan");
	rahul.setEmpSal(60000);
	
	Manager varsha =  new Manager();
	varsha.setEmpName("Varsha");
	varsha.setEmpSal(70000);
	varsha.setDeptName("Java");
	EntityManager em = JPAUtil.getEntityManager();
	EntityTransaction tran=em.getTransaction();
	tran.begin();
	//em.persist(rahul);
	//em.persist(varsha);
	tran.commit();
	System.out.println("data is inserted");
Manager ee1=em.find(Manager.class, 5);
System.out.println(ee1);
	}

}
