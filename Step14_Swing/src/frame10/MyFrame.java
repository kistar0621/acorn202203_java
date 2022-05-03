package frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
   //�ʵ�
   JTextField tf_num1, tf_num2;
   JLabel label_result;
   
   
   //default  ������
   public MyFrame() {
      //�������� ���̾ƿ� ��Ģ �����ϱ� 
      setLayout(new BorderLayout());
      
      //JPanel
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      //Panel �� ���ʿ� ��ġ�ϱ� 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
      JTextField tf_num1=new JTextField(10);
      topPanel.add(tf_num1);
      //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
      JButton plusBtn=new JButton("+");
      JButton minusBtn=new JButton("-");
      JButton multiBtn=new JButton("*");
      JButton divideBtn=new JButton("/");
      topPanel.add(plusBtn);
      topPanel.add(minusBtn);
      topPanel.add(multiBtn);
      topPanel.add(divideBtn);
      //�ι�° JTextField  ���� ��ο� �߰� �ϱ� 
      JTextField tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      //JLabel
      JLabel label1=new JLabel("=");
      JLabel label_result=new JLabel("0");
      //��ο� ���̺� �߰��ϱ�
      topPanel.add(label1);
      topPanel.add(label_result);
      
      //��ư�� ������ ����ϱ�
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);
      //��ư�� �׼� command �����ϱ�
      plusBtn.setActionCommand("plus");
      minusBtn.setActionCommand("minus");
      multiBtn.setActionCommand("multi");
      divideBtn.setActionCommand("divide");
      
   }
   
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      MyFrame frame=new MyFrame();
      //�������� ���� ����
      frame.setTitle("����");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }
   //ActionListener �������̽��� ���� �ؼ� ���� �������̵�� �޼ҵ� 
   @Override
   public void actionPerformed(ActionEvent e) {
      try {
         //JTextField �� �Է��� ���ڿ��� �о�ͼ� ����(�Ǽ�)�� �ٲ��ش�.
         double num1=Double.parseDouble(tf_num1.getText());
         double num2=Double.parseDouble(tf_num2.getText());
         //������ ������� ���� ���� ����
         double result=0;
         //������ ��ư�� command �о����
         String command=e.getActionCommand();
         if(command.equals("plus")) {
            result=num1+num2;
         }else if(command.equals("minus")) {
            result=num1-num2;
         }else if(command.equals("multi")) {
            result=num1*num2;
         }else if(command.equals("divide")) {
            result=num1/num2;
         }
         //��� ���� JLabel �� ����ϱ� 
         label_result.setText(Double.toString(result));
      }catch(Exception exe) {
         JOptionPane.showMessageDialog(this, "���� �������� �Է��� �ּ���");
      }
   }
}





