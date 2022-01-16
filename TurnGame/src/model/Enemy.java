package model;

public class Enemy implements Action {
    String nameE = "Monster";
    int hpE = 1000;

    public Enemy() {
    }

    ;

    public Enemy(Enemy enemy) {
        this.hpE = enemy.getHpE();
    }

    public int getHpE() {
        return hpE;
    }

    public void setHpE(int hpE) {
        this.hpE = hpE;
    }

    public String getNameE() {
        return nameE;
    }

    @Override
    public void Status() {
        System.out.print("พร้อม");
    }
}
