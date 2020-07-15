package Proyecto1;

import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class Settings extends JFrame{
	JPanel panel;
	JLabel et1;
	JTextField actual, nueva, nombre;
	JButton nuevoUser, actualizar;
	public Settings() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		et1 = new JLabel("Contraseña Actual");
		et1.setBounds(10, 10, 100, 20);
		et1.setForeground(Color.BLACK);
		panel.add(et1);
		actual = new JTextField();
		//continuar aquí 
	}
}
