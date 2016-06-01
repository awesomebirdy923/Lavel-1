
public class SeaRunner {

	public static void main(String[] args) {
		SeaCreature s = new SeaCreature("spongebob");
		SeaCreature p = new SeaCreature("patrick");
		SeaCreature sq = new SeaCreature("squidward");
		p.laugh();
		s.laugh();
		sq.laugh();
		s.eat();
		sq.eat();
		p.eat();
		System.out.println(p.getName() + " " + sq.getName() );
	}
	
}
