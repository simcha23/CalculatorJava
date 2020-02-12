import java.util.Arrays;

public class Calculator {
    public static void main(String[] args){
        System.out.println("\n---------ADDITION----------\n");
        System.out.println("The answer is:\t" + add(1,2,3,4,5));
        System.out.println("The answer is:\t" + add(1,2));
        System.out.println("The answer is:\t" + add(-1,-1));

        System.out.println("\n---------MULTIPLICATIONS----------\n");

        System.out.println("The answer is:\t" + multiply(1,3));
        System.out.println("The answer is:\t" + multiply(-1,3));
        System.out.println("The answer is:\t" + multiply(1,2,3,4,5));
    }
    public static int add(int ... num){

//        int sum = 0;
//        for(int value:num) {
//            sum = sum + value;
//        }
        int sum = Arrays.stream(num).sum();

        return sum;
    }
    public static int multiply(int ... num){

        int multiply = 1;
        for(int value : num) {
            multiply *= value;
        }
//        for(int i = 0; i < num.length; i++) {
//            multiply *= num[i];
//        }

        return multiply;
    }
}

