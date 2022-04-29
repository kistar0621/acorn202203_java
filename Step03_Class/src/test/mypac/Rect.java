package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void showArea() {
		int area=width*height;
		System.out.println("면적:"+area);
	}
//면적을 메소드를 호출한 곳으로 리턴해주는 메소드
	public int getArea() {
		int area=width*height;
		return area;
	}

	}


