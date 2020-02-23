public class ExampleOnMethods{
// instance method or concrete method
	void methodOne() {
    System.out.println(" we are in method one");
  System.out.println("we are in ExampeOnMethods class");
    }
 public int getEmpSal(int sal,int comm) {
	 int sum=sal+comm;
	 return sum;
	 
 }
  // static method
 public static  int studentTotalMarks(int m1,int m2,int m3) {
	 int res=m1+m2+m3;
	 return res;
 }
 public static void main(String[] args) {
	 ExampleOnMethods.studentTotalMarks(30, 70, 80);
	int totalmarks=ExampleOnMethods.studentTotalMarks(30, 70, 80);
	System.out.println("student total marks is:"+totalmarks);
 
 ExampleOnMethods eom= new ExampleOnMethods();
 int empTotalSal=eom.getEmpSal(3000,800);//formal parameters
System.out.println(empTotalSal);

 
 }
 
}
