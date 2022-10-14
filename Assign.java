import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
    //  Write a program to input principal, time, and rate (P, T, R) from the user
    //  and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle (in ₹): ");
        float principle = input.nextFloat();
        System.out.print("Enter Rate (in %): ");
        float rate = input.nextFloat();
        System.out.print("Enter Time (in yrs): ");
        float time = input.nextFloat();
        float SI = principle * rate * time / 100;
        System.out.println("Simple Interest = " + (int)(SI));
    }
}
