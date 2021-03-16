package builder.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class House {

    private String walls;
    private String floor;
    private String roof;
    private String rooms;
    private String doors;
    private String windows;
    private String garage;

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.floor = builder.floor;
        this.roof = builder.roof;
        this.rooms = builder.rooms;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.garage = builder.garage;

    }

    public static class HouseBuilder {
        private String walls;
        private String floor;
        private String roof;
        private String rooms;
        private String doors;
        private String windows;
        private String garage;

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }
        public HouseBuilder buildWindows(String windows) {
            this.windows = windows;
            return this;
        }
        public HouseBuilder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
