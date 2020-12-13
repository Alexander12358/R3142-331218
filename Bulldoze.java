import ru.ifmo.se.pokemon.*;
public class Bulldoze extends PhysicalMove {
    private final Effect Bulldoze = new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1);
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(Bulldoze);
    }
    @Override
    protected String describe() {
        return("использует Bulldoze");
    }
}
