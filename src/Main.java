import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for Player 1: ");
        String nameP1 = sc.nextLine();
        Character player1 = new Character(nameP1, new Fighter());

        System.out.print("Enter name for Player 2: ");
        String nameP2 = sc.nextLine();
        Character player2 = new Character(nameP2, new Ranger());

        // player1
        player1.getSword();
        player1.getShield();
        player1.getAccessory(new Ring());
        player1.levelUp();
        player1.shieldLevelUp();
        player1.swordLevelUp();

        System.out.println("---------------------------------");

        // player2
        player2.getSword();
        player2.getShield();
        player2.getAccessory(new Boots());
        player2.levelUp();
        player2.swordLevelUp();
        player2.shieldLevelUp();

        System.out.println("---------------------------------");

        // โจมตี
        player1.attack(player2);
        player2.attack(player1);
        player1.useSpecialSkill(player2);
        player2.useSpecialSkill(player1);

        System.out.println("\n--- After attack ---");
        player1.status();
        player2.status();
    }
    }
