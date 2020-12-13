import ru.ifmo.se.pokemon.*;
public class Granbull extends Snubbull {
    public Granbull(String name, int level) {
        super(name, level);
        this.setStats(160, 137, 80, 91, 64, 70);
        this.setType(Type.FAIRY);
        this.addMove(new Crunch());
        this.addMove(new Confide());
        this.addMove(new Bulldoze());
        this.addMove(new RockTomb());
    }
}
