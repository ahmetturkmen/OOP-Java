package hw4;

import java.util.Scanner;

public class  HanoiTowers {
	
	private static int numberOfDisks =0;

	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   HanoiTowers hanoiTowers = new HanoiTowers();
	       System.out.println("#Disks?: ");
	       int discs = scanner.nextInt();
	       hanoiTowers.doHanoiTower(discs, 'A', 'B', 'C');
	       System.out.println("Total #moves: "+numberOfDisks);
	   }
	   
	   private void doHanoiTower(int n, char start, char auxiliary, char end) {
		   
		   if (n == 1) {
	           System.out.println("Disk "+ n + " from " + start + " to " + end);
	           numberOfDisks++;
		   } else {
	    	   doHanoiTower(n - 1, start, end, auxiliary);   // Recursive call 
	    	   System.out.println("Disk "+ n + " from " + start + " to " + end);
	           doHanoiTower(n - 1, auxiliary, start, end);   // Recursive call 
	           numberOfDisks++;
		   }
	   }
	}