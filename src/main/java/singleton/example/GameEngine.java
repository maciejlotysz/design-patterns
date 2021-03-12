package singleton.example;

public class GameEngine {

    private int hp = 100;
    private String characterName = " ";
    private static GameEngine instance;

    private GameEngine() {

    }
    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }


    // Using keyword synchronized for all method (bad solution)
//    public  synchronized static GameEngine getInstance() {
//        if (instance == null) {
//            instance = new GameEngine();
//        }
//        return instance;
//    }


    // Synchronized only creation of new instance (good solution)
//    public static GameEngine getInstance() {
//        if (instance == null) {
//
//            synchronized (GameEngine.class) {
//                if (instance == null) {
//                    instance = new GameEngine();
//                }
//            }
//        }
//        return instance;
//    }



}
