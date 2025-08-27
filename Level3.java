import java.util.Scanner;

public class Level1Programs {

    // 1. Simple Interest
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 2. Maximum Handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // 3. Triangular Park Athlete Rounds
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return (5000 / perimeter); // 5 km = 5000 m
    }

    // 4. Check Positive, Negative, Zero
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    // 5. Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    // 6. Sum of N Natural Numbers
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // 7. Smallest and Largest of 3 Numbers
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    // 8. Quotient and Remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    // 9. Chocolates Division
    public static int[] divideChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    // 10. Wind Chill Temperature
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    // 11. Trigonometric Functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    // -------- Main Driver --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example Run - Uncomment whichever program you want to test

        // 1. Simple Interest
        /*
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si);
        */

        // 2. Handshakes
        /*
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Max Handshakes: " + calculateHandshakes(n));
        */

        // 3. Athlete Rounds
        /*
        System.out.print("Enter three sides of park (m): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
        */

        // 4. Positive/Negative/Zero
        /*
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Result: " + checkNumber(num));
        */

        // 5. Spring Season
        /*
        System.out.print("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "Its Spring Season" : "Not Spring Season");
        */

        // 6. Sum of Natural Numbers
        /*
        System.out.print("Enter n: ");
        int m = sc.nextInt();
        System.out.println("Sum: " + sumNaturalNumbers(m));
        */

        // 7. Smallest and Largest of 3 Numbers
        /*
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int[] res = findSmallestAndLargest(x, y, z);
        System.out.println("Smallest: " + res[0] + ", Largest: " + res[1]);
        */

        // 8. Quotient & Remainder
        /*
        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt(), divisor = sc.nextInt();
        int[] qr = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + qr[0] + ", Remainder: " + qr[1]);
        */

        // 9. Chocolate Division
        /*
        System.out.print("Enter chocolates and children: ");
        int choc = sc.nextInt(), child = sc.nextInt();
        int[] div = divideChocolates(choc, child);
        System.out.println("Each child: " + div[0] + ", Remaining: " + div[1]);
        */

        // 10. Wind Chill
        /*
        System.out.print("Enter Temperature and Wind Speed: ");
        double temp = sc.nextDouble(), ws = sc.nextDouble();
        System.out.println("Wind Chill: " + calculateWindChill(temp, ws));
        */

        // 11. Trigonometric Functions
        /*
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trig[0] + ", Cosine: " + trig[1] + ", Tangent: " + trig[2]);
        */

        sc.close();
    }
}
