import ru.ifmo.se.pokemon.*;
public class DizzyPunch extends PhysicalMove {
    public DizzyPunch() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<=0.2) { Effect.confuse(def); }
    }
    @Override
    protected String describe() {
        return("использует DizzyPunch");
    }
}
