package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JBajas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public JBajas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(64, 74, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.setBounds(75, 166, 89, 23);
		contentPane.add(btnNewButton);
		this.setVisible(true);
		
		
		
	}

}
