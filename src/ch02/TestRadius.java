package ch02;

import java.util.Scanner;

public class TestRadius {
	/**
	 * ��ҵ1 2019��3��14�� �ֹ�����Բ�İ뾶,����Բ�������,��ʾ��������|�뾶������С����
	 * 
	 * @author Administrator
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ���в�������
		// new һ��sc��������¼�����
System.out.println("����Բ�İ뾶");
		double Radius = sc.nextDouble(); // ��ֵ

		System.out.println("Բ�������: " + (Math.PI * Radius * Radius));

	}

}
