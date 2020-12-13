import ru.ifmo.se.pokemon.*;
public class Leavanny extends Swadloon {
    public Leavanny(String name, int level) {
        super(name, level);
        this.setStats(90, 103, 80, 70, 80, 92);
        this.setType(Type.BUG);
        this.addMove(new Facade());
        this.addMove(new DreamEater());
        this.addMove(new GrassWhistle());
        this.addMove(new XScissor());
    }
}