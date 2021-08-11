package poo2.ginterface;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaBase extends JFrame {
    protected JPanel contentPane;
    protected JLabel titleLabel;

    public TelaBase(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        titleLabel = new JLabel(title);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        titleLabel.setBounds(200, 30, 200, 20);
        contentPane.add(titleLabel);
    }


    public void errorPanel(String msg) {
        JOptionPane.showMessageDialog(this, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void successPanel(String msg) {
        JOptionPane.showMessageDialog(this, msg, "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }
}