package factory.example.abstractfactory.units;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class AirUnit {

    private  int hp;
    private  int exp;
    private int damage;

    protected AirUnit(int hp, int exp, int damage) {
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
    }
}
