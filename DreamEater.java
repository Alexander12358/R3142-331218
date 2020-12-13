import ru.ifmo.se.pokemon.*;
public class DreamEater extends SpecialMove {
    private final Effect DreamEater = new Effect().chance(1).turns(3).stat(Stat.ATTACK, -1);
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if (def.getCondition() == Status.SLEEP) {
            def.addEffect(DreamEater);
        }
    }
    @Override
    protected String describe() {
        return ("использует DreamEater");
    }
}