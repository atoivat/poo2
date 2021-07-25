package ginterface;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaIncluirBase extends TelaBase {
    protected JButton addButton;
    protected JButton toggleButton;
    protected JButton listButton;
    protected JLabel firstLabel;
    protected JTextField firstTextField;
    protected JLabel secondLabel;
    protected JTextField secondTextField;
    protected JLabel thirdLabel;
    protected JTextField thirdTextField;

    public TelaIncluirBase(String title, String toggleTitle, String first, String second, String third) {
        super(title);

        addButton = new JButton("Incluir");
		addButton.setBounds(70, 200, 100, 30);
		contentPane.add(addButton);
        
        toggleButton = new JButton(toggleTitle);
		toggleButton.setBounds(220, 200, 100, 30);
		contentPane.add(toggleButton);
        
        listButton = new JButton("Listagem");
		listButton.setBounds(340, 200, 100, 30);
		contentPane.add(listButton);

        firstLabel = new JLabel(first);
		firstLabel.setBounds(70, 70, 70, 20);
		contentPane.add(titleLabel);
        
        first = first.concat(":");
        firstLabel = new JLabel(first);
		firstLabel.setBounds(70, 70, 70, 20);
		contentPane.add(firstLabel);

        firstTextField = new JTextField();
		firstTextField.setBounds(130, 70, 310, 26);
		contentPane.add(firstTextField);
		firstTextField.setColumns(10);
        
        second = second.concat(":");
        secondLabel = new JLabel(second);
		secondLabel.setBounds(70, 100, 70, 20);
		contentPane.add(secondLabel);
        
        secondTextField = new JTextField();
		secondTextField.setBounds(130, 100, 310, 26);
		contentPane.add(secondTextField);
		secondTextField.setColumns(10);
        
        third = third.concat(":");
        thirdLabel = new JLabel(third);
		thirdLabel.setBounds(70, 130, 70, 20);
		contentPane.add(thirdLabel);
        
        thirdTextField = new JTextField();
		thirdTextField.setBounds(130, 130, 50, 26);
		contentPane.add(thirdTextField);
		thirdTextField.setColumns(10);

    }

	public JButton getToggleButton() {
		return toggleButton;
	}

	public JButton getListButton() {
		return listButton;
	}
}
