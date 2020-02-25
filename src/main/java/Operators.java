public class Operators {
    public int add(int... num){

        int sum = 0;
        for(int value:num) {
            sum = sum + value;
        }

        return sum;
    }
    public int multiply(int... num){

        int multiply = 1;
        for(int value : num) {
            multiply *= value;
        }

        return multiply;
    }
}
