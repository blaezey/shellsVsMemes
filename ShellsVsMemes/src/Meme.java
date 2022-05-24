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
		damage = 1;
		range = 2;
		vx = 1.0;
		attackSpeed = 1.0;
	}else if(name == "Doge") { //doge is conehead/bucket/heavy
		health = 750;
		damage = 2;
		range = 2;
		vx = 1.0;
		attackSpeed = 0.7;
	}else if(name == "Harambe") { //ITS HIM!
		health = 1000;
		damage = 5;
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

public boolean collision(Shell plant) {
	if((plant.getX()<trollX && plant.getX()+80>= trollX) &&(plant.getY()-50<=trollY && plant.getY()+20>= trollY)) {
		x += 1;
		return true;
	}else {
		return false;
	}
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

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public int getCurrHealth() {
	return currHealth;
}

public void setCurrHealth(int currHealth) {
	this.currHealth = currHealth;
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	this.damage = damage;
}

public int getRange() {
	return range;
}

public void setRange(int range) {
	this.range = range;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public double getAttackSpeed() {
	return attackSpeed;
}

public void setAttackSpeed(double attackSpeed) {
	this.attackSpeed = attackSpeed;
}

public double getVx() {
	return vx;
}

public void setVx(double vx) {
	this.vx = vx;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isAlive() {
	return alive;
}

public void setAlive(boolean alive) {
	this.alive = alive;
}

public Image getTroll() {
	return troll;
}

public void setTroll(Image troll) {
	this.troll = troll;
}

public Image getDoge() {
	return doge;
}

public void setDoge(Image doge) {
	this.doge = doge;
}

public Image getHarambe() {
	return harambe;
}

public void setHarambe(Image harambe) {
	this.harambe = harambe;
}

public int getTrollX() {
	return trollX;
}

public void setTrollX(int trollX) {
	this.trollX = trollX;
}

public int getTrollY() {
	return trollY;
}

public void setTrollY(int trollY) {
	this.trollY = trollY;
}

public int getDogeX() {
	return dogeX;
}

public void setDogeX(int dogeX) {
	this.dogeX = dogeX;
}

public int getDogeY() {
	return dogeY;
}

public void setDogeY(int dogeY) {
	this.dogeY = dogeY;
}

public int getHarX() {
	return harX;
}

public void setHarX(int harX) {
	this.harX = harX;
}

public int getHarY() {
	return harY;
}

public void setHarY(int harY) {
	this.harY = harY;
}

public AffineTransform getTxTroll() {
	return txTroll;
}

public void setTxTroll(AffineTransform txTroll) {
	this.txTroll = txTroll;
}







}
