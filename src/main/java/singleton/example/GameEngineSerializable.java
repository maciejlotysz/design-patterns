package singleton.example;

import java.io.Serializable;

public class GameEngineSerializable implements Serializable {

    private static final long serialVersionUID = 2351535;
    private int hp = 100;
    private String characterName = "";
    private static GameEngineSerializable instance = new GameEngineSerializable();

    private GameEngineSerializable() {

    }

    public static GameEngineSerializable getInstance() {
        return instance;
    }

    // zabezpiecza singletona pod kątem serializacji - brak wielokrotnych instancji przez kopiowanie
    protected Object readResolve() {
        return getInstance();
    }
}
