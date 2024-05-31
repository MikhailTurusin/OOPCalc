package Calc;

public class Main {
    public static void main(String[] args) {
        Calc.ICalculableFactory calculableFactory = new Calc.CalculableFactory();
        Calc.ViewCalculator view = new Calc.ViewCalculator(calculableFactory);
        view.run();
    }
}