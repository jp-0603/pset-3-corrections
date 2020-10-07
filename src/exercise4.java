import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Height:");
        double height = input.nextDouble();

        System.out.print("Width:");
        double width = input.nextDouble();
        input.close();

        height *= 2.54;
        width *= 2.54;
        double perimeter = 2 * (height + width);
        System.out.printf("%n%,.2f centimeters.", perimeter);
    }
}
