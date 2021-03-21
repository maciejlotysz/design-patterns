package flyweight.example.flysample;

public class UniStatsRepository {

    private static UnitStats destroyerStats = new UnitStats(
            "Destroyer",800, 250, 150, 15,800);
    private static UnitStats riflemanStats = new UnitStats(
            "Rifleman",25,5,20,25, 50);
    private static UnitStats teslaTankStats = new UnitStats(
            "TeslaTank",200,100,50,25, 500);

    private UniStatsRepository() {

    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }

    public static UnitStats getTeslaTankStats() {
        return teslaTankStats;
    }
}
