import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public  void TestMultiplication()
    {
        int multiply1 = 1 * 3;
        int multiply2 = -1 * 3;
        int multiply3 = 1 * 2 * 3 * 4 * 5;
        System.out.println(multiply1);

        Assert.assertEquals(3,multiply1);
        Assert.assertEquals(-3,multiply2);
        Assert.assertEquals(120,multiply3);
    }
    @Test
    public  void TestAddition()
    {
        int sum1 = 1 + 2 + 3 + 4 + 5;
        int sum2 = 1 + 2;
        int sum3 = -1 + -1;

        Assert.assertEquals(15,sum1);
        Assert.assertEquals(3,sum2);
        Assert.assertEquals(-2,sum3);
    }

}
