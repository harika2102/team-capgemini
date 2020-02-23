
public class ArthematicOperation {
	public static void main(String[] args) {
		int a =10,b=20,c;
		c=a+b;
		System.out.println("sum of two numbers is"+c);
		c=b-a;
		System.out.println("substrsction of two numbers is"+c);
		System.out.println("multipluication of two numbers is"+(a*b));
		//it will return quotient
		System.out.println("division of two numbers is "+(b/a));
		//it will return remainder
        System.out.println("module of two numbers is"+(b%a));
        //ternary operator or conditional operator
        int res = a>b?a:b;
        System.out.println("greater value is:"+res);
		
	}

}
