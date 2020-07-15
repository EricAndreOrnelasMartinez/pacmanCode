package Proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Start extends JFrame {
	JPanel panel;
	JButton b1, b2;
	JLabel et1, et2;
	ImageIcon pacmanA, pacmanC, fantasma;
	int aux = 0;
	Timer timer;
	Start ob;
	public Start() {
		ob = this;
		pacmanA = Ventana1.imagen;
		pacmanC = Ventana1.imagen2;
		fantasma = Ventana1.imagenf2;
		timer = new Timer(); 
		this.setSize(400, 400);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		this.add(panel);
		b1 = new JButton("Start");
		b1.setBounds(100, 300, 200, 40);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.yellow);
		b1.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(b1);
		b2 = new JButton("Exit");
		b2.setBounds(0, 360, 80, 30);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.yellow);
		b2.setFont(new Font("Arial", Font.PLAIN, 15));
		et1 = new JLabel();
		et1.setBounds(150, 200, 50, 50);
		et1.setIcon(new ImageIcon(pacmanA.getImage().getScaledInstance(et1.getWidth(), et1.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(et1); 
		et2 = new JLabel();
		et2.setBounds(70, 200, 50, 50);
		et2.setIcon(new ImageIcon(fantasma.getImage().getScaledInstance(et1.getWidth(), et1.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(et2); 
		Ventana1 v = new Ventana1();
		panel.add(b2);
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ob.setVisible(false);
				Ventana1.a = 0;
				Ventana1.a2 = 0;
				Ventana1.a3 = 0;
				v.setVisible(true);
			}
			
		};
		b1.addActionListener(ac);
		ActionListener ac1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
			
		};
		b2.addActionListener(ac1);
		TimerTask time = new TimerTask() {

			@Override
			public void run() {
				if(et1.getX() > 400) {
					et1.setLocation(0, 200);
				}
				if(et2.getX() > 400) {
					et2.setLocation(0, 200);
				}
				et1.setLocation(et1.getX() + 5, et1.getY());
				et2.setLocation(et2.getX() + 5, et2.getY());
				if(aux == 0) {
					et1.setIcon(new ImageIcon(pacmanA.getImage().getScaledInstance(et1.getWidth(), et1.getHeight(), Image.SCALE_SMOOTH)));
					if((aux == 1) == false) {
						aux = 1;
					}
					if(aux == 1) {
						et1.setIcon(new ImageIcon(pacmanC.getImage().getScaledInstance(et1.getWidth(), et1.getHeight(), Image.SCALE_SMOOTH)));
						if((aux == 0) == false) {
							aux = 0; 
						}
					}
				}
				
			}
		};
		timer.scheduleAtFixedRate(time, 100, 1);
		
	}

}
