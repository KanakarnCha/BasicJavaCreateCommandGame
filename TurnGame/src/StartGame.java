import Menu.MenuStart;
import model.User;

import java.util.Scanner;

public class StartGame {
    static User user = new User();
    static MenuStart menuStart = new MenuStart();

    public static void main(String[] args) throws Exception {
        loginUser();
        System.out.println("---------- " + "Your Welcome : " + user.getUsername() + " ----------");
        menuStart.menuFunction(user.getUsername());
    }

    public static void loginUser() throws Exception {
        Scanner kb = new Scanner(System.in);
        System.out.println("---------- LOGIN ----------");
        System.out.print("UserName ---> ");
        user.setUsername(kb.nextLine());
        if (user.getUsername().isEmpty()) {
            throw new Exception("----- กรุณากรอก UserName -----");
        }
    }
}
