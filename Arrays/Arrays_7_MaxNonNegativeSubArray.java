package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Arrays_7_MaxNonNegativeSubArray {
	public static ArrayList<Integer> lastStep (ArrayList<Integer> A){
		// First lets make sub array after that we can compare them
		// Attributes
		long sum = 0, max = 0, check = 0;
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0; i<A.size(); i++) {
			if(A.get(i) >= 0) {
				temp.add(A.get(i));
				sum = sum + A.get(i);
				check = 0;
			}
			else if(A.get(i) < 0 || A.get(i + 1 ) == null) {
				check = 1;
				if( check == 1) {
					if(sum >= max) {
						result.clear();
						result.addAll(temp);
						max = sum;
					}
					sum = 0;
				}
				temp.clear();
			}
			if(i == A.size() - 1 && A.get(i) > 0) {
				if(sum >= max) {
					result.clear();
					result.addAll(temp);
					max = sum;
				}
			}
		}
		
		
		return result;
	}
	public static ArrayList<Integer> setList(int size){
		// Attributes
		Random random = new Random();
		int luck = random.nextInt() % 3;
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		
		for(int i=0; i<size; i++) {
			if(luck <= 2) { // add positive value0
				a_list.add(random.nextInt() % 400);
			}
			else {	// add negative value
				a_list.add(-1 * random.nextInt() % 400);
			}
		}
		return a_list;
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int listSize = 0;
		
		System.out.print("Enter the size of list: ");
		listSize = scanner.nextInt(); // taking size of list and sending to setList function at line twentyone
		scanner.close(); // closing scaner to prevent memory leap
		
		ArrayList<Integer> a_list = new ArrayList<Integer>(setList(listSize));
		System.out.println(a_list); // printing the random array
		
		System.out.println(lastStep(a_list));
		
		
		
		
	}
}
