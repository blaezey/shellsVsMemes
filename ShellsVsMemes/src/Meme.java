
public class Meme {
	private int health, damage, range, x, y;
	private double attackSpeed, vx;
	private String name;


public Meme(String name) {
	if(name == "Troll") { //troll is basic
		health = 500;
		damage = 50;
		range = 2;
		vx = 10;
		attackSpeed = 1.0;
	}else if(name == "Doge") { //doge is conehead/bucket/heavy
		health = 750;
		damage = 50;
		range = 2;
		vx = 10;
		attackSpeed = 0.7;
	}else if(name == "Harambe") { //ITS HIM!
		health = 1000;
		damage = 100;
		range = 2;
		vx = 2;
		attackSpeed = 0.75;
	}
}

}
