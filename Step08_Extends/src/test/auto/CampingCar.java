package test.auto;

public class CampingCar extends Car{

	public CampingCar(Engine engine) {
		//super()�� �θ�Ŭ������ �����ڸ� ȣ���ϴ� ���� �ǹ��Ѵ�.
		super(engine);
		// TODO Auto-generated constructor stub
		}
	//�޼ҵ�
	public void sleepInCar() {
		System.out.println("������ ���� �ڿ�!");
	}
}
