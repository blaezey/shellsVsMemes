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
	
	int sun = 1000;
	public int score;
	Background ground = new Background();
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
		ground.paint(g);
		snailshop.paint(g);
		Color textC = new Color(255, 255, 255);
		g.setColor(textC);
		g.drawString("Score: " + score, 1150, 650);
		g.setColor(Color.black);
		g.setFont(new Font("Helvetica", 5, 20));
		g.drawString(sun+"", 40, 135);
		g.setFont(new Font("Helvetica", 5, 15));
		g.setColor(Color.white);
		g.drawString("---", 180, 130);
		g.drawString("200", 275, 130);
		g.drawString("150", 370, 130);
		g.drawString("200", 465, 130);
		g.drawString("100", 560, 130);
		g.drawString("225", 660, 130);
		
		
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j]!=null) {
					board[i][j].paint(g);
					if(board[i][j].getCurrHealth()<=0) board[i][j] = null;
				}
			}
		}
		
		if(enemies.isEmpty()==false) {
			for(int i = 0; i < enemies.size(); i++) {
				enemies.get(i).paint(g);
				if(enemies.get(i).getTrollX()<=210) enemies.remove(i);
			}
			for(int z = enemies.size()-1; z > 0; z--) {
				for(int i = 0; i < board.length; i++) {
					for(int j = 0; j < board[0].length; j++) {
						if(board[i][j]!=null) {
							if(enemies.get(z).collision(board[i][j])) {
								board[i][j].setCurrHealth(board[i][j].getCurrHealth()-enemies.get(z).getDamage());
								enemies.get(z).setTrollX(enemies.get(z).getTrollX()+1);
							}
						}
						
					}
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
			if(arg0.getX()>=633 && arg0.getX()<=716 && arg0.getY()>=61 && arg0.getY()<=137) {
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
				if(sun>=select.getCost()) {
					board[0][0] = select;
					board[0][0].setX(259);
					board[0][0].setY(255);
					sun -= select.getCost();
					select = null;
				}
				
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=244 && arg0.getY()<=348) {
				//set board square to select
				if(sun>=select.getCost()) {
					board[1][0] = select;
					board[1][0].setX(339);
					board[1][0].setY(244);
					sun -= select.getCost();
					select = null;
				}
				
				
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=247 && arg0.getY()<=348) {
				//set board square to select
				board[2][0] = select;
				sun -= select.getCost();
				board[2][0].setX(418);
				board[2][0].setY(247);
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=247 && arg0.getY()<=348){
				board[3][0] = select;
				sun -= select.getCost();
				board[3][0].setX(505);
				board[3][0].setY(247);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=247 && arg0.getY()<=348){
				board[4][0] = select;
				board[4][0].setX(584);
				sun -= select.getCost();
				board[4][0].setY(247);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=247 && arg0.getY()<=348){
				board[5][0] = select;
				board[5][0].setX(663);
				sun -= select.getCost();
				board[5][0].setY(247);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=247 && arg0.getY()<=348){
				board[6][0] = select;
				sun -= select.getCost();
				board[6][0].setX(742);
				board[6][0].setY(247);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=247 && arg0.getY()<=348){
				board[7][0] = select;
				sun -= select.getCost();
				board[7][0].setX(821);
				board[7][0].setY(247);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=247 && arg0.getY()<=348){
				board[8][0] = select;
				board[8][0].setX(900);
				board[8][0].setY(247);
				sun -= select.getCost();
				select = null;
			//SECOND ROW BELOW======================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=360 && arg0.getY()<=460) {
				//1
				board[0][1] = select;
				board[0][1].setX(259);
				sun -= select.getCost();
				board[0][1].setY(350);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=360 && arg0.getY()<=460) {
				//set board square to select
				board[1][1] = select;
				board[1][1].setX(339);
				sun -= select.getCost();
				board[1][1].setY(350);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=360 && arg0.getY()<=460) {
				//3
				board[2][1] = select;
				board[2][1].setX(418);
				board[2][1].setY(350);
				
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=360 && arg0.getY()<=460){
				//set board square to select
				board[3][1] = select;
				sun -= select.getCost();
				board[3][1].setX(500);
				board[3][1].setY(350);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=360 && arg0.getY()<=460){
				board[4][1] = select;
				board[4][1].setX(570);
				sun -= select.getCost();
				board[4][1].setY(350);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=360 && arg0.getY()<=460){
				board[5][1] = select;
				board[5][1].setX(663);
				sun -= select.getCost();
				board[5][1].setY(350);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=360 && arg0.getY()<=460){
				board[6][1] = select;
				sun -= select.getCost();
				board[6][1].setX(742);
				board[6][1].setY(350);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=360 && arg0.getY()<=460){
				board[7][1] = select;
				sun -= select.getCost();
				board[7][1].setX(821);
				board[7][1].setY(350);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=360 && arg0.getY()<=460){
				board[8][1] = select;
				board[8][1].setX(900);
				sun -= select.getCost();
				board[8][1].setY(350);
				select = null;
				//START OF THIRD ROW===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=462 && arg0.getY()<=550) {
				//1
				board[0][2] = select;
				board[0][2].setX(259);
				sun -= select.getCost();
				board[0][2].setY(462);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=462 && arg0.getY()<=550) {
				//set board square to select
				board[1][2] = select;
				board[1][2].setX(339);
				sun -= select.getCost();
				board[1][2].setY(462);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=462 && arg0.getY()<=550) {
				//3
				board[2][2] = select;
				board[2][2].setX(418);
				sun -= select.getCost();
				board[2][2].setY(462);
				
				select = null;
				
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=462 && arg0.getY()<=550){
				//set board square to select
				board[3][2] = select;
				board[3][2].setX(500);
				board[3][2].setY(462);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=462 && arg0.getY()<=550){
				board[4][2] = select;
				sun -= select.getCost();
				board[4][2].setX(580);
				board[4][2].setY(462);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=462 && arg0.getY()<=550){
				board[5][2] = select;
				sun -= select.getCost();
				board[5][2].setX(663);
				board[5][2].setY(462);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=462 && arg0.getY()<=550){
				board[6][2] = select;
				sun -= select.getCost();
				board[6][2].setX(742);
				board[6][2].setY(462);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=462 && arg0.getY()<=550){
				board[7][2] = select;
				sun -= select.getCost();
				board[7][2].setX(821);
				board[7][2].setY(462);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=462 && arg0.getY()<=550){
				board[8][2] = select;
				board[8][2].setX(900);
				sun -= select.getCost();
				board[8][2].setY(462);
				select = null;
				
				//START OF 4TH ROW===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=560 && arg0.getY()<=650) {
				//1
				board[0][3] = select;
				board[0][3].setX(259);
				board[0][3].setY(560);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=560 && arg0.getY()<=650) {
				//set board square to select
				board[1][3] = select;
				board[1][3].setX(339);
				board[1][3].setY(560);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=560 && arg0.getY()<=650) {
				//3
				board[2][3] = select;
				board[2][3].setX(418);
				board[2][3].setY(560);
				sun -= select.getCost();
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=560 && arg0.getY()<=650){
				//set board square to select
				board[3][3] = select;
				board[3][3].setX(500);
				sun -= select.getCost();
				board[3][3].setY(560);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=560 && arg0.getY()<=650){
				board[4][3] = select;
				board[4][3].setX(580);
				sun -= select.getCost();
				board[4][3].setY(560);
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=560 && arg0.getY()<=650){
				board[5][3] = select;
				board[5][3].setX(663);
				sun -= select.getCost();
				board[5][3].setY(560);
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=560 && arg0.getY()<=650){
				board[6][3] = select;
				sun -= select.getCost();
				board[6][3].setX(742);
				board[6][3].setY(560);
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=560 && arg0.getY()<=650){
				board[7][3] = select;
				board[7][3].setX(821);
				sun -= select.getCost();
				board[7][3].setY(560);
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=560 && arg0.getY()<=650){
				board[8][3] = select;
				board[8][3].setX(900);
				board[8][3].setY(560);
				sun -= select.getCost();
				select = null;
				//LAST ROW YEAHHHH BABYYYY===============================================================================
			}else if(arg0.getX()>=259 && arg0.getX()<=336 && arg0.getY()>=655 && arg0.getY()<=750) {
				//1
				board[0][4] = select;
				board[0][4].setX(259);
				sun -= select.getCost();
				board[0][4].setY(655);
				select = null;
			}else if(arg0.getX()>=339 && arg0.getX()<=408 && arg0.getY()>=655 && arg0.getY()<=750) {
				//set board square to select
				board[1][4] = select;
				board[1][4].setX(339);
				sun -= select.getCost();
				board[1][4].setY(655);
				select = null;
			}else if(arg0.getX()>=418 && arg0.getX()<=495 && arg0.getY()>=655 && arg0.getY()<=750) {
				//3
				board[2][4] = select;
				board[2][4].setX(418);
				board[2][4].setY(655);
				sun -= select.getCost();
				
				select = null;
			}else if(arg0.getX()>=505 && arg0.getX()<=574 && arg0.getY()>=655 && arg0.getY()<=750){
				//set board square to select
				board[3][4] = select;
				board[3][4].setX(500);
				sun -= select.getCost();
				board[3][4].setY(655);
				select = null;
			}else if(arg0.getX()>=584 && arg0.getX()<=653 && arg0.getY()>=655 && arg0.getY()<=750){
				board[4][4] = select;
				board[4][4].setX(580);
				board[4][4].setY(655);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=663 && arg0.getX()<=732 && arg0.getY()>=655 && arg0.getY()<=750){
				board[5][4] = select;
				board[5][4].setX(663);
				board[5][4].setY(655);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=742 && arg0.getX()<=811 && arg0.getY()>=655 && arg0.getY()<=750){
				board[6][4] = select;
				board[6][4].setX(742);
				board[6][4].setY(655);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=821 && arg0.getX()<=890 && arg0.getY()>=655 && arg0.getY()<=750){
				board[7][4] = select;
				board[7][4].setX(821);
				board[7][4].setY(655);
				sun -= select.getCost();
				select = null;
			}else if(arg0.getX()>=900 && arg0.getX()<=969 && arg0.getY()>=655 && arg0.getY()<=750){
				board[8][4] = select;
				board[8][4].setX(900);
				board[8][4].setY(655);
				sun -= select.getCost();
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
