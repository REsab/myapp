package ch02;

import java.util.Scanner;

/*
 * ������ DoChange
*�������б�Ϣ
*��������ʡ�
*��ʽ���£�
��Ϣ�ܶ� = ���� + ��Ϣ
��Ϣ = ���� * ��������� * �������

* 
* 2019��3��14��
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

		System.out.println("�����뱾��:");
		double principal = sc.nextDouble(); // ����
		double interest = 0; // ��Ϣ

		System.out.println("��ȡһ���ı�Ϣ��:" + (principal + principal * rate1y * 1));
		System.out.println("��ȡ�����ı�Ϣ��:" + (principal + principal * rate2y * 2));
		System.out.println("��ȡ�����ı�Ϣ��:" + (principal + principal * rate3y * 3));
		System.out.println("��ȡ�����ı�Ϣ��:" + (principal + principal * rate5y * 5));

	}

}
