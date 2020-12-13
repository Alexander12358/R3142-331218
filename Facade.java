import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    private final Effect Facade = new Effect().chance(1).turns(1).stat(Stat.HP, -1);
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if (def.getCondition() == Status.BURN ||
                def.getCondition() == Status.POISON ||
                def.getCondition() == Status.PARALYZE) {
            def.addEffect(Facade);
        }
    }
    @Override
    protected String describe() {
        return("использует Facade");
    }
}
