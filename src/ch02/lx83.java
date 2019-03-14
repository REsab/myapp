package ch02;

import java.util.Scanner;

/**
 * 类名：GoodLuck 2019年3月14日
 * 
 * @author Administrator
 *
 */

/*
 * 商场推出幸运抽奖活动抽奖规则 顾客的四位会员卡号的各位数字之和大于20 则为幸运顾客 实现思题 1,接收输入的会员卡号 , 2.分解并获得各位数字
 * 3·计算各位数字之和
 */
public class lx83 {
	public static void main(String[] args) {

		System.out.println("输入4位会员卡号:");
		Scanner sc = new Scanner(System.in);
		// boolean isLuck=true;
		int Num = sc.nextInt();
		int sum = sumOfNum(Num);

		System.out.println("会员卡号" + Num + "各位之和:" + sum);
		if (sum > 20) {
			System.out.println("是幸运客户吗?true");
		} else {
			System.out.println("是幸运客户吗?false");
		}

	}

	private static int sumOfNum(int num) {
		// TODO Auto-generated method stub
		int geWei = 0, shiWei = 0, baiWei = 0, qianWei = 0;
		if (num > 0 && num < 10000) {
			geWei = num % 10;// 取余数
			num /= 10;
			shiWei = num % 10;
			num /= 10;
			baiWei = num % 10;
			qianWei = num / 10;
		}
		return (geWei + shiWei + baiWei + qianWei);
	}

}
