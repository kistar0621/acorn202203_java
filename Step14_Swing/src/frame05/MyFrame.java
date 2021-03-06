package frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
   //생성자
   public MyFrame(String title) {
      super(title);
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //프레임의 레이아웃 메니저를 사용하지 않기 때문에 UI 를 절대 좌표에 직접 배치해야 한다.
      setLayout(new BorderLayout());
      
      JButton btn1=new JButton("버튼1");
      
      add(btn1,BorderLayout.NORTH); //프레임에 btn1 추가 하기 
      
      JButton btn2=new JButton("버튼2");
     
      add(btn2,BorderLayout.WEST); //프레임에 btn1 추가 하기 
      
      JButton btn3=new JButton("버튼3");
    
      add(btn3,BorderLayout.EAST); //프레임에 btn1 추가 하기 
      
      JButton btn4=new JButton("버튼4");
      
      add(btn4,BorderLayout.SOUTH);
      
      setVisible(true);
      
   }
   
   public static void main(String[] args) {
      new MyFrame("나의 프레임");
   }
   
}



