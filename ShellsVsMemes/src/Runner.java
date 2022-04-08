import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Runner extends JPanel implements KeyListener, ActionListener, MouseListener{
	//I'm just the shell of a man, and a shell of who I was or could've been
	
	Shell[][] board = new Shell[5][9];
	
	public int score;
	Ground background = new Ground();

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r = new Runner();
		
	}

	
	
	
	
	
	
	public void paint(Graphics g) {
		super.repaint();
		g.setColor(Color.black);
		g.fillRect(0, 0, 1400, 600);
		background.paint(g);
		Color textC = new Color(255, 255, 255);
		g.setColor(textC);
		g.drawString("Score: " + score, 500, 500);
	
		
	}
	
	
	public Runner() {
		JFrame ui = new JFrame();
		ui.setSize(1400,600);
		ui.add(this);
		
		ui.addKeyListener(this);
		ui.addMouseListener(this);
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Timer t = new Timer(16, this);
		t.start();
		ui.setVisible(true);
		ui.repaint();
		ui.setResizable(false);
	}
	
				
				  
				
				class ShellShop {
				    JFrame f;
				    JButton b, b1, b2, b3;			  
				    JLabel l;
				    
				 public void shop(){
					 
					 	Shell temp = new Shell();
				        // Creating a new frame to store text field and buttons
				        f = new JFrame("The Shell Shop");
				        l = new JLabel("Pick a Shell to place"); 
				  
				        //create buttons
				        b = new JButton("Snail");
				        b1 = new JButton("Tortoise");
				        b2 = new JButton("Turtle");
				        b3 = new JButton("Armadillo");
				  
				        
				        JPanel p = new JPanel();
				        
				        //layouts??
				        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
				        
				        //add buttons using add 
				        p.add(b);
				        p.add(b1);
				        p.add(b2);
				        p.add(b3);
				        p.add(l);
				  
				        // set background of panel
				        p.setBackground(Color.DARK_GRAY);
				  
				        // Adding panel to frame
				        f.add(p);
				  
				        // Setting the size of frame
				        f.setSize(300, 300);	
				  
				        f.show();
				        
				    }
				}
			
	
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
