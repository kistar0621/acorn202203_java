package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * ArrayList 객체에
		 * 친구 이름 5개를 담고
		 * 반복문 돌면서 친구이름을 다음과 같은 형식으로 출력햅세요
		 * 0번쨰 친구:김구라
		 * 1번째 친구:해골
		 * 2번째 친구:원숭이
		 * .
		 * .
		 */
		ArrayList<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("대머리");
		
		for(int i=0;i<names.size();i++) {
			System.out.println(i+" 번째 친구:"+names.get(i));
		}
		
	}
}
