// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
import java.util.*;
class Main {
   public static void main(String args[]) throws Exception {
    MyQueue t = new MyQueue();
    t.load();
    int choice;
    Scanner sca = new Scanner(System.in);
    System.out.println();
    System.out.println(" 1. Test f1 - enqueue (1 mark)");
    System.out.println(" 2. Test f2 - dequeue (1 mark)");
    System.out.println(" 3. Test f3 - front (1 mark)");
	System.out.println(" 4. Test f4 - enqueue with priority (1 mark)");
    System.out.print("    Your selection (1 -> 4): ");
    choice = sca.nextInt();
    sca.nextLine();
    switch(choice) {
       case 1: 
           System.out.println("Before:");
           t.display();
           t.enqueue(1);
           System.out.println("\nAfter:");
           t.display();
           break;
       case 2: 
           System.out.println("Before:");
           t.display();
           t.dequeue();
           System.out.println("\nAfter:");
           t.display();
           break;
       case 3: 
           System.out.println("Before:");
           t.display();
           int k = t.front();
		   System.out.println("\nThe first element:  " + k);
           System.out.println("\nAfter:");
           t.display();
           break;
	   case 4: 
           System.out.println("Before:");
           t.display();
           t.enqueueWithPriority(1, 3);
           System.out.println("\nAfter:");
           t.display();
           break;
		   
		   
       default: System.out.println("Wrong selection");
      }
     System.out.println();
   }      
 }