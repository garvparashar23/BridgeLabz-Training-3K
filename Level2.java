import java.util.*;

public class Level2Programs {

    // ---------------- 1. Factors of a Number ----------------
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double sumOfSquaresOfFactors(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    // ---------------- 2. Sum of Natural Numbers (Recursion vs Formula) ----------------
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    // ---------------- 3. Leap Year ----------------
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // ---------------- 4. Unit Converter Utility ----------------
    static class UnitConverter {
        public static double convertKmToMiles(double km) { return km * 0.621371; }
        public static double convertMilesToKm(double miles) { return miles * 1.60934; }
        public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
        public static double convertFeetToMeters(double feet) { return feet * 0.3048; }
        public static double convertYardsToFeet(double yards) { return yards * 3; }
        public static double convertFeetToYards(double feet) { return feet * 0.333333; }
        public static double convertMetersToInches(double meters) { return meters * 39.3701; }
        public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
        public static double convertInchesToCm(double inches) { return inches * 2.54; }
        public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
        public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
        public static double convertPoundsToKilograms(double pounds) { return pounds * 0.453592; }
        public static double convertKilogramsToPounds(double kg) { return kg * 2.20462; }
        public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
        public static double convertLitersToGallons(double liters) { return liters * 0.264172; }
    }

    // ---------------- 5. Student Vote Checker ----------------
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    // ---------------- 6. Youngest & Tallest among 3 friends ----------------
    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return names[minIndex];
    }

    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return names[maxIndex];
    }

    // ---------------- 7. Array Pos/Neg + Even/Odd + Compare ----------------
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    // ---------------- 8. BMI Calculator ----------------
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    // ---------------- 9. Quadratic Roots ----------------
    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        return new double[]{}; // no real roots
    }

    // ---------------- 10. Random Numbers Array ----------------
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int) (Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: Factors
        System.out.print("Enter a number for factors: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum = " + sumOfFactors(factors));
        System.out.println("Product = " + productOfFactors(factors));
        System.out.println("Sum of squares = " + sumOfSquaresOfFactors(factors));

        // Example: Recursion vs Formula
        System.out.print("Enter n for sum: ");
        int n = sc.nextInt();
        System.out.println("Recursive Sum = " + sumRecursive(n));
        System.out.println("Formula Sum = " + sumFormula(n));

        // Example: Leap Year
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println(year + (isLeapYear(year) ? " is Leap Year" : " is not Leap Year"));

        // Example: Student Vote Checker
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Can vote? " + canStudentVote(ages[i]));
        }

        // Example: Youngest & Tallest
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] friendsAges = {20, 18, 22};
        double[] heights = {170, 180, 175};
        System.out.println("Youngest: " + findYoungest(names, friendsAges));
        System.out.println("Tallest: " + findTallest(names, heights));

        // Example: Random Numbers
        int[] randomArray = generate4DigitRandomArray(5);
        System.out.println("Random Array: " + Arrays.toString(randomArray));
        double[] stats = findAverageMinMax(randomArray);
        System.out.println("Average = " + stats[0] + ", Min = " + stats[1] + ", Max = " + stats[2]);

        sc.close();
    }
}
