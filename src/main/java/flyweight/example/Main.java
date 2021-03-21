package flyweight.example;

import flyweight.example.flysample.Destroyer;
import flyweight.example.flysample.Rifleman;
import flyweight.example.flysample.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Rifleman(0,0));
            activeUnits.add(new Destroyer(0,0));
        }
    }

}
