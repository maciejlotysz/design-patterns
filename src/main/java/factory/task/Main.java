package factory.task;

import factory.task.cars.*;

public class Main {

    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getPosition());
        System.out.println(bmw);

        System.out.println();

        Car ford = continentalFactory.buildFord(FordModel.FOCUS);
        System.out.println(ford.getPosition());
        System.out.println(ford);

    }
}
