/***************
 * Anthony Walriven
 * Assignment 05
 * Due Date: October 24, 2017
 * Computer Programming I/Section 002/Fall Semester
 * Array Lists and Data Structures
 */

package assignment05;

import java.util.ArrayList;

public class Assignment05_walrivay {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10}; 
		
		ArrayList arrayListNumbers = new ArrayList(); //creates an ArrayList
		
		for (int i = 0; i < 10; i++) //a loop that initializes all the elements of the array given
		{
			arrayListNumbers.add(i);
		}
		
		int max = numbers[0]; //sets variable, max
		for (int i = 1; i < numbers.length; i++) 
		{
			if (numbers[i] > max) //if statement that searches for the maximum value by looking at each value in the array, one by one, and storing the highest
			{
				max = numbers[i];
			}
		}
		
		System.out.println("The maximum number is " + max); //print the found max from the array to the console
		
		int min = numbers[0]; //sets variable, min
		for (int i = 1; i > numbers.length; i++)
		{
			if (numbers[i] > min) //if statement that searches for the minimum value by looking at each value in the array, one by one, and storing the lowest
			{
				min = numbers[i];
			}
		}
		
		System.out.println("The minimum number is " + min); //print the found minimum to the console
		
		double total = 0; //sets the variable, total
		for (double element : numbers)
		{
		   total = total + element; //algorithm to calculate the total of all the array values
		}
		
		double average = 0; //sets the variable, average
		if (numbers.length > 0) 
		{ 
			average = total / numbers.length; //algorithm to find the average of the data structure, given the total and length of the array
		}
		
		System.out.println("The average is " + average); //print the calculated average to the console
	}

}
