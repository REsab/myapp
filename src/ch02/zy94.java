package ch02;

import java.util.Scanner;

/*
 *2019年3月14日
 *计算温度:手工输入华氏温度,转换为摄氏温度。
 * 摄氏度=5/9.0*(华氏度-32)
 * @author Administrator
 *
 */
public class zy94 {
public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);
	  System.out.println("输入当前华氏温度:");
	   double x=sc.nextDouble();
	   
	   double y=5/9.0*(x-32);
	    System.out.println("当前的摄氏温度是:"+y);
	  
	 
}
}
