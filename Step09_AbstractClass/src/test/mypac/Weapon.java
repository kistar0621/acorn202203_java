package test.mypac;

public abstract class Weapon {

	//���� �۵��� �غ��ϴ� �޼ҵ�
	public void prepare() {
		System.out.println("���� �۵��� �غ� �մϴ�.");
	}
	//������ �ϴ� �޼ҵ��� ��縸 �����ϰ� ���� ������ ���� �ʱ�
	//�̿ϼ��� �߻�޼ҵ带 ���� ���� abstract ���� �ʿ��ϴ�
	public abstract void attack();
	

	

	}
