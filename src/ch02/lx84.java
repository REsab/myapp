package ch02;

import java.util.Scanner;

/*
 * �ֹ������ۿۣ����жϸ���Ʒ���ۿۼۣ��Ƿ�С��100Ԫ��
 */
public class lx84 {

	public static void main(String[] args) {
		int shirtPrice = 245;
		int shoePrice = 570;
		int padPrice = 320;

		Scanner sc = new Scanner(System.in);
		System.out.println("�����ۿۼ��㼸��");
		double discount = sc.nextDouble();
		boolean isShirtLow = false;
		boolean isShoeLow = false;
		boolean ispadLow = false;

		isLow(shirtPrice, discount);

		System.out.println("T���ۿ۵���100��?"+(isLow(shirtPrice,discount)));
		System.out.println("����Ь�ۿ۵���100��?"+(isLow(shoePrice,discount)));   //��������  
		System.out.println("�������ۿ۵���100��?"+(padPrice*discount/10<100?"true":"false"));  //  ?  :

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
