package ch02;

import java.util.Scanner;

/**
 * ��ҵ2 2019��3��14�� �ֹ�����������ж��Ƿ񼰸�
 * 
 * @author Administrator
 *
 */
public class TestNumber {

	public static void main(String[] args) {

		System.out.println("������ɼ�(0-100)");
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();

		if (score > 0 && score < 100) {
			if (score >= 60) {
				System.out.println("���ĳɼ�����: true");
			} else {

				System.out.println("���ĳɼ�������: false");
			}

		} else {
			System.out.println("�ɼ�0-100,��������");

		}

	}

}
