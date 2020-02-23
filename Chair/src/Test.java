
public class Test {
 public static void main(String[] args) {
	Employee eobj =new Employee();
	eobj.setEmpId(1001);
	eobj.setEmpName("smith");
	eobj.setEmpSal(4000);
	//to display the private instance variables value using getter
	System.out.println("Employee Details");
	System.out.println(eobj.getEmpId());
	System.out.println(eobj.getEmpName());
	System.out.println(eobj.getEmpSal());
	
}
}
