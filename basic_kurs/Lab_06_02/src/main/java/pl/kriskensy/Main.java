//Zad 2 - Przetestować przesłonięcie i przeciążenie oraz przeciążenia między klasą a jej klasą bazową
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Moderator moderator = new Moderator();

        user.hello();
        moderator.hello();
    }
}