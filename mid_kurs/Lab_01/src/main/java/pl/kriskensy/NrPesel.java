package pl.kriskensy;

import java.util.Random;

public class NrPesel {
    public static void main(String[] args) {

        String[][] persons = new String[6][2];

        persons[0][0] = "Kowalski";
        persons[0][1] = "90120112345";
        persons[1][0] = "Nowak";
        persons[1][1] = "73061928539";
        persons[2][0] = "Antkowiak";
        persons[2][1] = "85051347861";
        persons[3][0] = "Bartczak";
        persons[3][1] = "64090478035";
        persons[4][0] = "Jasinski";
        persons[4][1] = "95072623987";
        persons[5][0] = "Maciejczyk";
        persons[5][1] = "80082597462";

        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println("Persons with number " + number + " in PESEL: ");

        for (String[] person : persons) {
            if (person[1].contains(Integer.toString(number))) {
                System.out.println(person[0] + " - " + person[1]);
            }
        }
    }
}