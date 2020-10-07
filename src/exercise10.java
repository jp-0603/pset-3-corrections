import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double f = input.nextDouble();

        input.close();

        double c = (f-32) * 5/9;
        System.out.printf("%n%-8s: %,.2f", "Celsius ", c);

        double k = c + 273.15;
        System.out.printf("%n%-8s: %,.2f", "Kelvin ", k);
    }
}
