import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // asking the user to input integer values, assigning the values to variables x, y and z
        // which are read thanks to the Scanner, input
        System.out.println("Please enter your first integer: ");
        int x = input.nextInt();
        System.out.println("Please enter your second integer: ");
        int y = input.nextInt();
        System.out.println("Please enter your third integer: ");
        int z = input.nextInt();
        // int product is equal to the product of x, y and z.
        int product = x * y * z;
        System.out.println("The product of the three integers is: " + product);

    }
}