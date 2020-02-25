import org.junit.Assert;
import org.junit.Test;
import javax.swing.JOptionPane;

public class CalculatorTest {

    @Test
    public  void TestMultiplication()
    {
        int multiply = 1;

        for(int x = 0; x < 2; x++) {

            String number = JOptionPane.showInputDialog("Enter number " + (x + 1));

            multiply = multiply * Integer.parseInt(number);
        }

        Assert.assertEquals(8,multiply);
    }
    @Test
    public  void TestAddition()
    {
        int sum = 0;

        for(int x = 0; x < 3; x++) {

            String number = JOptionPane.showInputDialog("Enter number " + (x + 1));

            sum = sum + Integer.parseInt(number);
        }

        Assert.assertEquals(8,sum);

    }

}
