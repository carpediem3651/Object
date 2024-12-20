package class8.CompositePatternAndVisitor;

import java.util.function.Supplier;

public class Renderer {
    private final Supplier<Visitor> factory;

    public Renderer(Supplier<Visitor> factory) {
        this.factory = factory;
    }

    public void render(TaskReport report) {
        render(factory.get(), report, 0);
    }

    private void render(Visitor visitor, TaskReport report, int depth){
        visitor.drawTask(report.getTask());
    }
}
