import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        Operators operator = new Operators();
        Validation validation = new Validation();

        ArrayList<Integer> integerList = new ArrayList<>();

        for(int x = 0; x <= integerList.size(); x++){

            System.out.println("Enter number " + (x + 1) + " or 'A/a' to terminate:");
            String number = scan.nextLine();

            if(!number.trim().equalsIgnoreCase("a")|| !number.trim().equalsIgnoreCase("A")){
                if(validation.numberOrNot(number)){

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

        System.out.println("The answer is:\t" + operator.add(array));

        System.out.println("\n---------MULTIPLICATIONS----------\n");

        System.out.println("The answer is:\t" + operator.multiply(array));

    }
}

