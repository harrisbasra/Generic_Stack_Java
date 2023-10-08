package com.genericstack.java;

import java.util.Scanner;

public class Main {
    static void testStack(){
        GenericStack stack = new GenericStack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Get the size of the stack");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    if (scanner.hasNextInt()) {
                        int intValue = scanner.nextInt();
                        stack.push(intValue);
                    } else if (scanner.hasNextDouble()) {
                        double doubleValue = scanner.nextDouble();
                        stack.push(doubleValue);
                    } else if (scanner.hasNextBoolean()) {
                        boolean boolValue = scanner.nextBoolean();
                        stack.push(boolValue);
                    } else {
                        String stringValue = scanner.next();
                        stack.push(stringValue);
                    }
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    boolean isEmpty = stack.isEmpty();
                    System.out.println("Is the stack empty? " + isEmpty);
                    break;
                case 4:
                    int size = stack.size();
                    System.out.println("Size of the stack: " + size);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            stack.print(); // Print the stack contents after each operation
        }

    }
    public static void main(String[] args) {
        testStack();
    }

}
