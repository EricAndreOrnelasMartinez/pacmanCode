package Proyecto1;

import java.awt.Color;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Inicio extends JFrame{
	JPanel panel; 
	JLabel men; 
	JButton b1; 
	JLabel L1; 
	JLabel L2; 
	JLabel L3; 
	JLabel L4; 
	JLabel L5; 
	JLabel L6; 
	int height = 400; 
	Timer timer; 
	Inicio ob;
	public Inicio() {
		ob = this;
		timer = new Timer(); 
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		panel = new JPanel(); 
		panel.setLayout(null);
		//panel.setBackground(Color.BLUE);
		this.add(panel); 
		L1 = new JLabel();
		L1.setBounds(50, 300, 50, 20);
		L1.setVisible(true);
		L1.setOpaque(true);
		L1.setBackground(Color.WHITE);
		panel.add(L1); 
		L2 = new JLabel();
		L2.setBounds(100, 300, 30, 20);
		L2.setVisible(true);
		L2.setOpaque(true);
		L2.setBackground(Color.WHITE);
		panel.add(L2); 
		L3 = new JLabel();
		L3.setBounds(130, 300, 70, 20);
		L3.setVisible(true);
		L3.setOpaque(true);
		L3.setBackground(Color.WHITE);
		panel.add(L3); 
		L4 = new JLabel();
		L4.setBounds(200, 300, 40, 20);
		L4.setVisible(true);
		L4.setOpaque(true);
		L4.setBackground(Color.WHITE);
		panel.add(L4); 
		L5 = new JLabel();
		L5.setBounds(240, 300, 40, 20);
		L5.setVisible(true);
		L5.setOpaque(true);
		L5.setBackground(Color.WHITE);
		panel.add(L5); 
		L6 = new JLabel();
		L6.setBounds(280, 300, 30, 20);
		L6.setVisible(true);
		L6.setOpaque(true);
		L6.setBackground(Color.WHITE);
		panel.add(L6); 
		ImageIcon imagen = new ImageIcon("fondo4.jpg"); 
		men = new JLabel("");
		men.setOpaque(true);
		men.setBounds(0, 0, this.getWidth(), this.height);
		men.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)));
		men.setVisible(true);
		panel.add(men); 
		this.setVisible(true);
		TimerTask time = new TimerTask() {

			@Override
			public void run() {
				L1.setBackground(Color.GREEN);
				
			}
			
		}; 
		timer.schedule(time, 1000);
		TimerTask time2 = new TimerTask() {

			@Override
			public void run() {
				L2.setBackground(Color.GREEN);
				
			}
			
		}; 
		timer.schedule(time2, 2000);
		TimerTask time3= new TimerTask() {

			@Override
			public void run() {
				L3.setBackground(Color.GREEN);
				
			}
			
		}; 
		timer.schedule(time3, 4000);
		TimerTask time4= new TimerTask() {

			@Override
			public void run() {
				L4.setBackground(Color.GREEN);
				
			}
			
		}; 
		timer.schedule(time4, 5000);
		TimerTask time5= new TimerTask() {

			@Override
			public void run() {
				L5.setBackground(Color.GREEN);
				
			}
			
		}; 
		timer.schedule(time5, 7000);
		TimerTask time6= new TimerTask() {

			@Override
			public void run() {
				L6.setBackground(Color.GREEN);
				ob.setVisible(false);
		    	 Start st = new Start();
		    	 st.setVisible(true);
			}
			
		}; 
		timer.schedule(time6, 9000);
	}
}
