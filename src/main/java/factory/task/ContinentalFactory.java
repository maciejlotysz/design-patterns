package factory.task;

import factory.task.cars.*;

public class ContinentalFactory implements Factory{

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    public BMW buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(3.2, "diesel", 2019, position);
            case E60:
                return new BMW(6.2, "benzyna", 1998, position);
            default:
                throw new UnsupportedOperationException("Brak takiego modelu");
        }
    }

    public Ford buildFord(FordModel model) {
        switch (model) {
            case C_MAX:
                return new Ford(1.6, "diesel", 2015, position);
            case FOCUS:
                return new Ford(2.0, "benzyna", 2018, position);
            default:
                throw new UnsupportedOperationException("Bak takiego modelu");
        }
    }

}
