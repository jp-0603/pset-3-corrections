import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();

        input.close();

        int quarters = (int) ((amount - amount % 0.25) / 0.25);
        amount -= (quarters * 0.25);

        int dimes = (int) ((amount - amount % 0.10) / 0.10);
        amount -= (dimes * 0.10);

        int nickels = (int) ((amount - amount % 0.05) / 0.05);
        amount -= (nickels * 0.05);

        int pennies = (int) (amount * 100);

        System.out.printf("%n%-9s: %d", "Quarters", quarters);
        System.out.printf("%n%-9s: %d", "Dimes", dimes);
        System.out.printf("%n%-9s: %d", "Nickels", nickels);
        System.out.printf("%n%-9s: %d", "Pennies", pennies);

    }
}