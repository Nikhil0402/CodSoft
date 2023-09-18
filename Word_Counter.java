package CodSoft;

import java.util.*;

public class Word_Counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text or line");
        String st = sc.nextLine();
        String[] words = st.split("[\\s\\p{Punct}]+");
        HashSet<String> set = new HashSet<>();

        int wordCount = 0;

        for (String word : words) {

            if (!word.isEmpty()) {
                wordCount++;
                set.add(word.toLowerCase());
            }

        }

        System.out.println("Word count: " + wordCount);
        System.out.println("Unique words are : " + set.size());
    }
}
