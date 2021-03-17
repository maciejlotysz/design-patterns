package factory.task.cars;

import lombok.ToString;

@ToString
public abstract class Car {

    private final double engineSize;
    private final String fuel;
    private final int yearOfMade;
    private final SteeringWheelPosition position;

    protected Car(double engineSize, String fuel, int yearOfMade, SteeringWheelPosition position) {
        this.engineSize = engineSize;
        this.fuel = fuel;
        this.yearOfMade = yearOfMade;
        this.position = position;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
