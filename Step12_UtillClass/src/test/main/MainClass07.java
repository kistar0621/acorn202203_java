package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
	final Map<String, Object>	map1=new HashMap<>();
	/*
	 * ������ ������ HashMap ��ü�� ������ ���� ���� 3������ ��ƺ�����
	 * 
	 * ��ȣ: 1
	 * �̸�: �豸��
	 * �������� ���� : true
	 */
	map1.put("num", 1);
	map1.put("name", "�豸��");
	map1.put("isMan", true);
	
	//map1�� ��� ��ȣ�� num, �̸��� name, �������� ���δ� isMan �̶�� ���� ������ ��� ������.
	int num= (int)map1.get("numb");
	String name=(String)map1.get("name");
	boolean isMan=(boolean)map1.get("isMan");
	
	//������ key������ �ٽ� ������ ����
	map1.put("name", "������");
	//Ư�� key ������ ��� ���� ����, �����ϸ�  true �����ϸ� false ����
	map1.remove(isMan);
	//��λ���
	map1.clear();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
