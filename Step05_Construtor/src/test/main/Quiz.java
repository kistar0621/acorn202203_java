package test.main;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ������ ���ڸ� ���� �ʹٸ�
		 * Random ��ü�� Ȱ���ؾ� �Ѵ�.
		 * ���� new Random() �ؼ� ��ü�� ������
		 * ��ü�� �޼ҵ带 �̿��ؼ� ������ ���ڸ� �� ����
		 */
		
		//0~10 ������ ������ ���� �ϳ��� ���� ranNum �̶�� ���� ������ ��ƺ�����
		
		int ranNum=new Random().nextInt(11);
		System.out.println("0~10������ ����:"+ranNum);
		//1~45 ������ ������ ���� �ϳ��� ���� ranNum2 ��� ���� ������ ��ƺ�����.
		int ranNum2=new Random().nextInt(45)+1;
		System.out.println("1~45������ ����:"+ranNum2);
		
		//true or false �߿� ������ boolean ���� ���� isRun �̶�� ���� ������ ��ƺ�����.
		boolean isRun=new Random().nextBoolean();
		System.out.println("true or false:"+isRun);
	}
}
