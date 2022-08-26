import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "racecar";
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0);
        for (char c : string.toCharArray()) {
            alphabets[c - 'a']++;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (alphabets[i] > 1) {
                char ch = (char) (97 + i);

                String temp = Character.toString(ch) + Character.toString(ch) + "";

                builder.insert(builder.length() / 2, temp);
                alphabets[i] = alphabets[i] - 2;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (alphabets[i] == 1) {
                char ch = (char) (97 + i);
                String temp = Character.toString(ch) + "";
                builder.insert(builder.length() / 2, temp);
            }
        }
        System.out.println(builder.toString());
    }
}
