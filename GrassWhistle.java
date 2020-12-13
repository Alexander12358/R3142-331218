import ru.ifmo.se.pokemon.*;
public class GrassWhistle extends StatusMove {
    private final Effect GrassWhistle = new Effect().chance(1).turns(1).condition(Status.SLEEP);
    public GrassWhistle() {
        super(Type.GRASS, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect(GrassWhistle);
    }
    @Override
    protected String describe() {
        return("использует GrassWhistle");
    }
}
