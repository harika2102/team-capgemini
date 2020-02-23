
public class Switchcase {
	public static void main(String[] args) {
		int x=20,y=30,z;
		char exp='*';
     switch (exp) {
     case '+': z=x+y;
     System.out.println("addition is :" +z);
     break;
     case '-': z=x-y;
     System.out.println("subtraction is :" +z);
     break;
     case '*': z=x*y;
     System.out.println("multiplication is : " +z);
     break;
     default :System.out.println("invalid operation");
     }
	}

}
