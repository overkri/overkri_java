package Lesson_7;

public abstract class HeroClass {

    protected int max_health;
    protected String type;
    protected int damage;
    protected int current_health;
    protected int healingpower;
    protected String status = "Жив";


    public int getHealingpower() {
        return healingpower;
    }

    public int getMax_health() {
        return max_health;
    }

    public HeroClass() {
        this.type = "";
        this.damage = 0;
        this.current_health = 0;
        max_health = current_health;
    }

    public String getType() {
        return type;
    }

    public int getCurrent_health() {
        return current_health;
    }


    public int getDamage() {
        return damage;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCurrent_health(int current_health) {
        this.current_health = current_health;
    }


    void info(int i) {
        System.out.println(i + " " + type + " Здоровье  " + current_health + "/" + max_health + " Урон " + damage + " Статус " + status);
    }
}

