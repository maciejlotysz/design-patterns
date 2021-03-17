package factory.example.abstractfactory.units;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class MechanizedUnit {

    private  int hp;
    private  int exp;
    private int damage;

    protected MechanizedUnit(int hp, int exp, int damage) {
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
    }
}
