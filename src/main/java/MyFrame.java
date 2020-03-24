import javax.swing.*;
import java.awt.*;

/*
 * @Author  :bob
 * @Date    :Created in 17:06 2020/3/24
 * @Description:
 *
 */
public class MyFrame extends JFrame {

    JLabel label = new JLabel("null");

    public MyFrame(){
       super("count");
       setSize(300, 400);
       setVisible(true);
       setLayout(new FlowLayout());

       label.setFont(new Font("宋体",Font.BOLD, 200));
       add(label);
   }
   public void updateLabel(int num){
        label.setText(String.valueOf(num));
   }





}
