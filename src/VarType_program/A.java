package VarType_program;

//it was introduced in java version 10.
//Var type variable can store any kind of value in it .
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var x1 = 10;
		var x2 = 10.3;
		var x3 = true ;
		var x4 = "mike";
		var x5 = new A ();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
	}
}
//var type variable can only be local variables.
//it cannot be static and non_static variable.