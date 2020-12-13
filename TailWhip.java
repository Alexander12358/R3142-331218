import ru.ifmo.se.pokemon.*;
public class TailWhip extends StatusMove {
    private final Effect TailWhip = new Effect().chance(1).turns(-1).stat(Stat.DEFENSE, -1);
    public TailWhip() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(TailWhip);
    }
    @Override
    protected String describe() {
        return("использует TailWhip");
    }
}
