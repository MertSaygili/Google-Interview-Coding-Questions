package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
/* Given numRows, generate the first numRows of Pascal's triangle.Pascal's triangle : To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1. */

// In this program, i am going to print pascal triangle
public class Arrays_5_PascalTriangle {
	public static void a_list(int N){
		// Attributes
		int temp_value = 0;
		ArrayList<Integer> main_list = new ArrayList<Integer>(); // main list will return to main function
		ArrayList<Integer> temp_list =  new ArrayList<Integer>(); // first pascal list - 1 -
		main_list.add(1);
		System.out.println(main_list); // i print the first row of the pascal triangle [1]
		main_list.clear(); // after i printed the first row, i prepare main list to compute other rows
		temp_list.add(1); // temp list is [1][1] 
		temp_list.add(1);
		
		for(int i=0; i<N; i++) {
			main_list.add(1); // first index of main_list --> [1, 
			for(int j=0; j<i; j++) {
				temp_value = temp_list.get(j) + temp_list.get(j+1);
				main_list.add(temp_value); // next indexes of main_list ---> [1, ....
			}
			main_list.add(1); // last index of main_list --> [1, .... , 1]
			System.out.println(main_list);
			
			temp_list.clear(); // clean the temp_list 
			temp_list.addAll(main_list); // add last row to temp_list 
			main_list.clear(); // get prepare for next row
			
		}
		
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int N;
		System.out.print("Enter the number of row: ");
		N = scanner.nextInt();
		a_list(N - 1);
		
		scanner.close(); // closing to scanner for prevent memory leap
		
	}
}
