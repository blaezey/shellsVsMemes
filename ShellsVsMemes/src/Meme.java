
public class Meme {
	private int health, damage, range, x, y;
	private double attackSpeed, vx;
	private String name;


public Meme(String name) {
	if(name == "Troll") { //snail is peeshoota
		health = 500;
		damage = 50;
		range = 2;
		vx = 10;
		attackSpeed = 1.0;
	}else if(name == "Doge") {
		health = 750;
		damage = 50;
		range = 2;
		vx = 10;
		attackSpeed = 0.7;
	}else if(name == "Tortoise") { //Wall-nut
		health = 750;
		damage = 0;
		range = 0;
		vx = 10;
		attackSpeed = 0;
	}else if(name == "Clam") { //Custom
		health = 500;
		damage = 100;
		range = 6;
		vx = 10;
		attackSpeed = 1.4;
	}else if(name == "Imp") { //fast movement, "low" health
		health = 500;
		damage = 30;
		range = 5;
		vx = 20;
		attackSpeed = 5.0;
	}else if(name == "Harambe") { //ITS HIM!
		health = 1000;
		damage = 100;
		range = 2;
		vx = 2;
		attackSpeed = 0.75;
	}
}

}
