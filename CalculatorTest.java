import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpressionForSmallNumber() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }

  @Test
  public void evaluatesExpressionForLargeNumber() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+4+4+7");
    assertEquals(16, sum);
  }
}
