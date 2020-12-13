import ru.ifmo.se.pokemon.*;
public class Kangaskhan extends Pokemon {
    public Kangaskhan(String name, int level) {
        super(name, level);
        this.setStats(105, 95, 80, 40, 80, 90);
        this.setType(Type.NORMAL);
        this.addMove(new ShadowBall());
        this.addMove(new CometPunch());
        this.addMove(new DizzyPunch());
        this.addMove(new TailWhip());
    }
}
