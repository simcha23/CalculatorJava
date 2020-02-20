import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> integerList = new ArrayList<>();

        for(int x = 0; x <= integerList.size(); x++){

            System.out.println("Enter number " + (x + 1) + " or 'A/a' to terminate:");
            String number = scan.nextLine();

            if(!number.trim().equalsIgnoreCase("a")|| !number.trim().equalsIgnoreCase("A")){
                if(numberOrNot(number)){

                    integerList.add(Integer.parseInt(number));
                }
                else {
                    System.out.println("Only integer number allowed");
                    x = x - 1;
                }

            }
            else{
                break;
            }


        }

        int[] array = new int[integerList.size()];
        for(int z =0 ; z< integerList.size(); z++){
            array[z] = integerList.get(z);
            System.out.println(array[z]);
        }


        System.out.println("\n---------ADDITION----------\n");

        System.out.println("The answer is:\t" + add(array));

        System.out.println("\n---------MULTIPLICATIONS----------\n");

        System.out.println("The answer is:\t" + multiply(array));

    }
    public static int add(int... num){

        int sum = 0;
        for(int value:num) {
            sum = sum + value;
        }

        return sum;
    }
    public static int multiply(int... num){

        int multiply = 1;
        for(int value : num) {
            multiply *= value;
        }

        return multiply;
    }
    public static boolean numberOrNot(String input)
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

