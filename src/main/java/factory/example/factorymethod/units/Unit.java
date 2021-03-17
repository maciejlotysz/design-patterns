package factory.example.factorymethod.units;

import lombok.Getter;

@Getter
public abstract class Unit {

    private  int hp;
    private  int exp;
    private int damage;

    protected Unit(int hp, int exp, int damage) {
        this.hp = hp;
        this.exp = exp;
        this.damage = damage;
    }


}
