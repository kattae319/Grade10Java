import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class homework7divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		List<Integer> myList = new ArrayList<Integer>();	
		for (int i = 0; i < n; i++) {
			int j = sc.nextInt();
			myList.add(j);
		}
		for (int i = 0; i < myList.size(); i++) {
			int num = myList.get(i);
			System.out.println(num);
			while(num >= 100) {
				int unit_digit = num%10;
				int quotient = num/10;
				num = quotient - unit_digit;
				System.out.println(num);

				if (num < 100) {
					if (num%11 == 0) {
						System.out.println("The number " + myList.get(i) + " is divisible by 11.");
					} else {
						System.out.println("The number " + myList.get(i) + " is not divisible by 11.");

					}
				}//if
			}//while
		} //for

		sc.close();
	}

}
