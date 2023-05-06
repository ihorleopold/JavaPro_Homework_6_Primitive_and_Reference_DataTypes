public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkNumber(0);
        checkNumber(-1);
        ifPositiveReturnsTrue(0);
        ifPositiveReturnsTrue(-1);
        dataAndIterations("Test", 5);
        leapYearCheck(100);

    }

    private static void printThreeWords() {
        System.out.println("""
                Apple
                Orange
                Banana
                Apple""");
    }

    private static void checkSumSign() {
        int a = 1;
        int b = 0;
        double result = a + b;
        if (result >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }

    }

    private static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    private static void compareNumbers() {
        int a = 9;
        int b = 1;
        double sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }

    private static boolean ifPositiveReturnsTrue(int number) {

        if (number < 0) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;

    }

    private static void dataAndIterations(String string, int number) {
        int iterations = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("String value is: " + string + "\nInteger value is: " + number);
            iterations++;
        }
        System.out.println("Amount of iterations " + iterations);
    }

    public static boolean leapYearCheck(int year) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        return isLeap;
    }

}

