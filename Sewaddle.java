import ru.ifmo.se.pokemon.*;
public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level) {
        super(name, level);
        this.setStats(45, 53, 70, 40, 60, 42);
        this.setType(Type.BUG);
        this.addMove(new Facade());
        this.addMove(new DreamEater());
    }
}
