import ru.ifmo.se.pokemon.*;
public class Crunch extends PhysicalMove {
    private final Effect Crunch = new Effect().chance(0.2).turns(-1).stat(Stat.DEFENSE, -1);
    public Crunch() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(Crunch);
    }
    @Override
    protected String describe() {
        return("использует Crunch");
    }
}
