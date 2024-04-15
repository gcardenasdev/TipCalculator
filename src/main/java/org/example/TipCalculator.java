package org.example;
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
        int tipAmount;
        int peopleNum;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Bill Amount: ");
        billAmount = input.nextDouble();


        System.out.println("5 \\n\" + \"10 \\n\" + \"15 \\n\" + \"20\\n\" + \"25 \\n\" + \"Custom\"");
        System.out.println("Enter tip %: ");
        tipAmount = input.nextInt();


        System.out.println("Enter number of people ");
        peopleNum = input.nextInt();

        System.out.println("Tip Amount Per Person: " + tipPerPerson(billAmount, tipAmount, peopleNum));
        System.out.println("Total Per Person: " + totalPerPerson(billAmount, tipPerPerson(billAmount, tipAmount, peopleNum), peopleNum));
    }

    static int tipPerPerson(double billAmount, int tipAmount, int peopleNum){

        int totalTip = (int) (billAmount * (tipAmount/100));
        int tipPerPerson = totalTip / peopleNum;

        return tipPerPerson;
    }

    static int totalPerPerson(double billAmount, int tipPerPerson, int peopleNum){

        int totalBillPerPerson = (int) (billAmount/peopleNum);
        int total = totalBillPerPerson + tipPerPerson;

        return total;
    }

}
