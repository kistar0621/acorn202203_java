package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void showArea() {
		int area=width*height;
		System.out.println("����:"+area);
	}
//������ �޼ҵ带 ȣ���� ������ �������ִ� �޼ҵ�
	public int getArea() {
		int area=width*height;
		return area;
	}

	}


