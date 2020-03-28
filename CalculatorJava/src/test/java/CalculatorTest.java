import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator operator = new Calculator();

    @Test
    public  void TestAddition()
    {

        int sum = operator.add(new int[]{1,2,3,2});

        Assert.assertEquals(8,sum);

    }
    @Test
    public  void TestMultiplication()
    {

        int multiply = operator.multiply(new int[]{1,2,3,2});

        Assert.assertEquals(12,multiply);
    }

}
