package test.mypac;

public class MyUtil {
	public static void draw() {
		System.out.println("5�� ���� �׸��� �׷���!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�׸��ϼ�!");
	}
	//�޼ҵ� �ȿ��� �߻��ϴ� Exception �� ���� ������ ���
	public static void send() throws InterruptedException {
		System.out.println("5�� ���� ������ �ؿ�!");
		Thread.sleep(5000);
		System.out.println("���� �Ϸ�!");
		

	}
}
