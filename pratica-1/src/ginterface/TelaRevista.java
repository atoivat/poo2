package ginterface;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import domain.Material;
import domain.Revista;

public class TelaRevista extends TelaIncluirBase {
    private JLabel nroLabel;
    private JTextField nroTextField;
    private JLabel anoLabel;
    private JTextField anoTextField;

    public TelaRevista(List<Material> list) {
        super("Revistas", "Livros", "Titulo", "Org.", "Vol.");

        nroLabel = new JLabel("Nro.:");
        nroLabel.setBounds(200, 130, 70, 20);
        contentPane.add(nroLabel);
        
        nroTextField = new JTextField();
        nroTextField.setBounds(260, 130, 50, 26);
        contentPane.add(nroTextField);
        nroTextField.setColumns(10);
        
        anoLabel = new JLabel("Ano:");
        anoLabel.setBounds(330, 130, 70, 20);
        contentPane.add(anoLabel);
        
        anoTextField = new JTextField();
        anoTextField.setBounds(390, 130, 50, 26);
        contentPane.add(anoTextField);
        anoTextField.setColumns(10);

        addButton.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e){
                String titulo = firstTextField.getText();
                String org = secondTextField.getText();
                String vol = thirdTextField.getText();
                String nro = nroTextField.getText();
                String ano = anoTextField.getText();
                try{
                    Revista r = new Revista(titulo, org, vol, nro, ano);
                    list.add(r);

                    successPanel("Revista adicionada com sucesso!");

                    firstTextField.setText("");
                    secondTextField.setText("");
                    thirdTextField.setText("");
                    nroTextField.setText("");
                    anoTextField.setText("");
                } catch (Exception exc) {
                    errorPanel(exc.getMessage());
                }
            }
        });
    }
}
