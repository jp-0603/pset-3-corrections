import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Homework 1:");
        double hw1 = input.nextDouble();

        System.out.print("Homework 2: ");
        double hw2 = input.nextDouble();

        System.out.print("Homework 3: ");
        double hw3 = input.nextDouble();

        System.out.print("Quiz 1: ");
        double quiz1 = input.nextDouble();

        System.out.print("Quiz 2: ");
        double quiz2 = input.nextDouble();

        System.out.print("Test 1: ");
        double test1 = input.nextDouble();
        input.close();
        double hwTotal= hw1 + hw2 + hw3;
        double quizTotal = quiz1 + quiz2;
        double hwGrade = hwTotal / 3 * 0.15;
        double quizGrade = quizTotal / 2 * 0.35;
        double testGrade = test1 * 0.5;
        double totalGrade = hwGrade + quizGrade + testGrade;
        System.out.printf("%n%,.2f%%", totalGrade);
    }
}
