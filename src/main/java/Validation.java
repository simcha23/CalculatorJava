public class Validation {
    public boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);

        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}
