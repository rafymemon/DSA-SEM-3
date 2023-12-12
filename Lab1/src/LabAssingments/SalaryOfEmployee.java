package LabAssingments;
import java.util.Scanner;

public class SalaryOfEmployee{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate the Salary of an Employee: ");
        System.out.print("Hours an employee works per week : ");
        int hours = in.nextInt();
        System.out.print(" Money generates by an an employee per hour :");
        float salary = in.nextFloat();
        System.out.print("Vacation Day : ");
        int vacationDays = in.nextInt();

        float totalSalaryWithoutExcludingVacationDays =  hours * 52 * salary;
        float totalSalary = totalSalaryWithoutExcludingVacationDays - (vacationDays * 8 * salary);
        System.out.println("Total Salary per year : " + totalSalary);

    }
}