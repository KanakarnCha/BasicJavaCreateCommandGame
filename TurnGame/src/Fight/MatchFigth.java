package Fight;

import display.DisplayShow;
import model.Enemy;
import model.Hero;

import java.util.Random;
import java.util.Scanner;

public class MatchFigth {
    int cards[] = new int[4];
    int pickCard;
    int round = 0;
    Random r = new Random();
    Scanner kb = new Scanner(System.in);

    Enemy enemy = new Enemy();
    Hero hero = new Hero();
    DisplayShow displayShow = new DisplayShow(cards, round);

    public MatchFigth() {


    }

    public void fight() {
        while (true) {
            round++;
            System.out.println("---------------" + " Round : " + round + " " + "---------------");
            System.out.println("-----Show " + "Enemy : " + enemy.getHpE() + " Hero : " + hero.getHpH());
            randomCard();
            displayShow.disPlay();
            displayShow.displayPick();
            pickCard = kb.nextInt();
            heroAtk();
            inputHDisply(enemy.getHpE(), hero.getHpH());
            if (enemy.getHpE() <= 0) {
                System.out.println("You Win");
                break;
            }
            enemyAtk();
            inputMDisply(enemy.getHpE(), hero.getHpH());
            if (hero.getHpH() <= 0) {
                System.out.println("You Lose");
                break;
            }


        }
    }

    public void randomCard() {
        for (int i = 0; i < cards.length; i++) {
            cards[i] = r.nextInt(1000 - 1) + 1;
        }
    }


    public void enemyAtk() {
        hero.setHpH(hero.getHpH() - r.nextInt(1000 - 1) + 1);


    }

    public void heroAtk() {
        enemy.setHpE(enemy.getHpE() - cards[pickCard - 1]);
    }

    public void inputHDisply(int darmages1, int darmages2) {
        DisplayShow displayShow1 = new DisplayShow(darmages1, darmages2);
        displayShow1.heroBlt();
        displayShow1.showEnd();
    }

    public void inputMDisply(int darmages1, int darmages2) {
        DisplayShow displayShow2 = new DisplayShow(darmages1, darmages2);
        displayShow2.monsterBlt();
        displayShow2.showEnd();
    }
}
