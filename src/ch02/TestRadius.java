package ch02;

import java.util.Scanner;

public class TestRadius {
	/**
	 * 作业1 2019年3月14日 手工输入圆的半径,计算圆的面积后,显示出来来。|半径可能是小数。
	 * 
	 * @author Administrator
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 此行不懂跳过
		// new 一个sc对像用来录入键盘
System.out.println("输入圆的半径");
		double Radius = sc.nextDouble(); // 赋值

		System.out.println("圆的面积是: " + (Math.PI * Radius * Radius));

	}

}
