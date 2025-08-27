import java.util.Scanner;

public class Level1Programs {

    // 1. Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 2. Handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // 3. Triangular Park Rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // meters (5 km)
        return distance / perimeter;
    }

    // 4. Positive, Negative or Zero
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    // 5. Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    // 6. Sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 7. Smallest and Largest of 3 numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[]{smallest, largest};
    }

    // 8. Quotient and Remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    // 9. Chocolate Distribution
    public static int[] distributeChocolates(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachChildGets, remaining};
    }

    // 10. Wind Chill Calculation
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    // 11. Trigonometric Functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    // ------------------- MAIN METHOD -------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example Calls (Uncomment to test one by one)

        // 1. Simple Interest
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + " and Time " + t);

        // 2. Handshakes
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.println("Maximum handshakes: " + calculateHandshakes(students));

        // 3. Triangular Park
        System.out.print("Enter 3 sides of triangular park: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds required: " + calculateRounds(a, b, c));

        // 4. Positive/Negative/Zero
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Result: " + checkNumber(num));

        // 5. Spring Season
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "Its a Spring Season" : "Not a Spring Season");

        // 6. Sum of natural numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers = " + sumOfNaturalNumbers(n));

        // 7. Smallest & Largest
        System.out.print("Enter 3 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] result1 = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest = " + result1[0] + ", Largest = " + result1[1]);

        // 8. Quotient & Remainder
        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt(), divisor = sc.nextInt();
        int[] result2 = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient = " + result2[1] + ", Remainder = " + result2[0]);

        // 9. Chocolate Distribution
        System.out.print("Enter chocolates and children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result3 = distributeChocolates(chocolates, children);
        System.out.println("Each child gets " + result3[0] + ", Remaining = " + result3[1]);

        // 10. Wind Chill
        System.out.print("Enter temperature and wind speed: ");
        double temp = sc.nextDouble(), wind = sc.nextDouble();
        System.out.println("Wind Chill = " + calculateWindChill(temp, wind));

        // 11. Trigonometric Functions
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.println("sin = " + trig[0] + ", cos = " + trig[1] + ", tan = " + trig[2]);

        sc.close();
    }
}
