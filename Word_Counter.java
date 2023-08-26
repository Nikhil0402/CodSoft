package CodSoft;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text or line");
        String st = sc.nextLine();
        String[] words = st.split("[\\s\\p{Punct}]+");
        HashSet<String> set = new HashSet<>();

        int wordCount = 0;
        int unique = 0;

        for (String word : words) {

            if (set.contains(word)) {
                unique++;
            } else {
                set.add(word);
            }
            wordCount++;
        }

        System.out.println("Word count: " + wordCount);
        System.out.println("Unque words are : " + unique);
    }
}
