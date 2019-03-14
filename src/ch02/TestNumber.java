package ch02;

import java.util.Scanner;

/**
 * 作业2 2019年3月14日 手工输入分数，判断是否及格
 * 
 * @author Administrator
 *
 */
public class TestNumber {

	public static void main(String[] args) {

		System.out.println("请输入成绩(0-100)");
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();

		if (score > 0 && score < 100) {
			if (score >= 60) {
				System.out.println("您的成绩及格: true");
			} else {

				System.out.println("您的成绩不及格: false");
			}

		} else {
			System.out.println("成绩0-100,重新运行");

		}

	}

}
