package test.main;

public class MainClass12 {
	public static void main(String[] args) {
		//정확한 반복 횟수를 알 수 없을 때 사용할 수 있는 반복문
		int count=0;
		while(true) {
			count++;
			System.out.println("반복횟수:"+count);
			if(count==1000) {
				break;//반복문 블럭 탈출
			}
		}
		
	}
}
