package example_2;

public class Hero {
    private int id;
    private String name;
    private float hp;
    private int damage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("hero id: ").append(id).append("\n")
        .append("hero name: ").append(name).append("\n")
        .append("hero hp: ").append(hp).append("\n")
        .append("hero damage: ").append(damage);
        return sb.toString();
    }
}
