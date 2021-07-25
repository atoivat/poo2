package ginterface;

import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaRevista extends TelaIncluirBase {
    private JLabel nroLabel;
    private JTextField nroTextField;
    private JLabel anoLabel;
    private JTextField anoTextField;

    public TelaRevista() {
        super("Revistas", "Livros", "Titulo", "Org.", "Vol.");

        nroLabel = new JLabel("Nro.:");
		nroLabel.setBounds(200, 130, 70, 20);
		contentPane.add(nroLabel);
        
        nroTextField = new JTextField();
		nroTextField.setBounds(260, 130, 50, 26);
		contentPane.add(nroTextField);
		nroTextField.setColumns(10);
        
        anoLabel = new JLabel("Ano.:");
		anoLabel.setBounds(330, 130, 70, 20);
		contentPane.add(anoLabel);
        
        anoTextField = new JTextField();
		anoTextField.setBounds(390, 130, 50, 26);
		contentPane.add(anoTextField);
		anoTextField.setColumns(10);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRevista frame = new TelaRevista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
