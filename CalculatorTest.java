import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpressionForPlus() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }

  @Test
  public void evaluatesExpressionForMinus() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+13-8");
    assertEquals(8, sum);
  }
}
