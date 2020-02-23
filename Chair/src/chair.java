
public class chair {
	//datamember
	String color="blue";
	String material="plastic";
	int wheels=4;
	//Actions or behaviour
	public  void movieable() {
		System.out.println("chair is movieable");   
		}
public void seatadjustable() {
	System.out.println("chair seat is adjustable");
}
public  static void main(String[] args) {
	chair cobj= new chair();
	System.out.println("chair properties");
	System.out.println(cobj.color+""+cobj.material+""+cobj.wheels);
	cobj.movieable();
	cobj.seatadjustable();
}
}
