import ru.ifmo.se.pokemon.*;
public class XScissor extends PhysicalMove {
    private Object XScissor;
    public XScissor() {
        super(Type.BUG, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.addEffect((Effect)XScissor);
    }
    @Override
    protected String describe() {
        return("использует XScissor");
    }
}
