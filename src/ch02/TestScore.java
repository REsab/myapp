package ch02;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入语言成绩:");
		int chineseScore = sc.nextInt();
		System.out.println("请输入数学 成绩:");
		int matchScore = sc.nextInt();
		System.out.println("请输入英语成绩:");
		int engScore = sc.nextInt();

		System.out.println("成绩如下:");
		System.out.println("语文:" + chineseScore + "   数学:" + matchScore + "     英语:" + engScore);
		System.out.println("数学和英语相差: " + (matchScore - engScore));
		System.out.println("平均分:" + ((double) (chineseScore + matchScore + engScore) / 3));

	}

}
