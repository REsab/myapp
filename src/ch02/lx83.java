package ch02;

import java.util.Scanner;

/**
 * ������GoodLuck 2019��3��14��
 * 
 * @author Administrator
 *
 */

/*
 * �̳��Ƴ����˳齱��齱���� �˿͵���λ��Ա���ŵĸ�λ����֮�ʹ���20 ��Ϊ���˹˿� ʵ��˼�� 1,��������Ļ�Ա���� , 2.�ֽⲢ��ø�λ����
 * 3�������λ����֮��
 */
public class lx83 {
	public static void main(String[] args) {

		System.out.println("����4λ��Ա����:");
		Scanner sc = new Scanner(System.in);
		// boolean isLuck=true;
		int Num = sc.nextInt();
		int sum = sumOfNum(Num);

		System.out.println("��Ա����" + Num + "��λ֮��:" + sum);
		if (sum > 20) {
			System.out.println("�����˿ͻ���?true");
		} else {
			System.out.println("�����˿ͻ���?false");
		}

	}

	private static int sumOfNum(int num) {
		// TODO Auto-generated method stub
		int geWei = 0, shiWei = 0, baiWei = 0, qianWei = 0;
		if (num > 0 && num < 10000) {
			geWei = num % 10;// ȡ����
			num /= 10;
			shiWei = num % 10;
			num /= 10;
			baiWei = num % 10;
			qianWei = num / 10;
		}
		return (geWei + shiWei + baiWei + qianWei);
	}

}
