import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Height:");
        double h = input.nextDouble();

        System.out.print("Width:");
        double w = input.nextDouble();

        input.close();
        h *= 25.4;
        w *= 25.4;

        double area = h * w;
        System.out.printf("%n%,.2f square millimeters.", area);
    }

}