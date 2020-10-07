import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Wage: ");
        double wage = input.nextDouble();

        System.out.print("Monday: ");
        double Mon = input.nextDouble();

        System.out.print("Tuesday: ");
        double Tue = input.nextDouble();

        System.out.print("Wednesday: ");
        double Wed = input.nextDouble();

        System.out.print("Thursday: ");
        double Thu = input.nextDouble();

        System.out.print("Friday: ");
        double Fri = input.nextDouble();

        System.out.print("Saturday: ");
        double Sat = input.nextDouble();

        System.out.print("Sunday: ");
        double Sun = input.nextDouble();

        input.close();

        double total = wage*(Mon + Tue + Wed + Thu + Fri + Sat + Sun);
        System.out.printf("%n$%,.2f.", total);
    }
}
