package ch02;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���������Գɼ�:");
		int chineseScore = sc.nextInt();
		System.out.println("��������ѧ �ɼ�:");
		int matchScore = sc.nextInt();
		System.out.println("������Ӣ��ɼ�:");
		int engScore = sc.nextInt();

		System.out.println("�ɼ�����:");
		System.out.println("����:" + chineseScore + "   ��ѧ:" + matchScore + "     Ӣ��:" + engScore);
		System.out.println("��ѧ��Ӣ�����: " + (matchScore - engScore));
		System.out.println("ƽ����:" + ((double) (chineseScore + matchScore + engScore) / 3));

	}

}
