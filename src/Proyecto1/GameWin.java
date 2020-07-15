package Proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class GameWin extends JFrame{
	JPanel panel; 
	JLabel men; 
	JButton b1; 
	int height = 200; 
	public GameWin() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		panel = new JPanel(); 
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
		this.add(panel); 
		b1 = new JButton("Exit"); 
		b1.setBounds(30, 200, 200, 50);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLUE); 
		panel.add(b1); 
		men = new JLabel("YOU WIN!!!");
		men.setOpaque(true);
		men.setBounds(0, 0, this.getWidth(), this.height);
		men.setBackground(Color.BLUE);
		men.setForeground(Color.WHITE);
		men.setFont(new Font("Arial",Font.PLAIN,40));
		panel.add(men); 
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
				
			}

		}; 
		b1.addActionListener(ac);
		
	}
}
