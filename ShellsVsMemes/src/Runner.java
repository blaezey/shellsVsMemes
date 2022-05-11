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
	Background background = new Background();
	Shop snailshop = new Shop();

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r = new Runner();
		
	}

	
	
	
	
	
	
	public void paint(Graphics g) {
		super.repaint();
		g.setColor(Color.darkGray);
		g.fillRect(0, 0, 1400, 600);
		background.paint(g);
		snailshop.paint(g);
		Color textC = new Color(255, 255, 255);
		g.setColor(textC);
		g.drawString("Score: " + score, 1150, 650);
	
		
	}
	
	
	public Runner() {
		JFrame ui = new JFrame();
		ui.setSize(1400,750);
		ui.add(this);
		
		ui.addKeyListener(this);
		ui.addMouseListener(this);
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Timer t = new Timer(16, this);
		t.start();
		ui.setVisible(true);
		ui.repaint();
		ui.setResizable(false);
		setVisible(true);
		
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
