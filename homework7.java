import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		List<Integer> myList = new ArrayList<Integer>();	
		for (int i = 0; i < num; i++) {
			int j = sc.nextInt();
			myList.add(j);
		}
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) > 1 && myList.get(i) < 32500) {
				int sum_div = 0;
				for (int j = 1; j < (myList.get(i)-1); j++) {
					if (myList.get(i) % j == 0) {
						sum_div = sum_div + j;
					}
				}
				if (sum_div < myList.get(i)) {
					System.out.println(myList.get(i) + " is a deficient number");
				} else if (sum_div == myList.get(i)) {
					System.out.println(myList.get(i) + " is a perfect number");
				} else {
					System.out.println(myList.get(i) + " is an abundant number");
				}
			}
		}
	sc.close();

	}

}
