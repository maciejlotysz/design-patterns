package singleton.task;

import lombok.Getter;

import java.util.*;

@Getter
public class GuessGame {

    private int score = 0;
    private static GuessGame instance = new GuessGame();
    private Scanner scanner = new Scanner(System.in);
    private Random r = new Random();

    private GuessGame() {

    }

    public static GuessGame getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }


    public void play() {

        System.out.println("Welcome on GuessGame!");
        int randomNumber = r.nextInt(10);
        int counter = 0;
        int guessNumber;
        while(counter <= 10) {
            System.out.println("Zgadnij wylosowaną przez komputet liczbę (od 0 do 9)");
            guessNumber = scanner.nextInt();
            if (guessNumber > 9 || guessNumber < 0) {
                System.out.println(
                        "Nieprawidłowa liczba! Podana liczba nie może byc mniejsza od zera ani większa niż 9");
            } else if (guessNumber > randomNumber) {

                System.out.println("Za dużo! Spróbuj jeszcze raz.");
                counter++;
            } else if (guessNumber < randomNumber) {
                System.out.println("Za mało! spróbuj jeszcze raz.");
                counter++;
            } else {
                System.out.println("Brawo! Zdobywasz 1 pkt!");
                counter++;
                score++;
                randomNumber = r.nextInt(10);
            }
        }
        System.out.println("Twój wynik: " + score);
    }
}
