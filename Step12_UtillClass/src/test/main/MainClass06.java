package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass06 {
   public static void main(String[] args) {
      //1. Member ��ü�� ������ �ִ� ArrayList ��ü�� �����ؼ� �������� members ��� ���������� ��� ������.
      List<Member> members=new ArrayList<>();
      //2. 3���� ȸ�������� Member ��ü�� ���� ��� ������. (Member ��ü�� 3�� �����Ǿ�� ��)
      //3. ������ ������ Member ��ü�� �������� members List ��ü�� ��� ��� ������.
      members.add(new Member(1, "�豸��", "�뷮��"));
      members.add(new Member(2, "�ذ�", "��ŵ�"));
      Member m1=new Member();
      m1.num=3;
      m1.name="������";
      m1.addr="�󵵵�";
      members.add(m1);
      /*
       *  4. members List ��ü�� ��� ������ �̿��ؼ� ȸ�� ����� �Ʒ��� ���� ��������
       *  �ݺ��� ���鼭 ����� ������.
       *  
       *  ��ȣ: 1, �̸�: �豸��, �ּ�: �뷮��
       *  ��ȣ: 2, �̸�: �ذ�, �ּ�: ��ŵ�
       *  .
       *  .
       */
      for(Member tmp:members) {
         System.out.println("��ȣ:"+tmp.num+", �̸�:"+tmp.name+", �ּ�:"+tmp.addr);
      }
   }
}














