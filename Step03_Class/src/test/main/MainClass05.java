package test.main;

import test.mypac.Rect;

/*
 * Rect ��� �̸��� Ŭ������ ������� �Ѵ�.
 * 
 * �ش� Ŭ������ ��ü�� �����ϰ�
 * 
 * �簢���� ����(width),����(height)�� �ʵ忡 �����ϰ�
 * showArea()�� ȣ���ϸ� �簢���� ���̰� �ܼ�â�� ��µ� �� �ֵ���
 * Rect Ŭ������ ������ ������.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Rect re1=new Rect();
		re1.height=30;
		re1.width=20;
		re1.showArea();
		//�޼ҵ尡 �������ִ� ���� ������ ��ƺ���
		int area=re1.getArea();
	}
}
