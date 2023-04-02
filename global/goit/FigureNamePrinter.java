package global.goit;

public class FigureNamePrinter implements FigurePrinter{
    @Override
    public void printFigureName(Shape shape) {
        shape.printName();
    }
}
