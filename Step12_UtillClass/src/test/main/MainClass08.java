package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		Map<String,String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		/*
		 * 검색할 단어를 입력하세요:house
		 * house의 뜻은 집입니다.
		 * 검색할 단어를 입력하세요:gura
		 * gura는 목록에 없습니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요");
		String word=scan.nextLine();
		
		//Map객체에 해당 키값으로 저장된 값이 있는지 일어와 본다.
		String mean=dic.get(word);
		if(mean == null) {//찾는 단어가 없는 경우
			System.out.println(word+" 는 목록에 없습니다.");
			}else {//찾는 단어가 있는 경우
				System.out.println(word+" 의 뜻은 "+mean+"입니다");
			}
	}
}
