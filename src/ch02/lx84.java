package ch02;

import java.util.Scanner;

/*
 * 手工输入折扣，并判断各商品的折扣价，是否小于100元。
 */
public class lx84 {

	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;

		Scanner sc = new Scanner(System.in);
		System.out.println("输入折扣几点几折");
		double discount = sc.nextDouble();
		boolean isShirtLow = false;
		boolean isShoeLow = false;
		boolean ispadLow = false;

		isLow(shirtPrice, discount);

		System.out.println("T恤折扣低于100吗?"+(isLow(shirtPrice,discount)));
		System.out.println("网球鞋折扣低于100吗?"+(isLow(shoePrice,discount)));   //方法调用  
		System.out.println("网球拍折扣低于100吗?"+(padPrice*discount/10<100?"true":"false"));  //  ?  :

		System.out.println();

	}

	private static boolean isLow(int a, double b) {
		// TODO Auto-generated method stub
		
		if(a*b/10<100) {
			return true;
		}else {
			return false;
		}
		


	}
}
