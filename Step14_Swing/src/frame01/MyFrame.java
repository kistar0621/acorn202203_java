package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
   //������
   public MyFrame(String title) {
      super(title);
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //�������� ���̾ƿ� �޴����� ������� �ʱ� ������ UI �� ���� ��ǥ�� ���� ��ġ�ؾ� �Ѵ�.
      setLayout(null);
      
      JButton btn1=new JButton("��ư1");
      //��ư�� ��ġ
      btn1.setLocation(10, 10);
      //��ư�� ũ��
      btn1.setSize(100, 30);
      add(btn1); //�����ӿ� btn1 �߰� �ϱ� 
      
      JButton btn2=new JButton("��ư2");
      //��ư�� ��ġ
      btn2.setLocation(120, 10);
      //��ư�� ũ��
      btn2.setSize(100, 30);
      add(btn2); //�����ӿ� btn1 �߰� �ϱ� 
      
      JButton btn3=new JButton("��ư3");
      //��ư�� ��ġ
      btn3.setLocation(230, 10);
      //��ư�� ũ��
      btn3.setSize(100, 30);
      add(btn3); //�����ӿ� btn1 �߰� �ϱ� 
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new MyFrame("���� ������");
   }
   
}



