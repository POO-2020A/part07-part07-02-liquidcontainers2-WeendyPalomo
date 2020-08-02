
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container cFirst = new Container();
        Container cSecond = new Container();
        while (true) {
            System.out.println("First: " + cFirst.toString());
            System.out.println("Second: " + cSecond.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                cFirst.add(amount);
                System.out.println();
            } else if (command.equals("move")) {

                System.out.println("Conta: " + cFirst.contains());
                if (cFirst.contains() >= amount) {
                    cSecond.add(amount);
                    cFirst.remove(amount);

                } else {
                    cSecond.add(cFirst.contains());
                    cFirst.remove(cFirst.contains());

                }
                System.out.println();
            } else if (command.equals("remove")) {
                cSecond.remove(amount);
                System.out.println();
            }

        }
    }

}
