package Arrays;
import java.util.Scanner;
import java.util.Random;
				/* You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise). */
// In this program, we rotate the two dimension matrix items 90 degree right
public class Arrays_2_RotateMatrix {
	public static int[][] get_Array(int N){ // getting array
		// Attributes
		Random random = new Random();
		// Defining 2D-Array
		int array_2d[][] = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				array_2d[i][j] = random.nextInt(9);
			}
		}
		return array_2d;
	}
	public static int[][] rotate_Array(int[][] array, int N) { // Rotating array index@s to index + 1, if index  == N then go to other row
		int array1[][] = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if (N - 1 == i && N - 1 == j) {
					array1[0][0] = array[i][j]; // For last index of main array
				}
				else if(j == N - 1) {
					array1[i + 1][0] = array[i][j]; // Go to next row and assign next row's first index
				}
				else {
					array1[i][j+1] = array[i][j];	// Classic assigment for new array
				}		
			}
		}
		return array1;
	}
	public static void print_array(int[][] array) { // Prints the array that main function has sent
		int N = array.length;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int N; // size of 2D arrayList
		
		System.out.println("Enter the size of two dimension array: ");
		N = scanner.nextInt();
		
		scanner.close();
		
		// Defining main 2D-array
		int array_2d[][] = get_Array(N);
		
		// Calling rotate function
		int rotated_array[][] = rotate_Array(array_2d, N);
		
		// Printing and comparing arrays
		print_array(array_2d);
		System.out.println("***************************************************************");
		print_array(rotated_array);
		
	}
}
