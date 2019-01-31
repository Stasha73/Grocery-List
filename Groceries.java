package JavaExercises;

import static java.lang.System.out;

import java.util.Scanner;

public class Groceries
{

    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);

        String groceryItem1;
        String groceryItem2;
        String groceryItem3;

        out.println("Please list three items on your grocery shopping list");

        out.print("Item 1?  ");
        groceryItem1 = keyboard.nextLine();
        out.print("\n");

        out.print("Item 2?  ");
        groceryItem2 = keyboard.nextLine();
        out.print("\n");

        out.print("Item 3?  ");
        groceryItem3 = keyboard.nextLine();
        out.print("\n)");

        out.println("Now, please enter the price of each item.");

        int count1;
        int count2;
        int count3;

        out.print("How many " + groceryItem1 + "?");
        count1 = keyboard.nextInt();
        keyboard.skip("\n");

        out.print("How many " + groceryItem2 + "?");
        count2 = keyboard.nextInt();
        keyboard.skip("\n");

        out.print("How many " + groceryItem3 + "?");
        count3 = keyboard.nextInt();
        keyboard.skip("\n");
        
        out.println("Now, please enter the price of each item");

        float price1;
        float price2;
        float price3;

        out.print("How much does " + groceryItem1 + " cost?");
        price1 = keyboard.nextFloat();
        out.print("\n");
        out.print("How much does " + groceryItem2 + " cost?");
        price2 = keyboard.nextFloat();
        out.print("\n");
        out.print("How much does " + groceryItem3 + " cost?");
        price3 = keyboard.nextFloat();
        out.print("\n");

        float totalBill;
        totalBill = ((count1 * price1) + (count2 * price2) + (count3 * price3));
        out.println("Calculating your grocery bill.");
        out.println("Your total cost is " + totalBill);










    }

}
