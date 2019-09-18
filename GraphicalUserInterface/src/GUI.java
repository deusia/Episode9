import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener{
    //创建按钮对象的引用
    JButton button;

    public static void main(String[] args){
        GUI gui=new GUI();
        gui.go();
    }
    public void go(){
        //创建窗口对象并连接引用
        JFrame frame =new JFrame();
        button=new JButton("按我");                             //创建按钮对象并赋予初值

        button.addActionListener(this);                            //添加对该按钮对象的监听

        frame.getContentPane().add(button);                          //把按钮添加到窗口上
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);                       //设定窗口大小
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

        button.setText("你已经按过我了");                            //更改点击后的文字
    }
}
