package Proyecto1;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Ventana2 extends JFrame{

    private static final long serialVersionUID = 1L;
    public static GameOver go;
    public static GameWin gw; 
    JPanel panel; 
    public static ImageIcon imagen = new ImageIcon("pacmancd.png");
    public static ImageIcon imagen2 = new ImageIcon("pacmanad.png");
    ImageIcon imagena = new ImageIcon("pacmanaa.png");
    ImageIcon imagenb = new ImageIcon("pacmancab.png");
    ImageIcon imageni = new ImageIcon("pacmanai.png");
    ImageIcon imagenf = new ImageIcon("fantasma.png");
    public static ImageIcon imagenf2 = new ImageIcon("fantasma2.png");
    public static int a = -1;
    public static int a2 = -1; 
    public static int a3 = -1;
    int a5 = 0; 
    int a6 = 0;
    int a7 = 0; 
    int d;
    int a8 = 0; 
    int muerte = 0;
    int lifes = 3;
    boolean coulddie = false;
    JButton b1; 
    JLabel target1, target2, target3, target4, target5, target6, target7; 
    JLabel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27,
    p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, salida, item;  
    Ventana2 ob;
    JLabel ghost1, ghost2, ghost3, ghost4, ghost5, ghost6, life1, life2, life3;  
    Timer timer, timer2, timer3, timer4, timer5, timer6, timer8, timer9, timer10; 
    public Ventana2() {
    	go = new GameOver();
    	gw = new GameWin(); 
        ob = this; 
        this.setSize(700, 530);
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        panel = new JPanel(); 
        panel.setLayout(null);
        panel.setBackground(Color.black );
        panel.setBorder( new LineBorder(Color.RED, 11, true));
        this.add(panel); 
        target1 = new JLabel(); 
        target1.setSize(50, 50);
        target1.setLocation(115, 30);
        target1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(target1.getWidth(), target1.getHeight(), Image.SCALE_SMOOTH)));
        //target1.setOpaque(true);
        //target1.setBackground(Color.green);
        panel.add(target1); 
        target2 = new JLabel(); 
        target2.setSize(100, 100);
        target2.setLocation(100, 300);
        target2.setOpaque(true);
        target2.setBackground(Color.BLACK);
        target2.setBorder(new LineBorder(Color.BLUE, 10, true));
        panel.add(target2); 
        target3 = new JLabel(); 
        target3.setSize(100, 100);
        target3.setLocation(300, 300);
        target3.setOpaque(true);
        target3.setBackground(Color.BLACK);
        target3.setBorder(new LineBorder(Color.BLUE, 10, true));
        panel.add(target3); 
        target4 = new JLabel(); 
        target4.setSize(100, 100);
        target4.setLocation(500, 300);
        target4.setOpaque(true);
        target4.setBackground(Color.BLACK);
        target4.setBorder(new LineBorder(Color.BLUE, 10, true));
        panel.add(target4); 
        target5 = new JLabel(); 
        target5.setSize(100, 100);
        target5.setLocation(100, 100);
        target5.setOpaque(true);
        target5.setBackground(Color.BLACK);
        target5.setBorder(new LineBorder(Color.BLUE, 10, true));
        panel.add(target5); 
        target6 = new JLabel(); 
        target6.setSize(100, 100);
        target6.setLocation(300, 100);
        target6.setOpaque(true);
        target6.setBackground(Color.BLACK);
        target6.setBorder(new LineBorder(Color.BLUE, 10, true));
        panel.add(target6);
        target7 = new JLabel(); 
        target7.setSize(100, 100);
        target7.setLocation(500, 100);
        target7.setOpaque(true);
        target7.setBackground(Color.BLACK);
        target7.setBorder(new LineBorder(Color.BLUE, 10, true));
        ghost1 = new JLabel(); 
        ghost1.setBounds(400, 430, 40, 40);
        ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
        //ghost1.setOpaque(true);
        //ghost1.setBackground(Color.white);
        panel.add(ghost1); 
        panel.add(target7); 
        ghost2 = new JLabel(); 
        ghost2.setBounds(400, 430, 40, 40);
        panel.add(ghost2); 
        ghost3 = new JLabel(); 
        ghost3.setBounds(235, 235, 40, 40);
        panel.add(ghost3); 
        life1 = new JLabel();
        life1.setBounds(15, 15, 10, 10);
        life1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(life1.getWidth(), life1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(life1);
        life2 = new JLabel();
        life2.setBounds(27, 15, 10, 10);
        life2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(life1.getWidth(), life1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(life2);
        life3 = new JLabel();
        life3.setBounds(39, 15, 10, 10);
        life3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(life1.getWidth(), life1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(life3);
        b1 = new JButton(); 
        b1.setBounds(0, 0, 1, 1);
        panel.add(b1); 
        p1 = new JLabel(); 
        p1.setBounds(40, 40, 20, 20);
        p1.setOpaque(true);
        p1.setBackground(Color.YELLOW);
        panel.add(p1); 
        p2 = new JLabel(); 
        p2.setBounds(40, 100, 20, 20);
        p2.setOpaque(true);
        p2.setBackground(Color.YELLOW);
        panel.add(p2); 
        p3 = new JLabel(); 
        p3.setBounds(40, 160, 20, 20);
        p3.setOpaque(true);
        p3.setBackground(Color.YELLOW);
        panel.add(p3); 
        p4 = new JLabel(); 
        p4.setBounds(40, 220, 20, 20);
        p4.setOpaque(true);
        p4.setBackground(Color.YELLOW);
        panel.add(p4); 
        p5 = new JLabel(); 
        p5.setBounds(40, 280, 20, 20);
        p5.setOpaque(true);
        p5.setBackground(Color.YELLOW);
        panel.add(p5); 
        p6 = new JLabel(); 
        p6.setBounds(40, 340, 20, 20);
        p6.setOpaque(true);
        p6.setBackground(Color.YELLOW);
        panel.add(p6); 
        p7 = new JLabel(); 
        p7.setBounds(40, 400, 20, 20);
        p7.setOpaque(true);
        p7.setBackground(Color.YELLOW);
        panel.add(p7); 
        p8 = new JLabel(); 
        p8.setBounds(100, 430, 20, 20);
        p8.setOpaque(true);
        p8.setBackground(Color.YELLOW);
        panel.add(p8); 
        p9 = new JLabel(); 
        p9.setBounds(160, 430, 20, 20);
        p9.setOpaque(true);
        p9.setBackground(Color.YELLOW);
        panel.add(p9); 
        p10 = new JLabel(); 
        p10.setBounds(220, 430, 20, 20);
        p10.setOpaque(true);
        p10.setBackground(Color.YELLOW);
        panel.add(p10); 
        p11 = new JLabel(); 
        p11.setBounds(280, 430, 20, 20);
        p11.setOpaque(true);
        p11.setBackground(Color.YELLOW);
        panel.add(p11); 
        p12 = new JLabel(); 
        p12.setBounds(340, 430, 20, 20);
        p12.setOpaque(true);
        p12.setBackground(Color.YELLOW);
        panel.add(p12); 
        p13 = new JLabel(); 
        p13.setBounds(400, 430, 20, 20);
        p13.setOpaque(true);
        p13.setBackground(Color.YELLOW);
        panel.add(p13); 
        p14 = new JLabel(); 
        p14.setBounds(460, 430, 20, 20);
        p14.setOpaque(true);
        p14.setBackground(Color.YELLOW);
        panel.add(p14); 
        p15 = new JLabel(); 
        p15.setBounds(520, 430, 20, 20);
        p15.setOpaque(true);
        p15.setBackground(Color.YELLOW);
        panel.add(p15); 
        p16 = new JLabel(); 
        p16.setBounds(580, 430, 20, 20);
        p16.setOpaque(true);
        p16.setBackground(Color.YELLOW);
        panel.add(p16); 
        p17 = new JLabel(); 
        p17.setBounds(640, 430, 20, 20);
        p17.setOpaque(true);
        p17.setBackground(Color.YELLOW);
        panel.add(p17); 
        p18 = new JLabel(); 
        p18.setBounds(640, 370, 20, 20);
        p18.setOpaque(true);
        p18.setBackground(Color.YELLOW);
        panel.add(p18); 
        p19 = new JLabel(); 
        p19.setBounds(640, 310, 20, 20);
        p19.setOpaque(true);
        p19.setBackground(Color.YELLOW);
        panel.add(p19); 
        p20 = new JLabel(); 
        p20.setBounds(640, 250, 20, 20);
        p20.setOpaque(true);
        p20.setBackground(Color.YELLOW);
        panel.add(p20); 
        p21 = new JLabel(); 
        p21.setBounds(640, 190, 20, 20);
        p21.setOpaque(true);
        p21.setBackground(Color.YELLOW);
        panel.add(p21); 
        p22 = new JLabel(); 
        p22.setBounds(640, 130, 20, 20);
        p22.setOpaque(true);
        p22.setBackground(Color.YELLOW);
        panel.add(p22); 
        p23 = new JLabel(); 
        p23.setBounds(640, 70, 20, 20);
        p23.setOpaque(true);
        p23.setBackground(Color.YELLOW);
        panel.add(p23); 
        p24 = new JLabel(); 
        p24.setBounds(580, 40, 20, 20);
        p24.setOpaque(true);
        p24.setBackground(Color.YELLOW);
        panel.add(p24); 
        p25 = new JLabel(); 
        p25.setBounds(520, 40, 20, 20);
        p25.setOpaque(true);
        p25.setBackground(Color.YELLOW);
        panel.add(p25); 
        p26 = new JLabel(); 
        p26.setBounds(460, 40, 20, 20);
        p26.setOpaque(true);
        p26.setBackground(Color.YELLOW);
        panel.add(p26); 
        p27 = new JLabel(); 
        p27.setBounds(400, 40, 20, 20);
        p27.setOpaque(true);
        p27.setBackground(Color.YELLOW);
        panel.add(p27); 
        p28 = new JLabel(); 
        p28.setBounds(340, 40, 20, 20);
        p28.setOpaque(true);
        p28.setBackground(Color.YELLOW);
        panel.add(p28); 
        p29 = new JLabel(); 
        p29.setBounds(280, 40, 20, 20);
        p29.setOpaque(true);
        p29.setBackground(Color.YELLOW);
        panel.add(p29); 
        p30 = new JLabel(); 
        p30.setBounds(220, 40, 20, 20);
        p30.setOpaque(true);
        p30.setBackground(Color.YELLOW);
        panel.add(p30); 
        p31 = new JLabel(); 
        p31.setBounds(100, 240, 20, 20);
        p31.setOpaque(true);
        p31.setBackground(Color.YELLOW);
        panel.add(p31); 
        p32 = new JLabel(); 
        p32.setBounds(160, 240, 20, 20);
        p32.setOpaque(true);
        p32.setBackground(Color.YELLOW);
        panel.add(p32); 
        item = new JLabel("?", SwingConstants.CENTER); 
        item.setBounds(220, 240, 20, 20);
        item.setOpaque(true);
        item.setBackground(Color.RED);
        panel.add(item); 
        p47 = new JLabel(); 
        p47.setBounds(280, 240, 20, 20);
        p47.setOpaque(true);
        p47.setBackground(Color.YELLOW);
        panel.add(p47); 
        p34 = new JLabel(); 
        p34.setBounds(340, 240, 20, 20);
        p34.setOpaque(true);
        p34.setBackground(Color.YELLOW);
        panel.add(p34); 
        p35 = new JLabel(); 
        p35.setBounds(400, 240, 20, 20);
        p35.setOpaque(true);
        p35.setBackground(Color.YELLOW);
        panel.add(p35); 
        p36 = new JLabel(); 
        p36.setBounds(460, 240, 20, 20);
        p36.setOpaque(true);
        p36.setBackground(Color.YELLOW);
        panel.add(p36);
        p37 = new JLabel(); 
        p37.setBounds(520, 240, 20, 20);
        p37.setOpaque(true);
        p37.setBackground(Color.YELLOW);
        panel.add(p37);
        p38 = new JLabel(); 
        p38.setBounds(580, 240, 20, 20);
        p38.setOpaque(true);
        p38.setBackground(Color.YELLOW);
        panel.add(p38);
        p39 = new JLabel(); 
        p39.setBounds(target6.getX() - 60,110, 20, 20);
        p39.setOpaque(true);
        p39.setBackground(Color.YELLOW);
        panel.add(p39);
        p40 = new JLabel(); 
        p40.setBounds(target6.getX() - 60,170, 20, 20);
        p40.setOpaque(true);
        p40.setBackground(Color.YELLOW);
        panel.add(p40);
        p41 = new JLabel(); 
        p41.setBounds(target6.getX() - 60, 315, 20, 20);
        p41.setOpaque(true);
        p41.setBackground(Color.YELLOW);
        panel.add(p41);
        p42 = new JLabel(); 
        p42.setBounds(target6.getX() - 60, 315 + 60, 20, 20);
        p42.setOpaque(true);
        p42.setBackground(Color.YELLOW);
        panel.add(p42);
        p43 = new JLabel(); 
        p43.setBounds(target6.getX() + 140, 110, 20, 20);
        p43.setOpaque(true);
        p43.setBackground(Color.YELLOW);
        panel.add(p43);
        p44 = new JLabel(); 
        p44.setBounds(target6.getX() + 140, 170, 20, 20);
        p44.setOpaque(true);
        p44.setBackground(Color.YELLOW);
        panel.add(p44);
        p45 = new JLabel(); 
        p45.setBounds(target6.getX() + 140, 315, 20, 20);
        p45.setOpaque(true);
        p45.setBackground(Color.YELLOW);
        panel.add(p45);
        p46 = new JLabel(); 
        p46.setBounds(target6.getX() + 140, 315 + 60, 20, 20);
        p46.setOpaque(true);
        p46.setBackground(Color.YELLOW);
        panel.add(p46);
        salida = new JLabel(); 
        salida.setBounds(40, 460, 60, 30);
        salida.setOpaque(true);
        salida.setVisible(false); 
        salida.setBackground(Color.BLUE);
        panel.add(salida); 
        timer4 = new Timer(); timer5 = new Timer(); timer10 = new Timer(); 
        KeyListener key = new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(target1.getX() > 10 && canmoveleft()){
                    if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT){
                    int x = target1.getX() - 5;
                    target1.setLocation(x, target1.getY());
                    target1.setIcon(new ImageIcon(getImageI().getImage().getScaledInstance(target1.getWidth(), 40, Image.SCALE_FAST)));
                    }
                }
                if(target1.getX() < 621 && canmoveright()){
                    if(e.getKeyChar() == 'D' || e.getKeyChar() == 'd' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
                    int x = target1.getX() + 5;
                    //ImageIcon imageIcon = getImage();
                    target1.setLocation(x, target1.getY());
                    target1.setIcon(new ImageIcon(getImage().getImage().getScaledInstance(target1.getWidth(), 40, Image.SCALE_FAST)));
                    }
                }
                if(target1.getY() < 430 && canmovedown()){
                    if(e.getKeyChar() == 's' || e.getKeyChar() == 'S' || e.getExtendedKeyCode() == KeyEvent.VK_DOWN){
                    int y = target1.getY() + 5;
                    target1.setLocation(target1.getX(), y);
                    target1.setIcon(new ImageIcon(getImageB().getImage().getScaledInstance(target1.getWidth(), 40, Image.SCALE_FAST)));
                    }
                }
                if(target1.getY() > 10 && cantmoveup()){
                    if(e.getKeyChar() == 'W' || e.getKeyChar() == 'w' || e.getExtendedKeyCode() == KeyEvent.VK_UP){
                    int y = target1.getY() - 5;
                    target1.setLocation(target1.getX(), y);
                    target1.setIcon(new ImageIcon(getImageA().getImage().getScaledInstance(target1.getWidth(), 40, Image.SCALE_FAST)));
                    }
                }
                if(touchP(p1)){
                    p1.setVisible(false);
                }else if(touchP(p2)){
                    p2.setVisible(false);
                }else if(touchP(p3)){
                    p3.setVisible(false);
                }else if(touchP(p4)){
                    p4.setVisible(false);
                }else if(touchP(p5)){
                    p5.setVisible(false);
                }else if(touchP(p6)){
                    p6.setVisible(false);
                }else if(touchP(p7)){
                    p7.setVisible(false);
                }else if(touchP(p8)){
                    p8.setVisible(false);
                }else if(touchP(p9)){
                    p9.setVisible(false);
                }else if(touchP(p10)){
                    p10.setVisible(false);
                }else if(touchP(p11)){
                    p11.setVisible(false);
                }else if(touchP(p12)){
                    p12.setVisible(false);
                }else if(touchP(p13)){
                    p13.setVisible(false);
                }else if(touchP(p14)){
                    p14.setVisible(false);
                }else if(touchP(p15)){
                    p15.setVisible(false);
                }else if(touchP(p16)){
                    p16.setVisible(false);
                }else if(touchP(p17)){
                    p17.setVisible(false);
                }else if(touchP(p18)){
                    p18.setVisible(false);
                }else if(touchP(p19)){
                    p19.setVisible(false);
                }else if(touchP(p20)){
                    p20.setVisible(false);
                }else if(touchP(p21)){
                    p21.setVisible(false);
                }else if(touchP(p22)){
                    p22.setVisible(false);
                }else if(touchP(p23)){
                    p23.setVisible(false);
                }else if(touchP(p24)){
                    p24.setVisible(false);
                }else if(touchP(p25)){
                    p25.setVisible(false);
                }else if(touchP(p26)){
                    p26.setVisible(false);
                }else if(touchP(p27)){
                    p27.setVisible(false);
                }else if(touchP(p28)){
                    p28.setVisible(false);
                }else if(touchP(p29)){
                    p29.setVisible(false);
                }else if(touchP(p30)){
                    p30.setVisible(false);
                }else if(touchP(p31)){
                    p31.setVisible(false);
                }else if(touchP(p32)){
                    p32.setVisible(false);
                }else if(touchP(p34)){
                    p34.setVisible(false);
                }else if(touchP(p35)){
                    p35.setVisible(false);
                }else if(touchP(p36)){
                    p36.setVisible(false);
                }else if(touchP(p37)){
                    p37.setVisible(false);
                }else if(touchP(p38)){
                    p38.setVisible(false);
                }else if(touchP(p39)){
                    p39.setVisible(false); 
                }else if(touchP(p40)){
                    p40.setVisible(false);
                }else if(touchP(p41)){
                    p41.setVisible(false);
                }else if(touchP(p42)){
                    p42.setVisible(false);
                }else if(touchP(p43)){
                    p43.setVisible(false);
                }else if(touchP(p44)){
                    p44.setVisible(false);
                }else if(touchP(p45)){
                    p45.setVisible(false);
                }else if(touchP(p46)){
                    p46.setVisible(false);
                }else if(touchP(p47)){
                    p47.setVisible(false);
                }else if(touchP(item)) {
                	item.setLocation(2000, 2000);
                	Random e1 = new Random();
                	d = e1.nextInt(3);
                	System.out.println(d);
                	if(d == 1) {
                            salida.setVisible(true);
                            while(true) {
                            if(touchP(salida)){
                                gw.setVisible(true);
                                a = 80;
                                a2 = 80;
                                a3 = 80;
                            }
                            }
                          
                	}
                	if(d == 2) {
                		coulddie = true;
                	}
                	if(d == 0) {
                		
                	}
                }
                if(win()){
                  salida.setVisible(true);
                  if(touchP(salida)){
                      gw.setVisible(true);
                      a = 80;
                      a2 = 80;
                      a3 = 80;
                  }
                }
              
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        }; 

        b1.addKeyListener(key);
            gameOrver();
            auto();
            auto2();
            auto3();
    }
    public boolean cantmoveup(){
        boolean flag = true;
        if(target1.getY() == target2.getY() + 100 || target1.getY() == target5.getY()  + 100){
            if(target1.getX() >= target2.getX() && target1.getX() <= target2.getX() + 100  || target1.getX() >= target2.getX() - 50 && target1.getX() <= target2.getX() + 100 ||
            target1.getX() >= target3.getX() && target1.getX() <= target3.getX() + 100  || target1.getX() >= target3.getX() - 50 && target1.getX() <= target3.getX() + 100 || 
            target1.getX() >= target4.getX() && target1.getX() <= target4.getX() + 100  || target1.getX() >= target4.getX() - 50 && target1.getX() <= target4.getX() + 100 ||
            target1.getX() >= target5.getX() && target1.getX() <= target5.getX() + 100  || target1.getX() >= target5.getX() - 50 && target1.getX() <= target5.getX() + 100 ||
            target1.getX() >= target6.getX() && target1.getX() <= target6.getX() + 100  || target1.getX() >= target6.getX() - 50 && target1.getX() <= target6.getX() + 100 ||
            target1.getX() >= target7.getX() && target1.getX() <= target7.getX() + 100  || target1.getX() >= target7.getX() - 50 && target1.getX() <= target7.getX() + 100){
                flag = false; 
            }
            else{
               flag = true; 
            }
        } 
        return flag; 
    }
    public boolean canmovedown(){
        boolean flag = true;
        if(target1.getY() == target2.getY() - 50 || target1.getY() == target5.getY() - 50){
            if(target1.getX() >= target2.getX() && target1.getX() <= target2.getX() + 100  || target1.getX() >= target2.getX() - 50 && target1.getX() <= target2.getX() + 100 ||
            target1.getX() >= target3.getX() && target1.getX() <= target3.getX() + 100  || target1.getX() >= target3.getX() - 50 && target1.getX() <= target3.getX() + 100 || 
            target1.getX() >= target4.getX() && target1.getX() <= target4.getX() + 100  || target1.getX() >= target4.getX() - 50 && target1.getX() <= target4.getX() + 100 ||
            target1.getX() >= target5.getX() && target1.getX() <= target5.getX() + 100  || target1.getX() >= target5.getX() - 50 && target1.getX() <= target5.getX() + 100 ||
            target1.getX() >= target6.getX() && target1.getX() <= target6.getX() + 100  || target1.getX() >= target6.getX() - 50 && target1.getX() <= target6.getX() + 100 ||
            target1.getX() >= target7.getX() && target1.getX() <= target7.getX() + 100  || target1.getX() >= target7.getX() - 50 && target1.getX() <= target7.getX() + 100){
                flag = false; 
            }
            else{
               flag = true; 
            }
        }
        return flag; 
    }
    public boolean canmoveright(){
        boolean flag = true;
        if(target1.getX() == target2.getX() -50  || target1.getX() == target6.getX() - 50 || target1.getX() == target7.getX() - 50){
            if(target1.getY() >= target2.getY() && target1.getY() <= target2.getY() + 100  || target1.getY() >= target2.getY() - 50 && target1.getY() <= target2.getY() + 100 ||
            target1.getY() >= target3.getY() && target1.getY() <= target3.getY() + 100  || target1.getY() >= target3.getY() - 50 && target1.getY() <= target3.getY() + 100 || 
            target1.getY() >= target4.getY() && target1.getY() <= target4.getY() + 100  || target1.getY() >= target4.getY() - 50 && target1.getY() <= target4.getY() + 100 ||
            target1.getY() >= target5.getY() && target1.getY() <= target5.getY() + 100  || target1.getY() >= target5.getY() - 50 && target1.getY() <= target5.getY() + 100 ||
            target1.getY() >= target6.getY() && target1.getY() <= target6.getY() + 100  || target1.getY() >= target6.getY() - 50 && target1.getY() <= target6.getY() + 100 ||
            target1.getY() >= target7.getY() && target1.getY() <= target7.getY() + 100  || target1.getY() >= target7.getY() - 50 && target1.getY() <= target7.getY() + 100){
                flag = false; 
            }
            else{
               flag = true; 
            }
        } 
        return flag; 
    
    }
    public boolean canmoveleft(){
        boolean flag = true;
        if(target1.getX() == target2.getX() + 100 || target1.getX()  == target6.getX() + 100|| target1.getX() == target7.getX() + 100){
            if(target1.getY() >= target2.getY() && target1.getY() <= target2.getY() + 100  || target1.getY() >= target2.getY() - 50 && target1.getY() <= target2.getY() + 100 ||
            target1.getY() >= target3.getY() && target1.getY() <= target3.getY() + 100  || target1.getY() >= target3.getY() - 50 && target1.getY() <= target3.getY() + 100 || 
            target1.getY() >= target4.getY() && target1.getY() <= target4.getY() + 100  || target1.getY() >= target4.getY() - 50 && target1.getY() <= target4.getY() + 100 ||
            target1.getY() >= target5.getY() && target1.getY() <= target5.getY() + 100  || target1.getY() >= target5.getY() - 50 && target1.getY() <= target5.getY() + 100 ||
            target1.getY() >= target6.getY() && target1.getY() <= target6.getY() + 100  || target1.getY() >= target6.getY() - 50 && target1.getY() <= target6.getY() + 100 ||
            target1.getY() >= target7.getY() && target1.getY() <= target7.getY() + 100  || target1.getY() >= target7.getY() - 50 && target1.getY() <= target7.getY() + 100){
                flag = false; 
            }
            else{
               flag = true; 
            }
        }
        return flag; 
    }
    public boolean touchP(JLabel comp){
        boolean flag = false; 
        if(comp.getY() <= target1.getY() && comp.getY() >= target1.getY() || comp.getY() + 5 >= target1.getY() && comp.getY() -30 <= target1.getY() ){
        if(target1.getX() >= comp.getX() && target1.getX() <= comp.getX() + 20 ||
        target1.getX() >= comp.getX() - 30 && target1.getX() < comp.getX() + 20) {
        
            flag = true; 
        }else{
            flag = false; 
        }
    }
    
        return flag; 
    }
    public boolean touchG(JLabel comp){
        boolean flag = false;
        if(comp.getY() <= target1.getY() + 40 && comp.getY() >= target1.getY() - 40   ){
            if(target1.getX() + 40 >= comp.getX() && target1.getX() - 40 <= comp.getX()){
                flag = true;
            }

        }
        return flag;
    }
    public boolean win(){
        return ((p1.isVisible() || p2.isVisible() || p3.isVisible() || p4.isVisible() || p5.isVisible() 
        || p6.isVisible() || p7.isVisible() || p8.isVisible() || p9.isVisible() || p10.isVisible() ||
        p11.isVisible() || p12.isVisible() || p13.isVisible() || p14.isVisible() || p15.isVisible() ||
        p16.isVisible() || p18.isVisible() || p19.isVisible() || p20.isVisible() || p21.isVisible() || 
        p22.isVisible() || p23.isVisible() || p24.isVisible() || p25.isVisible() || p26.isVisible() ||
        p27.isVisible() || p28.isVisible() || p29.isVisible() || p30.isVisible() || p31.isVisible() ||
        p32.isVisible() || p34.isVisible() || p35.isVisible() || p36.isVisible() ||
        p37.isVisible() || p40.isVisible() || p41.isVisible() || p42.isVisible() || p43.isVisible() ||
        p44.isVisible() || p45.isVisible() || p46.isVisible() || p17.isVisible() || p38.isVisible() ||
        p39.isVisible()) == false);
    }

    public void auto(){
    	timer = new Timer();
        TimerTask time = new TimerTask(){
        
            @Override
            public void run() {
                int aux = 0; 
                if(ghost1.getX() >= 400 && ghost1.getX() <= 630 && ghost1.getY() == 430 && a == 0){
                    ghost1.setLocation(ghost1.getX() + 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getX() >= 400 && ghost1.getX() <= 630 && ghost1.getY() == 430) == false){a = 1;}
                }else if(ghost1.getX() >= 630 && ghost1.getY() >= 50 && a == 1){ 
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() - 5);
                    ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getX() >= 630 && ghost1.getY() >= 50) == false){a = 2; }
                }else if(ghost1.getX() <= 635 && ghost1.getX() >= 240 && ghost1.getY() == 45 && a == 2){
                    ghost1.setLocation(ghost1.getX() - 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getX() <= 635 && ghost1.getX() >= 240 && ghost1.getY() == 45) == false){a = 3;}
                }else if(ghost1.getX() == 235 && ghost1.getY() >= 45 && ghost1.getY() <= 232 && a == 3) {
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() + 5);
                    if((ghost1.getX() == 235 && ghost1.getY() >= 45 && ghost1.getY() <= 232) == false){a = 4;}
                }else if(ghost1.getY() == 235 && ghost1.getX() <= 235 && ghost1.getX() >= 45 && a == 4){
                    ghost1.setLocation(ghost1.getX() - 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 235 && ghost1.getX() <= 235 && ghost1.getX() >= 45) == false){ a = 5;} 
                }else if(ghost1.getX() == 40 && ghost1.getY() >= 235 && ghost1.getY() <= 425 && a == 5){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() + 5);
                    if((ghost1.getX() == 40 && ghost1.getY() >= 235 && ghost1.getY() <= 425) == false){ a = 6;} 
                }else if(ghost1.getY() == 430 && ghost1.getX() >= 40 && ghost1.getX() <= 235 && a == 6){
                    ghost1.setLocation(ghost1.getX() + 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 430 && ghost1.getX() >= 40 && ghost1.getX() <= 220) == false){ a = 7;}
                }else if(ghost1.getX() == 225 && ghost1.getY() <= 430 && ghost1.getY() >= 215 && a == 7){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() - 5);
                    if((ghost1.getX() == 225 && ghost1.getY() <= 430 && ghost1.getY() >= 215) == false){a = 8;}
                }else if(ghost1.getY() == 210 && ghost1.getX() <= 225 && ghost1.getX() >= 40 && a == 8){
                    ghost1.setLocation(ghost1.getX() - 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 210 && ghost1.getX() <= 225 && ghost1.getX() >= 40) == false){a = 9;}
                }else if(ghost1.getX() == 35 && ghost1.getY() <= 210 && ghost1.getY() >= 40 && a == 9){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() - 5);
                    if((ghost1.getX() == 35 && ghost1.getY() <= 210 && ghost1.getY() >= 40) == false){a = 10;}
                }else if(ghost1.getY() == 35 && ghost1.getX() >= 35 && ghost1.getX() <= 230 && a == 10){
                    ghost1.setLocation(ghost1.getX() + 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 35 && ghost1.getX() >= 35 && ghost1.getX() <= 230) == false){a = 11;}
                }else if(ghost1.getX() == 235 && ghost1.getY() >= 35 && ghost1.getY() <= 230 && a == 11){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() + 5);
                    if((ghost1.getX() == 235 && ghost1.getY() >= 35 && ghost1.getY() <= 230) == false){a = 12;}
                }else if(ghost1.getY() == 235 && ghost1.getX() >= 235 && ghost1.getX() <= 435 && a == 12){
                    ghost1.setLocation(ghost1.getX() + 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 235 && ghost1.getX() >= 235 && ghost1.getX() <= 435 ) == false){a = 13;}
                }else if(ghost1.getX() == 440 && ghost1.getY() <= 235 && ghost1.getY() >= 40 && a == 13){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() - 5);
                    if((ghost1.getX() == 440 && ghost1.getY() <= 235 && ghost1.getY() >= 40 ) == false){a = 15;}
                }else if(ghost1.getY() == 35 && ghost1.getX() <= 440 && ghost1.getX() >= 235 && a == 15){
                    ghost1.setLocation(ghost1.getX() - 5, ghost1.getY());
                    ghost1.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost1.getY() == 35 && ghost1.getX() <= 440 && ghost1.getX() >= 235) == false){a = 16;}
                }else if(ghost1.getX() == 230 && ghost1.getY() >= 35 && ghost1.getY() <= 420 && a == 16){
                    ghost1.setLocation(ghost1.getX(), ghost1.getY() + 5);
                    if((ghost1.getX() == 230 && ghost1.getY() >= 35 && ghost1.getY() <= 420 ) == false){a = 17;}
                }else if(ghost1.getY() == 425 && a == 17){
                    if(ghost1.getX() < 400 ){
                        ghost1.setLocation(ghost1.getX() + 5, ghost1.getY());
                        ghost1.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    }else if(ghost1.getY() <= 430){
                        aux = 1; 
                        ghost1.setLocation(ghost1.getX(), ghost1.getY() + 5);
                    }
                    if(aux == 1){
                        a = 0; 
                    }
                }
                
            }
        };
        if(muerte == 0) {
        timer.schedule(time, 50, 40);
        }
        if(muerte == 1) {
       	 timer.cancel();
       	 muerte = 0;
       	 a = 0;
        }
    }
    public void auto2(){
    	timer2 = new Timer();
        TimerTask time = new TimerTask(){
        
            @Override
            public void run() {
                if(ghost2.getY() == 430 && ghost2.getX() >= 400 && ghost2.getX() <= 430 && a2 == 0){
                    ghost2.setLocation(ghost2.getX() + 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 430 && ghost2.getX() >= 400 && ghost2.getX() <= 430 ) == false){a2 = 1;}
                }else if(ghost2.getX() == 435 && ghost2.getY() <= 430 && ghost2.getY() >= 240 && a2 == 1){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() - 5);
                    if((ghost2.getX() == 435 && ghost2.getY() <= 430 && ghost2.getY() >= 240) == false){a2 = 2;}
                }else if(ghost2.getY() == 235 && ghost2.getX() <= 435 && ghost2.getX() >= 235 && a2 == 2){
                    ghost2.setLocation(ghost2.getX() - 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 235 && ghost2.getX() <= 435 && ghost2.getX() >= 235) == false){a2 = 3;}
                }else if(ghost2.getX() == 230 && ghost2.getY() <= 235 && ghost2.getY() >= 45 && a2 == 3){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() - 5);
                    if((ghost2.getX() == 230 && ghost2.getY() <= 235 && ghost2.getY() >= 45) == false){a2 = 4;}
                }else if(ghost2.getY() == 40 && ghost2.getX() >= 230 && ghost2.getX() <= 430 && a2 == 4){
                    ghost2.setLocation(ghost2.getX() + 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 40 && ghost2.getX() >= 230 && ghost2.getX() <= 430) == false){a2 = 5;}
                }else if(ghost2.getX() == 435 && ghost2.getY() >= 40 && ghost2.getY() <= 230 && a2 == 5){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() + 5);
                    if((ghost2.getX() == 435 && ghost2.getY() >= 40 && ghost2.getY() <= 230) == false){a2 = 6;}
                }else if(ghost2.getY() == 235 && ghost2.getX() >= 435 && ghost2.getX() <= 630 && a2 == 6){
                    ghost2.setLocation(ghost2.getX() + 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 235 && ghost2.getX() >= 435 && ghost2.getX() <= 630 ) == false){a2 = 7;}
                }else if(ghost2.getX() == 635 && ghost2.getY() <= 235 && ghost2.getY() >= 40 && a2 == 7){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() - 5);
                    if((ghost2.getX() == 635 && ghost2.getY() <= 235 && ghost2.getY() >= 40 ) == false){a2 = 8;}
                }else if(ghost2.getY() == 35 && ghost2.getX() <= 635 && ghost2.getX() >= 430 && a2 == 8){
                    ghost2.setLocation(ghost2.getX() - 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 35 && ghost2.getX() <= 635 && ghost2.getX() >= 430 ) == false){a2 = 9;}
                }else if(ghost2.getX() == 425 && ghost2.getY() >= 35 && ghost2.getY() <= 230 && a2 == 9){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() + 5);
                    if((ghost2.getX() == 425 && ghost2.getY() >= 35 && ghost2.getY() <= 230) == false){a2 = 10;}
                }else if(ghost2.getY() == 235 && ghost2.getX() <= 425 && ghost2.getX() >= 235 && a2 == 10){
                    ghost2.setLocation(ghost2.getX() - 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 235 && ghost2.getX() <= 425 && ghost2.getX() >= 235) == false){a2 = 11;}
                }else if(ghost2.getX() == 230 && ghost2.getY() >= 235 && ghost2.getY() <= 420 && a2 == 11){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() + 5);
                    if((ghost2.getX() == 230 && ghost2.getY() >= 235 && ghost2.getY() <= 420 ) == false){a2 = 12;}
                }else if(ghost2.getY() == 425 && ghost2.getX() <= 230 && ghost2.getX() >= 40 && a2 == 12){
                    ghost2.setLocation(ghost2.getX() - 5, ghost2.getY());                    
                    if((ghost2.getY() == 425 && ghost2.getX() <= 230 && ghost2.getX() >= 40) == false){a2 = 13;}
                }else if(ghost2.getX() == 35 && ghost2.getY() <= 425 && ghost2.getY() >= 235 && a2 == 13){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() - 5);
                    if((ghost2.getX() == 35 && ghost2.getY() <= 425 && ghost2.getY() >= 235 ) == false){a2 = 14;}
                }else if(ghost2.getY() == 230 && ghost2.getX() >= 35 && ghost2.getX() <= 230 && a2 == 14){
                    ghost2.setLocation(ghost2.getX() + 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getY() == 230 && ghost2.getX() >= 35 && ghost2.getX() <= 230) == false){a2 = 15;}
                }else if(ghost2.getX() == 235 && ghost2.getY() >= 230 && ghost2.getY() <= 425 && a2 == 15){
                    ghost2.setLocation(ghost2.getX(), ghost2.getY() + 5);
                    if((ghost2.getX() == 235 && ghost2.getY() >= 230 && ghost2.getY() <= 425) == false){a2 = 16;}
                }else if(ghost2.getX() <= 400 && a2 == 16){
                    ghost2.setLocation(ghost2.getX() + 5, ghost2.getY());
                    ghost2.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost2.getX() <= 400) == false){
                        a2 = 0;
                    }
                }
                //System.out.println("X = " +ghost2.getX() + " Y = " + ghost2.getY());
                //System.out.println(a2);
            }
        };
        if(muerte == 0) {
        timer2.schedule(time, 50, 40);
        }
        if(muerte == 1) {
       	 timer2.cancel();
       	 muerte = 0; 
       	 a2 = 0;
        }
    }
    public void auto3(){
    	timer3 = new Timer();
        TimerTask time = new TimerTask(){
        
            @Override
            public void run() {
                int x = ghost3.getX();
                int y = ghost3.getY();
                if(ghost3.getY() == 235 && ghost3.getX() <= 235 && ghost3.getX()  >= 40 && a3 == 0){
                    ghost3.setLocation(x - 5, y);
                    ghost3.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost3.getY() == 235 && ghost3.getX()  <= 235 && ghost3.getX()  >= 40) == false){a3 = 1;}
                }else if(ghost3.getX()  == 35 && ghost3.getY() <= 235 && ghost3.getY() >= 45 && a3 == 1){
                    ghost3.setLocation(x , y - 5);
                    if((ghost3.getX()  == 35 && ghost3.getY() <= 235 && ghost3.getY() >= 45 ) == false){a3 = 2;}
                }else if(ghost3.getY() == 40 && ghost3.getX()  >= 35 && ghost3.getX()  <= 230 && a3 == 2){
                    ghost3.setLocation(x + 5, y);
                    ghost3.setIcon(new ImageIcon(imagenf2.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost3.getY() == 40 && ghost3.getX() >= 35 && ghost3.getX() <= 230) == false){a3 = 3;}
                }else if(ghost3.getX() == 235 && ghost3.getY() >= 40 && ghost3.getY() <= 230 && a3 == 3){
                    ghost3.setLocation(x , y + 5);
                    if((ghost3.getX() == 235 && ghost3.getY() >= 40 && ghost3.getY() <= 230) == false){a3 = 4;}
                }else if(ghost3.getY() == 235 && ghost3.getX() >= 235 && ghost3.getX() <= 430 && a3 == 4){
                    ghost3.setLocation(x + 5, y);
                    if((ghost3.getY() == 235 && ghost3.getX() >= 235 && ghost3.getX() <= 430) == false){a3 = 5;}
                }else if(ghost3.getX() == 435 && ghost3.getY() >= 235 && ghost3.getY() <= 420 && a3 == 5){
                    ghost3.setLocation(x , y + 5);
                    if((ghost3.getX() == 435 && ghost3.getY() >= 235 && ghost3.getY() <= 420) == false){a3 = 6;}
                }else if(ghost3.getY() == 425 && ghost3.getX() >= 435 && ghost3.getX() <= 630 && a3 == 6){
                    ghost3.setLocation(x + 5, y);
                    if((ghost3.getY() == 425 && ghost3.getX() >= 435 && ghost3.getX() <= 630 ) == false){a3 = 7;}
                }else if(ghost3.getX() == 635 && ghost3.getY() <= 425 && ghost3.getY() >= 230 && a3 == 7){
                    ghost3.setLocation(x , y - 5);
                    if((ghost3.getX() == 635 && ghost3.getY() <= 425 && ghost3.getY() >= 230 ) == false){a3 = 8;}
                }else if(ghost3.getY() == 225 && ghost3.getX() <= 635 && ghost3.getX() >= 440 && a3 == 8){
                    ghost3.setLocation(x - 5, y);
                    ghost3.setIcon(new ImageIcon(imagenf.getImage().getScaledInstance(ghost1.getWidth(), ghost1.getHeight(), Image.SCALE_SMOOTH)));
                    if((ghost3.getY() == 225 && ghost3.getX() <= 635 && ghost3.getX() >= 440 ) == false){a3 = 9;}
                }else if(ghost3.getX() == 435 && ghost3.getY() <= 225 && ghost3.getY() >= 40 && a3 == 9){
                    ghost3.setLocation(x , y - 5);
                    if((ghost3.getX() == 435 && ghost3.getY() <= 225 && ghost3.getY() >= 40) == false){a3 = 10;}
                }else if(ghost3.getY() == 35 && ghost3.getX() <= 435 && ghost3.getX() >= 235 && a3 == 10){
                    ghost3.setLocation(x - 5, y);
                    if((ghost3.getY() == 35 && ghost3.getX() <= 435 && ghost3.getX() >= 235) == false){a3 = 11;}
                }else if(ghost3.getX() == 230 && ghost3.getY() >= 35 && ghost3.getY() <= 230 && a3 == 11){
                    ghost3.setLocation(x , y + 5);
                    if((ghost3.getX() == 230 && ghost3.getY() >= 35 && ghost3.getY() <= 230) == false){a3 = 0;}
                }
                //System.out.println("X = " + x + " Y = " + y);
                //System.out.println(a3);
                //System.out.println(muerte);
            }
        };
        if(muerte == 0) {
         timer3.schedule(time, 50, 40);
        }
         if(muerte == 1) {
        	 timer3.cancel();
        	 muerte = 0; 
        	 a3 = 0;
         }

    }
    public void gameOrver(){
        TimerTask time = new TimerTask(){
        
            @Override
            public void run() {
            	if(coulddie == false) {
                if(touchG(ghost1)){
                    System.out.println(timer.purge());
                    target1.setLocation(115, 30);
                    ghost1.setLocation(400, 430);
                    ghost2.setLocation(400, 430);
                    ghost3.setLocation(235, 235);
                    muerte = 1;
                 	a = 0;
                	a2 = 0;
                	a3 = 0;
                	lifes--;
                	if(life1.isVisible()) {
                		life1.setVisible(false);
                	}else if(life2.isVisible()) {
                		life2.setVisible(false);
                	}else if(life3.isVisible()) {
                		life3.setVisible(false);
                	}
                }
                if(touchG(ghost2)){
                    System.out.println( timer2.purge());
                    target1.setLocation(115, 30); 
                    ghost1.setLocation(400, 430);
                    ghost2.setLocation(400, 430);
                    ghost3.setLocation(235, 235);
                    muerte = 1;
                 	a = 0;
                	a2 = 0;
                	a3 = 0;
                	lifes--;
                	if(life1.isVisible()) {
                		life1.setVisible(false);
                	}else if(life2.isVisible()) {
                		life2.setVisible(false);
                	}else if(life3.isVisible()) {
                		life3.setVisible(false);
                	}
                }
                if(touchG(ghost3)){
                	System.out.println(timer3.purge());
                	target1.setLocation(115, 30);
                    ghost1.setLocation(400, 430);
                    ghost2.setLocation(400, 430);
                    ghost3.setLocation(235, 235);
                	muerte = 1;
                	a = 0;
                	a2 = 0;
                	a3 = 0;
                	lifes--;
                	if(life1.isVisible()) {
                		life1.setVisible(false);
                	}else if(life2.isVisible()) {
                		life2.setVisible(false);
                	}else if(life3.isVisible()) {
                		life3.setVisible(false);
                	}
                }
                if(lifes == 0) {
                	a = 80;
                	a2 = 80;
                	a3 = 80;
                	go.setVisible(true);
                }
            }
            }
        };
        timer10.schedule(time, 50, 20);
    }
    public ImageIcon getImage() {
    	ImageIcon im = null;
    	if(a5 == 0 ) {
    		 im = imagen;
     		if((a5 == 1) == false) {
    			a5 = 1;
    		}
    		 //System.out.println("se cumple 1");
    	}else if(a5 == 1) {
    		im = imagen2;
    		//System.out.println("se cumple 2");
    		if((a5 == 0) == false) {
    			a5 = 0;
			 }
    	}else {
    	System.out.println("se cumple null");
    	}
    	return im; 
    }
    public ImageIcon getImageA() {
    	ImageIcon im = null;
    	if(a6 == 0 ) {
    		 im = imagena;
     		if((a6 == 1) == false) {
    			a6 = 1;
    		}
    		 //System.out.println("se cumple 1");
    	}else if(a6 == 1) {
    		im = imagen2;
    		//System.out.println("se cumple 2");
    		if((a6 == 0) == false) {
    			a6 = 0;
			 }
    	}else {
    	System.out.println("se cumple null");
    	}
    	return im; 
    }
    public ImageIcon getImageB() {
    	ImageIcon im = null;
    	if(a7 == 0 ) {
    		 im = imagenb;
     		if((a7 == 1) == false) {
    			a7 = 1;
    		}
    		 //System.out.println("se cumple 1");
    	}else if(a7 == 1) {
    		im = imagen2;
    		//System.out.println("se cumple 2");
    		if((a7 == 0) == false) {
    			a7 = 0;
			 }
    	}else {
    	System.out.println("se cumple null");
    	}
    	return im; 
    }
    public ImageIcon getImageI() {
    	ImageIcon im = null;
    	if(a8 == 0 ) {
    		 im = imageni;
     		if((a8 == 1) == false) {
    			a8 = 1;
    		}
    		 //System.out.println("se cumple 1");
    	}else if(a8 == 1) {
    		im = imagen2;
    		//System.out.println("se cumple 2");
    		if((a8 == 0) == false) {
    			a8 = 0;
			 }
    	}else {
    	System.out.println("se cumple null");
    	}
    	return im; 
    }
}
