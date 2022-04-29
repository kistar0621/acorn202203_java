package test.main;

import test.auto.Engine;
import test.auto.FlyingCar;

public class MainClass08 {
	public static void main(String[] args) {
		FlyingCar car1=new FlyingCar(new Engine());
		car1.drive();
	}
}
