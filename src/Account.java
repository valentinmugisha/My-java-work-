import java.util.Scanner;
public class Account {
    public static void main(String[] args) {
        System.out.println("enter the monthly gloss salary");
        Scanner input1=new Scanner(System.in);
        int salary;
        int monthlyemployee;
        salary=input1.nextInt();
        monthlyemployee=(salary+(salary*5/100))-(salary*30/100)-(salary*3/100);/*salary of monthly employee
         plus lumpsum(5%) on  deduction of tax(30%) and RSSB(3%)*/
        System.out.println("the salary of monthly employee is:");
        System.out.println(monthlyemployee);
        System.out.println("enter weekly employee gloss salary");
        Scanner input2=new Scanner(System.in);
        int weeklysalary;
        int weeklyemployee;
        weeklysalary=input2.nextInt();
        weeklyemployee=weeklysalary-(weeklysalary*3/100);/*this salary of weekly employee with no lumpsum and
        no tax only  deduction of RSSB(3%)*/
        System.out.println("the salary of weekly employee is: ");
        System.out.println(weeklyemployee);
        System.out.println("enter hourly rate");
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        int houryrate;
        int hours;
        int hourlyemployee;
        houryrate=input3.nextInt();
        System.out.println("enter hours worked");
        hours=input4.nextInt();
        hourlyemployee=houryrate*hours;/* this is the salary of employee working on hour by taking amount of
         money worked on hour multiplying by hours worked*/
        System.out.println("the salary of hourly employee is: ");
        System.out.println(hourlyemployee);
    }
}
