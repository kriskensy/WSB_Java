//5 Napisać metody które będą pobierały od użytkownika informacje (mogą to być odpowiedzi na pytania abcd) po wszyskich
// pytaniach program powinien zliczać na ile pytań dobrze odpowiedzieliśmy oraz dać nam informacje zwrotną
// na ile % dobrze odpowiedzieśmy na nie.
package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"2x2?", "3x3?", "4x4?", "5x5?"};
        String[] answers = {"a", "b", "c", "d"};

        int goodAnswersCounter = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("a 4");
            System.out.println("b 9");
            System.out.println("c 16");
            System.out.println("d 25");
            System.out.print("your answer: ");

            String userAnswers = scanner.nextLine();

            if (userAnswers.equals(answers[i])) {
                goodAnswersCounter++;
            }
        }

        double goodAnswersPercent = (double) goodAnswersCounter / questions.length * 100;

        System.out.println("Good answers: " + goodAnswersCounter);
        System.out.println("Good answers %: " + goodAnswersPercent + "%");
    }
}