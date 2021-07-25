package ginterface;

import java.awt.EventQueue;
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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBase frame = new TelaBase("Tela Base");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

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

	public void warningPanel(String msg) {
		JOptionPane.showMessageDialog(this, msg, "WARNING", JOptionPane.WARNING_MESSAGE);
	}

	public void successPanel(String msg) {
		JOptionPane.showMessageDialog(this, msg, "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
	}
}