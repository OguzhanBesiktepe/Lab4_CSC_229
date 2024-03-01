// Question 1: Write a function that prints "Hello World" n times recursively.

public class PrintingHelloWorld {
    public static void printHelloWorld (String[] args) {
            if (n <= 30) { // If n is greater than 30 it will then Print
                return;
            }
            System.out.println("Hello World");
            printHelloWorld(n - 30); // When this prints it will reduce by 1 (aka n - 30)
        }

    }