package org.sample;

////public - access with or outside the class / package 
//public class StudentData {
//	
//	private void  method1() {
//	//void - don't given any data from method
//	//private - access with in the method level only 
//		System.out.println("method 1");
//		
//	}
//	public void method2() {
//		//public-access from with or outside the method
//		System.out.println("method 2");
//	}
//	
//	public static void main(String[]  args) {
//		
//		StudentData object=new StudentData();
//		object.method1();
//		object.method2();
//		
//		
//	}
//}


//public class StudentData extends StaticMethodExample1{
//
//	@Override
//	public void salary() {
//		
//		System.out.println("45000");
//	}
//
//	public static void main(String[] args) {
//		StudentData s= new StudentData();
//		s.salary();
//		s.emp();
//		
//	}
//
//
//	}



//in we r using interface using implements keyword on class level

public class StudentData implements StaticMethodExample1{

	public void emp(String name) {
		System.out.println("emp name:"+name);
		
	}

	public void salary(int pay) {
		System.out.println("emp salary :"+pay);
		
	}
	
	public static void main(String[] args) {
		StudentData s=new StudentData();
		s.emp("rithik");
		s.salary(45000);
	}

	
}

	