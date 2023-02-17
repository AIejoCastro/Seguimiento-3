import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static CirularList list = new CirularList();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        int menu = 0;
        int turnNumber = 0;
        while (menu != 5) {
            System.out.println("---------------" +
                    "\n¿Que deseas hacer?" +
                    "\n1. Dar turno" +
                    "\n2. Mostrar turno actual" +
                    "\n3. Pasar turno" +
                    "\n4. Seguir" +
                    "\n5. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    turnNumber++;
                    System.out.println("---------------");
                    System.out.println("You create a turn");
                    Node node = new Node(turnNumber);
                    list.addNode(node);
                    break;
                case 2:
                    System.out.println("---------------" +
                            "\nYou are in this turn: ");
                    list.printTurn();
                    break;
                case 3:
                    System.out.println("---------------" +
                            "\nYou pass the turn");
                    list.passTurn();
                    break;
                case 4:
                    System.out.println("---------------" +
                            "\nYou continue");
                    list.continueTurn();
                    break;
                case 5:
                    break;
            }
        }
    }
}