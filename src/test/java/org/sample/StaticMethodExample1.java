package org.sample;

/*
public class StaticMethodExample1 {						//non static method access  into another non static method works
	
	public void method1() {
		System.out.println("method1");
		
	}
	private void method2() {
		
		method1();
		
	}
	
public static void main(String[] args) {
	StaticMethodExample1 object = new StaticMethodExample1();
	object.method2();
}
}

*/

/*
public class StaticMethodExample1{							//non static method access into another static method to use
	public static void method1() {
		System.out.println("static  method1");
		
	}
	
	public void method2() {
		System.out.println("non static method2");
		method1();
	}
	
	
	public static void main(String[] args) {
		
		StaticMethodExample1 object=new StaticMethodExample1();
		object.method2();
	}
}



public class StaticMethodExample1{							//static method access into another static method to use
	public static void method1() {
		System.out.println("static  method1");
		
	}
	
	public static void method2() {
		System.out.println("static method2");
		method1();
	}
	
	
	public static void main(String[] args) {
		
//		StaticMethodExample1 object=new StaticMethodExample1();
//		object.method2();
		method2();
		
	}
}
*/


//static method does not allow to access non-static method its throws Error............................ 

/*
 
 
public class StaticMethodExample1{
int roll;
String name;
static String clgname ="Park college of engineering";
public void emp(int n,String s){
	roll=n;
	name=s;
System.out.println(n+""+ s+""+clgname);
}
public static void main(String[] args){
StaticMethodExample1 c=new StaticMethodExample1();
c.emp(123, "prasanth");
}
}





public abstract class StaticMethodExample1{
    //non abstract method
    public void emp(){
        System.out.println("Rithik");
    }
    //abstract method
    public abstract void salary();
    
}

*/

	//we can using interface keyword in class level....
public interface StaticMethodExample1{
	
	//fully abstract we don't create body or logic...
	// we can mention abstract keyword in method level....
	public abstract void emp(String name);
	
	//in default have - public abstract keyword.....
	void salary(int pay);
	
	 
}
















