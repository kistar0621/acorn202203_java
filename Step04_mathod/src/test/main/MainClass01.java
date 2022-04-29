package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject Ŭ������ ���ǵ� 3���� �޼ҵ带 ���ʷ� ȣ���ϴ� code ���ۼ��� ������.
		MyObject mo=new MyObject();
		mo.walk();
		int num=mo.getNumber();
		String greet=mo.getGreeting();
		Car car=mo.getCar();
		
		//.setNum(), .setName() .useCar() �޼ҵ� 3���� ȣ���ϴ� code �ۼ��غ�����
		mo.setNum(1);
		mo.setName("�̱⼺");
		mo.useCar(new Car());
		
		//.listenMusic() �޼ҵ带 ȣ���ϴ� code�� �ۼ��� ������.
		mo.listenMusic(new Radio(),new Speaker());
		
		
		
	}

}
