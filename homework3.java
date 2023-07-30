//There are 10 numbers from 100-1000000 stored in array dollarlist. We first find the sum of all elements in dollarlist
//and store it within variable sum for later use. 
//This code processes the first number entered by the user then stores it within variable x. This variable is then used
//within a for-loop to count the following x numbers. These x numbers are matched to their corresponding elements in 
//dollarlist. The dollarlist values are added to new list myList. We find the sum of myList, subtract it from variable sum,
//and divide it by the number of elements remaining in dollarlist that aren't in myList (which is 10-x). This gives us the
//average of the remaining elements in dollarlist. This value is stored in variable "average". We compare this to the final 
//input number from the user. If the number from the user, labeled banker, is greater than "average", the code prints 
//"deal". Otherwise, it prints "no deal". 

import java.util.Scanner;
import java.util.*;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int dollarlist[] = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		int sum = 0;
		for (int i=0;i<10;i++) {
			sum += dollarlist[i];
		}
		
		System.out.println("Please enter the number opened cases, followed by their numbers, each on a new line:");
		int x = sc.nextInt(); 
		List<Integer> myList = new ArrayList<Integer>();	
		for(int i=0; i<x; i++) {
			int num = sc.nextInt();
			myList.add(dollarlist[num-1]);
		}
		int sumlist = 0;
		for (int i = 0; i < myList.size(); i++) { 
	        sumlist += myList.get(i);
		}
		int average = (sum - sumlist)/(10-x);
		int banker = sc.nextInt();
		if (average > banker) {
			System.out.println("no deal");
		}else {
			System.out.println("deal");
		}
		sc.close();
	}

}
