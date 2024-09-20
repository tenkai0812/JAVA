public class methoddefine {
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // Method with parameters and a return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters of different types
    public static void printPersonInfo(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
    }

    // Method with an array parameter
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Main method to demonstrate the use of defined methods
    public static void main(String[] args) {
        // Calling a method with no parameters
        sayHello();

        // Calling a method with parameters and using its return value
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        // Calling a method with multiple parameters
        printPersonInfo("Alice", 30, 1.65);

        // Calling a method with an array parameter
        double[] scores = {85.5, 90.0, 78.5, 92.5};
        double average = calculateAverage(scores);
        System.out.println("Average score: " + average);
    }
    
}
