package shape;

public class ShapePrinter{
    private final IAreaCalculator calculator;

    public ShapePrinter(IAreaCalculator calculator) {
        this.calculator = calculator;
    }

    public String json(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "sum, %s".formatted(sum);
    }

}
