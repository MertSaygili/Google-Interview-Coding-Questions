package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

public class Arrays_9_MaxMin {
	// Finding maximum and minumum variable in array and return the sum of them, for example --> [1,-2,5] = 5+(-2) = 3
	// 1. I take range of list from user
	// 2. I create list which is including random variables
	// 3. I find min and max value in list and return sum of them to main function
	public static ArrayList<Integer> makeRandomList(int N) { // creating list 
		// Local Attributes
		int luck = 0;
		Random random = new Random();
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			luck = random.nextInt(2); // if luck == 0  adds negative value, if luck == 1 adds positive value 
			if(luck == 0) {
				a_list.add(-1 * (random.nextInt(9) + 1));
			}
			else {
				a_list.add(random.nextInt(9) + 1);
			}
		}
		return a_list;
	}
	public static int conclusion(ArrayList<Integer> a_list) {
		int min, max;
        a_list.sort(Comparator.naturalOrder()); // sorting array
        min = a_list.get(0); 
        max = a_list.get(a_list.size() - 1);

        return min + max;
	}
	
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int size_f_list;
		
		System.out.print("Enter the limit of the list: ");
		size_f_list = scanner.nextInt();
		
		scanner.close(); // closing Scanner to prevent memory leap
		
		ArrayList<Integer> a_list = new ArrayList<Integer>(makeRandomList(size_f_list)); // calling the makeRandomLis function and assing to a_list variable
		System.out.println("/n The list is: " + a_list);
		
		System.out.println("Total value is: " + conclusion(a_list));
	}
}
