package org.sample;

public class Child extends SingleInheritance{
		
		public void method2() {
			System.out.println("method 2");
			method1();
			String a="java";
			String b="python";
			String replaceAll = a.replaceAll("java", "selenium");
			System.out.println(replaceAll);
		}
		
		
public static void main(String[] args) {
			
			Child c=new Child();
			c.method2();
			
		}
	}

