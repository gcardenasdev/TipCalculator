package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        userInput();

    }

    //Ask User for bill amount
    //Ask user for Tip amount
    //Ask user for amount of people to split order
    //Display Tip amount per person
    //Display Total per person
    //Reset amounts

    static void userInput() {
        double billAmount;
        double tipAmount;
        double peopleNum;
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.00");

        System.out.println("Enter Bill Amount: ");
        billAmount = input.nextDouble();


        System.out.println("5 \\n\" + \"10 \\n\" + \"15 \\n\" + \"20\\n\" + \"25 \\n\" + \"Custom\"");
        System.out.println("Enter tip %: ");
        tipAmount = input.nextDouble();


        System.out.println("Enter number of people ");
        peopleNum = input.nextDouble();

        System.out.println("Tip Amount Per Person: " + format.format(tipPerPerson(billAmount, tipAmount, peopleNum)));
        System.out.println("Total Per Person: " + format.format(totalPerPerson(billAmount, tipPerPerson(billAmount, tipAmount, peopleNum), peopleNum)));
    }

    static double tipPerPerson(double billAmount, double tipAmount, double peopleNum){


        double totalTip = billAmount * (tipAmount/100);
        double tipPerPerson = totalTip / peopleNum;

        return tipPerPerson;
    }

    static double totalPerPerson(double billAmount, double tipPerPerson, double peopleNum){

        double totalBillPerPerson = billAmount/peopleNum;
        double total = totalBillPerPerson + tipPerPerson;

        return total;
    }

}
