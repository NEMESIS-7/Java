public class Main {
    public static void main(String[] args) {
        // Data Types and Variables
        int number = 10;
        double price = 19.99;
        boolean isAvailable = true;
        char grade = 'A';
        String message = "Hello, Java!";

        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);

        // Flow Control: If-Else
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // Loop Example
        System.out.println("Counting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Switch Statement Example
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
