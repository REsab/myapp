package ch02;

/**
 * 
 * 2019��3��14��
 * ���� : pay
 * 
 * ������ϸ����
 * @author Administrator
 *
 */
public class lx82 {

	 public static void main(String[] args) {

		  int shirtPrice =245;
		  int shoePrice =570;
		  int padPrice =320;
		  int shirtNo=2;
		   int shoeNO =1;
		  int padNo=1;
		  double discount =0.8;
		  
		  int sum =shirtPrice*shirtNo+shoePrice*shoeNO+padPrice*padNo;

System.out.println("************ ���ѵ� *****************");

System.out.println("������Ʒ\t����\t����\t���");

System.out.println("T��\t"+"$"+shirtPrice+"\t"+shirtNo+"\t$"+(shirtNo*shirtPrice));

System.out.println("����Ь\t"+"$"+shoePrice+"\t"+shoeNO+"\t$"+(shoePrice*shoeNO));

System.out.println("������\t"+"$"+padPrice+"\t"+padNo+"\t$"+(padPrice*padNo)+"\n");

System.out.println("�ۿ�:\t\t"+(discount*10)+"��");

System.out.println("�����ܽ��: \t"+sum);

double charge=1500;
System.out.println("ʵ���շ�: \t"+charge);
 System.out.println("��Ǯ\t\t"+(charge-(sum*0.8)));


System.out.println("���ι��������: 33");
		   
		   
		   
	
		  
	}
}
