package test.main;

import java.util.Scanner;

public class MainClass06 {
   public static void main(String[] args) {
      /*
       *     Scanner ��ü�� �̿��ؼ� ���ڿ��� 5�� �Է� �޴´�.
       *     �Է� ���� ���ڿ��� ���ʴ�� �迭�� ���� �Ǿ�� �Ѵ�.
       *     ��δ� �Է� ������ for ���� �̿��ؼ� �迭�� ����� 
       *     ��� ���ڿ��� �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��� ������.
       */
      Scanner scan=new Scanner(System.in);
      String[] msgs=new String[5];
      
      for(int i=0; i<msgs.length; i++) {
         System.out.print("���ڿ� �Է�:");
         String msg=scan.nextLine();
         msgs[i]=msg;
      }
      
      for(int i=0; i<msgs.length; i++) {
         String tmp=msgs[i];
         System.out.println(tmp);
      }
      
   }
}









	



