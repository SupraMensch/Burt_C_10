//  Christopher Burt
//  Project # 10

// A prime number is a number that is only evenly divisible by itself and 1.  You can refer to programming challenge 13 on page 316 in the textbook for more details.

// Write a Java program that finds prime numbers:
// 1. Create a method called isPrime that accepts an Integer value and returns true if it is prime and false if it is not.
// 2. In your main method, write a loop that that calls the method and passes it values from 1 to 100.
// 3. This loop should display all of the values that are prime.
package burt_c_10;

public class Burt_C_10 
{
   //Main method loop that passes values 1-100
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 100; i++)
        isPrime(i);
    }
    
    // Method that accepts integer values and returns true/false boolean; also displays prime values
    public static boolean isPrime(int num)
    {
        if (num < 2) 
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        System.out.println(num);
        return true;  
    }
}
