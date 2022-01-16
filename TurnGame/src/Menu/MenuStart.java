package Menu;

import Fight.MatchFigth;

import java.util.Scanner;

public class MenuStart {
    Scanner kb = new Scanner(System.in);
    int inputMenu;
    public void menuFunction(String namePlayer){
        try {
            menu();
            System.out.println(inputMenu+"ตือ");
            if(inputMenu == 1) {
                startGame();

            }else if(inputMenu == 2){
                exitGame();
            }
        }catch(Exception e){
            System.out.println("!!!!!!!!!!!" + "กรุณากรอกเลข 1 , 2" + "!!!!!!!!!!!");
        }
    }


    public void menu() throws Exception {
            System.out.println("-----> Menu Introduce <-----");
            System.out.println("---->Start Game = 1" + "\n" + "---->Exit  Game = 2");
            inputMenu = kb.nextInt();
            if(inputMenu < 1||inputMenu > 2) {
                throw new Exception();
            }
    }
    public void startGame(){
        System.out.println("---------- Start ---------- ");
        MatchFigth matchFigth = new MatchFigth();
        matchFigth.fight();

    }
    public void  exitGame(){
        System.out.println("Exit");
        System.exit(0);
    }
}
