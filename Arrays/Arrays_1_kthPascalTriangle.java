package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
							/* Given an index k, return the kth row of the Pascal's triangle. */
// In this program, we take input from user which is the row number. We find to pascal triangle row with our method which is pascalTriangle
public class Arrays_1_kthPascalTriangle {
	public static ArrayList<Integer> pascalTriangle(int kth_row) {
		List<Integer> temp_row = new ArrayList<Integer>();
		List<Integer> kth_roww =  new ArrayList<Integer>();
		kth_roww.add(1);
		int temp = 0;
		for(int i=0; i<kth_row; i++) {
			temp_row.add(1); // our first item of list is one 
			for(int j=0; j<kth_roww.size() - 1; j++) {
				temp = kth_roww.get(j) + kth_roww.get(j+1);
				temp_row.add(temp);
			}
			temp_row.add(1); // our last item of list is one
			kth_roww.clear(); // we clear our main list before we add new item on it
			kth_roww.addAll(temp_row); // our new main list creates in here
			temp_row.clear();			
		}
		
		return (ArrayList<Integer>) kth_roww; // returning main list to main method
	
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		List<Integer> kths_list = new ArrayList<Integer>();
		int kth_row;
		
		System.out.println("Enter the row number you want to see? ");
		kth_row = scanner.nextInt(); // th row number
		
		scanner.close(); // Closing scanner for leaping memory
		
		kths_list.addAll(pascalTriangle(kth_row));
		System.out.println(kths_list); // printing the main list that we has found
	}
	
}
