package ch02;

import java.util.Scanner;

/*todo
 * 
 * 2019年3月14日
 *  为三角形的三个边声明三个变量并初始化也可运行时输入三条边) 
 * ,计算出三角形的周长和面积,并输出
 * 
 * 三角形三边关系是三角形三条边关系的定则，
 * 具体内容是在一个三角形中，
 * 任意两边之和大于第三边，
 * 任意两边之差小于第三边。
 * @author Administrator
 *
 */

public class lx22 {

	public static void main(String[] args) {

	while(true) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入三角形三个边:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b>c&&a+c>b&&b+c>a) {//任意两边之和大于第三边，满足这个条件
			
			 System.out.println("是三角形");
				System.out.println("三角形的周长是: "+(a+b+c));
				System.out.println("三角形的面积是:"+(1/4.0*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))));//（海伦公式）
			 break;
		}else {
			 
			 System.out.println("不能构成三角形,请重新运行");
		}
		
		
		
		
	}
	
		

	

	
			 
			 
	
		
	}

}
