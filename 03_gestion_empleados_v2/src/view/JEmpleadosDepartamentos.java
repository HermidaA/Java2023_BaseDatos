package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.EmpleadosService;
import view.adapters.TablaEmpleadosModel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JEmpleadosDepartamentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDepartamento;
	private JTable tbEmpleados;

	public JEmpleadosDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Introduce Departamento");
		lblNombre.setBounds(10, 42, 124, 26);
		contentPane.add(lblNombre);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(212, 45, 131, 20);
		contentPane.add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JButton btnEmpleados = new JButton("Ver empleados");
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbEmpleados.setModel(new TablaEmpleadosModel(txtDepartamento.getText()));
				
			}
		});
		btnEmpleados.setBounds(131, 101, 89, 23);
		contentPane.add(btnEmpleados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 135, 262, 103);
		contentPane.add(scrollPane);
		
		tbEmpleados = new JTable();
		scrollPane.setViewportView(tbEmpleados);
		this.setVisible(true);
	}
}
