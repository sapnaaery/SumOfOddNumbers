package day6;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// program to calculate the sum of all odd numbers between 1 and 100 using a
		// while loop
		// int limit =100;
		int i = 1;// to initialize number
		int sum = 0;// variable to store sum

		while (i <= 100)// condition to check limit of 1 to 100 numbers
		{
			if (i % 2 != 0)// To get only odd numbers
			{
				sum = sum + i;// Adding up odd number to Sum variable
			}
			i++;// increment number

		}

		System.out.println("Sum of odd numbers between 1 and 100 is: " + sum);
	}

}
