package test.main;

import test.mypac.Remocon;
import test.mypac.ourRemocon;


public class MainClass02 {
	public static void main(String[] args) {
	//���� Ŭ������ test.mypac ��Ű���� ���Ϸ� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������
		Remocon yr=new ourRemocon();
		useRemocon(yr);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
