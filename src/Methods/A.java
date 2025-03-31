package Methods;
//A void method can never return any value.
public class A {
  public static void main(String[] args) {
	  //method return type cannot be var. 
	  A a1 =new A();
	  String  x =a1.test();
	  System.out.println(x);
	
}
  public String test() {
	return "mike";
	
}

}
