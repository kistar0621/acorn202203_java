package frame07;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
   //필드
   JButton sendBtn;
   JButton removeBtn;
   
   //생성자
   public MyFrame(String title) {
      super(title);
      //MyFrame 의 레이아웃 메니저 지정하기
      setLayout(new FlowLayout());
      //버튼
      sendBtn=new JButton("전송");
      removeBtn=new JButton("삭제");
      //프레임에 버튼 추가하기 ( FlowLayout 의 영향을 받는다 )
      add(sendBtn);
      add(removeBtn);
      
      sendBtn.addActionListener(this);
      removeBtn.addActionListener(this);
      
      //버튼의 액션 command 설정하기
      sendBtn.setActionCommand("send");
      removeBtn.setActionCommand("remove");
   }
   
   public static void main(String[] args) {
      JFrame f=new MyFrame("나의 프레임");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100,  100, 500, 500);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
    String command=  e.getActionCommand();
     //분기하다.
    if(command.equals("send")) {
    	JOptionPane.showMessageDialog(this, "전송");
    	
    }else if(command.equals("remove")) {
    	JOptionPane.showMessageDialog(this, "삭제");
    }
      
   }
   
}














