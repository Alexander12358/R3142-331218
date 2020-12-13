import ru.ifmo.se.pokemon.*;
public class Snubbull extends Pokemon {
    public Snubbull(String name, int level) {
        super(name, level);
        this.setStats(60, 80, 50, 40, 40, 30);
        this.setType(Type.FAIRY);
        this.addMove(new Crunch());
        this.addMove(new Confide());
        this.addMove(new Bulldoze());
    }
}
