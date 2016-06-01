
public class SmurfRunner {
public static void main(String[] args) {
	Smurfs handy = new Smurfs("Handy");
	Smurfs papa = new Smurfs("Papa");
	Smurfs ette = new Smurfs("Smurfette");
	handy.eat();
	System.out.println(handy.getName() + " " + papa.getName());
	System.out.println(papa.getHatColor("red") + " " + papa.isGirlOrBoy("boy"));
	System.out.println(ette.isGirlOrBoy("girl") + " " + ette.getHatColor("white"));
}
}
