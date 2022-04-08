
public abstract class Shell {
	private int health, damage, range, cost, x, y;
	private double attackSpeed;
	private String name;

	


	public Shell(int x, int y, double attackSpeed, int cost, int health, int damage, String name) {
		this.health = health;
		this.damage = damage;
		this.range = range;
		this.attackSpeed = attackSpeed;
		this.name = name;
		
	}
	
	
	//public void Attacking(boolean Attack) {
	//	if(Meme.getX() - Shell.getX() < range) {
	//		Attack = true;
	//	}
	//		Attack = false;
	//	}
	
	
	
	
	public Shell(String name) {
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
		}
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
