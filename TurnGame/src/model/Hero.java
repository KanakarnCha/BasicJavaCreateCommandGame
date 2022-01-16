package model;

public class Hero implements Action{
    String nameH = null;
    int hpH = 1000;
    public Hero(){

    }
    public Hero(String nameH){
        this.nameH = nameH;
    }
    public Hero(Hero H){
        this.hpH = H.hpH;
    }
    public void setHpH(int hpH) {
        this.hpH = hpH;
    }
    public int getHpH() {
        return hpH;
    }
    @Override
    public void Status() {
        System.out.println("พร้อม");
    }

}
