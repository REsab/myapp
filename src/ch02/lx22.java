package ch02;

import java.util.Scanner;

/*todo
 * 
 * 2019��3��14��
 *  Ϊ�����ε�����������������������ʼ��Ҳ������ʱ����������) 
 * ,����������ε��ܳ������,�����
 * 
 * ���������߹�ϵ�������������߹�ϵ�Ķ���
 * ������������һ���������У�
 * ��������֮�ʹ��ڵ����ߣ�
 * ��������֮��С�ڵ����ߡ�
 * @author Administrator
 *
 */

public class lx22 {

	public static void main(String[] args) {

	while(true) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b>c&&a+c>b&&b+c>a) {//��������֮�ʹ��ڵ����ߣ������������
			
			 System.out.println("��������");
				System.out.println("�����ε��ܳ���: "+(a+b+c));
				System.out.println("�����ε������:"+(1/4.0*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))));//�����׹�ʽ��
			 break;
		}else {
			 
			 System.out.println("���ܹ���������,����������");
		}
		
		
		
		
	}
	
		

	

	
			 
			 
	
		
	}

}
