/**
 * UC6: HelloApp
 * Accepts multiple names as command-line arguments and prints them
 * in a comma-separated greeting format.
 */

public class HelloApp {

    public static void main(String[] args) {

        // If no names are given
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to combine names
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to iterate through arguments
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove the last comma and space
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}