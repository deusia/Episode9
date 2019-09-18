import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui3D {

    private int x=70;
    private int y=70;
    public static void main(String[] args){
        Gui3D gui3D=new Gui3D();
        gui3D.go();
    }

    //创建组件的引用
    private JButton labelButton,colorButton;
    private JLabel label;
    private JFrame frame;

//    public void go(){
//        frame=new JFrame();                                      //创建实列对象
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //创建实例并设立监听
//        labelButton =new JButton("change label");
//        labelButton.addActionListener(new LabelListener());
//
//        //创建实例并设立监听
//        colorButton=new JButton("Change Circle");
//        colorButton.addActionListener(new ColorListener());
//
//        label =new JLabel("I'm a label");
//        MyDrawPanel drawPanel=new MyDrawPanel();
//
//        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
//        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
//        frame.getContentPane().add(BorderLayout.EAST,labelButton);
//        frame.getContentPane().add(BorderLayout.WEST, label);
//
//
//        frame.setSize(300,300);
//        frame.setVisible(true);
//    }

    public void go(){
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myDrawPanel=new MyDrawPanel();

        frame.getContentPane().add(myDrawPanel);
        frame.setSize(600 ,600);
        frame.setVisible(true);


        for (int i=0;i<130;i++){
            x++;
            y++;

            //重新绘制画板
            myDrawPanel.repaint();

            try {
                Thread.sleep(50);
            }catch (Exception ex){
            }
        }
    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics graphics){
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,this.getWidth(),this.getHeight());

            graphics.setColor(Color.orange);
            graphics.fillOval(x,y,40,40);
        }
    }


    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            label.setText("Ough!");
        }
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }

}
