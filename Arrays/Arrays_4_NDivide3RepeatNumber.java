package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
			/* Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space. */
public class Arrays_4_NDivide3RepeatNumber {
	public static ArrayList<Integer> set_List(int N){
		// Attributes
		Random random = new Random();
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		
 		for(int i=0; i<N; i++) {
			a_list.add(random.nextInt(3)); // We assign low values to check the program
		}
 		return a_list; // Returning list to main function
	}
	public static void check_t_List(ArrayList<Integer> a_list) {
		int N = a_list.size(), count = 0, max=0, the_numb = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(a_list.get(i) == a_list.get(j)) { // With brutal force we check the how many same value we have
					count = count + 1;
				}
			}
			if(count >= max) {	// we assing the max repeating number with this if condition
				max = count;
				the_numb = a_list.get(i);
			}
			count = 0;
		}
		if(max > (N) / max ) {
			System.out.println(the_numb);
			System.out.println(the_numb + " occurs " + max + " times which is more than " + (N) + "/" + max );
		}
		else {
			System.out.println("The list does not in good condition. ");
		}
		
	}
	
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit of list: ");
		int N = scanner.nextInt();
		
		scanner.close(); // Closing scanner to prevent from memory leap
		
		// Calling set_list method
		ArrayList<Integer> a_list = new ArrayList<Integer>(set_List(N));
		
		System.out.println(a_list + "\n");
		
		check_t_List(a_list); // the end
		
	}
}
