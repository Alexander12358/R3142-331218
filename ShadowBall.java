import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove {
    private final Effect ShadowBall = new Effect().chance(0.2).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(ShadowBall);
    }
    @Override
    protected String describe() {
        return("использует ShadowBall");
    }
}
