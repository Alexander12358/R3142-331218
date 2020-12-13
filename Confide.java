import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    private final Effect Confide = new Effect().chance(1).turns(-1).stat(Stat.SPECIAL_ATTACK, -1);
    public Confide() {
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(Confide);
    }
    @Override
    protected String describe() {
        return("использует Confide");
    }
}
