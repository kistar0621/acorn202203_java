package test.main;

import test.mypac.HandPhone;
/*
 * Phone Ŭ������ ��ӹ��� HandPhone Ŭ������ ��ü�� �����ϸ�
 * Phone ��ü�� �̸� ��������� HandPhone ��ü�� ���������.
 * �׸��� �� �ΰ��� ��ü�� ������ heap ������ ����Ǽ� ������ ���������� ������ �ȴ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
	HandPhone p1=new HandPhone();
	p1.call();//�θ�� ���� ��� ���� ����� ����� �� �ִ�.
	p1.mobileCall();//
	p1.takePicture();
	}
}
