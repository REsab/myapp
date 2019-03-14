package ch02;

/**
 * 
 * 2019年3月14日
 * 类名 : pay
 * 
 * 购物详细结算
 * @author Administrator
 *
 */
public class lx82 {

	 public static void main(String[] args) {

		  int shirtPrice =245;
		  int shoePrice =570;
		  int padPrice =320;
		  int shirtNo=2;
		   int shoeNO =1;
		  int padNo=1;
		  double discount =0.8;
		  
		  int sum =shirtPrice*shirtNo+shoePrice*shoeNO+padPrice*padNo;

System.out.println("************ 消费单 *****************");

System.out.println("购买物品\t单价\t个数\t金额");

System.out.println("T恤\t"+"$"+shirtPrice+"\t"+shirtNo+"\t$"+(shirtNo*shirtPrice));

System.out.println("网球鞋\t"+"$"+shoePrice+"\t"+shoeNO+"\t$"+(shoePrice*shoeNO));

System.out.println("网球拍\t"+"$"+padPrice+"\t"+padNo+"\t$"+(padPrice*padNo)+"\n");

System.out.println("折扣:\t\t"+(discount*10)+"折");

System.out.println("消费总金额: \t"+sum);

double charge=1500;
System.out.println("实际收费: \t"+charge);
 System.out.println("找钱\t\t"+(charge-(sum*0.8)));


System.out.println("本次购物积分是: 33");
		   
		   
		   
	
		  
	}
}
