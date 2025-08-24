//1. Voting Eligibility of 10 Students

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}

//2. Positive/Negative/Zero + Even/Odd + Compare First & Last

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (n > 0) {
                if (n % 2 == 0)
                    System.out.println(n + " is Positive and Even");
                else
                    System.out.println(n + " is Positive and Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");

        sc.close();
    }
}

//3. Multiplication Table of a Number
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}

//4. Store up to 10 Values Until 0 or Negative

import java.util.Scanner;

public class Level1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) break;

            arr[index++] = num;
        }

        System.out.println("You entered:");
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of numbers = " + total);

        sc.close();
    }
}

//5. Multiplication Table from 6 to 9

public class Level1 {
    public static void main(String[] args) {
        int[] table = new int[4]; // stores results temporarily

        for (int num = 6; num <= 9; num++) {
            System.out.println("Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " * " + i + " = " + result);
            }
            System.out.println();
        }
    }
}

//6. Mean Height of 11 Players

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height of players = " + mean);

        sc.close();
    }
}

//7. Odd & Even Numbers in Separate Arrays

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++)
            System.out.print(odd[i] + " ");

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++)
            System.out.print(even[i] + " ");

        sc.close();
    }
}
//8. Factors of a Number
import java.util.Scanner;
public class Level1{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = new int[10];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        sc.close();
    }
}
//9. Copy 2D Array into 1D
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array after copy:");
        for (int val : array)
            System.out.print(val + " ");

        sc.close();
    }
}
//10. FizzBuzz with Array
import java.util.Scanner;

public class Level1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
            return;
        }

        String[] results = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                results[i] = "FizzBuzz";
            else if (i % 3 == 0)
                results[i] = "Fizz";
            else if (i % 5 == 0)
                results[i] = "Buzz";
            else
                results[i] = String.valueOf(i);
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
