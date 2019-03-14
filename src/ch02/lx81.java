package ch02;
/**
 * 
 * 2019年3月14日
 * 类名 : pay
 * 
 * 购物结算
 * @author Administrator
 *
 */


public class lx81 {

	 public static void main(String[] args) {

		  int shirtPrice =245;
		  int shoePrice =570;
		  int padPrice =320;
		  int shirtNo=2;
		   int shoeNO =1;
		  int padNo=1;
		  double discount =0.8;
		  
		  int sum =shirtPrice*shirtNo+shoePrice*shoeNO+padPrice*padNo;
		   
		  System.out.println("消费总金额: "+(sum*0.8));
		  
		  
	}
	 
}
