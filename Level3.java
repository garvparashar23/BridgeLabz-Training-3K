import java.util.Scanner;

public class Level3Programs {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;  // Convert cm to m
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.format("%.2f", bmi), status};
    }

    // Method to compute BMI table for team
    public static String[][] computeTeamBMI(double[][] teamData) {
        String[][] result = new String[teamData.length][4];
        for (int i = 0; i < teamData.length; i++) {
            result[i] = calculateBMI(teamData[i][0], teamData[i][1]);
        }
        return result;
    }

    // Method to display table
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: BMI Program
        System.out.println("Enter number of team members: ");
        int n = sc.nextInt();
        double[][] teamData = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) of person " + (i+1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i+1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        String[][] bmiTable = computeTeamBMI(teamData);
        displayTable(bmiTable);

        sc.close();
    }
}

