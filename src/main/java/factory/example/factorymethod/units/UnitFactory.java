package factory.example.factorymethod.units;

public class UnitFactory extends Factory{

    @Override
    public Unit createUnit(UnitType type) {

        switch (type) {
            case TANK:
                return new Tank(200, 0, 50);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
