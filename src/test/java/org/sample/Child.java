package org.sample;

public class Child extends SingleInheritance{
		
		public void method2() {
			System.out.println("method 2");
			method1();
		}
		public void method3() {
			System.out.println("method 3 ");
		}
		
public static void main(String[] args) {
			
			Child c=new Child();
			c.method2();
			c.method3();
		}
	}

