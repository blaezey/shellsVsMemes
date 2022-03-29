
public class Shell {
	private int health, damage, range, cost;
	private double attackSpeed;
	private String name;


	public Shell(String name) {
		if(name == "Snail") { //snail is peeshoota
			health = 500;
			damage = 50;
			range = 5;
			cost = 100;
			attackSpeed = 1.0;
		}else if(name == "Tortoise") { //Wall-nut
			health = 750;
			damage = 0;
			range = 0;
			cost = 50;
			attackSpeed = 0;
		}else if(name == "Clam") { //Clam is custom lol
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
		}else if(name == "Queen Conch") {
			health = 500;
			damage = 30;
			range = 5;
			cost = 300;
			attackSpeed = 5.0;
		}else if(name == "King Crab") {
			health = 750;
			damage = 100;
			range = 2;
			cost = 500;
			attackSpeed = 3.0;
		}
	}
	
	
	
}
