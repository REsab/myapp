package ch02;

import java.util.Scanner;

/*
 * 类名： DoChange
*计算银行本息
*各年份利率。
*公式如下：
本息总额 = 本金 + 利息
利息 = 本金 * 各年份利率 * 存放年数

* 
* 2019年3月14日
* 
* 
* 
* 
* 		
 */
public class zy95 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double rate1y = 2.25 / 100;
		double rate2y = 2.7 / 100;
		double rate3y = 3.24 / 100;
		double rate5y = 3.6 / 100;

		System.out.println("请输入本金:");
		double principal = sc.nextDouble(); // 本金
		double interest = 0; // 利息

		System.out.println("存取一年后的本息是:" + (principal + principal * rate1y * 1));
		System.out.println("存取两年后的本息是:" + (principal + principal * rate2y * 2));
		System.out.println("存取三年后的本息是:" + (principal + principal * rate3y * 3));
		System.out.println("存取五年后的本息是:" + (principal + principal * rate5y * 5));

	}

}
