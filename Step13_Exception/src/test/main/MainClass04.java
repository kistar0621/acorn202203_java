package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("c:/accon_202203/myFolder/memo.txt");
		//���� ��ο� ������ ������ ����� �ִ� file ��ü�� �޼ҵ带 ã�Ƽ� �����ϰ�
		//������ ������ ����������� Ȯ���� ������.
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main �޼ҵ尡 ����˴ϴ�");
	}
}
