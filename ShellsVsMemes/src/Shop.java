import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Shop {
	private Image Tortoise,Turtle,Arma,Snail,Clam,GemTurtle,OmegaTurtle;
	private int TorX,TorY,TurX,TurY,ArmX,ArmY,SnaX,SnaY,ClamX,ClamY,GemX,GemY,OmeX,OmeY;
	private int x,y;
	private AffineTransform txTor = AffineTransform.getTranslateInstance(TorX, TorY);
	private AffineTransform txTur = AffineTransform.getTranslateInstance(TurX, TurY);
	private AffineTransform txArm = AffineTransform.getTranslateInstance(ArmX, ArmY);
	private AffineTransform txSna = AffineTransform.getTranslateInstance(SnaX, SnaY);
	private AffineTransform txClam = AffineTransform.getTranslateInstance(ClamX, ClamY);
	private AffineTransform txGem = AffineTransform.getTranslateInstance(GemX, GemY);
	private AffineTransform txOme = AffineTransform.getTranslateInstance(OmeX, OmeY);
	private static int scoreCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Shop() {
		//Tortoise = getImage("/imgs/tortoise.gif");
		
		Turtle = getImage("/imgs/turtle.gif");
		Arma = getImage("/imgs/armadillo.png");
		Snail = getImage("/imgs/snail.gif");
		Clam = getImage("/imgs/clam.gif");
		GemTurtle = getImage("/imgs/gemturtle.gif");
		OmegaTurtle = getImage("/imgs/omegaturtle.gif");
		
		
		
		//TorX = 0;
		//TorY = 0;
		
		TurX = 100;
		TurY = -20;
		
		ArmX = 325;
		ArmY = 30;
		
		SnaX = 500;
		SnaY = -30;
		
		ClamX = 440;
		ClamY = 15;
		
		GemX = 250;
		GemY = 10;
		
		OmeX = 640; 
		OmeY = 60;
		
		
		
		//add icons for clam, gem, omega
	}
	
	
	
	
	
	public Image getTortoise() {
		return Tortoise;
	}


	public void setTortoise(Image tortoise) {
		Tortoise = tortoise;
	}


	public Image getTurtle() {
		return Turtle;
	}


	public void setTurtle(Image turtle) {
		Turtle = turtle;
	}


	public Image getArma() {
		return Arma;
	}


	public void setArma(Image arma) {
		Arma = arma;
	}


	public Image getSnail() {
		return Snail;
	}


	public void setSnail(Image snail) {
		Snail = snail;
	}


	public Image getClam() {
		return Clam;
	}


	public void setClam(Image clam) {
		Clam = clam;
	}


	public Image getGemTurtle() {
		return GemTurtle;
	}


	public void setGemTurtle(Image gemTurtle) {
		GemTurtle = gemTurtle;
	}


	public Image getOmegaTurtle() {
		return OmegaTurtle;
	}


	public void setOmegaTurtle(Image omegaTurtle) {
		OmegaTurtle = omegaTurtle;
	}


	public int getClamX() {
		return ClamX;
	}


	public void setClamX(int clamX) {
		ClamX = clamX;
	}


	public int getClamY() {
		return ClamY;
	}


	public void setClamY(int clamY) {
		ClamY = clamY;
	}


	public int getGemX() {
		return GemX;
	}


	public void setGemX(int gemX) {
		GemX = gemX;
	}


	public int getGemY() {
		return GemY;
	}


	public void setGemY(int gemY) {
		GemY = gemY;
	}


	public int getOmeX() {
		return OmeX;
	}


	public void setOmeX(int omeX) {
		OmeX = omeX;
	}


	public int getOmeY() {
		return OmeY;
	}


	public void setOmeY(int omeY) {
		OmeY = omeY;
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


	public AffineTransform getTxTor() {
		return txTor;
	}


	public void setTxTor(AffineTransform txTor) {
		this.txTor = txTor;
	}


	public AffineTransform getTxTur() {
		return txTur;
	}


	public void setTxTur(AffineTransform txTur) {
		this.txTur = txTur;
	}


	public AffineTransform getTxArm() {
		return txArm;
	}


	public void setTxArm(AffineTransform txArm) {
		this.txArm = txArm;
	}


	public AffineTransform getTxSna() {
		return txSna;
	}


	public void setTxSna(AffineTransform txSna) {
		this.txSna = txSna;
	}


	public AffineTransform getTxClam() {
		return txClam;
	}


	public void setTxClam(AffineTransform txClam) {
		this.txClam = txClam;
	}


	public AffineTransform getTxGem() {
		return txGem;
	}


	public void setTxGem(AffineTransform txGem) {
		this.txGem = txGem;
	}


	public AffineTransform getTxOme() {
		return txOme;
	}


	public void setTxOme(AffineTransform txOme) {
		this.txOme = txOme;
	}


	public static int getScoreCount() {
		return scoreCount;
	}


	public static void setScoreCount(int scoreCount) {
		Shop.scoreCount = scoreCount;
	}


	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;	
		g2.drawImage(Tortoise, txTor, null);
		//g2.drawImage(Turtle, txTur, null);
		g2.drawImage(Arma, txArm, null);
		g2.drawImage(Snail, txSna, null);
		g2.drawImage(Clam, txClam, null);
		g2.drawImage(GemTurtle, txGem, null);
		g2.drawImage(OmegaTurtle, txOme, null);
		
		
		
		
		txTor.setToTranslation(TorX, TorY);
		txTur.setToTranslation(TurX, TurY);
		txArm.setToTranslation(ArmX, ArmY);
		txSna.setToTranslation(SnaX, SnaY);
		txClam.setToTranslation(ClamX, ClamY);
		txGem.setToTranslation(GemX, GemY);
		txOme.setToTranslation(OmeX, OmeY);
		
		
		
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
		//txTor.scale(0.01,0.01);
		//txTur.scale(0.01,0.01);
		//txArm.scale(0.01,0.01);
		//txSna.scale(0.01,0.01);
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
