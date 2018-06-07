package mpp.lab5.p1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class AddressWindow extends JFrame {
	public AddressWindow() {

		JButton button = new JButton("Submit Address Information");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				RuleSet addressRules = RuleSetFactory.getRuleSet(AddressWindow.this);
				try {
					addressRules.applyRules(AddressWindow.this);
					// if rules pass...
					// submit data
				} catch (RuleException e) {
					JOptionPane.showMessageDialog(AddressWindow.this, "Error: " + e.getMessage(), "Error",
							JOptionPane.ERROR_MESSAGE);

				}
			}

		});

		JPanel mainPanel = new JPanel();
		mainPanel.add(button);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(320, 240);

	}

	private static final long serialVersionUID = 898343560683602553L;
	
	public String getZipValue() {
		return "56756";
	}

}
