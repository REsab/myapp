package ch02;

import java.util.Scanner;

public class lx16 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		
		 System.out.println("请输入姓名:");

		  String name=sc.next();
		  
		 System.out.println("请输入年龄:");
		 int age=sc.nextInt();
		 System.out.println("请输入身高(单位m):");
		  double height =sc.nextDouble();
		 System.out.println("------------------");
		 System.out.println("姓名:"+name);
		 System.out.println("年龄:"+age);
		 System.out.println("身高:"+height);
		 
		 
		 
	}
	
	
	

}
