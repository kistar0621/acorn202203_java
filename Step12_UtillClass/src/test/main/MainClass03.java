package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * Scanner ��ü�� �̿��ؼ� �ݺ��� ���鼭 ģ�� �̸��� 3�� �Է� �޾Ƽ�
		 * �Է¹��� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷��� �غ�����.
		 */
		ArrayList<String> names= new ArrayList<>();
		System.out.println("ģ���̸��� 3�� �ۼ��ϼ���");
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
	         System.out.println("ģ�� �̸� : ");
	         names.add(scan.nextLine());
	    }
		
		System.out.println("ģ���� �̸���:"+names);
		scan.close();
		
		//����� ������ �ݺ��� ���鼭 ������� �̤����ϱ�
		for(int i=0;i<names.size();i++) {
			//i��° item
			//.get() �޼ҵ尡 �������ִ� type �� String �� ������? ArrayList<String>�̱� �����̴�
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		System.out.println("--------");
		//Ȯ�� for ��
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
