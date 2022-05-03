package frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
   //������
   public MyFrame(String title) {
      super(title);
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //�������� ���̾ƿ� �޴����� ������� �ʱ� ������ UI �� ���� ��ǥ�� ���� ��ġ�ؾ� �Ѵ�.
      setLayout(new BorderLayout());
      
      JButton btn1=new JButton("��ư1");
      
      add(btn1,BorderLayout.NORTH); //�����ӿ� btn1 �߰� �ϱ� 
      
      JButton btn2=new JButton("��ư2");
     
      add(btn2,BorderLayout.WEST); //�����ӿ� btn1 �߰� �ϱ� 
      
      JButton btn3=new JButton("��ư3");
    
      add(btn3,BorderLayout.EAST); //�����ӿ� btn1 �߰� �ϱ� 
      
      JButton btn4=new JButton("��ư4");
      
      add(btn4,BorderLayout.SOUTH);
      
      setVisible(true);
      
   }
   
   public static void main(String[] args) {
      new MyFrame("���� ������");
   }
   
}



