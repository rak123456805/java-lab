import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swing{
    JLabel jlab;
    swing(){
    JFrame jfrim=new JFrame("Aa Event Listener");
    jfrim.setLayout(new FlowLayout());
    jfrim.setSize(220,90);
    jfrim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton jbtnAlpha=new JButton("Alpha");
    JButton jbtnBeta=new JButton("Beta");

    jbtnAlpha.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        jlab.setText("Alpha Was Pressed");
        }
    });
    jbtnBeta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        jlab.setText("Beta Was Pressed");
        }
    });
    jfrim.add(jbtnAlpha);
    jfrim.add(jbtnBeta);

    jlab=new JLabel("Press a Button");
    jfrim.add(jlab);
    jfrim.setVisible(true);
    }
    public static void main(String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new swing();
            }
        });
    }
}