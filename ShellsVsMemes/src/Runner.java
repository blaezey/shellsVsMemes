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
	Shell select = null;
	
	
	
	
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
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j]!=null) {
					board[i][j].paint(g);
				}
			}
		}
		
		
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
		if(select==null) {
			if(arg0.getX()>=146 && arg0.getX()<=228 && arg0.getY()>=61 && arg0.getY()<=132) {
				select = new Shell("Omega Turtle", 0, 0);
			}else if(arg0.getX()>=246 && arg0.getX()<=328 && arg0.getY()>=57 && arg0.getY()<=133) {
				select = new Shell("Gem Turtle", 0, 0);
			}else if(arg0.getX()>=346 && arg0.getX()<=419 && arg0.getY()>=54 && arg0.getY()<=132) {
				select = new Shell("Armadillo", 0, 0);
			}else if(arg0.getX()>=441 && arg0.getX()<=516 && arg0.getY()>=58 && arg0.getY()<=137) {
				select = new Shell("Clam", 0, 0);
			}else if(arg0.getX()>=536 && arg0.getX()<=610 && arg0.getY()>=57 && arg0.getY()<=135) {
				select = new Shell("Snail", 0, 0);
			}else {
				select = null;
			}
		}else {
			if(!(arg0.getX()>=146 && arg0.getX()<=908 && arg0.getY()>=61 && arg0.getY()<=144) && !(arg0.getX()>=258 && arg0.getX()<=991 && arg0.getY()>=254 && arg0.getY()<=742)) {
				select = null;
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=255 && arg0.getY()<=348) {
				//set board square to select
				board[0][0] = select;
				board[0][0].setOmeX(259);
				board[0][0].setOmeY(255);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=244 && arg0.getY()<=348) {
				//set board square to select
				board[1][0] = select;
				board[1][0].setOmeX(339);
				board[1][0].setOmeY(244);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=247 && arg0.getY()<=348) {
				//set board square to select
				board[2][0] = select;
				board[2][0].setOmeX(418);
				board[2][0].setOmeY(247);
				
				select = null;
			}else {
				select = null;
			}
		}
		
		
		System.out.println(arg0.getX() +" "+arg0.getY());
		if(select != null) System.out.println(select.getName());
		
		
		
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
