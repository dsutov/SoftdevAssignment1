import javax.swing.*;
import java.awt.*;

public class Part1 extends JFrame {
    private JButton btn1 = new JButton();
    private JButton btn2 = new JButton();
    private JButton btn3 = new JButton();

    public Part1(){
        getContentPane().setLayout(new FlowLayout());

        btn1.setPreferredSize(new Dimension(50,50));
        btn2.setPreferredSize(new Dimension(50,50));
        btn3.setPreferredSize(new Dimension(50,50));


        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);


        setSize(400,400);
        setTitle("Part 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Part1();
    }
}
