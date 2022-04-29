package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		//1.Car type �� ������ �� �ִ� ArratList ��ü�� �����ؼ�
		//�������� List �������̽� type �������� cars�� ��� ������.
		List<Car> cars=new ArrayList<>();
		
		//2.Car ��ü(3��)�� �����ؼ� List ��ü�� �����غ�����.
		cars.add(new Car("����"));
		cars.add(new Car("�ƿ��"));
		cars.add(new Car("������"));
		
		//3.�ݺ��� for ���� �̿��ؼ� List ��ü�� ����� ��� Car ��ü�� drive()�޼ҵ带
		//������� ȣ���غ�����.
		for(Car tmp:cars) {
			tmp.drive();
			
	}
	}
}
	

