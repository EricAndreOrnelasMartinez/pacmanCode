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
public class GameOver extends JFrame {
	JPanel panel; 
	JLabel me; 
	JButton back;
	public GameOver() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		panel = new JPanel(); 
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		this.add(panel); 
		me = new JLabel("Game Over"); 
		me.setBounds(100, 100, 340, 200);
		me.setForeground(Color.RED);
		me.setFont(new Font("Arial",Font.PLAIN, 30 ));
		me.setVisible(true);
		panel.add(me);
		back = new JButton("Exit");
		back.setBounds(100, 300, 200, 50);
		back.setBackground(Color.RED);
		back.setForeground(Color.BLACK);
		panel.add(back); 
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana1.go.setVisible(false);
				System.exit(1);
				
			}
			
		}; 
		back.addActionListener(ac);
		
	}

}
