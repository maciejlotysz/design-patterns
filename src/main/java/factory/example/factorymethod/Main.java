package factory.example.factorymethod;

import factory.example.factorymethod.units.*;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

    }
}
