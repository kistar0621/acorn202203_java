package test.mypac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{
   //������
   public TestFrame(String title) {
      super(title);
      //�ʱ� ��ġ�� ũ�� ���� 
      this.setBounds(100, 100, 500, 500);
      //�������� �ݾ����� �ڵ����� ���μ��� ���� �ǵ��� 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //���̾ƿ� �޴����� ��� ���� �ʵ��� ���� 
      this.setLayout(null);
      
      //��ư��ü �����ؼ� 
      JButton btn=new JButton("��������");
      //ǥ�õ� ��ġ�� ũ�⸦ ������
      btn.setBounds(10, 10, 100, 40);
      
      //�����ӿ� �߰��ϱ�  this. ���� ���� 
      add(btn);
      //�������� ���̵��� �ϱ�
      setVisible(true);
   }
}


