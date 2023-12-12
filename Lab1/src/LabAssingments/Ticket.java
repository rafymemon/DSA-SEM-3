package LabAssingments;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ticket{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age of the person for the ticket :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age < 0){
            System.out.println("Negative number is not included :");
        } else if (age >= 65){
            System.out.println("Price of the ticket is 7$");
        } else if (age > 13) {
            System.out.println("Price of the ticket is 10$");
        } else if ( age <13) {
            System.out.println("Price of the ticket is 5$");
        }
        else {
            System.out.println("invalid output....!!");
        }
    }
}