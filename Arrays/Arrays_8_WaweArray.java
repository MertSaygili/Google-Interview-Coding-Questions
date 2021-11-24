package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;

public class Arrays_8_WaweArray {
	// Making wawe array like 2<1<4<3<6<5 but there are lots of different answers, i need the smallest array so:
	// 1- I'll make the array with randomly 
	// 2- I'll sort the array  1<2<3<4<5<6
	// 3- I'll calculate the array 1<2<3<4<5<6 --> 2<1<4<3<6<5
	public static ArrayList<Integer> setRandomList(int size_f_list){ 	// making random list with using random numbers
		// Defining random object and list
		Random random = new Random();
		int random_number = 0, i = 1;
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		a_list.add(random.nextInt(10) + 1);
		while(i < size_f_list) {
			random_number = random.nextInt(10) + 1;
			if(a_list.contains(random_number) == false) {
				a_list.add(random_number);
				i++;
			}
		}
		return a_list;
		
	}
	public static ArrayList<Integer> sortRandomList(ArrayList<Integer> a_list){ 		// sorting the random list, smallest to biggest
		a_list.sort(Comparator.naturalOrder());
		System.out.println("Sorted list is: " + a_list);
		return conclusion(a_list);
	}
	public static ArrayList<Integer> conclusion(ArrayList<Integer> a_list){
		int temp, i = 0;
		while(i < a_list.size()) {
			if(a_list.size() == 1) { // if size equal to 1 return directly the main list
				return a_list;
			}
			temp = a_list.get(i);  // in 38, 39 and 40. line we change location of list items
			a_list.set(i, a_list.get(i+1));
			a_list.set(i+1, temp);
			i = i + 2;	// we add two because we need to increase i+2, such as 0 2 4 6
			if(i == a_list.size() - 1) { // if i equal to size - 1, it might happen when list size odd. We prevent to "index out of bound" error/ 
				break;
			} 
		}
		
		
		return a_list;
	}
	public static void main(String[] args) {
		// Attributes
		Scanner scanner = new Scanner(System.in);
		int limit_f_list;
		
		System.out.print("Enter size of list: ");
		limit_f_list = scanner.nextInt();
		
		ArrayList<Integer> a_list = new ArrayList<Integer>(setRandomList(limit_f_list)); // we assing the created list to a_list
		System.out.println("\nFirst appear of the list: " + a_list);
		
		ArrayList<Integer> a_list1 = new ArrayList<Integer>(sortRandomList(a_list)); // we assing to sorted list to a_list
		System.out.println("Result list is: " + (a_list1));
		
		
		scanner.close(); // Closing Scanner to prevent memory leap or lose
		
	}
}
