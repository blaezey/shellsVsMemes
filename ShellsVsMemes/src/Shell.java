import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Shell {
	private int health, currHealth, damage, range, cost, x, y;
	private double attackSpeed;
	private String name;
	private Image Tortoise,Turtle,Arma,Snail,Clam,GemTurtle,OmegaTurtle;
	private int TorX,TorY,TurX,TurY,ArmX,ArmY,SnaX,SnaY,ClamX,ClamY,GemX,GemY,OmeX,OmeY;
	private AffineTransform txTor = AffineTransform.getTranslateInstance(TorX, TorY);
	private AffineTransform txTur = AffineTransform.getTranslateInstance(TurX, TurY);
	private AffineTransform txArm = AffineTransform.getTranslateInstance(ArmX, ArmY);
	private AffineTransform txSna = AffineTransform.getTranslateInstance(SnaX, SnaY);
	private AffineTransform txClam = AffineTransform.getTranslateInstance(ClamX, ClamY);
	private AffineTransform txGem = AffineTransform.getTranslateInstance(GemX, GemY);
	private AffineTransform txOme = AffineTransform.getTranslateInstance(OmeX, OmeY);


	public Shell() {
		health = 1;
		currHealth = 1;
		damage = 0;
		range = 0;
		attackSpeed = 0.0;
		name = "";
		
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
	
//	public void Attacking(boolean Attack) {
//		if(Meme.getX() - Shell.getX() < range) {
//			Attack = true;
//		}else {
//			Attack = false;
//		}
//	}
	
	
	
	
	
	
	public Shell(String name, int x, int y) {
		Turtle = getImage("/imgs/turtle.gif");
		Arma = getImage("/imgs/armadillo.png");
		Snail = getImage("/imgs/snail.gif");
		Clam = getImage("/imgs/clam.gif");
		GemTurtle = getImage("/imgs/gemturtle.gif");
		OmegaTurtle = getImage("/imgs/omegaturtle.gif");
		
		this.name = name;
		
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
		
		OmeX = 200; 
		OmeY = 50;
		
		
		if(name == "Snail") { //snail is peeshoota
			health = 500;
			damage = 50;
			range = 5;
			cost = 100;
			attackSpeed = 1.0;
		}else if(name == "Turtle") {
			health = 500;
			damage = 100;
			range = 4;
			cost = 125;
			attackSpeed = 0.7;
		}else if(name == "Omega Turtle") {
			health = 600;
			damage = 200;
			range = 8;
			cost = 225;
			attackSpeed = 0.7;
		}else if(name == "Gem Turtle") {
			health = 750;
			damage = 75;
			range = 5;
			cost = 200;
			attackSpeed = 1.0;
		}else if(name == "Armadillo") {
			health = 1000;
			damage = 50;
			range = 2;
			cost = 150;
			attackSpeed = 1.5;
		}else if(name == "Tortoise") { //Wall-nut
			health = 750;
			damage = 0;
			range = 0;
			cost = 50;
			attackSpeed = 0;
		}else if(name == "Clam") { //Custom
			health = 500;
			damage = 100;
			range = 6;
			cost = 200;
			attackSpeed = 1.4;
		}else if(name == "Crab") {
			health = 750;
			damage = 100;
			range = 1;
			cost = 150;
			attackSpeed = 1.3;
		}else if(name == "Queen Conch") { //fast attack, "low" damage
			health = 500;
			damage = 30;
			range = 5;
			cost = 300;
			attackSpeed = 5.0;
		}else if(name == "King Crab") { //better version of crab
			health = 750;
			damage = 100;
			range = 2;
			cost = 500;
			attackSpeed = 3.0;
		}else {
			health = 500;
			damage = 50;
			range = 5;
			cost = 100;
			attackSpeed = 1.0;
		}
		currHealth = health;
	}
	
	public int getCurrHealth() {
		return currHealth;
	}

	public void setCurrHealth(int currHealth) {
		this.currHealth = currHealth;
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

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;	
		txOme.setToTranslation(OmeX, OmeY);
		txTur.setToTranslation(TurX, TurY);
		txArm.setToTranslation(ArmX, ArmY);
		txSna.setToTranslation(SnaX, SnaY);
		txClam.setToTranslation(ClamX, ClamY);
		txGem.setToTranslation(GemX, GemY);
		
		if(name == "Omega Turtle") {
			g2.drawImage(OmegaTurtle, txOme, null);
		}else if(name == "Turtle"){
			g2.drawImage(Turtle, txTur, null);
		}else if(name == "Gem Turtle"){
			g2.drawImage(GemTurtle, txGem, null);
		}else if(name == "Snail"){
			g2.drawImage(Snail, txSna, null);
		}else if(name == "Armadillo"){
			g2.drawImage(Arma, txArm, null);
		}else if(name == "Clam"){
			g2.drawImage(Clam, txClam, null);
		}else{
			g2.drawImage(OmegaTurtle, txOme, null);
		}
		
			
		
		
		
	}
	
	public String getStats() {
		return name+" "+health;
	}
	
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
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


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		TorX = x;
		TurX = x;
		ArmX = x;
		SnaX = x;
		ClamX = x;
		GemX = x;
		OmeX = x;
		
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		TorY = y;
		TurY = y;
		ArmY = y;
		SnaY = y;
		ClamY = y;
		GemY = y;
		OmeY = y;
		
		
		this.y = y;
	}


	public double getAttackSpeed() {
		return attackSpeed;
	}


	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
