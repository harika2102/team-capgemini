
public class ExampleOnTypecasting {  
 public static void main(String[] args) {
	//implicit casting 
 byte b=100;
 int a = b;
 System.out.println("byte value cast to int:"+a);
  int num1 =97;
  System.out.println("before convert"+num1);
  float num2 = num1;
  System.out.println("after type cast from int to float is:"+num2);
  //explicit casting
  float n1 =10;
  System.out.println("the value of a n1 is "+n1);
  int n2=(int) n1;
  System.out.println("after typecasting float to int");
  int c1= 97;
  char c2 =(char)c1;
 System.out.println("after typecasting from int to char:"+c2);
 
 }
}
