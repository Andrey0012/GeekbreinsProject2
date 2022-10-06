package Task5;

public class MainClass {
  public static void main(String[] args) {
    CalculatorThree calculator = new CalculatorThree();
    calculator.initGraphicWindow();

    new CalculatorEngine(calculator);
  }
}
