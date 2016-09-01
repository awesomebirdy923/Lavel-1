
public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human

		Human human = new Human("Keith");

		// 2. create a new Robot army of good and evil robots.

		Robot robot = new Robot("Robby", false);
		Robot evil = new Robot("Giselle", true);

		// 3. command your robot army to destroy a human

		evil.destroy(human);
		robot.destroy(human);
		evil.smootch(human);
		human.derpOut(evil);

	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}

	public void derpOut(Robot theOneToOffend) {
		System.out.println("The human just made the derpiest face and offended " + theOneToOffend.getName() + " then she baby slapped him. lel");
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;

	public Robot(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No!! The robot " + name + " can't destroy " + man.getName());
		}
	}

	public void smootch(Human target) {
		System.out.println(target.getName() + " started smootching the evil robot! :O XDDDDDD");
	}
	
	public String getName(){
		return name;
	}
}
