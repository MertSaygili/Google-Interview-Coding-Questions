package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
		/* Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ) */
// In this porgram, i am going to unite to list items and add one to last digit.

public class Arrays_3_AddOneToNumber {
	public static ArrayList<Integer> set_List(int N){ // Setting main_list and returning to main function
		// Attributes
		Random random = new Random();
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			a_list.add(random.nextInt(9)); // I set random values to list
		}
		return a_list;
		
	}
	public static int get_Output(ArrayList<Integer> a_list) { // Output
		// Attributes
		int result = 0, N = a_list.size();
		
		for(int i=0; i<N; i++) {
			if(a_list.get(i) == 0) {
				
			}
			else {
				result = result + a_list.get(i) * (int)(Math.pow(10, N - i - 1)); // [1 ,2, 3] =>  1* 100 + 2*10 + 3*1 = 123
			}
		}
		return result + 1;
		
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int N, result = 0;
		
		System.out.print("Enter the limit of the list: ");
		N = scanner.nextInt();
		
		scanner.close(); // Closing scanner to prevent from leaping memory
		
		ArrayList<Integer> a_list = new ArrayList<Integer>(set_List(N));
		System.out.println(a_list);
		result = get_Output(a_list);
		System.out.println("The result is: " + result);		
	}
}
