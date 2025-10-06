package core.basesyntax;

public abstract class AbstractFigure implements Drawable, Figure {
    private final Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name();
    }
}
