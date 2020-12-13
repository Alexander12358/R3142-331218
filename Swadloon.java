import ru.ifmo.se.pokemon.*;
public class Swadloon extends Sewaddle {
    public Swadloon(String name, int level) {
        super(name, level);
        this.setStats(60, 63, 90, 50, 80, 42);
        this.setType(Type.BUG);
        this.addMove(new Facade());
        this.addMove(new DreamEater());
        this.addMove(new GrassWhistle());
    }
}
