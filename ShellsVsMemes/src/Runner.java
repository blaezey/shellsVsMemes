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
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Runner extends JPanel implements KeyListener, ActionListener, MouseListener{
	//I'm just the shell of a man, and a shell of who I was or could've been
	
	Shell[][] board = new Shell[9][5];
	ArrayList<Meme> enemies = new ArrayList<Meme>();
	Meme enemy;
	
	public int score;
	Ground background = new Ground();
	Shop snailshop = new Shop();
	Shell select = null;
	Music m = new Music("heat.wav", false);
	
	
	
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
		
		if(enemies.isEmpty()==false) {
			for(int i = 0; i < enemies.size(); i++) {
				enemies.get(i).paint(g);
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
		m.play();
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
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=247 && arg0.getY()<=348){
				board[3][0] = select;
				board[3][0].setOmeX(505);
				board[3][0].setOmeY(247);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=247 && arg0.getY()<=348){
				board[4][0] = select;
				board[4][0].setOmeX(584);
				board[4][0].setOmeY(247);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=247 && arg0.getY()<=348){
				board[5][0] = select;
				board[5][0].setOmeX(663);
				board[5][0].setOmeY(247);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=247 && arg0.getY()<=348){
				board[6][0] = select;
				board[6][0].setOmeX(742);
				board[6][0].setOmeY(247);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=247 && arg0.getY()<=348){
				board[7][0] = select;
				board[7][0].setOmeX(821);
				board[7][0].setOmeY(247);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=247 && arg0.getY()<=348){
				board[8][0] = select;
				board[8][0].setOmeX(900);
				board[8][0].setOmeY(247);
				select = null;
			//SECOND ROW BELOW======================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=360 && arg0.getY()<=460) {
				//1
				board[0][1] = select;
				board[0][1].setOmeX(259);
				board[0][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=360 && arg0.getY()<=460) {
				//set board square to select
				board[1][1] = select;
				board[1][1].setOmeX(339);
				board[1][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=360 && arg0.getY()<=460) {
				//3
				board[2][1] = select;
				board[2][1].setOmeX(418);
				board[2][1].setOmeY(350);
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=360 && arg0.getY()<=460){
				//set board square to select
				board[3][1] = select;
				board[3][1].setOmeX(500);
				board[3][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=360 && arg0.getY()<=460){
				board[4][1] = select;
				board[4][1].setOmeX(570);
				board[4][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=360 && arg0.getY()<=460){
				board[5][1] = select;
				board[5][1].setOmeX(663);
				board[5][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=360 && arg0.getY()<=460){
				board[6][1] = select;
				board[6][1].setOmeX(742);
				board[6][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=360 && arg0.getY()<=460){
				board[7][1] = select;
				board[7][1].setOmeX(821);
				board[7][1].setOmeY(350);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=360 && arg0.getY()<=460){
				board[8][1] = select;
				board[8][1].setOmeX(900);
				board[8][1].setOmeY(350);
				select = null;
				//START OF THIRD ROW===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=462 && arg0.getY()<=550) {
				//1
				board[0][2] = select;
				board[0][2].setOmeX(259);
				board[0][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=462 && arg0.getY()<=550) {
				//set board square to select
				board[1][2] = select;
				board[1][2].setOmeX(339);
				board[1][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=462 && arg0.getY()<=550) {
				//3
				board[2][2] = select;
				board[2][2].setOmeX(418);
				board[2][2].setOmeY(462);
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=462 && arg0.getY()<=550){
				//set board square to select
				board[3][2] = select;
				board[3][2].setOmeX(500);
				board[3][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=462 && arg0.getY()<=550){
				board[4][2] = select;
				board[4][2].setOmeX(580);
				board[4][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=462 && arg0.getY()<=550){
				board[5][2] = select;
				board[5][2].setOmeX(663);
				board[5][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=462 && arg0.getY()<=550){
				board[6][2] = select;
				board[6][2].setOmeX(742);
				board[6][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=462 && arg0.getY()<=550){
				board[7][2] = select;
				board[7][2].setOmeX(821);
				board[7][2].setOmeY(462);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=462 && arg0.getY()<=550){
				board[8][2] = select;
				board[8][2].setOmeX(900);
				board[8][2].setOmeY(462);
				select = null;
				//START OF 4TH ROW===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=560 && arg0.getY()<=650) {
				//1
				board[0][3] = select;
				board[0][3].setOmeX(259);
				board[0][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=560 && arg0.getY()<=650) {
				//set board square to select
				board[1][3] = select;
				board[1][3].setOmeX(339);
				board[1][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=560 && arg0.getY()<=650) {
				//3
				board[2][3] = select;
				board[2][3].setOmeX(418);
				board[2][3].setOmeY(560);
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=560 && arg0.getY()<=650){
				//set board square to select
				board[3][3] = select;
				board[3][3].setOmeX(500);
				board[3][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=560 && arg0.getY()<=650){
				board[4][3] = select;
				board[4][3].setOmeX(580);
				board[4][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=560 && arg0.getY()<=650){
				board[5][3] = select;
				board[5][3].setOmeX(663);
				board[5][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=560 && arg0.getY()<=650){
				board[6][3] = select;
				board[6][3].setOmeX(742);
				board[6][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=560 && arg0.getY()<=650){
				board[7][3] = select;
				board[7][3].setOmeX(821);
				board[7][3].setOmeY(560);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=560 && arg0.getY()<=650){
				board[8][3] = select;
				board[8][3].setOmeX(900);
				board[8][3].setOmeY(560);
				select = null;
				//LAST ROW YEAHHHH BABYYYY===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=655 && arg0.getY()<=750) {
				//1
				board[0][4] = select;
				board[0][4].setOmeX(259);
				board[0][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=655 && arg0.getY()<=750) {
				//set board square to select
				board[1][4] = select;
				board[1][4].setOmeX(339);
				board[1][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=655 && arg0.getY()<=750) {
				//3
				board[2][4] = select;
				board[2][4].setOmeX(418);
				board[2][4].setOmeY(655);
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=655 && arg0.getY()<=750){
				//set board square to select
				board[3][4] = select;
				board[3][4].setOmeX(500);
				board[3][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=655 && arg0.getY()<=750){
				board[4][4] = select;
				board[4][4].setOmeX(580);
				board[4][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=655 && arg0.getY()<=750){
				board[5][4] = select;
				board[5][4].setOmeX(663);
				board[5][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=655 && arg0.getY()<=750){
				board[6][4] = select;
				board[6][4].setOmeX(742);
				board[6][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=655 && arg0.getY()<=750){
				board[7][4] = select;
				board[7][4].setOmeX(821);
				board[7][4].setOmeY(655);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=655 && arg0.getY()<=750){
				board[8][4] = select;
				board[8][4].setOmeX(900);
				board[8][4].setOmeY(655);
				select = null;
			}else {
				select = null;
			}
		}
		
		
		System.out.println("X=" + arg0.getX() +" Y="+arg0.getY());
//		if(select != null) System.out.println(select.getName());
		
		
		
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
		if(arg0.getKeyCode()==69) {
			enemies.add(new Meme("Troll"));
			int row = (int)(Math.random()*5);
			enemies.get(enemies.size()-1).spawn(row);
			
			
		}
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
