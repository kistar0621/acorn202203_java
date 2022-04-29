package test.mypac;

public class MultiObject implements Remocon,Drill {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("내려요");
	}

	@Override
	public void hole() {
		// TODO Auto-generated method stub
		System.out.println("구멍을 뚫어요");
	}
}
