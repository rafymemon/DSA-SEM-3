package LabAssingments;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        String question = "Which is not a primitive data type among the following :";
        String choiceone = "1. int .";
        String choicetwo = "2. String .";
        String choicethree = "3. char .";
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choose the Correct answer among the following :");
        System.out.println(" Your Question is :"+question);
        System.out.println(choiceone+"\n"+choicetwo+"\n"+choicethree+"\n");
        choice = sc.nextInt();
        if (choice == 1 || choice == 3){
            System.out.println("Incorrect Answer .");
        } else if (choice == 2) {
            System.out.println("Correct Answer.");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
