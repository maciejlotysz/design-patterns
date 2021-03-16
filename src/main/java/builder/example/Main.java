package builder.example;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("4 walls")
                .build();

        System.out.println(house);

    }
}
