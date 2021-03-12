package singleton.example;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine == engine2);

        GameEngine engine3 = GameEngine.getInstance();

        System.out.println(engine == engine3);
    }

}
