package builder.task;

public class Main {

    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();

        System.out.println(leg);
    }
}
