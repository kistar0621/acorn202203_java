package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 반복문 돌면서 친구 이름을 3번 입력 받아서
		 * 입력받은 이름을 ArrayList 객체에 순서대로 저장을 하는 프로그래밍 해보세요.
		 */
		ArrayList<String> names= new ArrayList<>();
		System.out.println("친구이름을 3번 작성하세요");
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
	         System.out.println("친구 이름 : ");
	         names.add(scan.nextLine());
	    }
		
		System.out.println("친구의 이름은:"+names);
		scan.close();
		
		//저장된 내용을 반복문 돌면서 순서대로 ㅜㄹ력하기
		for(int i=0;i<names.size();i++) {
			//i번째 item
			//.get() 메소드가 리턴해주는 type 이 String 인 이유는? ArrayList<String>이기 때문이다
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		System.out.println("--------");
		//확장 for 문
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
