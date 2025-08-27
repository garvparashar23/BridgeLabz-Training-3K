import java.util.*;

public class Level2Programs {

    // 1. Find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // 2. Split string into words without split()
    public static String[] manualSplit(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    // Compare 2 arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    // 3. Split text into words and return 2D array of words & lengths
    public static String[][] wordsWithLength(String text) {
        String[] words = manualSplit(text);
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // 4. Shortest and longest string
    public static String[] shortestAndLongest(String text) {
        String[][] words = wordsWithLength(text);
        String shortest = words[0][0], longest = words[0][0];
        int min = Integer.parseInt(words[0][1]), max = min;

        for (String[] w : words) {
            int len = Integer.parseInt(w[1]);
            if (len < min) {
                min = len; shortest = w[0];
            }
            if (len > max) {
                max = len; longest = w[0];
            }
        }
        return new String[]{shortest, longest};
    }

    // 5. Count vowels and consonants
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    public static int[] countVowelsAndConsonants(String str) {
        int v = 0, c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    // 6. Show each character type (Vowel/Consonant/Not a letter)
    public static String[][] charTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type;
            if (Character.isLetter(ch)) {
                type = isVowel(ch) ? "Vowel" : "Consonant";
            } else {
                type = "Not a Letter";
            }
            result[i][0] = String.valueOf(ch);
            result[i][1] = type;
        }
        return result;
    }

    // 7. Trim spaces manually
    public static String manualTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return str.substring(start, end + 1);
    }

    // 8. Voting eligibility
    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // 9. Rock Paper Scissors
    public static String computerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random()*3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    // 10. Marks & Grades
    public static String grade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "F";
    }

    public static void studentScores() {
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            int phy = r.nextInt(41)+60;  // random marks 60-100
            int chem = r.nextInt(41)+60;
            int math = r.nextInt(41)+60;
            int total = phy+chem+math;
            double percentage = total/3.0;
            System.out.println("Student " + i + " => " +
                "Physics:" + phy + ", Chemistry:" + chem + ", Maths:" + math +
                ", Total:" + total + ", %:" + Math.round(percentage*100.0)/100.0 +
                ", Grade:" + grade(percentage));
        }
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example runs (you can test one by one)
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Length (manual): " + findLength(str));
        System.out.println("Length (built-in): " + str.length());

        String[] manual = manualSplit(str);
        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(str.split(" ")));
        System.out.println("Arrays Equal? " + compareArrays(manual, str.split(" ")));

        System.out.println("Words with Lengths: " + Arrays.deepToString(wordsWithLength(str)));

        String[] sl = shortestAndLongest(str);
        System.out.println("Shortest: " + sl[0] + ", Longest: " + sl[1]);

        int[] vc = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + vc[0] + ", Consonants: " + vc[1]);

        System.out.println("Char Types: " + Arrays.deepToString(charTypes(str)));

        System.out.println("Trimmed (manual): '" + manualTrim("   hello world   ") + "'");
        System.out.println("Trimmed (built-in): '" + "   hello world   ".trim() + "'");

        int[] ages = {12, 18, 25, 10, 30};
        System.out.println("Voting Eligibility: " + Arrays.deepToString(canVote(ages)));

        System.out.println("Game Example: User=rock vs Computer=" + computerChoice() +
                           " => Winner=" + findWinner("rock", computerChoice()));

        studentScores();

        sc.close();
    }
}
