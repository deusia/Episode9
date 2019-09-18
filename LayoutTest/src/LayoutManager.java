import javax.swing.*;

public class LayoutManager {
    public static void main(String[] arg){
        LayoutManager layoutManager=new LayoutManager();
        layoutManager.createPanel();

    }

    public void createPanel(){
        JFrame frame =new JFrame();

        JPanel panelA=new JPanel();
        JPanel panelB=new JPanel();

        panelA.add(new JButton("button one"));
        panelA.add(new JButton("button two"));
        panelA.add(new JButton("button three"));

        panelB.add(panelA);

        frame.getContentPane().add(panelB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setVisible(true);

    }
}
