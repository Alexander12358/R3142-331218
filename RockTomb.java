import ru.ifmo.se.pokemon.*;
public class RockTomb extends PhysicalMove {
    private final Effect RockTomb = new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1);
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(RockTomb);
    }
    @Override
    protected String describe() {
        return("использует RockTomb");
    }
}
