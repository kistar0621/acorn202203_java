package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("�÷���");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("������");
			}
		};
		useRemocon(r1);
		useRemocon(new Remocon() {

			@Override
			public void up() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void down() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
