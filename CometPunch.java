import ru.ifmo.se.pokemon.*;
public class CometPunch extends PhysicalMove {
    private final Effect CometPunch = new Effect().chance(1).turns(-1).stat(Stat.ATTACK, +1);
    public CometPunch() {
        super(Type.NORMAL, 18, 85);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        att.addEffect(CometPunch);
    }
    @Override
    protected String describe() {
        return("использует CometPunch");
    }
}
