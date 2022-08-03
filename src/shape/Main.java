package shape;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalc = new AreaCalculator();
        ShapePrinter printer = new ShapePrinter(areaCalc);

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
//        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(
//                noShape,
                circle, square,
                cube, rectangle
        );

        int sum = areaCalc.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }

}