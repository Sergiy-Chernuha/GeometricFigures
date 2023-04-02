package global.goit;

import java.util.Arrays;

public class AppStarter {
    public static void main(String[] args) {
        Shape firstFigure= new Circle();
        Shape secondFigure= new Oval();
        Shape thirdFigure= new Quad();
        Shape fourthFigure= new Rectangle();
        Shape fifthFigure= new Triangle();

        Shape[] shapeArray= {firstFigure,secondFigure,thirdFigure,fourthFigure,fifthFigure};

        Arrays.stream(shapeArray).forEach(figure->figure.printName());
    }
}
