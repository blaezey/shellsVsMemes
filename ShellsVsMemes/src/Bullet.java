import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Bullet {
	private int x, vx, y, size, damage;
	private Image bulletImg;
	private AffineTransform txBullet = AffineTransform.getTranslateInstance(x, y);
	
	public Bullet(int initX, int initY, int damage) {
		x = initX;
		y = initY;
		vx = 2;
		size = 19;
		this.damage = damage;
		
	}
	
	
	
	
}
