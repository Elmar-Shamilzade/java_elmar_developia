package newlesson;

public class MainMath {
    public static void main(String[] args) {
        MathUnits mathUnits = new MathUnits();
        AdvancedMath advancedMath = new AdvancedMath();

        int my_number = mathUnits.add(1, 2, 3);
        int my_number2 = mathUnits.add(2, 100, 30);
        int sum_myNums = my_number * my_number2;

        mathUnits.multpl(10, 1, 1);

        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNums);

        int subtracted = advancedMath.add(5, 3, 1); // 5 - 3 - 1 = 1
        int divided = advancedMath.division(10, 2, 1); // 10 / 2 = 5
        System.out.println(subtracted);
        System.out.println(divided);
    }
}

class MathUnits {
    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    void multpl(int x, int y, int z) {
        int product = x * y * z;
        System.out.println(product);
    }
}

class AdvancedMath {
    int add(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }

    int division(int x, int y, int z) {
        int quotient = x / y;
        return quotient;
    }
}