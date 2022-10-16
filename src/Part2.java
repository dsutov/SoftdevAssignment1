import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Part2 extends JFrame implements ActionListener {
    private JButton btn1 = new JButton();
    private JButton btn2 = new JButton();
    private JButton btn3 = new JButton();

    private JCheckBox checkBox = new JCheckBox("Give Colours", false);

    public Part2(){
        getContentPane().setLayout(new FlowLayout());

        btn1.setPreferredSize(new Dimension(50,50));
        btn2.setPreferredSize(new Dimension(50,50));
        btn3.setPreferredSize(new Dimension(50,50));
        checkBox.addActionListener(this);

        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(checkBox);


        setSize(400,400);
        setTitle("Part 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Part2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkBox){
            if(checkBox.equals(true)){
                btn1.setBackground(Color.RED);
                btn2.setBackground(Color.GREEN);
                btn3.setBackground(Color.BLUE);
            }
            /*if(checkBox.equals(false)){
                btn1.setBackground(Color.GRAY);
                btn2.setBackground(Color.GRAY);
                btn3.setBackground(Color.GRAY);
            }*/
        }
    }
}

