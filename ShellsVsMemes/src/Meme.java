import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Meme {
	private int health, currHealth, damage, range, x, y;
	private double attackSpeed, vx;
	private String name;
	private boolean alive;
	private Image troll, doge, harambe;
	private int trollX, trollY, dogeX, dogeY, harX, harY;
	private AffineTransform txTroll = AffineTransform.getTranslateInstance(trollX, trollY);

	
public Meme(String name) {
	troll = getImage("/imgs/basic.png");
	doge = getImage("/imgs/doge.png");
	harambe = getImage("/imgs/armadillo.png");
	
	alive = false;
	if(name == "Troll") { //troll is basic
		health = 500;
		damage = 50;
		range = 2;
		vx = 1.0;
		attackSpeed = 1.0;
	}else if(name == "Doge") { //doge is conehead/bucket/heavy
		health = 750;
		damage = 50;
		range = 2;
		vx = 1.0;
		attackSpeed = 0.7;
	}else if(name == "Harambe") { //ITS HIM!
		health = 1000;
		damage = 100;
		range = 2;
		vx = 0.2;
		attackSpeed = 0.75;
	}
}

public void spawn(int row) {
	alive = true;
	currHealth = health;
	trollX = 1050;
	trollY = 215 + (100*row);
}

private void update() {
	trollX -= vx/5;
}







private Image getImage(String path) {
	Image tempImage = null;
	try {
		URL imageURL = Shop.class.getResource(path);
		tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return tempImage;
}

public void paint(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;	
	txTroll.setToTranslation(trollX, trollY);
	g2.drawImage(troll, txTroll, null);
	update();	
	
	
	
}


}
