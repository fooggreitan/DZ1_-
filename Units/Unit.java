package Units;

public class Unit {

    protected String character;
    protected float hp;
    protected int speed;
    protected int damage;

    public Unit(String character, float hp, int speed, int damage) {
        this.character = character;
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Unit [character=" + character + ", hp=" + hp + ", speed=" + speed + ", damage=" + damage + "]";
    }

    public float getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public String getCharacter() {
        return character;
    }

    
}
