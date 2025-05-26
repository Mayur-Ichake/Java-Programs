package program;

import java.util.Scanner;

public class elseif2 {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);;
		int button = sc.nextInt();
		 
		 if (button == 1) {
			 System.out.println("hello");
		 } else if(button == 2) {
			 System.out.println("namste");
		 } else if (button == 3) {
			 System.out.println("a is smaller");
		 } else { 
			 System.out.println("Invalid button");
		 }
	 }
}
			    


