import java.util.Scanner;

public class Level1Programs {
    
    // 🔹 Example static helper function for Program 1
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- PROGRAM 1: Compare Strings ----------------
        System.out.println("\n--- Program 1: Compare Strings ---");
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        System.out.println("Custom Compare (via static function): " + compareUsingCharAt(s1, s2));
        System.out.println("Built-in Compare: " + s1.equals(s2));

        // ---------------- PROGRAM 2: Substring ----------------
        System.out.println("\n--- Program 2: Substring ---");
        System.out.print("Enter string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String customSub = "";
        for (int i = start; i < end; i++) {
            customSub += text.charAt(i);
        }
        String builtinSub = text.substring(start, end);
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtinSub);
        System.out.println("Equal? " + customSub.equals(builtinSub));

        // ---------------- PROGRAM 3: Char Array Conversion ----------------
        System.out.println("\n--- Program 3: Char Array Conversion ---");
        System.out.print("Enter string: ");
        String strArr = sc.next();
        char[] customArr = new char[strArr.length()];
        for (int i = 0; i < strArr.length(); i++) {
            customArr[i] = strArr.charAt(i);
        }
        char[] builtinArr = strArr.toCharArray();
        boolean arraysEqual = true;
        if (customArr.length != builtinArr.length) arraysEqual = false;
        else {
            for (int i = 0; i < customArr.length; i++) {
                if (customArr[i] != builtinArr[i]) {
                    arraysEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays Equal? " + arraysEqual);

        // ---------------- PROGRAM 4: Uppercase Conversion ----------------
        sc.nextLine(); // clear buffer
        System.out.println("\n--- Program 4: Uppercase Conversion ---");
        System.out.print("Enter text: ");
        String upperText = sc.nextLine();
        String customUpper = "";
        for (int i = 0; i < upperText.length(); i++) {
            char ch = upperText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                customUpper += (char) (ch - 32);
            } else customUpper += ch;
        }
        System.out.println("Custom Upper: " + customUpper);
        System.out.println("Built-in Upper: " + upperText.toUpperCase());
        System.out.println("Equal? " + customUpper.equals(upperText.toUpperCase()));

        // ---------------- PROGRAM 5: Lowercase Conversion ----------------
        System.out.println("\n--- Program 5: Lowercase Conversion ---");
        System.out.print("Enter text: ");
        String lowerText = sc.nextLine();
        String customLower = "";
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                customLower += (char) (ch + 32);
            } else customLower += ch;
        }
        System.out.println("Custom Lower: " + customLower);
        System.out.println("Built-in Lower: " + lowerText.toLowerCase());
        System.out.println("Equal? " + customLower.equals(lowerText.toLowerCase()));

        // ---------------- PROGRAM 6: NullPointerException ----------------
        System.out.println("\n--- Program 6: NullPointerException ---");
        try {
            String nullStr = null;
            System.out.println(nullStr.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }

        // ---------------- PROGRAM 7: StringIndexOutOfBoundsException ----------------
        System.out.println("\n--- Program 7: StringIndexOutOfBoundsException ---");
        try {
            String str = "Hello";
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // ---------------- PROGRAM 8: IllegalArgumentException ----------------
        System.out.println("\n--- Program 8: IllegalArgumentException ---");
        try {
            String str = "Java";
            System.out.println(str.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }

        // ---------------- PROGRAM 9: NumberFormatException ----------------
        System.out.println("\n--- Program 9: NumberFormatException ---");
        try {
            String numStr = "abc123";
            int num = Integer.parseInt(numStr);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        }

        // ---------------- PROGRAM 10: ArrayIndexOutOfBoundsException ----------------
        System.out.println("\n--- Program 10: ArrayIndexOutOfBoundsException ---");
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        sc.close();
    }
}
