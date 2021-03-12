package singleton.example;

public enum GameEngineEnum {

    INSTANCE();

    private int hp = 100;
    private String characterName = "";

    private GameEngineEnum() {

    }

}
