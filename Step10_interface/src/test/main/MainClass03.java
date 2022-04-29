package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			// TODO Auto-generated method stub
			System.out.println("무언가를 올려요");
		}

		@Override
		public void down() {
			// TODO Auto-generated method stub
			System.out.println("무언가를 내려요");
		}
		
	}
	public static void main(String[] args) {
		Remocon r1=new YourRemocon();
		r1.down();
		r1.up();
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
