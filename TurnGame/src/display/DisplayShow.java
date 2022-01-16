package display;


import Menu.MenuStart;

public class DisplayShow {
    int cards[];
    int round, darmageH1, darmageH2;
    String bar = "---------------";
    String icon1 = "︻┳═一";
    String icon2 = "╾━╤デ╦︻";
    MenuStart menustart = new MenuStart();

    public DisplayShow(int darmageH1,int darmageH2) {
        this.darmageH1 = darmageH1;
        this.darmageH2 = darmageH2;
    }

    public DisplayShow(int[] card, int round) {
        this.cards = card;
        this.round = round;
    }

    public void disPlay() {
        System.out.println("Card 1 : " + this.cards[0] + "\n" + "Card 2 : " + this.cards[1] + "\n" + "Card 3 : " + this.cards[2] + "\n" + "Card 4 : " + this.cards[3]);
    }

    public void heroBlt() {
        System.out.println("Hero " + icon1 + " Monser ");
        System.out.println("---------------------");
    }

    public void monsterBlt() {
        System.out.println("Hero " + icon2 + " Monser ");
        System.out.println("---------------------");
    }
    public void  displayPick(){
        System.out.print("-----" + "Pick Card : ");
    }
    public void showEnd(){
        if(this.darmageH2 <= 0){
            System.out.println("Hp Hero : " + 0);
            System.out.println("Monster : " + this.darmageH1);
        }else if(this.darmageH1 <= 0){
            System.out.println("Hp Hero : " + this.darmageH2);
            System.out.println("Monster : " + 0);
        }else{
            System.out.println("Hp Hero : " + this.darmageH2);
            System.out.println("Monster : " + this.darmageH1);
        }

    }
}
