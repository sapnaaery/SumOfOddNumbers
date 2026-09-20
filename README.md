Sum of Odd Numbers
Description
This Java program calculates the sum of all odd numbers between 1 and 100 using a while loop.

The program checks each number from 1 to 100. If the number is odd, it adds that number to the sum variable.

Concepts Used
Java while loop

if statement

Modulus operator (%)

Variables

Increment operator (++)

Console output using System.out.println()

How It Works
The variable i is initialized to 1.

The variable sum is initialized to 0.

A while loop runs as long as i is less than or equal to 100.

The program checks whether i is odd using:

i % 2 != 0

If the number is odd, it is added to sum.

The value of i is increased by 1.

After the loop finishes, the total sum is displayed.

Example
The odd numbers between 1 and 100 are:

1, 3, 5, 7, ..., 97, 99

The program produces:

Sum of odd numbers between 1 and 100 is: 2500

Source Code
package day6;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        // Program to calculate the sum of all odd numbers
        // between 1 and 100 using a while loop

        int i = 1;       // Initialize number
        int sum = 0;     // Variable to store sum

        while (i <= 100) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

            i++;
        }

        System.out.println(
            "Sum of odd numbers between 1 and 100 is: " + sum
        );
    }
}

Expected Output
Sum of odd numbers between 1 and 100 is: 2500

Requirements
Java Development Kit (JDK)

Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

Author
Created as a Java practice exercise to understand while loops, conditional statements, and arithmetic operations.
