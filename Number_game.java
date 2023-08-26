package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a = rand.nextInt(1, 100);
        int count = 0;

        for (int i = 10; i > 0; i--) {
            System.out.println("Enter you choice you have " + i + " chances left");
            int user = sc.nextInt();
            if (user == a) {
                System.out.println("Congratulations! you guessed correctly , you score is " + count);
                break;
            } else if (user < a) {
                System.out.println("Oops your guess is to low ");
            } else if (user > a) {
                System.out.println("Oops your guess is to high ");
            } else {
                System.out.println("Sorry , you coudn't guess it correct ");
            }
            count++;
        }

    }

}
