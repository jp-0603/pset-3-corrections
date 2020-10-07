import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Salary: ");
        double salary = input.nextDouble();

        System.out.print("401(k): ");
        double four = input.nextDouble();

        System.out.print("Federal: ");
        double federal = input.nextDouble();

        System.out.print("State: ");
        double state = input.nextDouble();

        input.close();

        double netPay = (salary * (1 - four/100) * (1-(federal+state)/100))/24;
        System.out.printf("%n$%,.2f.", netPay);
    }
}
