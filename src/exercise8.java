import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Students: ");
        int students = input.nextInt();

        System.out.print("Teachers: ");
        int teachers = input.nextInt();

        System.out.print("Capacity: ");
        int capacity = input.nextInt();

        input.close();

        int totalPeople = (students + teachers);
        int buses = (totalPeople + capacity - 1) / capacity;
        int overflow = (totalPeople % capacity);

        System.out.printf("%n%-20s: %d", "Buses required", buses);
        System.out.printf("%n%-20s: %d", "Overflow passengers", overflow);

    }
}
