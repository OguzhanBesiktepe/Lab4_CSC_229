// Question 2) Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.

public class sumofMultiplesof7 {

    public int sumOfMultiplesof7(int n1, int n2) {
        // will change the value of n1 to go up by 7
        if (n1 % 7 != 0) {
            n1 = n1 + (7 - n1 % 7);
        }
        if (n1 > n2) {
            return 0; // Here is the Base Case
        }
        return n1 + sumOfMultiplesof7(n1 + 7, n2);
    }

}
