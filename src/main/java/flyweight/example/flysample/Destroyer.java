package flyweight.example.flysample;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y) {
        this.stats = UniStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
