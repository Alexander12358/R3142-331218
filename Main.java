import ru.ifmo.se.pokemon.*;
public class Main {
	public static void main (String[] args) {
		Battle battle = new Battle();
		battle.addAlly(new Sewaddle ("Sewaddle", 1));
		battle.addAlly(new Kangaskhan ("Kangaskhan", 50));
		battle.addAlly(new Swadloon ("Swadloon", 100));
		battle.addFoe(new Snubbull ("Snubbull", 1));
		battle.addFoe(new Granbull ("Granbull", 50));
		battle.addFoe(new Leavanny ("Leavanny", 100));
		battle.go();
	}
}