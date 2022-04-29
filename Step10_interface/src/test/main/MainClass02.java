package test.main;

import test.mypac.Remocon;
import test.mypac.ourRemocon;


public class MainClass02 {
	public static void main(String[] args) {
	//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해 보세요
		Remocon yr=new ourRemocon();
		useRemocon(yr);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
