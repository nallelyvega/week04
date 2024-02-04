package week04;

import java.util.Arrays;

public class project_04_copy {

	public static void main(String[] args) {
		//Coding Steps
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		repeatName("Mike & Ikes, ", 4);
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int ageResult = 0;
		for (int i = 0; i < ages.length; i++) {
			if (i==0) {
				ageResult = ages[ages.length - 1] - ages[i];
			
				System.out.println(ageResult);
			}
		}

		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int [] ages2 = new int[9];

		//i. Make sure that there are 9 elements of type int in this new array. 
		ages2[0] = 2;
		ages2[1] = 4;
		ages2[2] = 6;
		ages2[3] = 8;
		ages2[4] = 10;
		ages2[5] = 12;
		ages2[6] = 14;
		ages2[7] = 16;
		ages2[8] = 18;
		

		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int agesResult2 = 0;
		for (int i = 0; i < ages2.length; i++) {
			if (i==0) {
				agesResult2 = ages2[ages2.length - 1] - ages2[i];
				System.out.println(agesResult2);
			}

		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		System.out.println(i);
					
		}
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int a = 0; a < ages2.length; a++) {
			sum += ages2[a];
		}
		double average = (double) sum / ages2.length; 
		System.out.println(average);
				
				
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totLetters = 0;
		for (String name : names) {
			totLetters += name.length();
		}
		double averageLetters = (double) totLetters / names.length;
		System.out.println(averageLetters);

		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		StringBuilder concatenateNames = new StringBuilder();
		for (String name : names) {
			concatenateNames.append(name + " ");
		}
		System.out.println(concatenateNames);

		//3. How do you access the last element of any array?
		//index of the last element is one less than the total number of element.
		System.out.println(names[names.length -1]);

		//4. How do you access the first element of any array?
		//the first index is ALWAYS going to be [0].
		System.out.println(names[0]);

		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int [names.length];
		for (int i = 0; i <names.length; i++) {
			nameLengths[i] = names[i].length();
		}
						
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int nameSum = 0;
		for (int length : nameLengths) {
			nameSum += length;
		}
		System.out.println(nameSum);
	}
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String concatValues(String word, int n) {
		return word.repeat(n);
	}
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//concat method
	public static String fullName(String firstName, String lastName) {
		return firstName.concat(" ").concat(lastName);
	}	
	
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		// write for loop that check each index to see if the value is greater than 100, if it isn't return false.
	public static boolean returnTrue(int[] intArr) {
		//always use static to call method
		//main method has to call the returnTrue method with a int Array - so for example using ages. 
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		if (sum > 100) {
			return true; 
		} else {
			return false;
		}
	}	

		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	//this one is going the same as above by using an enhanced loop rather than a for loop using an array of doubles as a parameter. 
	public static double doubleAverage(double[] doubleArr) {
		double sum = 0.00;
		for(double doub : doubleArr) {
			sum += doub;
		}
		
		return sum / doubleArr.length;
	}
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			//if is how i return the averages
	public static boolean multiDoubleArr(double[] arr1, double[] arr2) {
		double sum1 = 0.00;
		double sum2 = 0.00;
		for(double doub2: arr1) {
			sum1 += doub2;
		}
		for(double doub3: arr2) {
			sum2 +=doub3;
		}
		
		if((sum1 / arr1.length) > (sum2 / arr2.length)) {
			return true;
		} else {
			return false;
		}
		
	}
	
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.5) {
			return true; 
		} else {
			return false;
		}
	
	}
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//this method repeats 4 times. I created this because I like mike & ikes and have found concatenating methods to be helpful in my line of work.
	public static void repeatName(String name, int repeatValue) {
		System.out.println(name.repeat(repeatValue));
	}
	
	
}
			