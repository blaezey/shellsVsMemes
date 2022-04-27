import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Shop {
	private Image Tortoise,Turtle,Arma,Snail;
	private int TorX,TorY,TurX,TurY,ArmX,ArmY,SnaX,SnaY;
	private int x,y;
	private AffineTransform txTor = AffineTransform.getTranslateInstance(TorX, TorY);
	private AffineTransform txTur = AffineTransform.getTranslateInstance(TurX, TurY);
	private AffineTransform txArm = AffineTransform.getTranslateInstance(ArmX, ArmY);
	private AffineTransform txSna = AffineTransform.getTranslateInstance(SnaX, SnaY);
	private static int scoreCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Shop() {
		Tortoise = getImage("/imgs/tortoise.gif");
		Turtle = getImage("/imgs/turtle.gif");
		Arma = getImage("/imgs/armadillo.png");
		Snail = getImage("/imgs/snail.gif");
		
		TorX = 0;
		TorY = 0;
		
		TurX = 0;
		TurY = 0;
		
		ArmX = 0;
		ArmY = 0;
		
		SnaX = 0;
		SnaY = 0;
	}
	
	
	
	
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;	
		g2.drawImage(Tortoise, txTor, null);
		g2.drawImage(Turtle, txTur, null);
		g2.drawImage(Arma, txArm, null);
		g2.drawImage(Snail, txSna, null);
		
		txTor.setToTranslation(TorX, TorY);
		txTur.setToTranslation(TurX, TurY);
		txArm.setToTranslation(ArmX, ArmY);
		txSna.setToTranslation(SnaX, SnaY);
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
	
	//
	private void init(int x, int y) {
		txTor.setToTranslation(TorX, TorY);
		txTur.setToTranslation(TurX, TurY);
		txArm.setToTranslation(ArmX, ArmY);
		txSna.setToTranslation(SnaX, SnaY);
		txTor.scale(0.01,0.01);
		txTur.scale(0.01,0.01);
		txArm.scale(0.01,0.01);
		txSna.scale(0.01,0.01);
	}
	
	
	public int getTorX() {
		return TorX;
	}


	public void setTorX(int torX) {
		TorX = torX;
	}


	public int getTorY() {
		return TorY;
	}


	public void setTorY(int torY) {
		TorY = torY;
	}


	public int getTurX() {
		return TurX;
	}


	public void setTurX(int turX) {
		TurX = turX;
	}


	public int getTurY() {
		return TurY;
	}


	public void setTurY(int turY) {
		TurY = turY;
	}


	public int getArmX() {
		return ArmX;
	}


	public void setArmX(int armX) {
		ArmX = armX;
	}


	public int getArmY() {
		return ArmY;
	}


	public void setArmY(int armY) {
		ArmY = armY;
	}


	public int getSnaX() {
		return SnaX;
	}


	public void setSnaX(int snaX) {
		SnaX = snaX;
	}


	public int getSnaY() {
		return SnaY;
	}


	public void setSnaY(int snaY) {
		SnaY = snaY;
	}
}
